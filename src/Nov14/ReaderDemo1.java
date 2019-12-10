package Nov14;

import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader reader=null;
		try {
			reader=new FileReader("c:/hello/abc.txt");
			int x;
			//reader.skip(300);
			while((x=reader.read())!=-1){
				System.out.print((char)x);
			}
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}