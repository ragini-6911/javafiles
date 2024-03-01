package com.javaapplication;

public class unaryoperator {

	public static void main(String[] args) {
		int x=10;
		System.out.println(x++); //10-->(11)
		System.out.println(++x); //(11+1)-->12
		System.out.println(x--); //12-->(11)
		System.out.println(--x); //(11-1)-->10
		System.out.println(x++ + ++x); //10 + 12--> 22
		System.out.println(x-- + --x); // 12 + 10--> 22
		System.out.println(x++ + --x - x-- + ++x);
	

}
