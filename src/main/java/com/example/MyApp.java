package com.example;

public class MyApp {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        MyApp app = new MyApp();
        System.out.println(app.greet("World"));
    }
}
