package org;

public class ObjectDemo {
	private int age;
	public ObjectDemo(int age) {
		super();
		this.age = age;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		ObjectDemo o=(ObjectDemo)obj;
		if(this.age==o.age)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectDemo o1=new ObjectDemo(22);
		ObjectDemo o2=new ObjectDemo(22);
		if(o1.equals(o2))
			System.out.println("o1 equals o2");
		else
			System.out.println("o1 NOT equals o2");
		System.out.println(o1.equals(o2));
		String s1="abc efg";
		String s2=new String("abc efg");
		if(s1==s2)
			System.out.println("s1=s2");
		else
			System.out.println("s!=s2");
	}

}
