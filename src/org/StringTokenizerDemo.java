package org;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a string, split by StingTokenizer, with comma as delimiter";
		StringTokenizer s1=new StringTokenizer(s,",");
		System.out.println(s1.countTokens());
		while(s1.hasMoreTokens()){
			System.out.println(s1.nextToken());
		}
		String ar[]=s.split(",");
		for (String string : ar) {
			System.out.println(string);
		}

	}

}
