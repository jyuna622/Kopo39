package class0323;

public class p04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		int count = 0;
	
		System.out.println("Numbers given: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(" [" + numbers[i] + "] ");
		}
		
		//in ascending orders
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if(numbers[i] > numbers[j]) {    
	                   count = numbers[i];    // 0 = 0 --> 2
	                   numbers[i] = numbers[j];    // 0 = 1 --> 5
	                   numbers[j] = count;     // 1 = ¥Ÿ¿Ω count
	            }     
			}
		}
			System.out.println("");
			
			System.out.println("\nNumbers in ascending order: ");
			 for (int i = 0; i < numbers.length; i++) {     
				 System.out.print(" [" + numbers[i] + "] ");
				 
		     }   
			 
		//in descending orders
			 for (int i = 0; i < numbers.length; i++) {
				for (int j = i+1; j < numbers.length; j++) {
					if(numbers[i] < numbers[j]) {    
		                   count = numbers[i];    
		                   numbers[i] = numbers[j];    
		                   numbers[j] = count;    
		            }     
				}
			}
				System.out.println("");
					
				System.out.println("\nNumbers in descending order: ");
				 for (int i = 0; i < numbers.length; i++) {     
					 System.out.print(" [" + numbers[i] + "] ");
						 
				 }   	 
	}
}
