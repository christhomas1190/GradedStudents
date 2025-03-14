package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

public class StudentTest {
    String firstName = "";
    String lastName= "";
    ArrayList<Double> testScores = new ArrayList<>();
    private Student student;

    private void setUp() {
         student = new Student(firstName, lastName,testScores);
    }
    @Test
    public void setStudent(){
        setUp();
        //Given
        student.setfirstName("Jey");
        student.setlastName("Uso");
        testScores.add(100.0);
        student.settestScores(testScores);
        //When
        String expectedFirst = "Jey";
        String expectedLast = "Uso";
        ArrayList<Double> expectedScores = new ArrayList<>();
        expectedScores.add(100.0);
        //Then
        Assert.assertEquals(student.getFirstName(),expectedFirst);
        Assert.assertEquals(student.getLastName(),expectedLast);
        Assert.assertEquals(expectedScores,expectedScores);

    }

}