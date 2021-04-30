package class0325;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new MultiThreadTest2("[ Thread " + 1 + " ]");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		Thread thread2 = new MultiThreadTest2("[ Thread " + 2 + " ]");
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
	}
}
	
class  MultiThreadTest2 extends Thread {
	public  MultiThreadTest2 (String threadName) {
		this.setName(threadName);
	}

	public void run() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		System.out.println(this.getName() + " Thread_Start ");
	}
}