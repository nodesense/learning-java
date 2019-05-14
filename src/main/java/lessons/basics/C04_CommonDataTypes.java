package lessons.basics;

public class C04_CommonDataTypes {
    public static void main(String[] args) {
        String studentName = "Bette Itall";
        int age = 22;
        double gpa = 3.75;
        boolean isFemale = true;
        System.out.printf("%s is %d years old. %s has a %4.3f gpa.\n",
                studentName,
                age,
                (isFemale ? "She" : "He"),
                gpa);
    }
}
