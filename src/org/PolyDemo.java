package org;

public class PolyDemo {
	void sound(){
		System.out.println("animal sound");
	}
}
class Dog extends PolyDemo{
	void sound(){
		System.out.println("barks");
	}
}
class Cat extends PolyDemo{
	void sound(){
		System.out.println("meow");
	}
}
class PolyDemoMain{
	public static void main(String[] args) {
		PolyDemo animal;
		animal=new Dog();
		animal.sound();
		animal=new Cat();
		animal.sound();
	}
}