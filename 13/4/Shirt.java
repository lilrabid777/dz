public class Shirt {
    private String article, model, colour, size;
    public Shirt(String stringToParse){
        String[] s = stringToParse.split(",");
        article = s[0];
        model = s[1];
        colour = s[2];
        size = s[3];
    }
    public String toString() {
        return "Shirt{ " +
                "article = " + article +
                ", model = " + model +
                ", colour = " + colour +
                ", size = " + size +
                " }";
    }
}
