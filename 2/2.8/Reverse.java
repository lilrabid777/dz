public class Reverse {
    public static void main(String[] args){
        String[] str = { "123 "," 345 "," 678 "," 910"};
        for (String i : str){
            System.out.print(i);
        }
        System.out.println();
        int n = str.length;
        String a;
        for (int i = 0; i < n/2; i++) {
            a = str[n-i-1];
            str[n-i-1] = str[i];
            str[i] = a;
        }
        for (String i : str){
            System.out.print(i);
        }
    }
}
