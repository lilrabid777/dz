import java.util.StringTokenizer;

public class Address {
    String country, region, city, street, house, building, flat;

    public Address(String stringToParse){
        StringTokenizer str = new StringTokenizer(stringToParse, ",.;");

        String[] s = new String[str.countTokens()];

        int i = 0;
        while(str.hasMoreTokens()) s[i++] = str.nextToken();

        if(s.length < 7) throw new IllegalArgumentException("Address is not correct!");
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        building = s[5].trim();
        flat = s[6].trim();
    }

    public String toString() {
        return "Address{" +
                "country=" + country +
                "; region=" + region +
                "; city=" + city +
                "; street=" + street +
                "; house=" + house +
                "; building=" + building +
                "; flat=" + flat +
                "}";
    }
}