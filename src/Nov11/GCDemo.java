package Nov11;

public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]=new String[10000];
		Runtime runtime=Runtime.getRuntime();
		System.out.println(runtime.totalMemory()+" "+runtime.freeMemory());
		for (int i = 0; i < s.length; i++) {
			s[i]=new String("hello world");
		}
		System.out.println(runtime.totalMemory()+" "+runtime.freeMemory());
		for (int i = 0; i < s.length; i++) {
			s[i]=null;
		}
		System.gc();
		System.out.println(runtime.totalMemory()+" "+runtime.freeMemory());
	}

}
