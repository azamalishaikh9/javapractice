package java8.functionalinterfaces;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel() {
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGpa() {
        System.out.println("filterStudentByGpa");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if (p2.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudents() {
        System.out.println("filterStudent");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if (p1.or(p2).negate().test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudents();
    }
}
