package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyAppTest {

    @Test
    void testGreetValidName() {
        MyApp app = new MyApp();
        String result = app.greet("John");
        assertEquals("Hello, John!", result, "The greeting message is incorrect!");
    }

    @Test
    void testGreetNullName() {
        MyApp app = new MyApp();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            app.greet(null);
        });
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }

    @Test
    void testGreetEmptyName() {
        MyApp app = new MyApp();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            app.greet("");
        });
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }
}
