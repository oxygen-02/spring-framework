package com.firefish.springframework.aop.service.impl;

import com.firefish.springframework.aop.service.IBusinessService;

/**
 * 业务类.
 *
 * @author Fire Fish
 */
public class BusinessServiceImpl implements IBusinessService {

	@Override
	public int devide(int i, int j) {

		System.out.println("调用被拦截的方法");

//        int a = 1 / 0;
		return i / j;
	}


	@Override
	public void print() {
		System.out.println("=====真实业务======");
	}

	@Override
	public void selfInvoke() {
		System.out.println("========自调用开始=======");
		this.print();
	}
}
