package org;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="we are learning java";
        System.out.println(s.indexOf("are"));
        s=s.concat(".java is easy to learn");
        System.out.println(s);
        
        String ar[]=s.split(" ");
        for (String string : ar) {
			System.out.println(string);
		}
    
	}

}
