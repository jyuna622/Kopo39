package class0324;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ji");
		list.add("Posada");
		list.add("Kim");
		
		java.util.Iterator<String> iterator = list.iterator(); 
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("----------------");
		
		for (String Names : list) {
			System.out.println(Names);
		}
		
		System.out.println("----------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
