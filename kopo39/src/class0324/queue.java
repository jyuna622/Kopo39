package class0324;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		Queue<String> name = new LinkedList<String>();
		name.offer("Ji");
		System.out.println(name);
		name.offer("Lee");
		System.out.println(name);
		System.out.println(name.poll());
		System.out.println(name.poll());
		System.out.println(name);
	}

}
