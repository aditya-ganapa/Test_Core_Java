package Nov12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<String>();
		list1.add("India");
		list1.add("China");
		list1.add("Sri Lanka");
		list1.add("Pakistan");
		System.out.println(list1);
		Iterator<String> it=list1.iterator();
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
			if(s.equals("China"))
				it.remove();
		}
		System.out.println(list1);
	}

}