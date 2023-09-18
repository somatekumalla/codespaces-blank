package com.soma.app.cli.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class PluralsightCourseTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            01:08:54.9613330, 68
            00:05:03, 5
            00:00:00, 0
            """)
    void durationInMinutes(String input, long expected) {
        PluralsightCourse course =
        new PluralsightCourse("id", "Test Course", input, "url", false);
        
        assertEquals(expected, course.durationInMinutes());
        }
    
}