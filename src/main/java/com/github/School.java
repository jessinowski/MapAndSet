package com.github;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    // Step 1:
    // Convert your application from the List lecture so that the School Object uses a Hashmap
    // instead of an ArrayList.

    // Step 3:(fromListTask)
    // Create a class "School" to which students can be added through a method ('addStudent').
    private Map<Integer, Student> studentList = new HashMap<>();

    public void addStudent(int studentID,Student student) {
        studentList.put(studentID, student);
    }

    // Step 5:(fromListTask)
    // Add a method to find a student by their ID.
    // The found student should be returned.
    public Student findStudentByID(int id) {
        return studentList.get(id);
    }

    // Step 6:(fromListTask)
    // Create a method to remove a student from the school.
    public void removeStudent(int id){
        studentList.remove(id);
    }

    // Bonus Course:(fromListTask)
    // Implement a method within the School class to retrieve all courses of a specific student
    // (based on a student ID).
    public List<Course> retrieveCourses(int id){
        return findStudentByID(id).getCourseList();
    }

    // Step 4:(fromListTask)
    // Implement a method to print all students of the school (as text, to the console).
    @Override
    public String toString() {
        return "School{" +
                "students=" + studentList +
                '}';
    }
}
