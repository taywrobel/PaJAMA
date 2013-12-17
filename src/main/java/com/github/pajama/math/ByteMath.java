package com.github.pajama.math;

class ByteMath implements NumberMath<Byte> {

	@Override
	public Byte add(Byte n1, Byte n2) {
		return (byte)(n1 + n2);
	}

	@Override
	public Byte subtract(Byte n1, Byte n2) {
		return (byte)(n1 - n2);
	}

	@Override
	public Byte multiply(Byte n1, Byte n2) {
		return (byte)(n1 * n2);
	}

	@Override
	public Byte divide(Byte n1, Byte n2) {
		return (byte)(n1 / n2);
	}

	@Override
	public Class<Byte> getNumberClass() {
		return Byte.class;
	}

}
