

public class Calculator {
	int num1, num2;
	void addition(){
		System.out.println("Addition:\"The Sum of the Two numbers "+num1+" and "+num2+" is "+(num1+num2)+"\"");
	}
	void subtraction(){
		System.out.println("Subtraction:\"The Subtracted Result of the Two numbers "+num1+" and "+num2+" is "+(num1-num2)+"\"");
	}
	void printSmaller(){
		System.out.println("Print Smaller:\"The Smallest of the Two numbers "+num1+" and "+num2+" is "+(num1<num2?num1:num2)+"\"");
	}
}