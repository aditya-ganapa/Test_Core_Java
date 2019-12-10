package Nov21;

interface Calculation {
	int addition(int a,int b);
}



public class LambdaExp2 {

	Calculation calculation = new Calculation() {
		
		@Override
		public int addition(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
	};
	
	Calculation calculation2=(int a,int b)->{return a+b;};
	Calculation calculation3=(a,b)->{return a+b;};
	Calculation calculation4=(a,b)->a+b;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaExp2 exp2=new LambdaExp2();
		int res=exp2.calculation.addition(12, 13);
		System.out.println("sum is "+res);
		
		Calculation calculation5=(a,b)->a+b;
		int res2=calculation5.addition(12, 13);
		System.out.println("sum is "+res2);
	
	}
}