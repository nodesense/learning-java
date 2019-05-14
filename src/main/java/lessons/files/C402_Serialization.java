package lessons.files;

import lessons.arrays.Student;

import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;

public class C402_Serialization {
    public static class Student implements Serializable {
        private String Name;
        private double GPA;

        public Student(String name, double gpa) {
            this.Name = name;
            this.GPA = gpa;
        }

        public String getName() {
            return this.Name;
        }

        public String setName(String newName) {
            return (this.Name = newName);
        }

        public double getGPA() {
            return this.GPA;
        }

        public double setGPA(double newGPA) {
            return (this.GPA=newGPA);
        }

        @Override
        public String toString() {
            return String.format("%s\t%f",this.Name, this.GPA);
        }


    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("students.txt");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Tom",3.921));
        students.add(new Student("Dave", 4.0));
        students.add(new Student("Bill",2.0));

        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(fo);
        for ( Student s : students) {
            output.writeObject(s);
        }
        output.close();
        fo.close();

        FileInputStream is = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(is);

        try {
            while(true) {
                Student s = (Student)input.readObject();
                System.out.println(s);
            }
        } catch (EOFException ex) {

        }




    }
}
