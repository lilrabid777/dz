import java.util.*;
public class Bookshelf {
    static List <Book> mas = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of books:");
        int size = scan.nextInt();
        for (int i = 0; i != size; i++) {
            System.out.println("Enter: name, author, year: ");
            mas.add(new Book(scan.next(), scan.next(), scan.nextInt()));
        }

        Collections.sort(mas);

        for (int j = 0; j<size; j++){
            System.out.println(mas.get(j).toString());
        }
        System.out.println("Earliest: "+mas.get(0));
        System.out.println("Latest: "+mas.get(mas.size()-1));
    }
}
