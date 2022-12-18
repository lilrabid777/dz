import java.util.Scanner;
public class T5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a phone number:");
        String x = scan.next();
        if(x.length()>10){
            System.out.println(new PhoneNumber(x));
        }else{
            System.out.println("Incorrect phone number!");
        }
    }
}
