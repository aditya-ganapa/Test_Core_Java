package Nov13;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class ListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> country=new ArrayList<String>();
		country.add("india");
		country.add("china");
		country.add("sri lanka");
		country.add("bangladesh");
		country.add("nepal");
		
		Collections.sort(country);
		
		for (String string : country) {
			System.out.println(string);
		}
		
		int pos=Collections.binarySearch(country, "nepal");
		if(pos>=0)
			System.out.println("found at "+pos);
		else
			System.out.println("not found");
	}

}
