import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an address (country, region, city, street, house, building, flat):");
        String A = scan.next();
        Address address = new Address(A);
        System.out.println(address);
    }
}
