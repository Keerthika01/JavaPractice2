package com.mfai;

public class reverse {
	public static void main(String[]args) {
	int n=12345678;
	int reverse=0;
	while(n!=0) {
		int rem=n%10;
		reverse=reverse*10+rem;
		n=n/10;
	}
		System.out.println("The reverse of the given number:"+reverse);
	}

}
