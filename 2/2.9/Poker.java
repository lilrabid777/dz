import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        String[] suits = {"S", "C", "D", "H"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10","V", "Q", "K", "A"};
        int n = 52;
        String[] deck = new String[52];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck[i*13 + j] = rank[j] + " " + suits[i];
            }
        }

        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < players * 5; i++) {
            System.out.println(deck[i]);
        }
    }
}