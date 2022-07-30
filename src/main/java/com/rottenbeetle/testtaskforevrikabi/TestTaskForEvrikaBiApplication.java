package com.rottenbeetle.testtaskforevrikabi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class TestTaskForEvrikaBiApplication {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        String url = "http://localhost:8080/";

        SpringApplication.run(TestTaskForEvrikaBiApplication.class, args);

        try {
            rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
