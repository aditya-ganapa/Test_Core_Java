package Interfaces_Demo;

public interface IVehicle {
	void drive();
	void turnLeft();
	void brake();
}
interface IPublicTransport {
	void getNumberOfPeople();
}
class MotorisedVehicle {
	void checkMotor(){
		System.out.println("Motor of the vehicle is in good condition");
	}
}
class Car extends MotorisedVehicle implements IVehicle {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("The car is being driven");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("The car is in brake mode");
	}
	
}
class Train extends MotorisedVehicle implements IVehicle,IPublicTransport {

	@Override
	public void getNumberOfPeople() {
		// TODO Auto-generated method stub
		System.out.println("The number of people on the train is 965");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("Train is taking left");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		
	}	
}