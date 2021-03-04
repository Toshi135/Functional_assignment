package com.assignment;

import java.util.*;







public class Assignment {
    public static void main(String[] args){

        // create classrooms
        ClassRoom room1 = new ClassRoom("room1");
        ClassRoom room2 = new ClassRoom("room2");
        ClassRoom room3 = new ClassRoom("room3");

        // List of classrooms
        List<ClassRoom> classrooms = new ArrayList<>();
        classrooms.add(room1);
        classrooms.add(room2);
        classrooms.add(room3);

        // create students
        Student ramesh = new Student("ramesh",1);
        Student suresh = new Student("suresh",2);
        Student rajesh = new Student("rajesh",3);
        Student rakesh = new Student("rakesh",4);
        Student ravi = new Student("ravi",5);

        // creating subjects
        String maths = "maths";
        String english = "english";
        String science = "science";
        String hindi = "hindi";

        // adding subjects
        suresh.addSubject(maths);
        suresh.addSubject(english);
        suresh.addSubject(science);
        suresh.addSubject(hindi);
        rakesh.addSubject(english);
        rakesh.addSubject(science);

        // adding students
        room1.addStudent(ramesh);
        room1.addStudent(suresh);
        room2.addStudent(rajesh);
        room2.addStudent(rakesh);
        room2.addStudent(ravi);

        //  Operation on class room list
        for (ClassRoom classroom: classrooms) {

            System.out.println("classroom "+classroom.roomID);

            //  Find the students associated with a room that have no subjects associated.
            for(Student student:classroom.students) {
                if(!student.hasSubjects()){
                    System.out.println("Student associated "+student.name);
                }

                //  Find the subjects of students associated with a room.
                for(String subject: student.subjects){
                    System.out.println("subject opted by "+student.name+ "," +subject);
                }
            }

            //  print "hello Student" if a room has students associated.
            if(classroom.hasStudents()){
                System.out.println("Hello Students");
            }

            System.out.println("---------------------------------------------");
        }
    }
}
