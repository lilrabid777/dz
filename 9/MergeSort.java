import java.util.ArrayList;

public class MergeSort {
    public static ArrayList<Integer> Sort(ArrayList <Integer> left, ArrayList <Integer> right) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (left.size() > 0 && right.size() > 0) {
            if (left.get(0) < right.get(0)) {
                arr.add(left.get(0));
                left.remove(0);
            } else {
                arr.add(right.get(0));
                right.remove(0);
            }
        }
        left.addAll(right);
        arr.addAll(left);
        return arr;
    }
    public static ArrayList<Integer> mergeSort(ArrayList <Integer> array) {
        int middle = array.size() / 2;
        if (array.size() < 2) {return array;}
        ArrayList<Integer> left = new ArrayList<Integer>(array.subList(0, middle));
        for (int i = 1; i <= middle; i++) {array.remove(0);}
        return Sort(mergeSort(left), mergeSort(array));
    }

    public static void main(String[] args) {
        ArrayList <Student> S = new ArrayList<>();
        ArrayList<Integer> sortedList;
        System.out.println("Original:");
        for (int i = 0; i < 10; i++) {
            S.add(new Student(i,(int)(Math.random()*100)));
            System.out.print(S.get(i).getGPA()+" ");
        }
        System.out.println("\nSorted:");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < S.size(); i++) {
            list.add(S.get(i).getGPA());
        }
        sortedList = mergeSort(list);
        for (Integer x : sortedList) {
            System.out.print(x + " ");
        }
    }
}