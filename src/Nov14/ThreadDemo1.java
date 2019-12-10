package Nov14;

public class ThreadDemo1 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread name is "+getName());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread starts");
		Thread thread1=new ThreadDemo1();
		Thread thread2=new ThreadDemo1();
		Thread thread3=new ThreadDemo1();
		thread1.setName("task1");
		thread2.setName("task2");
		thread3.setName("task3");
		thread1.start();
		thread2.start();
		thread3.start();
		System.out.println("Main thread stops");
	}
}