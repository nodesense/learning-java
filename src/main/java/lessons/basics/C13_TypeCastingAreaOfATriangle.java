package lessons.basics;

import java.util.Scanner;

public class C13_TypeCastingAreaOfATriangle {
    public static void main(String[] args) {
        int base, height;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter triangle base : ");
        base = input.nextInt();
        System.out.print("Enter triangle height : ");
        height = input.nextInt();
        area = (base * (double) height) / 2;
        System.out.printf("Triangle area : %.1f\n", area);
    }
}
