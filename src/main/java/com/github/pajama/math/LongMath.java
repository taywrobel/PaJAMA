package com.github.pajama.math;

class LongMath implements NumberMath<Long>{

	@Override
	public Long add(Long n1, Long n2) {
		return n1 + n2;
	}

	@Override
	public Long subtract(Long n1, Long n2) {
		return n1 - n2;
	}

	@Override
	public Long multiply(Long n1, Long n2) {
		return n1 * n2;
	}

	@Override
	public Long divide(Long n1, Long n2) {
		return n1 / n2;
	}

	@Override
	public Class<Long> getNumberClass() {
		return Long.class;
	}

}
