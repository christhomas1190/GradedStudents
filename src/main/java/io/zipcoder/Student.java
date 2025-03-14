package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName ;
    private String lastName ;
    private ArrayList<Double> testScores;

    public Student(String firstName, String lastName, ArrayList<Double> testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;

    }


    public String getFirstName() {
        return firstName;
   }
   public String getLastName() {
        return lastName;
   }
    public ArrayList<Double> gettestScores() {
        return testScores;
    }
    public void setfirstName(String firstName) {
       this.firstName=firstName;
    }
    public void  setlastName(String lastName) {
        this.lastName=lastName;
    }
    public void  settestScores(ArrayList<Double> score) {
       this.testScores= score;
    }
    public void addtestScores(Double newScore){
        testScores.add(newScore);
    }

}

