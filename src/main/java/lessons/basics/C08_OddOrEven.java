package lessons.basics;
import java.util.Scanner;

public class C08_OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int i = input.nextInt();
        String result =  i%2 == 0 ? "EVEN" : "ODD";
        System.out.printf("%d is %s\n",i,result);
    }
}
