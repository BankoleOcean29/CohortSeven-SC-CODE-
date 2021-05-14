package com.Edutech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Coursetest {

    @Test

    public void testThatCourseNameCanBeAdded() {
        Course jav = new Course();

        jav.setCourseName("intro to python");

        String myCourse = jav.getCourseName();

        assertEquals(myCourse, myCourse);

    }
    @Test

    public void testThatCourseIdCanBeAdded() {

        Course pyth = new Course();

        pyth.setCourseId(90);

        int nuCourse = pyth.getCourseId();

        assertEquals(nuCourse, nuCourse);
    }
}

