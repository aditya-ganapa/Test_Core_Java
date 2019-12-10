package Nov14;

public class ThreadDemo3 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println((i+1)+" Child thread name is "+getName());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread starts");
		Thread thread1=new ThreadDemo3();
		thread1.setDaemon(true);
		thread1.setName("task1");
		thread1.start();
		System.out.println("Main thread stops");
	}
}