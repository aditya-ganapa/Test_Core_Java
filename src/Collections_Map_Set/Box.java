package Collections_Map_Set;
public class Box {
	private double length,width,height;
	public Box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return String.format("Length="+length+" Width="+width+" Height="+height+" Volume=%.2f",length*width*height);
	}
	@Override
	public boolean equals(Object obj) {
		Box b=(Box)obj;
		if(length*width*height==b.length*b.width*b.height)
			return true;
		return false;
	}
}