package Nov14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String s="";
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter("data.txt",true);
			
			while(!s.equals("exit_1")){
				System.out.println("Enter Line:");
				s=scanner.nextLine();
				fileWriter.write(s+"\n");
				System.out.println("Enter exit_1 to exit");
			}
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		scanner.close();
	}

}
