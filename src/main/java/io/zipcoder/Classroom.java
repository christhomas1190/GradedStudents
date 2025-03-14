package io.zipcoder;

import java.util.ArrayList;

public class Classroom {
private ArrayList<Student> student;
private Integer maxStudents;
private Double[] testScores;


public Classroom(){};

public Classroom(Integer maxStudents){
    this.maxStudents= maxStudents;
}

  public Classroom(ArrayList<Student> student){
    this.student=student;
  }
  public ArrayList<Student>  getStudents(){
    return student;
  }
  public Integer getMaxStudents() {
    return maxStudents;
  }

}

