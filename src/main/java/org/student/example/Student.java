package org.student.example;

//Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.
//Step 2: Create a Java List for elements of type "Student" and add multiple students.


import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int studentID;
    private List<Course> courses = new ArrayList<>();

    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void addCourses(Course course){
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Student: {" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}
