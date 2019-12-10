package Nov13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileMain1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileInputStream stream=new FileInputStream("c:\\hello\\abc.txt");
		FileInputStream stream=new FileInputStream("c:/hello/abc.txt");
		int x=stream.read();
//		System.out.print((char)x);
//		x=stream.read();
//		System.out.print((char)x);
		
		while(x!=-1){
			System.out.print((char)x);
			x=stream.read();
		}
		stream.close();
	}
}