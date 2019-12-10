package corejava;

public class Forum {
	int id;
	String name;
	String location;
	public Forum(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	void dispForum(){
		System.out.println("Forum Info:");
		System.out.println("\tID is:"+id);
		System.out.println("\tname is:"+name);
		System.out.println("\tlocation is:"+location);
	}

}
