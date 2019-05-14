package lessons.generics;

public class C501_GenTypeExample {

    public static class GenType<T> {
        private T t;

        public T get() {
            return this.t;
        }

        public void set(T t1) {
            this.t = t1;
        }
    }


    static class Student{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


    public static void main(String args[]) {

        // Generic type with Integer Type
        GenType<Integer> type = new GenType<>();
        type.set(10); // valid
        System.out.println(type.get());

        // Generic type with String Type
        GenType<String> typeStr = new GenType<>();
        typeStr.set("String");
        System.out.println(typeStr.get());

        // Generic type with Custom Student Type
        GenType<Student> genericType = new GenType<>();
        Student student = new Student();
        student.setName("Venkat");
        genericType.set(student);
        System.out.println(genericType.get());


        @SuppressWarnings("rawtypes")
        GenType type1 = new GenType(); // raw type
        type1.set("Venkat"); // valid
        type1.set(10); // valid and autoboxing support
        System.out.println("Raw Type :" + type1.get());
    }
}
