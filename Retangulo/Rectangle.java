import java.math.BigInteger;

public class Rectangle {
public double Width;
public double Height;


public double Area() {
	return  Height * Width;	
}

public double Perimeter() {
	return 2*(Width+Height);
}

public double Diagonal() {
	
	return Math.sqrt((Width*Width) + (Height*Height));
 }
}