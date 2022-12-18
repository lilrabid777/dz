import java.lang.Math;
public class InsertSort {
    public static void Sort(Student[] S) {
        for (int i = 0; i < S.length; i++) {
            int min = S[i].getID();
            int I = i;
            for (int j = i + 1; j < S.length; j++)
                if (S[j].getID() < min) {
                    min = S[j].getID();
                    I = j;
                }
            if (i != I) {
                Student swap = S[i];
                S[i] = S[I];
                S[I] = swap;
            }
        }
    }
    public static void main(String[] args) {
        Student[] S = new Student[10];
        System.out.println("Original:");
        for (int i = 0; i < S.length; i++) {
            S[i] = new Student((int)(Math.random()*100),0);
            System.out.print(S[i].getID()+" ");
        }
        Sort(S);
        System.out.println("\nSorted:");
        for (int i = 0; i < S.length; i++) {
            System.out.print(S[i].getID()+" ");
        }
    }
}
