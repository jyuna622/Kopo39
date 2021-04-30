package seconwk;

import java.util.Scanner;

public class p02 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		newclass d = new newclass("D", 260, 87);
		newclass e = new newclass("E", 1213, 46);
	
		System.out.println(d.printCharacter());
		System.out.println(e.printCharacter());
	}
}

class newclass {
	String name;
	int age;
	int power;
	
	public newclass (String name, int age, int power) {
		this.name = name;
		this.age = age;
		this.power = power;
	}
	
	public String printCharacter () {
		String ret = "";
		ret = name + "|" + age + "|" + power;
		return ret;	
	}		
}
	
	
	/*
	public static void main(String[] args) {
		newclass newclass = new newclass("hello", 10, 20);
		newclass.printCharacter();
		
	}
}

class newclass {
	String name;
	int age;
	int power;
	
	public newclass (String name, int age, int power) {
		this.name = name;
		this.age = age;
		this.power = power;
	}
	
	public newclass (String z) {
		this(z, 12, 30);
	}
	
	public String printCharacter () {
		String ret = "";
		ret = name + "|" + age + "|" + power;
		return ret;	
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
*/