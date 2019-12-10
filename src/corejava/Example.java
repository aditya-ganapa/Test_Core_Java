package corejava;

public class Example {
	int a,b;
	void change1(int a1,int b1){
		a=a1;
		b=b1;
	}
	void change2(Example o1){
		o1.a=10;
		o1.b=20;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example o=new Example();
		o.change1(30,40);
		System.out.println(o.a+" "+o.b);
		o.change2(o);
		System.out.println(o.a+" "+o.b);
	}

}
