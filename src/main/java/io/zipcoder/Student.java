package io.zipcoder;

import java.util.ArrayList;

public class Student extends Classroom{
    public Student(String firstName, String lastName, ArrayList<Double> testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = testScores;
    }
   private String firstName ;
   private String lastName ;
   private ArrayList<Double> testScores;
}
