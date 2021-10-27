package com.bridgelabz.generics;

public class  MaxInteger {

	public static Integer checkMax(Integer X, Integer Y, Integer Z) {
		Integer max = X;
		if(Y.compareTo(max) > 0){
			max = Y;
		}
		if(Z.compareTo(max) > 0) {
			max = Z;
		}
		return max;
	}
	public static void main(String[] args) {
		Integer maxNum = checkMax(25,60,35);
		System.out.println(maxNum);
	}

}