package OOPS;

public class q4_Delivery {
	void displayDeliveryDetails(String bowler, String batsman){
		System.out.println("Player details of the delivery:");
		System.out.println("Bowler:"+bowler.substring(1+bowler.lastIndexOf(" ")));
		System.out.println("Batsman:"+batsman.substring(1+batsman.lastIndexOf(" ")));
	}
	void displayDeliveryDetails(long runs){
		System.out.println("Numeber of runs scored in the delivery:"+runs);
		if(runs==4)
			System.out.println("It is a boundary.");
		if(runs==6)
			System.out.println("It is a Sixer.");
	}
}