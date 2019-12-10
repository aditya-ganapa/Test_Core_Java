package Interfaces_Demo;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		Train train=new Train();
		car.brake();
		train.turnLeft();
		IVehicle iVehicle=new Car();
		iVehicle.brake();
		iVehicle.drive();
		IPublicTransport iPublicTransport=new Train();
		iPublicTransport.getNumberOfPeople();
	}

}
