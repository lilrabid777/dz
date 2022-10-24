import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {
        int n;
        int sum = 0;
        int max;
        int min;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = scn.nextInt();
        int[] a = new int[n];

        int i = 0;
        while(i < n) {
            a[i]=scn.nextInt();
            i+=1;
        }

        i = 0;
        min = a[0];
        max = a[0];
        while(i < n){
            sum += a[i];
            if(a[i] > max) {
                max = a[i];
            }
            if(a[i] < min) {
                min = a[i];
            }
            i+=1;
        }
        System.out.println("Sum: "+sum+"; Max: "+ max+"; Min: "+ min);
    }
}
