import java.util.Scanner;
public class C1 {
	public static void main(String[] args) {
		double r;
		Circle a = new Circle(1, 2, 3);
		Circle b = new Circle(4, 5, 6);
		System.out.println("Length of circle = " + a.getLength() + "sm");
		Scanner source = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		r = source.nextDouble();
		b.setR(r);
		System.out.println("a equals b " + a.isEqual(b));
		b.toString();
	}
}