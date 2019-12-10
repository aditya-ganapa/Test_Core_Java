package Nov12;

import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method 	stub
		TreeSet t=new TreeSet<>();
		t.add(22);
		t.add(23);
	//	t.add("java"); this is the reason we use generic types
		t.add(25);
		t.add(26);
		System.out.println(t);
	}

}
