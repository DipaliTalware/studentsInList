package org.student.example;

public class Student {
    private String firstName;
    private String lastName;
    private int studentID;

    public Student(String firstName, String lastName, int studentID){
        this.firstName=firstName;
        this.lastName = lastName;
        this.studentID =studentID;
    }

    public int getStudentID() {
        return studentID;
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
