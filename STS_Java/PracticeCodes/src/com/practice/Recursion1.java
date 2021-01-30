package com.practice;

public class Recursion1 {

	private Integer function(Integer number) {
		//System.out.println(number);
		if (number <= 1) {
			System.out.println("return");
			return 1;
		}
		System.out.println("----:"+number);
		return function(number - 1) + function(number -1);
	}
	public static void main(String [] args) {
		
		Recursion1 rec1 = new Recursion1();
		System.out.println("Calling Function : f(3)=" +rec1.function(2));
		//System.out.println("Calling Function : f(4)" +rec1.function(4));
	}
}
