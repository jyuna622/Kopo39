package class0323;

public class p02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers = new int[3][4];
		int cnt = 0;
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
			numbers[i][j] = cnt;
			cnt++;
			System.out.print(" [" + i + " , " + j + "] ");
			}
			System.out.println("");
		}	
	}
}