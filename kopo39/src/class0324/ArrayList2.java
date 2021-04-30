package class0324;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> name = new ArrayList<String>();
		name.add("Ji");
		name.add("Yuna");
		name.add("Marifer");
		
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.get(0));
	
		name.remove(1);
		System.out.println(name);
		
		name.set(1, "Maria Fernanda");
		System.out.println(name);
		System.out.println(name.size());
		
		name.add("Zaraa");
		System.out.println(name);
		
		Collections.sort(name);
		System.out.println(name);
		
		Collections.reverse(name);
		System.out.println(name);		
	}
}