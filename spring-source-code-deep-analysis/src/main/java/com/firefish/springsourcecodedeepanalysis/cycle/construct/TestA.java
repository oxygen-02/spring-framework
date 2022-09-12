package com.firefish.springsourcecodedeepanalysis.cycle.construct;

import lombok.Data;

@Data
public class TestA {
	
	private TestB testB;

	public void a() {
		testB.b();
	}
}
