public class T4 {
    public static void main(String[] args) {

        String[] stringShirts = new String[11];
        stringShirts[0] = "S001,Black Polo Shirt,Black,XL";
        stringShirts[1] = "S002,Black Polo Shirt,Black,L";
        stringShirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        stringShirts[3] = "S004,Blue Polo Shirt,Blue,M";
        stringShirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        stringShirts[5] = "S006,Black T-Shirt,Black,XL";
        stringShirts[6] = "S007,White T-Shirt,White,XL";
        stringShirts[7] = "S008,White T-Shirt,White,L";
        stringShirts[8] = "S009,Green T-Shirt,Green,S";
        stringShirts[9] = "S010,Orange T-Shirt,Orange,S";
        stringShirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] shirtShirts = new Shirt[stringShirts.length];
        for (int i = 0; i < stringShirts.length; i++) {
            shirtShirts[i] = new Shirt(stringShirts[i]);
            System.out.println(shirtShirts[i]);
        }
    }
}
