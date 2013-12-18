package com.github.pajama.math;

public enum MathType {
	BYTE(new ByteMath()),
	SHORT(new ShortMath()),
	INTEGER(new IntegerMath()),
	LONG(new LongMath()),
	FLOAT(new FloatMath()),
	DOUBLE(new DoubleMath()),
	BIG_INTEGER(new BigIntegerMath()),
	BIG_DECIMAL(new BigDecimalMath());

	private NumberMath<? extends Number> impl;

	private <N extends Number> MathType(NumberMath<N> impl) {
		this.impl = impl;
	}

	@SuppressWarnings("unchecked")
	// It is okay for this to not check the cast because nothing can make impl
	// except the constructor, which guarantees its type extends Number.
	public <N extends Number> Class<N> getMathClass() {
		return (Class<N>) impl.getNumberClass();
	}

	@SuppressWarnings("unchecked")
	// It is okay for this to not check the cast because nothing can make impl
	// except the constructor, which guarantees its type extends Number.
	public <N extends Number> NumberMath<N> getMath() {
		return (NumberMath<N>) impl;
	}
}
