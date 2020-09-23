package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob1; //only ID
    Job testJob2; //only ID
    Job testJob3; //full constructor used
    Job testJob4; //full constructor used
    Job testJob5; //core competency left blank

    @Before
    public void createTwoJobs(){
        testJob1 = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(testJob1.getId()+1, testJob2.getId(), 0);
        //assertFalse(testJob1.getId() == testJob2.getId());
        assertTrue(testJob1.getId() != testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob3 instanceof Job);
        assertTrue("Issue with Job 'name' value being assigned.", testJob3.getName() == "Product tester");
        assertTrue("Issue with Job 'employer' value being assigned.", testJob3.getEmployer().getValue() == "ACME");
        assertTrue("Issue with Job 'location' value being assigned.", testJob3.getLocation().getValue() == "Desert");
        assertTrue("Issue with Job 'positionType' value being assigned.", testJob3.getPositionType().getValue() == "Quality control");
        assertTrue("Issue with Job 'coreCompetency' value being assigned.", testJob3.getCoreCompetency().getValue() == "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJob3.equals(testJob4));
    }

    @Test
    public void testToStringFirstTest() {
        assertTrue(testJob3.toString().endsWith("\n") && testJob3.toString().startsWith("\n"));
    }

    @Test
    public void testToStringSecondTest() {
        assertTrue(testJob3.toString().contains("ID: " + testJob3.getId() +
                "\nName: " + testJob3.getName() +
                "\nEmployer: " + testJob3.getEmployer().getValue() +
                "\nLocation: " + testJob3.getLocation().getValue() +
                "\nPosition Type: " + testJob3.getPositionType().getValue() +
                "\nCore Competency: " + testJob3.getCoreCompetency().getValue()
        ));
    }

    @Test
    public void testToStringThirdTest() {
        assertTrue(testJob5.toString().contains("ID: " + testJob5.getId() +
                "\nName: " + testJob5.getName() +
                "\nEmployer: " + testJob5.getEmployer().getValue() +
                "\nLocation: " + testJob5.getLocation().getValue() +
                "\nPosition Type: " + testJob5.getPositionType().getValue() +
                "\nCore Competency: " + "Data not available"
        ));
    }

//    public static void main(String[] args) {
//        System.out.println(testJob1.toString());
//    }
}


