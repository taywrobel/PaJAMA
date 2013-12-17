package com.github.pajama.math;

import java.math.BigInteger;

class BigIntegerMath implements NumberMath<BigInteger>{

	@Override
	public BigInteger add(BigInteger n1, BigInteger n2) {
		return n1.add(n2);
	}

	@Override
	public BigInteger subtract(BigInteger n1, BigInteger n2) {
		return n1.subtract(n2);
	}

	@Override
	public BigInteger multiply(BigInteger n1, BigInteger n2) {
		return n1.multiply(n2);
	}

	@Override
	public BigInteger divide(BigInteger n1, BigInteger n2) {
		return n1.divide(n2);
	}

	@Override
	public Class<BigInteger> getNumberClass() {
		return BigInteger.class;
	}

}
