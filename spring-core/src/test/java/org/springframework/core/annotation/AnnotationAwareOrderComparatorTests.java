/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.core.annotation;

import javax.annotation.Priority;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Juergen Hoeller
 * @author Oliver Gierke
 */
public class AnnotationAwareOrderComparatorTests {

	@Test
	public void instanceVariableIsAnAnnotationAwareOrderComparator() {
		assertThat(AnnotationAwareOrderComparator.INSTANCE, is(instanceOf(AnnotationAwareOrderComparator.class)));
	}

	@Test
	public void sortInstances() {
		List<Object> list = new ArrayList<>();
		list.add(new B());
		list.add(new A());
		AnnotationAwareOrderComparator.sort(list);
		assertTrue(list.get(0) instanceof A);
		assertTrue(list.get(1) instanceof B);

		// 测试通过，说明交换了位置，A具有优先 ---> 也就是order越小越优先
	}

	@Test
	public void sortInstancesWithPriority() {
		List<Object> list = new ArrayList<>();
		list.add(new B2());
		list.add(new A2());
		AnnotationAwareOrderComparator.sort(list);
		assertTrue(list.get(0) instanceof A2);
		assertTrue(list.get(1) instanceof B2);

		// 测试通过，说明交换了位置，A2具有优先 ---> 也就是@Priority(越小越优先
	}

	@Test
	public void sortInstancesWithOrderAndPriority() {
		List<Object> list = new ArrayList<>();
		list.add(new B());
		list.add(new A2());
		AnnotationAwareOrderComparator.sort(list);
		assertTrue(list.get(0) instanceof A2);
		assertTrue(list.get(1) instanceof B);

		// 测试通过，说明交换了位置，A2具有优先 ---> 也就是@Priority 比 @Order 优先
	}

	@Test
	public void sortInstancesWithSubclass() {
		List<Object> list = new ArrayList<>();
		list.add(new B());
		list.add(new C());
		AnnotationAwareOrderComparator.sort(list);
		assertTrue(list.get(0) instanceof C);
		assertTrue(list.get(1) instanceof B);

		// 测试通过，说明交换了位置，C具有优先 ---> 说明优先级会被继承？？？
		// 当然了，
	}

	@Test
	public void sortClasses() {
		List<Object> list = new ArrayList<>();
		list.add(B.class);
		list.add(A.class);
		AnnotationAwareOrderComparator.sort(list);
		assertEquals(A.class, list.get(0));
		assertEquals(B.class, list.get(1));

		// 说明还能对class排序？？？。
		// 不管你是不是class，它是对@Order注解的属性进行获取，然后决定排序的哈哈哈哈
	}

	@Test
	public void sortClassesWithSubclass() {
		List<Object> list = new ArrayList<>();
		list.add(B.class);
		list.add(C.class);
		AnnotationAwareOrderComparator.sort(list);
		assertEquals(C.class, list.get(0));
		assertEquals(B.class, list.get(1));
	}

	@Test
	public void sortWithNulls() {
		List<Object> list = new ArrayList<>();
		list.add(null);
		list.add(B.class);
		list.add(null);
		list.add(A.class);
		AnnotationAwareOrderComparator.sort(list);
		assertEquals(A.class, list.get(0));
		assertEquals(B.class, list.get(1));
		assertNull(list.get(2));
		assertNull(list.get(3));
	}


	@Test
	public void throwAnotation() {

		// 测试 AnnotationUtils.getAnnotation能获取到注解的注解。
		Order order = AnnotationUtils.getAnnotation(TestOrder.class, Order.class);
		System.out.println(order);
	}

	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
	@Documented
	@Order(123)
	public @interface TestOrder {
//		@AliasFor(annotation = Order.class)
//		int value() default Ordered.LOWEST_PRECEDENCE;
	}

	@Order(1)
	private static class A {
	}

	@Order(2)
	private static class B {
	}

	private static class C extends A {
	}

	@Priority(1)
	private static class A2 {
	}

	@Priority(2)
	private static class B2 {
	}

}
