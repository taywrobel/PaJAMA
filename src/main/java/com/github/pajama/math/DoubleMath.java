package com.github.pajama.math;

class DoubleMath implements NumberMath<Double>{

	@Override
	public Double add(Double n1, Double n2) {
		return n1 + n2;
	}

	@Override
	public Double subtract(Double n1, Double n2) {
		return n1 - n2;
	}

	@Override
	public Double multiply(Double n1, Double n2) {
		return n1 * n2;
	}

	@Override
	public Double divide(Double n1, Double n2) {
		return n1 / n2;
	}

	@Override
	public Class<Double> getNumberClass() {
		return Double.class;
	}

}
