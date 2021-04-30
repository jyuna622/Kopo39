package seconwk;

import java.util.ArrayList;
import java.util.Scanner;

public class P9 {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P9 p9 = new P9();
		ArrayList<String> MyCourse = new ArrayList<String>(); 
		String[] type = {"Korean", "Math", "English", "Social Studies", "Science"};
	
		while(true) {
			int n = p9.Menu();
			
			if (n== 0) {
				break;
			} else if(n == 1) {
				int c = p9.CourseList(type);
				if(c == 0) {
					break;
				} else if (c > 0) {
					p9.Course(c, type, MyCourse);
				}
				
			} else if (n == 2) {
				p9.CoursePrint(n, MyCourse);
			}
		}
	}
	
	public static int Menu() {
		System.out.println("#Menu");
		System.out.println("1. Course List");
		System.out.println("2. My Course");
		
		return scan.nextInt();
		
	}
	
	public static int CourseList (String[] type) {
		System.out.println("#Menu");
		for (int i = 0; i < type.length; i++) {
			System.out.println((i+1) + "." + type[i]);
		}
		System.out.println("0. Back to Main");
		System.out.println("--> ");
		
		return scan.nextInt();
	}
	
	public static void Course (int a, String[] type, ArrayList<String> MyCourse) {
		MyCourse.add(type[a-1]);
		System.out.println(type[a-1] + " is registered.");
	}
	
	public static void CoursePrint(int a, ArrayList<String> MyCourse) {
		if (MyCourse.size() == 0) {
			System.out.println("Nothing is registered.");
		} else { 
			System.out.println("My Course : ");
			for(int i = 0; i < MyCourse.size(); i ++) {
				System.out.println((i+1) + "." + MyCourse.get(i));
			}
			System.out.println("");
		}
	}
}