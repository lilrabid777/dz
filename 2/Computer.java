public class Computer {
    private String name;
    private double price;
    private int year;

    public Computer(String name, double price, int year) {
        this.name = name;
        this.price = price;
        this.year = year;
    }

    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getYear() {return year;}
    public String toString(){
        return "Computer "+ name +
                "; price: " + price +
                "$; year: " + year;
    }
}
