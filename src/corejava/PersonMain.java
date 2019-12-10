package corejava;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.setPid(1);
		person.setName("abc");
		person.setAge(20);
		System.out.println("ID is:"+person.getPid());
		System.out.println("Name is:"+person.getName());
		System.out.println("Age is:"+person.getAge());
	}

}
