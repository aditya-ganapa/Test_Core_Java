package corejava;
import java.util.Scanner;
public class forumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forum forum[]=new Forum[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<forum.length;i++){
			System.out.println("Enter Id name and location");
			forum[i]=new Forum(sc.nextInt(),sc.next(),sc.next());
		}
		for(Forum forum2 : forum){
			forum2.dispForum();
		}
	}

}