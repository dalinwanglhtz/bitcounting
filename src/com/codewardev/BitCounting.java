package com.codewardev;

// https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java

public class BitCounting {

	public static int countBits(int n) {
		int numOnes=0;
		while(n != 0) {
			if(n % 2==1) numOnes++;
			n /= 2;
		}
		
		return numOnes;
	}

}
