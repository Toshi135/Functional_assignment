package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    String roomID;
    List<Student> students;

    /*
     * Constructor of class Classroom.
     * @param roomID Room Id of the classroom.
     */
    ClassRoom(String roomID){
        this.roomID = roomID;
        this.students = new ArrayList<>();
    }

    /*
     * Method to add students in the classroom class.
     * @param Student Student which needs to be added in the class.
     * @return void Does not return anything.
     */
    void addStudent(Student student) {
        this.students.add(student);
    }

    /*
     * Method to return if students are there in class
     * @param None
     * @return boolean Return true if students are present, false otherwise.
     */
    boolean hasStudents() {
        if(students.size() > 0) return true;
        return false;
    }



}

