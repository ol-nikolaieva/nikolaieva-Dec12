package ua.hillel.nikolaieva.homework8and9;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        List <Student> listOfStudents = new ArrayList<>();
        Student student1 = new Student("Tony", 3);
        Student student2 = new Student("Lucy", 3);
        Student student3 = new Student("George", 4);
        Student student4 = new Student("Florence", 1);


        addStudent(listOfStudents, student1);
        addStudent(listOfStudents, student2);
        addStudent(listOfStudents, student3);
        addStudent(listOfStudents, student4);

        printStudents(listOfStudents, 3);

        removeStudent(listOfStudents, student1);

        printStudents(listOfStudents, 3);
    }

    public static void addStudent (List <Student> listOfStudents,  Student student) {
        listOfStudents.add(student);
    }

    public static void  removeStudent (List <Student> listOfStudents,  Student student){
        listOfStudents.remove(student);
    };

    public static void printStudents (List<Student> listOfStudents, int course) {
        Iterator iterator = listOfStudents.iterator();
        while (iterator.hasNext()) {
            Student nextStudent = (Student) iterator.next();
            if (nextStudent.getCourse() == course) {
                System.out.println(nextStudent.getName());
            }
        }

    };
}