package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int rollNumber;
    List<String> subjects;

    /*
     * Student class constructor.
     * @param name Name of the student.
     * @param rollNumber Roll Number of the student.
     */
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = new ArrayList<>();
    }

    /*
     * This is a method to add subjects to the student class.
     * @param subject Name of the subject.
     * @return void Does not return anything.
     */
    void addSubject(String subject) {
        this.subjects.add(subject);
    }

    /*
     * Method to return if student has sujects associated.
     * @param None
     * @return boolean Returns true if students have subjects associate, false otherwise.
     */
    boolean hasSubjects(){
        if(subjects.size() > 0) return true;
        return false;
    }
}
