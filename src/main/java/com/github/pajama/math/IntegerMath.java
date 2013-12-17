package com.github.pajama.math;

class IntegerMath implements NumberMath<Integer>{

	@Override
	public Integer add(Integer n1, Integer n2) {
		return n1 + n2;
	}

	@Override
	public Integer subtract(Integer n1, Integer n2) {
		return n1 - n2;
	}

	@Override
	public Integer multiply(Integer n1, Integer n2) {
		return n1 * n2;
	}

	@Override
	public Integer divide(Integer n1, Integer n2) {
		return n1 / n2;
	}

	@Override
	public Class<Integer> getNumberClass() {
		return Integer.class;
	}

}
