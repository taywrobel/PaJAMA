package com.github.pajama.math;

class ShortMath implements NumberMath<Short>{

	@Override
	public Short add(Short n1, Short n2) {
		return (short)(n1 + n2);
	}

	@Override
	public Short subtract(Short n1, Short n2) {
		return (short)(n1 - n2);
	}

	@Override
	public Short multiply(Short n1, Short n2) {
		return (short)(n1 * n2);
	}

	@Override
	public Short divide(Short n1, Short n2) {
		return (short)(n1 / n2);
	}

	@Override
	public Class<Short> getNumberClass() {
		return Short.class;
	}

}
