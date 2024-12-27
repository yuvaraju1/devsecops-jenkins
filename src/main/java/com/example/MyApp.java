package com.example;

import java.util.HashMap;
import java.util.Map;

public class CombinedApp {

    // MyApp functionality
    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        return "Hello, " + name + "!";
    }

    // VulnerableApp functionality
    public static void main(String[] args) {
        // VulnerableApp code (hardcoded secrets)
        String username = "admin";
        String password = "admin123";

        // Hardcoded sensitive data - Secrets
        String API_KEY = "12345-abcde-67890-fghij";
        String DB_PASSWORD = "password123";
        String SECRET_KEY = "secret-key-value";

        // A simulated database connection (insecure)
        String dbConnection = "jdbc:mysql://localhost:3306/mydb?user=root&password=" + DB_PASSWORD;

        // API Call (with API Key)
        String apiUrl = "https://api.example.com/endpoint?apikey=" + API_KEY;

        // Code that simulates a potential security vulnerability
        Map<String, String> data = new HashMap<>();
        data.put("username", username);
        data.put("password", password);
        data.put("dbConnection", dbConnection);

        // Print vulnerable data
        System.out.println("Vulnerable application running...");
        System.out.println("API URL: " + apiUrl);
        System.out.println("Database connection string: " + dbConnection);
        System.out.println("User credentials: " + data);

        // MyApp functionality: Greet method
        CombinedApp app = new CombinedApp();
        System.out.println(app.greet("World"));
    }
}

