package com.github.pajama;

import java.math.BigDecimal;

import com.github.pajama.math.MathType;
import com.github.pajama.math.NumberMath;

public class Tester <N extends Number> {

	NumberMath<N> math = null;
	
	public Tester(){};
	
	public Tester(Class<N> type){
		NumberMath<N> mathType = null;
		for(MathType math : MathType.values()){
			if(type.equals(math.getMathClass())){
				mathType = math.getMath();
			}
		}
		if(mathType == null){
			throw new IllegalArgumentException("Class type "
					+ type.getSimpleName() + " is not currently supported.");
		}
		math = mathType;
	}
	
	public static <M extends Number> Tester<M> makeTester(Class<M> type){
		Tester<M> newTester = new Tester<M>();
		NumberMath<M> mathType = null;
		for(MathType math : MathType.values()){
			if(type.equals(math.getMathClass())){
				mathType = math.getMath();
			}
		}
		if(mathType == null){
			throw new IllegalArgumentException("Class type "
					+ type.getSimpleName() + " is not currently supported.");
		}
		newTester.math = mathType;
		return newTester;
	}
	
	public N times(N n1, N n2){
		return math.multiply(n1, n2);
	}
	
	public static void main(String[] args){
		Tester<BigDecimal> test = new Tester<BigDecimal>(BigDecimal.class);
		System.out.println(test.times(new BigDecimal(5.1), new BigDecimal(3.0)));
		
		Tester<Double> testDbl = Tester.makeTester(Double.class);
		System.out.println(testDbl.times(5.1, 3.0));
	}
}
