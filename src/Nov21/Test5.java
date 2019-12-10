package Nov21;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> square=a->a*a;
		System.out.println(square.apply(5));
		
		BiFunction<Integer, Integer, Float> division=(a,b)->(float)a/b;
		System.out.println(division.apply(61, 3));
		
		
	}

}
