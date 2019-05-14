package lessons.arrays;

public class C201_ArrayBasics {
    public static void main(String[] args) {
        int[] grades = new int[4];  //declare empty array of size 4
        //assign values
        grades[0] = 77;
        grades[1] = 84;
        grades[2] = 80;
        grades[3] = 96;

        // or make the array and assign the values all in one statement.
        String[] students = { "Tom", "Ed", "Joe", "Bob"};

        System.out.printf("#\tStudent\tGrade\n");
        System.out.printf("-\t-------\t-----\n");

        // for loops are useful for enumerating arrays
        for (int i=0;i<grades.length;i++)
        {
            System.out.printf("%d\t%s\t%d\n",i, students[i], grades[i]);
        }
    }
}
