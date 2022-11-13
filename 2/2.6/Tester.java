import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		double r;
		Circle1 a = new Circle1(1, 2, 3, "red");
		System.out.println("Length of circle = " + a.getLength() + "sm");
		Scanner source = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		r = source.nextDouble();
		a.setR(r);
		System.out.println("Length of circle = " + a.getLength() + "sm");
		a.toString();

	}
}