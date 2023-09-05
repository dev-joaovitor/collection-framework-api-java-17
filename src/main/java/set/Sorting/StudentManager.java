package main.java.set.Sorting;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {
    private Set<Student> studentSet;

    public StudentManager() {
        this.studentSet = new HashSet<>();
    }

    public void addStudent(String name, long registration, double grade){
        studentSet.add(new Student(name, registration, grade));
    }

    public void removeStudentByRegistration(long registration) {
        for (Student student: studentSet){
            if (student.getRegistration() == registration){
                studentSet.remove(student);
                return;
            }
        }
    }

    public Set<Student> showStudentsByName() {
        return new TreeSet<>(studentSet);
    }

    public Set<Student> showStudentsByGrade() {
        Set<Student> studentsByGrade = new TreeSet<>(new ComparatorByGrade());

        studentsByGrade.addAll(studentSet);

        return studentsByGrade;
    }

    public void showAllStudents() {
        System.out.println(studentSet);
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent("Joao", 1000, 9.9);
        studentManager.addStudent("Matheus", 1001, 9.5);
        studentManager.addStudent("Carlos", 1002, 5.5);
        studentManager.addStudent("Eduardo", 1003, 8.5);
        studentManager.addStudent("Jose", 1003, 2.5);
        studentManager.addStudent("Jose", 1004, 2.5);
        studentManager.addStudent("Arnaldo", 1005, 2.5);

        // unsorted
        // studentManager.showAllStudents();

        // sorted by name
        // System.out.println(studentManager.showStudentsByName());

        // sorted by grade lowest -> highest
        System.out.println(studentManager.showStudentsByGrade());

    }
}
