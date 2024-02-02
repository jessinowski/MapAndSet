package com.github;

public class Course {
    // Bonus Course:(fromListTask)
    // Expand the Java-List project with a class called "Course"
    // that has the following properties: course name, instructor, room.
    private String courseName;
    private String instructor;
    private int room;

    public Course(String courseName, String instructor, int room) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.room = room;
    }

    //Getter und Setter
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", room=" + room +
                '}';
    }
}
