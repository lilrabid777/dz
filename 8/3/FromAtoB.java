import java.util.Scanner;
import java.lang.Math;

public class FromAtoB {
    static void Until(int a, int b){
        if(a + (b-a)/Math.abs(b-a) != b){
            //если A<B, то (b-a)/Math.abs(b-a) = 1, если A<B, то (b-a)/Math.abs(b-a) = -1
            a+=(b-a)/Math.abs(b-a);
            System.out.println(a);
            Until(a,b);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A:");
        int A = scan.nextInt();
        System.out.println("Enter B:");
        int B = scan.nextInt();
        Until(A,B);
    }
}
