package org;

public class Animal {
	String type;
	String color;
	void sound(){
		System.out.println("animal sound");
	}
}
class Cow extends Animal{
	public static void main(String[] args) {
		Cow c=new Cow();
		c.type="domestic";
		c.color="white";
		System.out.println(c.type);
		System.out.println(c.color);
		c.sound();
	}
}