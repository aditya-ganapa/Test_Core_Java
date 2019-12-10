package Nov21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of(1,2,3,4,5,6).forEach(a->System.out.println(a+" "));
		List<Integer> list=new ArrayList<Integer>();
		list.add(132);
		list.add(141);
		list.add(5421);
		list.add(6431);
		Stream.of(list).forEach(a->System.out.println(a+"    "));
		
		Stream.of(1,2,3,45,6,66,73).filter(a->a%2==0).forEach(a->System.out.println(a));
		
		Stream.of(11,11,223,543,543,256,32).distinct().forEach(a->System.out.println(a+" "));
		
		Stream.of(11,22,3,4,5,6).limit(2).forEach(a->System.out.println(a+" "));
		
		System.out.println("Square of each:");
		Stream.of(11,22,3,4,5,6).map(a->a*a).forEach(a->System.out.println(a+" "));
	}
}