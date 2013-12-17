package com.github.pajama.math;

class FloatMath implements NumberMath<Float>{

	@Override
	public Float add(Float n1, Float n2) {
		return n1 + n2;
	}

	@Override
	public Float subtract(Float n1, Float n2) {
		return n1 - n2;
	}

	@Override
	public Float multiply(Float n1, Float n2) {
		return n1 * n2;
	}

	@Override
	public Float divide(Float n1, Float n2) {
		return n1 / n2;
	}

	@Override
	public Class<Float> getNumberClass() {
		return Float.class;
	}

}
