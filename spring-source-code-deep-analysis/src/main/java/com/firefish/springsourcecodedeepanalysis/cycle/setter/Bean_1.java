package com.firefish.springsourcecodedeepanalysis.cycle.setter;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Bean_1 {
	private Bean_2 prop_2;
	private Bean_3 prop_3;
}
