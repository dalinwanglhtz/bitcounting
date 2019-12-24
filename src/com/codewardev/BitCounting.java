package com.codewardev;

// https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java

public class BitCounting {

	public static int countBits(int n) {
		
		int remainder;
		long binaryVal=0;
		int numOnes=0;
		long j=1;
		while(n != 0) {
			remainder = n % 2;
			binaryVal += remainder * j;
			j *= 10;
			n /= 2;
			if(remainder==1) numOnes++;
		}
		
		System.out.println("Binary: "+binaryVal);
		
		return numOnes;
	}

}
