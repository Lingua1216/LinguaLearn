/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import java.sql.DriverManager;
import com.raven.form.SessionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author intsi
 */
public class track extends javax.swing.JPanel {

    private int userId = 1; // example userId, adjust as needed
    private int[] chineseQuizIds = {1, 2, 3, 4, 5}; // example quizIds for Chinese lessons
    private int[] japaneseQuizIds = {6, 7, 8, 9, 10}; // example quizIds for Japanese lessons

public track() {
    initComponents();

        // Initialize the tables
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Chinese Lessons Completed", "Score"}
        ));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Japanese Lessons Completed", "Score"}
        ));

    // Load data for both Chinese and Japanese lessons
    loadLessonData(jTable1, "chinese", chineseQuizIds);
    loadLessonData(jTable2, "japanese", japaneseQuizIds);

    // Add row selection listener to the Chinese lessons table
    jTable1.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            int row = jTable1.getSelectedRow();
            if (row != -1) {
                int lessonId = (int) jTable1.getValueAt(row, 0);
                fetchLessonResponse(lessonId);
            }
        }
    });

    // Add row selection listener to the Japanese lessons table
    jTable2.getSelectionModel().addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            int row = jTable2.getSelectedRow();
            if (row != -1) {
                int lessonId = (int) jTable2.getValueAt(row, 0);
                fetchLessonResponse(lessonId);
            }
        }
    });
}
private void loadLessonData(javax.swing.JTable table, String language, int[] quizIds) {
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0);  // Clear existing rows

    // Retrieve the user ID from the session
    Object userIdObj = SessionManager.getSessionValue("userId");
    if (userIdObj == null || !(userIdObj instanceof Integer)) {
        System.out.println("User ID not found in session or invalid.");
        return; // Exit if user ID is not available
    }
    int userId = (int) userIdObj; // Safely cast user ID

    // Determine the appropriate lessons table
    String lessonsTable = language.equalsIgnoreCase("chinese") ? "chinese" : "japanese";

    // Generate placeholders for the IN clause for quiz IDs
    String quizIdPlaceholders = generatePlaceholders(quizIds.length);

    // SQL query to fetch lesson descriptions and responses (scores) related to the user
    String sql = "SELECT DISTINCT l.description, r.response AS score " +
                 "FROM responses r " +
                 "JOIN " + lessonsTable + " l ON r.lesson_id = l.lesson_id " +
                 "WHERE r.quiz_id IN (" + quizIdPlaceholders + ") AND r.user_id = ?";

    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        // Bind quiz IDs dynamically
        for (int i = 0; i < quizIds.length; i++) {
            ps.setInt(i + 1, quizIds[i]); // Quiz IDs start at index 1
        }
        ps.setInt(quizIds.length + 1, userId); // Bind the user ID after the quiz IDs

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String description = rs.getString("description");
            int score = rs.getInt("score"); // Fetch the score (response value)
            // Add rows with lesson descriptions and scores related to the user
            model.addRow(new Object[]{description, score});
            System.out.println("Fetched Lesson: " + description + ", Score: " + score);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}
    // Helper method to generate placeholders for IN clause
    private String generatePlaceholders(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("?");
            if (i < count - 1) sb.append(",");
        }
        return sb.toString();
    }

    private void fetchLessonResponse(int lessonId) {
        try (Connection conn = DBConnection.getConnection()) {
            String query = "SELECT * FROM responses WHERE lesson_id = ? AND user_id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, lessonId);
                pstmt.setInt(2, userId);
                
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    int responseId = rs.getInt("response_id");
                    String response = rs.getString("response");
                    System.out.println("Response ID: " + responseId + ", Response: " + response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static class DBConnection {
        private static final String URL = "jdbc:mysql://localhost:3306/users-database";
        private static final String USER = "root";
        private static final String PASSWORD = "";

        public static Connection getConnection() {
            Connection conn = null;
            try {
                // Load MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (Exception e) {
                System.out.println("Database connection error: " + e.getMessage());
            }
            return conn;
        }
    }
    /**
     * Nested class for database connection
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Chinese lessons Completed", "Score"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Japanese Lessons Completed", "Score"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(760, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
