package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ClassroomTest {
    ArrayList<Double> testScores = new ArrayList<>();
    private ArrayList<Student> student;

    private void setUp(){
        student = new ArrayList<Student>();
    }

    @Test
    public void setTestScores(){
        setUp();
        //Given
        testScores.add(100.0);
        //When
        ArrayList<Double> expectedScores = new ArrayList<>();
        expectedScores.add(100.0);
        //Then
        Assert.assertEquals(expectedScores,expectedScores);
    }
    @Test
    public void setTestScores2() {
        setUp();
        //Given
        testScores.add(78.0);
        //When
        ArrayList<Double> expectedScores = new ArrayList<>();
        expectedScores.add(78.0);
        //Then
        Assert.assertEquals(expectedScores, expectedScores);
    }
}
