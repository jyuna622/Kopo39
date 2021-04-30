package class0325;

public class P10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 10, 12};
		
		try {
			String temp = null;
			System.out.println(temp.length());
			//System.out.println(numbers[3]);
		} catch (NullPointerException e) {
			System.out.println("1");
		} catch (Exception e) {
			System.out.println("2");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}
