public class B1 {
    public static void main(String[] args){
        Ball B = new Ball(0.0, 0.0);
        B.setX(1.0);
        System.out.println(B.getX());
        B.setY(1.0);
        System.out.println(B.getY());
        B.setXY(2.0, 2.0);
        B.move(-1.0, 1.0);
        System.out.println(B.toString());
    }
}
