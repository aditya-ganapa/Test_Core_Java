package OOPS;
//import java.lang.Math.*;

public class q3_Shape {
	protected String shapeName;
	double calculateArea(){
		return 0;
	}
	q3_Shape(String shapeName) {
		this.shapeName=shapeName;
	}
	public String getShapeName() {
		return shapeName;
	}
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
}

class q3_Square extends q3_Shape {
	int side;
	double calculateArea(){
		return side*side;
	}
	q3_Square(int side){
		super("Square");
		this.side=side;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
}

class q3_Rectangle extends q3_Shape {
	int length;
	int breadth;
	double calculateArea(){
		return length*breadth;
	}
	q3_Rectangle(int length,int breadth){
		super("Rectangle");
		this.length=length;
		this.breadth=breadth;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}

class q3_Circle extends q3_Shape {
	int radius;
	double calculateArea(){
		return Math.PI*radius*radius;
	}
	q3_Circle(int radius){
		super("Circle");
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
}

class q3_Hexagon extends q3_Shape {
	int side;
	q3_Hexagon(int side){
		super("Hexagon");
		this.side=side;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
}