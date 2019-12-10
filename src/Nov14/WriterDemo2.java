package Nov14;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriterDemo2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name,email;
		BufferedWriter bufferedWriter=null;
		try {
			bufferedWriter=new BufferedWriter(new FileWriter("fileName.txt"));
			System.out.println("Enter name and email:");
			name=scanner.nextLine();
			email=scanner.nextLine();
			bufferedWriter.write("Welcome "+name+", Thank you for registering your email id, "+email);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		scanner.close();
	}
}