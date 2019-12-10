package Nov12;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<String>();
		list1.add("India");
		list1.add("China");
		list1.add("Sri Lanka");
		list1.add("Pakistan");
		System.out.println(list1);
		for (String string : list1) {
			System.out.print(string+" ");
		}
		List<String> list2=new ArrayList<String>();
		list2.add("US");
		list2.add("UK");
		list2.add("Australia");
		list2.addAll(list1);
		System.out.println("\n"+list2);
		System.out.println(list2.containsAll(list1));
		System.out.println(list1.containsAll(list2));
		System.out.println("China is present at "+list2.indexOf("China"));
		System.out.println(list2.retainAll(list1));
	}
}