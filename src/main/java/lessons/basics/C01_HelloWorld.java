package lessons.basics;

public class C01_HelloWorld {
    /**
     * main() function executes when Java program is run.
     *
     * public = accessible to all
     * static = does not need to be declared to be used
     * void = returns nothing
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!!!!!");

        String yourName;    // Set aside some memory, refer to it as yourName
        yourName = "Krish";  // set memory at yourName to value "Krish"
        System.out.printf("Hello, %s!!!!!\n", yourName); // say hello

    }
}
