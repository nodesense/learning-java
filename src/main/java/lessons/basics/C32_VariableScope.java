package lessons.basics;

public class C32_VariableScope {
    public static void main(String[] args) {
        String name = "Tony";
        SayHello("Bob");
        SayHello(name);
        name = "Pete";
        SayHello(name);
    }

    public static void SayHello( String name ) {
        System.out.printf("Hello, %s\n",name);
        name="George";
    }
}
