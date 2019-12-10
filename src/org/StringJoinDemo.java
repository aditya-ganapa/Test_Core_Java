package org;

import java.util.StringJoiner;

public class StringJoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner joiner=new StringJoiner(",");
		joiner.add("python");
		joiner.add("java");
		joiner.add("c");
		joiner.add("c++").add("html").add("css").add("js");
		String s=joiner.toString();
		System.out.println(s);
		String s1="asd ad  ad ";
		System.out.println(s1.lastIndexOf(" "));
	}

}
