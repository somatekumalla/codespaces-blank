package com.soma.app.cli.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CourseRetrievalService {

    private static final String PS_URI = "https://app.pluralsight.com/profile/data/author/%s/all-content";

    // newHttpClient class is available and has good default values
    private static final HttpClient CLIENT = HttpClient.newHttpClient();

    // private HttpResponse<String> response;

    public String getCoursesFor(String authorId) {
                              
        String formatted = PS_URI.formatted(authorId);        

        HttpRequest request = HttpRequest
            .newBuilder(URI.create(formatted))
            .build();
        
        // ofString() is an available Body Handler        
        try {
            HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Could not call Pluralsight API", e);
        }


        
        }
        
}
