package Nov12;
import java.util.List;
import java.util.ArrayList;
public class ListDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list1=new ArrayList();
		list1.add(32564);
		list1.add(32564.3213f);
		list1.add(new Integer(43141));
		list1.add("java");
		list1.add(new Long(12312));
		System.out.println(list1);
		
		list1.remove(2);
		list1.remove("java");
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i)+" ");
		}
		
		list1.add(1,"python");
		System.out.println(list1);
		
		System.out.println(list1.contains("python"));	
		
	}
}