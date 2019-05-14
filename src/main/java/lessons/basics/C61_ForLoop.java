package lessons.basics;

public class C61_ForLoop {
    public static void nested(String[] args) {
        // simple example of next for loops
        int max = 9;
        for(int i=0;i<=max;i++) {
            for(int j=0;j<=max;j++){
                System.out.printf("[%d,%d]",i,j);
            }
            System.out.println();
        }
    }

    public static void forloopExample(String[] args) {
        // this demonstrates the basic for loop for iterating a specific number of times
        int max = 10;
        System.out.println("Counting Up...");
        for ( int i =1;i<=max;i++ ) {
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.println("Counting Down...");
        for (int i=max; i>=1; i--) {
            System.out.printf("%d ",i);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // this demonstrates the basic for loop for iterating a specific number of times
        int max = 10;
        System.out.println("Counting Up...");
        for ( int i =1;i<=max;i++ ) {
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.println("Counting Down...");
        for (int i=max; i>=1; i--) {
            System.out.printf("%d ",i);
        }
        System.out.println();

    }
}
