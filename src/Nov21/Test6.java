package Nov21;

import java.util.function.Function;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> square=a->(a*a);
		Function<Integer, Integer> addone=a->(a+1);
		Function<Integer, Integer> andThen=square.andThen(addone);
		System.out.println(andThen.apply(6));
		
	}

}
