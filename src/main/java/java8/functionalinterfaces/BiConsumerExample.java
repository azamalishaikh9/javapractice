package java8.functionalinterfaces;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> nameAndActivities = (name, activities) -> System.out.println(name + " : " + activities);

        List<Student> studentList = StudentDatabase.getAllStudents();

        studentList.forEach(student -> nameAndActivities.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a : " + a + ", b : " + b);

        biConsumer.accept("Java7", "Java8");

        BiConsumer<Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplication : " + (a * b));
        };

        BiConsumer<Integer, Integer> division = (a, b) -> {
            System.out.println("Division : " + (a / b));
        };

        multiply.andThen(division).accept(10, 5);

        division.accept(10, 5);

        nameAndActivities();
    }
}
