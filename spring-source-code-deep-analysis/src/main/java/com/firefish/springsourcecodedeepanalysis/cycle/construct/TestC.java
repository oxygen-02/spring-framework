package com.firefish.springsourcecodedeepanalysis.cycle.construct;

import lombok.Data;

@Data
public class TestC {

	private TestA testA;

	public void c() {
		testA.a();
	}
}
