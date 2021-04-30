package seconwk;

public class main3 {
	public static void main (String[] args) {
		System.out.println("Here is a Polymorphism of 'A Draw'");
		PenDraw penDraw = new PenDraw();
		
		ADraw aDraw = new ADraw();
		aDraw.printContent();
		ADraw aDraw2 = new PenDraw();
		aDraw2.printContent();
		ADraw aDraw3 = new PencilDraw();
		aDraw3.printContent();
		ADraw aDraw4 = new HighlighterDraw();
		aDraw4.printContent();
	}
}
