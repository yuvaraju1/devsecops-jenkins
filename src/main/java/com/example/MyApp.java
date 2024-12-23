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

//the below code is from VulnerableApp.java file 


package com.example.vulnerable;

import java.util.HashMap;
import java.util.Map;

public class VulnerableApp {

    // Hardcoded sensitive data - Secrets
    private static final String API_KEY = "12345-abcde-67890-fghij";
    private static final String DB_PASSWORD = "password123";
    private static final String SECRET_KEY = "secret-key-value";

    public static void main(String[] args) {

        // Hardcoded credentials (insecure)
        String username = "admin";
        String password = "admin123";

        // A simulated database connection (insecure)
        String dbConnection = "jdbc:mysql://localhost:3306/mydb?user=root&password=" + DB_PASSWORD;

        // API Call (with API Key)
        String apiUrl = "https://api.example.com/endpoint?apikey=" + API_KEY;

        // Code that simulates a potential security vulnerability
        Map<String, String> data = new HashMap<>();
        data.put("username", username);
        data.put("password", password);
        data.put("dbConnection", dbConnection);

        System.out.println("Vulnerable application running...");
        System.out.println("API URL: " + apiUrl);
        System.out.println("Database connection string: " + dbConnection);
        System.out.println("User credentials: " + data);
    }
}
