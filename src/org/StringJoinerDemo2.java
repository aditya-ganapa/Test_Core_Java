package org;

import java.util.StringJoiner;

public class StringJoinerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner joiner=new StringJoiner(" and ","{","}");
		joiner.add("python");
		joiner.add("java");
		joiner.add("c");
		joiner.add("c++").add("html").add("css").add("js");
		String s=joiner.toString();
		System.out.println(s);
		String s1="asd ad ad vxczvz";
		System.out.println(s1.lastIndexOf(" "));
		System.out.println(s1.substring(s1.lastIndexOf(" ")));
		
		StringJoiner joiner1=new StringJoiner(" and ","[","]");
		joiner1.add("asdsa").add("rgrg").add("grger");
		System.out.println(joiner1);
		joiner.merge(joiner1);
		System.out.println(joiner);
	}

}
