import java.util.Scanner;
public class HowMany {
    public static void main(String[] args) {
        System.out.println("Enter words: ");
        Scanner scan = new Scanner(System.in);
        String str = ' '+scan.nextLine()+' ';
        int f = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i-1) != ' ') {
                ++f;
            }
        }
        System.out.println("Result: " + f + " words");
    }
}