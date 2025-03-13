package io.zipcoder;

import java.util.ArrayList;

public class Student extends Classroom{
    private String firstName ;
    private String lastName ;
    private ArrayList<Double> testScores;

    public Student(String firstName, String lastName, ArrayList<Double> testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;

    }


   public String getFirstName() {
        return this.firstName;
   }
   public String getLastName() {
        return this.lastName;
   }
    public ArrayList gettestScores() {
        return this.testScores;
    }
    void setfirstName(String firstName) {
       this.firstName=firstName;
    }
    void  setlastName(String lastName) {
        this.lastName=lastName;
    }
   void  settestScores(ArrayList score) {
       this.testScores= score;
    }
}

