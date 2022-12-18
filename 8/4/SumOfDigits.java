import java.util.Scanner;
public class SumOfDigits {

    static int Find(int k, int s, int len, int sum){
        if(len == k){
            if (sum == s) {return 1;}
            else {return 0;}
        }
        int first = 0;
        if(len == 0){first = 1;}
        int count = 0;
        for (int i = first; i < 10; i++){
            count += Find(k, s, len+1,sum+i);
        }
        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter k:");
        int k = scan.nextInt();
        System.out.println("Enter s:");
        int s = scan.nextInt();
        System.out.println(Find(k,s,0,0));
    }
}
