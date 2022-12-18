import java.util.ArrayList;

public class QuickSort {
    public static void quickSort(ArrayList<Student> array, int size){
        Student middle = array.get(size/2);
        ArrayList<Student> left = new ArrayList<>();
        ArrayList<Student> right = new ArrayList<>();
        ArrayList<Student> eq = new ArrayList<>();
        for(int i = 0; i < size; i++){
            if(array.get(i).compareTo(middle) > 0){
                right.add(array.get(i));
            }
            else if (array.get(i).compareTo(middle) < 0)
                left.add(array.get(i));
            else eq.add(array.get(i));
        }
        ArrayList<Student> leftArr = new ArrayList<>();
        ArrayList<Student> rightArr = new ArrayList<>();
        if(left.size()>0) {
            quickSort(left, leftArr.size()-1);
        }
        if(right.size() > 0) {
            quickSort(right, size-1);
        }
    }
    public static void main(String[] args) {
        ArrayList <Student> S = new ArrayList<>();
        System.out.println("Original:");
        for (int i = 0; i < 10; i++) {
            S.add(new Student(i,(int)(Math.random()*100)));
            System.out.print(S.get(i).getGPA()+" ");
        }
        System.out.println("\nSorted:");
        quickSort(S, S.size()-1);
        for (Student s : S) {
            System.out.print(s.getID()+" ");
        }
    }
}
