package com.soma.app.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.soma.app.cli.service.CourseRetrievalService;
import com.soma.app.cli.service.PluralsightCourse;

public class CourseRetriever {

    private static final Logger LOG = LoggerFactory.getLogger(CourseRetriever.class);
    public static void main(String... args) {
        LOG.info("CourseRetriever started");

        if (args.length == 0) {
            LOG.warn("Please provide an author name as first argument.");
            return;
        }

        try {
            // retrieveCourses(args[0]);
            PluralsightCourse course = new PluralsightCourse("id", 
                "title", "08:54:57", "https://url", false);
            // methods available automatically 
            // course.id();
            // course.contentUrl();
            // course.duration();
            // course.isRetired();
            // course.title();
            LOG.info("Course : {}", course); 

            // retrieveCourses(course.id());



        } catch (Exception e) {
            LOG.error("Unexpected error.", e);
            // e.printStackTrace();
        }
        
    }

    private static void retrieveCourses(String authorId) {
        LOG.info("Retrieving courses for author '{}'", authorId);
        CourseRetrievalService courseRetrievalService = new CourseRetrievalService();
        
        String coursesToStore = courseRetrievalService.getCoursesFor(authorId);
        LOG.info("Retrieved the following courses {}", coursesToStore);
        }
        
}