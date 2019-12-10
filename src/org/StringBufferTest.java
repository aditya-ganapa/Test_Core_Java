package org;

public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mutable
		StringBuffer sb=new StringBuffer("hello");
		sb.append("world");
		System.out.println(sb);
		sb.insert(5,"-");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);


	}

}
