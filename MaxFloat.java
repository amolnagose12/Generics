package com.bridgelabz.generics;

public class MaxFloat {

	public static Float checkMax(Float X, Float Y, Float Z) {
		Float max = X;
		if(Y.compareTo(max) > 0){
			max = Y;
		}
		if(Z.compareTo(max) > 0) {
			max = Z;
		}
		return max;
	}
	public static void main(String[] args) {
		Float maxFloat = checkMax(2.5f,65.5f,7.5f);
		System.out.println(maxFloat);
	}
}
