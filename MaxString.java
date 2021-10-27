package com.bridgelabz.generics;

public class MaxString {
	
	public static String checkMax(String X, String Y, String Z) {
		String max = X;
		if(Y.compareTo(max) > 0){
			max = Y;
		}
		if(Z.compareTo(max) > 0) {
			max = Z;
		}
		return max;
	}
	public static void main(String[] args) {
		String maxNum = checkMax("abcd","defh","dfghjkl");
		System.out.println(maxNum);
	}

}

