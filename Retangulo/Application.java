import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter rectangle width and height");
		retangulo.Height = sc.nextDouble();
		
		retangulo.Width = sc.nextDouble();
		
		System.out.println("AREA = "+ retangulo.Area() +""
				+ "\nPERIMETER = " + retangulo.Perimeter() +
				"\nDIAGONAL = " + retangulo.Diagonal());
		
	}

}
