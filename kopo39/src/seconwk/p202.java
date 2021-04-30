package seconwk;

import java.util.Scanner;

public class p202 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		p02 d = new p02("D", 260, 87);
		p02 e = new p02("E", 1213, 46);
	
		System.out.println(d.printCharacter());
		System.out.println(e.printCharacter());
	}
}



/*
p02 a = new p02 ("A", 260, 56.5, 42.1);
p02 b = new p02 ("B", 190, 67.6, 39.8);
p02 c = new p02 ("C", 158, 17.3, 88.7);
p02 d = new p02 ("D", 260, 35.5, 42.1);
p02 e = new p02 ("E", 1213, 46.1, 38.9);

System.out.println(a.printp02());
System.out.println(b.printp02());
System.out.println(c.printp02());
System.out.println(d.printp02());
System.out.println(e.printp02());
*/