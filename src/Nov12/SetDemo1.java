package Nov12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> language=new HashSet<>(); //no order
		language.add("python");
		language.add("javascript");
		language.add("C");
		language.add("C++");
		language.add("java");
		language.add("python");
		language.add("python");
		language.add("python");
		language.add("java");
		language.add("java");
		System.out.println(language);
		for (String string : language) {
			System.out.println(string);
		}
		Set<String> language1=new TreeSet<>(); // sorted
		language1.add("python");
		language1.add("javascript");
		language1.add("C");
		language1.add("C++");
		language1.add("java");
		language1.add("python");
		language1.add("python");
		language1.add("python");
		language1.add("java");
		language1.add("java");
		System.out.println(language1);
		for (String string : language1) {
			System.out.println(string);
		}
		Set<String> language2=new LinkedHashSet<>(); // given order
		language2.add("python");
		language2.add("javascript");
		language2.add("C");
		language2.add("C++");
		language2.add("java");
		language2.add("python");
		language2.add("python");
		language2.add("python");
		language2.add("java");
		language2.add("java");
		System.out.println(language2);
		for (String string : language2) {
			System.out.println(string);
		}
		Iterator<String> it=language2.iterator();
		while(it.hasNext()){
			String string=(String)it.next();
			System.out.println(string);
		}
	}
}