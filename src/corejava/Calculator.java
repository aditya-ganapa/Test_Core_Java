package corejava;

public class Calculator {
	int num1, num2;
	void bitwiseand(){
		System.out.println("\"The Bitwise AND of the Two numbers "+num1+" and "+num2+" is "+(num1&num2)+"\"");
	}
	void bitwiseor(){
		System.out.println("\"The Bitwise OR of the Two numbers "+num1+" and "+num2+" is "+(num1|num2)+"\"");
	}
	void bitwisexor(){
		System.out.println("\"The Bitwise XOR of the Two numbers "+num1+" and "+num2+" is "+(num1^num2)+"\"");
	}
	void bitwisenot(){
		System.out.println("\"The Bitwise NOT of the number "+num1+" is "+(~num1)+"\"");
	}
}