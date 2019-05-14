package lessons.arrays;
import java.util.ArrayList;

public class C203_ArrayList {
    public static void main(String[] args) {
        // Let's demonstrate some basics of arraylists
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(85);
        grades.add(70);
        System.out.printf("Second Grade : %d\n", grades.get(1));
    }
}
