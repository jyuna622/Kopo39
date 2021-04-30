package review;

public class class0331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	abstract class Animal {
		public int leg;
		public void run() {
			System.out.println("Moving");
		}	
		abstract public void play();
	}

class Cat extends Animal {
	public void play() {
		System.out.println("He is playing.");
	}
}

	}
}

	/*
		int a = 5;
		int b = 6;
		int result = (a > b) ? a - b : b - a;
		System.out.println(result);
	}

}

	*/