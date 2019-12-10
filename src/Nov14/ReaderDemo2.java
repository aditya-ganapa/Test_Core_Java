package Nov14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader=null;
		try {
			reader=new BufferedReader(new FileReader("C:\\Users\\828561\\Test_Workspace\\Test_Core_Java\\src\\Nov14\\ReaderDemo2.java"));
			//int x;
			reader.skip(300);
			String s=null;
			while((s=reader.readLine())!=null){
				System.out.println(s);
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