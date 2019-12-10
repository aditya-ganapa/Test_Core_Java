package java_fundamentals;
import java.util.Scanner;

public class q12 {
	public static void main(String[] args){
		String agreementDraft,oldName,newName;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the content of the document");
		agreementDraft=sc.nextLine();
		System.out.println("Enter the old name of the company");
		oldName=sc.next();
		System.out.println("Enter the new name of the company");
		newName=sc.next();
		System.out.println("The content of the modified document is");
		agreementDraft=agreementDraft.replace(oldName, newName);
		System.out.println(agreementDraft);
		sc.close();
	}
}