package com.soma.app.cli.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;



class PluralsightCourseTest {

    // Note - We want to replace these tests with parameterized tests.
    @Test
    void durationInMinutes() {        
        PluralsightCourse course = 
        new PluralsightCourse("id", "Test Course", "00:05:37", "url", false);
        assertEquals(5, course.durationInMinutes());
    }

    @Test
    void durationInMinutesOverHour() {        
        PluralsightCourse course = 
        new PluralsightCourse("id", "Test Course", "01:08:54.9613330", "url", false);
        assertEquals(68, course.durationInMinutes());
    }

    @Test
    void durationInMinutesZero() {        
        PluralsightCourse course = 
        new PluralsightCourse("id", "Test Course", "00:00:00", "url", false);
        assertEquals(0, course.durationInMinutes());
    }
}