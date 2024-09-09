package org.student.example;

import java.util.ArrayList;
import java.util.List;

//Step 3: Create a class "School" to which students can be added through a method ('addStudent').
//Step 4: Implement a method to print all students of the school (as text, to the console).

public class School {

    List<Student> students = new ArrayList<>();

    public void addStudents(Student student) {
        this.students.add(student);
    }

    public void addStudents(List<Student> students){
        this.students.addAll(students);
    }


//    Step 5: Add a method to find a student by their ID. The found student should be returned.
    public Student searchStudent(int studentID){
        for(Student s: students){
            if(studentID == s.getStudentID()){
                return s;
            }
        }
        return null;
    }

//    Step 6: Create a method to remove a student from the school.

    public boolean removeStudent(int studentID){
      return students.removeIf(s -> studentID == s.getStudentID());
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
