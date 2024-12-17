package com.raven.form;

import java.util.HashMap;
import java.util.Map;


public class SessionManager {
    private static Map<String, Object> session = new HashMap<>();

        
    public static void setSessionValue(String key, Object value) {
    session.put(key, value);
    System.out.println("Session value set: " + key + " = " + value);  // Debug print
    }

    public static Object getSessionValue(String key) {
    System.out.println("Session value fetched: " + key);  // Debug print
    return session.get(key);
    }

    // Get the entire session map
    public static Map<String, Object> getSession() {
        return session;
    }

    // Clear session
    public static void clearSession() {
        session.clear();
    }
}   