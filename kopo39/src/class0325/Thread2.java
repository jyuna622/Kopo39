package class0325;

public class Thread2 implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread2 thread2 = new Thread2();
		Thread thread = new Thread(thread2);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
	}
}
