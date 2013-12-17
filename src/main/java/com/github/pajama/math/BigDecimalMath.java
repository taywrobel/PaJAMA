package com.github.pajama.math;

import java.math.BigDecimal;

class BigDecimalMath implements NumberMath<BigDecimal>{

	@Override
	public BigDecimal add(BigDecimal n1, BigDecimal n2) {
		return n1.add(n2);
	}

	@Override
	public BigDecimal subtract(BigDecimal n1, BigDecimal n2) {
		return n1.subtract(n2);
	}

	@Override
	public BigDecimal multiply(BigDecimal n1, BigDecimal n2) {
		return n1.multiply(n2);
	}

	@Override
	public BigDecimal divide(BigDecimal n1, BigDecimal n2) {
		return n1.divide(n2);
	}

	@Override
	public Class<BigDecimal> getNumberClass() {
		return BigDecimal.class;
	}

}
