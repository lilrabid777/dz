import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {
        int n;
        int sum = 0;
        double avg;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        n = scn.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i]=scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum +=  a[i];
        }
        avg = (double)sum/n;
        System.out.println("Sum: "+sum+"; Avg: "+ avg);
    }
}
