package Nov21;

import java.util.ArrayList;
import java.util.List;

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.forEach(a->System.out.println(a+" "));
	}
}