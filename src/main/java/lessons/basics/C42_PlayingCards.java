package lessons.basics;

import java.util.Random;

public class C42_PlayingCards {
    public static void main(String[] args) {
        Random gen = new Random();
        C42_Card  c1 = new C42_Card(C42_Ranks.ACE,C42_Suits.HEARTS);
        C42_Card c2 = new C42_Card(gen.nextInt(52));

        System.out.printf("Cards: %s %s\n",c1.toString(),c2.toString());
        System.out.printf("SAME RANK : %s\n", c1.sameRank(c2));
        System.out.printf("SAME SUIT : %s\n", c1.sameSuit(c2));
        System.out.printf("SAME CARD : %s\n", c1.sameCard(c2));
    }
}
