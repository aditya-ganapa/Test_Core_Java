package Nov13;

public class Customer implements Comparable<Customer>{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
	//	return 0;
		if(this.id>o.id)
			return 1;
		else if(this.id<o.id)
			return -1;
		else
			return 0;
	}
}