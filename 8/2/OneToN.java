import java.util.Scanner;

public class OneToN {

    static void Until(int a, int b){
        if(a < b){
            System.out.println(a);
            a++;
            Until(a,b);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scan.nextInt();
        if(n > 1){
            Until(1,n);
        }else{
            System.out.println("Number n must be greater then 1!");
        }
    }
}
