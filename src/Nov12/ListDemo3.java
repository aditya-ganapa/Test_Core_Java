package Nov12;

import java.util.ArrayList;
//import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(11);
		list1.add(22);
		list1.add(3);
		list1.add(4);
		System.out.println(list1);
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(333);
		list2.add(444);
		list2.addAll(list1);
		System.out.println(list2);
		list2.retainAll(list1);
		System.out.println(list2);
	}

}
