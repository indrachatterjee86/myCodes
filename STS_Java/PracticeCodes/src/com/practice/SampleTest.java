package com.practice;


class A{
	public int x;
	private int y;
	
	void cal(int a, int b) {
		x = a+1;
		y=b;
	}
	public void print() {
		protected int d = 20;
		System.out.println();
	}
	protected static A set() {
		return new A();
	}
}


public class SampleTest{

	static {
		code(2);
	}
	static void code (int n) {
		System.out.println(n);
	}
	SampleTest() {
		code(5);
	}
	static {
		code(4);
		
	}
	{
		code(6);
	}
	static {
		new SampleTest();
	}
	
	{
		code(8);
	}
	public static void main(String[] args) {
		A obj = A.set();
		obj.print();

	}

}
