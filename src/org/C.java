package org;

public class C {
	public C(){
		super();
		System.out.println("C Constructor Called");
	}
}
class B extends C {
	public B(){
		super();
		System.out.println("B Constructor Called");
	}
}
class A extends B {
	public A(){
		super();
		System.out.println("A Constructor Called");
	}
	public static void main(String[] args) {
		A a=new A();
	}
}