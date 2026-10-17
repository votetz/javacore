package generics.practice;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Getter
public class Student implements Comparable<Student> {
    private final String name;
    private final double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + " - " + "Grade: " + grade;
    }

    @Override
    public int compareTo(Student other) {
        int result = Double.compare(grade, other.grade);
        if (result != 0) {
            return result;
        }
        return name.compareTo(other.name);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Max", 60));
        students.add(new Student("Alex", 60));
        students.add(new Student("Bob", 75));
        students.add(new Student("Sam", 50));

        students.sort(
                Comparator.comparingDouble(Student::getGrade)
                        .reversed()
                        .thenComparing(Student::getName)
        );

        System.out.println(students);
    }
}
