package com.github.pajama.math;

public interface NumberMath <N extends Number>{
	N add(N n1, N n2);
	
	N subtract(N n1, N n2);
	
	N multiply(N n1, N n2);
	
	N divide(N n1, N n2);
	
	Class<N> getNumberClass();
}
