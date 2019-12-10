package Nov12;

//import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


//import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> emp_map=new HashMap<>();
		emp_map.put(1001, "java");
		emp_map.put(1001, "python");
		emp_map.put(12, "C");
		emp_map.put(9993, "C++");
		emp_map.put(1, "javascript");
		System.out.println(emp_map);
		System.out.println("12 is id of:"+emp_map.get(12));
		
		Set<Integer> keyset=emp_map.keySet();
		for (Integer integer : keyset) {
			System.out.println(integer+" "+emp_map.get(integer));
		}
		Set<Map.Entry<Integer,String>> entryset=emp_map.entrySet();
		for (Map.Entry<Integer,String> entry : entryset) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		Map<Integer, String> emp_map1=new TreeMap<>();
		emp_map1.put(1001, "java");
		emp_map1.put(1001, "python");
		emp_map1.put(12, "C");
		emp_map1.put(9993, "C++");
		emp_map1.put(1, "javascript");
		System.out.println(emp_map1);
	}
}