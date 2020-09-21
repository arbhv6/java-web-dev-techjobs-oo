package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob1;
    Job testJob2;
    Job testJob3;
    Job testJob4;

    @Before
    public void createTwoJobs(){
        testJob1 = new Job();
        testJob2 = new Job();
        testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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

//    public static void main(String[] args) {
//        System.out.println(testJob1.toString());
//    }
}


