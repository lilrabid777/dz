import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {
        Computer[] a = new Computer[10000];
        int c = 0;
        String menu;
        do{
            Scanner scan = new Scanner(System.in);
            System.out.println("\nPress S to search computer;\nPress A to add computer;\nPress any other key to exit.");
            menu = scan.nextLine();
            if (menu.equals("A")) {
                System.out.println("Enter name, prise, year");
                a[c] = new Computer(scan.next(), scan.nextDouble(), scan.nextInt());
                c++;
            }
            if (menu.equals("S")) {
                System.out.println("Enter computers max price: ");
                double p = scan.nextDouble();
                int i = 0;
                while(a[i]!=null) {
                    if (a[i].getPrice() <= p) {
                        System.out.println(a[i].toString());
                    }
                    i++;
                }
            }
        } while (menu.equals("A") || menu.equals("S"));
    }
}
