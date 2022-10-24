public class T5 {
    public static int f (int a){
        if (a < 0){
            return 0;
        }
        if (a == 1 || a == 0) {
            return 1;
        }
        return a*f(a-1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(f(n));
    }
}
