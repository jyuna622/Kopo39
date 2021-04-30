package class0325;

public class SetPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = (int) (Math.random() * 10 + 1); 
		int n2 = (int) (Math.random() * 10 + 1); 
		for (int i = 0;  i <= 10; i++) {
			int sum = n1 + n2;
			i++;
		}
		Thread thread1 = new MultiThreadTest("[ Thread " + n1 + " ]");
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		Thread thread2 = new MultiThreadTest("[ Thread " + n2 + " ]");
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread2.start();
	}
}
class  MultiThreadTest extends Thread {
	public  MultiThreadTest (String threadName) {
		this.setName(threadName);
	}
	
	public void run() {
		int count = 0;
		while (true) {
			if (count >= 100) {
				break;
			}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		System.out.println(this.getName() + " Thread_Start ");
		}
	}
}

/*
public static void main(String[] args) {
// TODO Auto-generated method stub
Thread thread1 = new MultiThreadTest("[ Thread " + 1 + " ]");
thread1.start();
Thread thread2 = new MultiThreadTest("[ Thread " + 2 + " ]");
thread2.start();
}
}
class  MultiThreadTest extends Thread {
public  MultiThreadTest (String threadName) {
this.setName(threadName);
}

public void run() {
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println(this.getName() + " Thread_Start ");
}
}
*/