package com.firefish.springsourcecodedeepanalysis.cycle.construct;

import lombok.Data;

@Data
public class TestB {

	private TestC testC;

	public void b() {
		testC.c();
	}
}
