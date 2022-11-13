public class Seasons {
    public enum S{
        WINTER(-10), SUMMER(20), SPRING(10), FALL(5);
        private double at;
        private S(double at){this.at = at;}
        public double getAT(){return this.at;}
        public void setAT(double at){this.at = at;}
        public void getDescription(){
            if(this.getAT()>15){
                System.out.println("It's warm season");
            }
            else{
                System.out.println("It's cold season");
            }
        }
    }
    static void iLike(S x){
        switch(x){
            case SUMMER:
                System.out.println("I like "+x);
                break;
            default:
                System.out.println("I don't like "+x);
        }
    }
    public static void main(String[] args){
        S n = S.SUMMER;
        System.out.println("Average temperature in "+n+" is "+n.getAT()+"C");
        n.getDescription();
        iLike(n);
        for (S a: S.values()){
            System.out.println("Average temperature in "+a+" is "+a.getAT()+"C");
            a.getDescription();
        }
    }
}
