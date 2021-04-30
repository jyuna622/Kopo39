package class0318;

import java.util.Scanner;

public class HW02_P2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int i;
        int subnum = scan.nextInt();
        int marks[] = new int[subnum];
        String grade[] = new String[subnum];
       
        float total = 0, avg;
               
        for(i=0; i < subnum; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scan.nextInt();
           total = total + marks[i];
        }
        scan.close();
        
        //Calculating average here
        avg = total / subnum;
        System.out.print("The student Grade is: ");
        
        if (avg <= 4.5 && avg >= 4.25) {
            System.out.println("A+");
        } else if (avg < 4.25 && avg >= 3.75) {
           System.out.println("A0");
        } else if (avg < 3.75 && avg >= 3.25) {
            System.out.println("B+");
        } else if (avg < 3.25 && avg >= 2.75) {
            System.out.println("B0");
        } else if (avg < 2.75 && avg >= 2.25) {
            System.out.println("C+");
        } else if (avg < 2.25 && avg >= 1.75) {
            System.out.println("C0");
        } else {
            System.out.println("F");
        }
        System.out.println("Your total grade is: " + avg);
    }
}