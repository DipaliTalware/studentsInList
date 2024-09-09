package org.student.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Dipali", "Talware", 10);
        Student student2 = new Student("Bob", "Tal", 11);
        Student student3 = new Student("Jane", "Mili", 15);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println("The list of students is: " + studentList);

//        for(Student s: studentList){
//            System.out.println(s);
//        }
        School school = new School();
//        school.addStudents(student1);
//        school.addStudents(student2);
//        school.addStudents(student3);

        school.addStudents(studentList);
        System.out.println(school);

        System.out.println("Task: searching the student in list");
        Student foundStudent = school.searchStudent(13);

        if (foundStudent != null) {
            System.out.println(foundStudent);
        } else System.out.println("Student not found");

        System.out.println("Task: remove the student");
       boolean removedStudent = school.removeStudent(10);
        System.out.println("student removed: "+ removedStudent);

    }
}
