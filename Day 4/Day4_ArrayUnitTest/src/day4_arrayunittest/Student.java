/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_arrayunittest;

import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class Student {
    int StudentID;
    String name;
    int percentage;
    
    Student() {
        this.StudentID = 0;
        this.name = "Unknown";
        this.percentage = 0;
    }
    
    Student(int StudentID, String name, int percentage) {
        this.StudentID = StudentID;
        this.name = name;
        this.percentage = percentage;
    }
    
    void setID(int ID) {
        this.StudentID = ID;
    }
    
    int getID() {
        return this.StudentID;
    }
    
    void setTitle(String name) {
        this.name = name;
    }
    String getTitle() {
        return this.name;
    }
    void setRating(int rate) {
        this.percentage = rate;
    }
    int getRating() {
        return this.percentage;
    }
    
    void displayInfo() {
        System.out.println("StudentID : " + this.StudentID + "\n Student Name : " + this.name + "\n Student Percenatge : " + this.percentage);
    }
}


class studentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareToIgnoreCase(o2.name);
    }
    
}