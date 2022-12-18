import java.util.Scanner;
public class Triangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        if (n > 0){
            int k = 1;
            for(int i = 1; i <= n; i++){
                System.out.println(k);
                if(i==k*(k+1)/2){
                    k++;
                }
            }
        }
        else{
            System.out.println("Number n must be greater then 0!");
        }
    }
}
