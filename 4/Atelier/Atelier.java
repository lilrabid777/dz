import java.util.ArrayList;
public interface Atelier{
    static ArrayList<Clothes> сlothesList = new ArrayList<Clothes>();
    public static void dressMan(ArrayList<Clothes> list) {
        for (int i = 0; i < list.size(); i++) {
                if (list.get(i) instanceof MenClothing)
            ((MenClothing) list.get(i)).dressMan();
        }
    }
    public static void dressWoman(ArrayList<Clothes> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof WomenClothing)
            ((WomenClothing) list.get(i)).dressWomen();
        }
    }
    public static void main(String[] args) {
        сlothesList.add(new Pants());
        сlothesList.add(new TShirt());
        сlothesList.add(new Skirt());
        сlothesList.add(new Tie());
        dressMan(сlothesList);
        dressWoman(сlothesList);
    }
}