package FileHandling_DateAPI;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class q1_Main {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter the file name");
		Scanner scanner=new Scanner(System.in);
		BufferedReader bufferedReader=new BufferedReader(new FileReader("c:/hello/"+scanner.nextLine()));
		String s=null;
		while((s=bufferedReader.readLine())!=null)
			System.out.println(s);
		bufferedReader.close();
		scanner.close();
	}
}