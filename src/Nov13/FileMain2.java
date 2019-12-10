package Nov13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream outputStream;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter name:");
			String name=sc.nextLine();
			outputStream = new FileOutputStream("c:\\hello\\abc.txt");
			
			outputStream.write(name.getBytes());
			outputStream.write(65);
			outputStream.write(66);
			outputStream.write(67);
			outputStream.write(68);
			outputStream.write(69);
			outputStream.write("\nHello World".getBytes());
			outputStream = new FileOutputStream("c:\\hello\\abc.txt",true); //append
			outputStream.write(65);
			outputStream.write(66);
			outputStream.write(67);
			outputStream.write(68);
			outputStream.write(69);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
}