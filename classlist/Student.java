import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList();
        addStudents(studentNames);
        displayStudents(studentNames);
    }// end method main

    static void displayStudents(ArrayList<String> studentNames) {
        for (String student : studentNames)
            System.out.println("Student Name: " + student);
        // endfor
    }// end method displayStudents

    static void addStudents(ArrayList<String> studentNames) {
        // Add the names of everyone in your class
        studentNames.add("Mark");
        studentNames.add("Andrew");
        studentNames.add("Beth");
        studentNames.add("Bagas");
        studentNames.add("Renz");
    }// end method addStudents
}// end class Student