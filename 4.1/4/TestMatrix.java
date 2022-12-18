import java.util.Scanner;

public class TestMatrix{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int r = sc.nextInt();
        System.out.println("Enter number of columns:");
        int c = sc.nextInt();
        System.out.println("Enter x (int): ");
        int x = sc.nextInt();

        if(r > 0 && c > 0){

            Matrix m1 = new Matrix(r, c);
            Matrix m2 = new Matrix(r, c);
            m1.Generate();
            System.out.println("Matrix 1:");
            m1.Print();
            m2.Generate();
            System.out.println("Matrix 2:");
            m2.Print();

            System.out.println("Sum:");
            Matrix sum = m1.Sum(m2);
            sum.Print();

            System.out.println("Matrix1 * x:");
            Matrix M1x = m1.Multiply(x);
            M1x.Print();
        }
        else{
            System.out.println("Wrong matrix size!");
        }
    }
}