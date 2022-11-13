import java.util.Scanner;
import java.util.ArrayList;
public class Shop {

    public enum Items{
        Apples(1), Bananas(1.5), Grapes(2.5), Oranges(2);
        private double cost;
        private Items(double cost){this.cost = cost;}
        public double getCost(){return this.cost;}
        public void setAT(double at){this.cost = cost;}
    }

    public static void main(String[] args) {
        int logged = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your login:");
        String login = scan.next();
        System.out.println("Enter your password:");
        String password = scan.next();
        System.out.println("You have logged!");
        int c = 0;
        for (Items a: Items.values()){
            c++;
            System.out.println(c+")"+"Cost of 1 kg of "+a+" is "+a.getCost()+"$");
        }
        System.out.println("Enter product number to add it to your cart. To exit enter 0.");
        int i = scan.nextInt();
        double cost = 0, amount = 0;
        double[] cart = new double[Items.values().length];
        while (i!=0){
            if(i<Items.values().length){
                System.out.println("How much kg?");
                amount = scan.nextDouble();
                cart[i-1] += amount;
            }else{
                System.out.println("Incorrect input! Try again.");
            }
            System.out.println("Anything else?");
            i = scan.nextInt();
        }
        System.out.println("Your cart is:");
        int x = 0;
        for (Items a: Items.values()){
            if(cart[x]!=0){
                cost += a.getCost();
                System.out.println(cart[x]+" kg of "+a);
            }
            x++;
        }
        System.out.println("The total cost is: "+cost+"$");
    }
}
