package class0323;

public class p03 {
	
	public static void main(String[] args) {
		int[][] numbers = {{1, 2, 3, 4 ,5}, {4, 5}};
		int count = 0;
	
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
			numbers[i][j] = count;
			count++;
			System.out.print(" [" + i + " , " + j + "] ");
			}
			System.out.println("");
		}	
	}
}

