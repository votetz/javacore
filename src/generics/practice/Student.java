package generics.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        return Double.compare(grade, other.grade);
    }
    
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 60));
        students.add(new Student("Bob", 75));
        students.add(new Student("Sam", 50));

        Collections.sort(students);
        System.out.println(students);
    }
}
