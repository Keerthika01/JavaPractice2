package com.mfai;

public class sod {
	public static void main(String[] args) {	
int n=5489;
int sum=0; 
while(n!=0) {
	int d = n%10;
	sum=sum+d;
	n=n/10;
}
System.out.println("The sum of digits 5+4+8+9 is "+sum);
}
}
