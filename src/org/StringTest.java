package org;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1="hello";
		String s2=new String("hello");
		
		if(s==s1)
			System.out.println("s==s1");
		if(s==s2)
			System.out.println("s==s2");
		if(s.equals(s2))
			System.out.println("s equals s2");
		if("welcome"==new String("welcome"))
			System.out.println("welcome==welcome");

	}

}
// == checks references
// .equals checks content