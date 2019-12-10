package Nov14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader=null;
		try {
			reader=new BufferedReader(new FileReader("c:/hello/abc.txt"));
			//int x;
			//reader.skip(300);
			String s=null;
			StringBuffer buffer=new StringBuffer();
			while((s=reader.readLine())!=null){
				//System.out.println(s);
				buffer.append(s+"\n");
			}
			System.out.println(buffer);
			System.out.println("Reverse");
			System.out.println(buffer.reverse());
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