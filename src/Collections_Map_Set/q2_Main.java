package Collections_Map_Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class q2_Main {
	public static void main(String[] args) {
		System.out.println("Enter the number of boxes");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		Set<Box> boxes=new HashSet<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Box "+(i+1)+" details");
			System.out.println("Enter Length");
			double length=scanner.nextDouble();
			System.out.println("Enter Width");
			double width=scanner.nextDouble();
			System.out.println("Enter Height");
			double height=scanner.nextDouble();
			boolean b=true;
			for (Box box : boxes)
				if(box.equals(new Box(length,width,height))){
					b=false;
					break;
				}
			if(b)
				boxes.add(new Box(length,width,height));
		}
		System.out.println("Unique Boxes in the Set are");
		for (Box box : boxes)
			System.out.println(box);
		scanner.close();
	}
}