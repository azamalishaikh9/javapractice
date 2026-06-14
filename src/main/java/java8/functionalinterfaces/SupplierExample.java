package java8.functionalinterfaces;

import data.Student;
import data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author Azam
 **/
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam", 2, 3.6, "male", Arrays.asList("Swimming", "basketball", "volleyball"));
        };

        Supplier<List<Student>> listSupplier = () -> StudentDatabase.getAllStudents();

        System.out.println("Student is : " + studentSupplier.get());
        System.out.println("Student are : " + listSupplier.get());
    }
}
