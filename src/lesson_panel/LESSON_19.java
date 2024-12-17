/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lesson_panel;

import com.raven.form.SessionManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author intsi
 */
public class LESSON_19 extends javax.swing.JPanel {

    /**
     * Creates new form LESSON_13
     */
    public LESSON_19() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        takequiz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("11-20\n11. じゅういち (Juu-ichi) – Eleven\n12. じゅうに (Juu-ni) – Twelve\n13. じゅうさん (Juu-san) – Thirteen\n14. じゅうし / じゅうよん (Juu-shi / Juu-yon) – Fourteen\n15. じゅうご (Juu-go) – Fifteen\n16. じゅうろく (Juu-roku) – Sixteen\n17. じゅうしち / じゅうなな (Juu-shichi / Juu-nana) – Seventeen\n18. じゅうはち (Juu-hachi) – Eighteen\n19. じゅうきゅう / じゅうく (Juu-kyuu / Juu-ku) – Nineteen\n20. にじゅう (Ni-juu) – Twenty");
        jScrollPane5.setViewportView(jTextArea5);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("1-10:\n1. いち (Ichi) – One\n2. に (Ni) – Two\n3. さん (San) – Three\n4. し / よん (Shi / Yon) – Four\n5. ご (Go) – Five\n6. ろく (Roku) – Six\n7. しち / なな (Shichi / Nana) – Seven\n8. はち (Hachi) – Eight\n9. きゅう / く (Kyuu / Ku) – Nine\n10. じゅう (Juu) – Ten");
        jScrollPane6.setViewportView(jTextArea6);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("31-40\n31. さんじゅういち (San-juu-ichi) – Thirty-one\n32. さんじゅうに (San-juu-ni) – Thirty-two\n33. さんじゅうさん (San-juu-san) – Thirty-three\n34. さんじゅうし / さんじゅうよん (San-juu-shi / San-juu-yon) – Thirty-four\n35. さんじゅうご (San-juu-go) – Thirty-five\n36. さんじゅうろく (San-juu-roku) – Thirty-six\n37. さんじゅうしち / さんじゅうなな (San-juu-shichi / San-juu-nana) – Thirty-seven\n38. さんじゅうはち (San-juu-hachi) – Thirty-eight\n39. さんじゅうきゅう / さんじゅうく (San-juu-kyuu / San-juu-ku) – Thirty-nine\n40. よんじゅう (Yon-juu) – Forty");
        jTextArea7.setPreferredSize(new java.awt.Dimension(232, 180));
        jScrollPane7.setViewportView(jTextArea7);

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("41-50\n41. よんじゅういち (Yon-juu-ichi) – Forty-one\n42. よんじゅうに (Yon-juu-ni) – Forty-two\n43. よんじゅうさん (Yon-juu-san) – Forty-three\n44. よんじゅうし / よんじゅうよん (Yon-juu-shi / Yon-juu-yon) – Forty-four\n45. よんじゅうご (Yon-juu-go) – Forty-five\n46. よんじゅうろく (Yon-juu-roku) – Forty-six\n47.  よんじゅうなな (Yon-juu-shichi / Yon-juu-nana) – Forty-seven\n48. よんじゅうはち (Yon-juu-hachi) – Forty-eight\n49. よんじゅうきゅう / よんじゅうく (Yon-juu-kyuu / Yon-juu-ku) – Forty-nine\n50. ごじゅう (Go-juu) – Fifty");
        jTextArea8.setPreferredSize(new java.awt.Dimension(232, 180));
        jScrollPane8.setViewportView(jTextArea8);

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setText("21-30\n21. にじゅういち (Ni-juu-ichi) – Twenty-one\n22. にじゅうに (Ni-juu-ni) – Twenty-two\n23. にじゅうさん (Ni-juu-san) – Twenty-three\n24. にじゅうし / にじゅうよん (Ni-juu-shi / Ni-juu-yon) – Twenty-four\n25. にじゅうご (Ni-juu-go) – Twenty-five\n26. にじゅうろく (Ni-juu-roku) – Twenty-six\n27. にじゅうしち / にじゅうなな (Ni-juu-shichi / Ni-juu-nana) – Twenty-seven\n28. にじゅうはち (Ni-juu-hachi) – Twenty-eight\n29. にじゅうきゅう / にじゅうく (Ni-juu-kyuu / Ni-juu-ku) – Twenty-nine\n30. さんじゅう (San-juu) – Thirty");
        jScrollPane9.setViewportView(jTextArea9);

        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jTextArea11.setText("71-80\n71. ななじゅういち (Nana-juu-ichi) – Seventy-one\n72. ななじゅうに (Nana-juu-ni) – Seventy-two\n73. ななじゅうさん (Nana-juu-san) – Seventy-three\n74. ななじゅうし / ななじゅうよん (Nana-juu-shi / Nana-juu-yon) – Seventy-four\n75.ななじゅうご (Nana-juu-go) – Seventy-five\n76. ななじゅうろく (Nana-juu-roku) – Seventy-six\n77. ななじゅうしち / ななじゅうなな (Nana-juu-shichi / Nana-juu-nana) – Seventy-seven\n78. ななじゅうはち (Nana-juu-hachi) – Seventy-eight\n79. ななじゅうきゅう / ななじゅうく (Nana-juu-kyuu / Nana-juu-ku) – Seventy-nine\n80. はちじゅう (Hachi-juu) – Eighty\n");
        jTextArea11.setPreferredSize(new java.awt.Dimension(232, 180));
        jScrollPane11.setViewportView(jTextArea11);

        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.setText("51-60\n51. ごじゅういち (Go-juu-ichi) – Fifty-one\n52. ごじゅうに (Go-juu-ni) – Fifty-two\n53. ごじゅうさん (Go-juu-san) – Fifty-three\n54. ごじゅうし / ごじゅうよん (Go-juu-shi / Go-juu-yon) – Fifty-four\n55. ごじゅうご (Go-juu-go) – Fifty-five\n56. ごじゅうろく (Go-juu-roku) – Fifty-six\n57.ごじゅうしち / ごじゅうなな (Go-juu-shichi / Go-juu-nana) – Fifty-seven\n58. ごじゅうはち (Go-juu-hachi) – Fifty-eight\n59. ごじゅうきゅう / ごじゅうく (Go-juu-kyuu / Go-juu-ku) – Fifty-nine\n60. ろくじゅう (Roku-juu) – Sixty");
        jScrollPane12.setViewportView(jTextArea12);

        jTextArea13.setColumns(20);
        jTextArea13.setRows(5);
        jTextArea13.setText("61-70\n61.ろくじゅういち (Roku-juu-ichi) – Sixty-one\n62.ろくじゅうに (Roku-juu-ni) – Sixty-two\n63.ろくじうさん (Roku-juu-san) – Sixty-three\n64.ろくじゅうし / ろくじゅうよん (Roku-juu-shi / Roku-juu-yon) – Sixty-four\n65.ろくじゅうご (Roku-juu-go) – Sixty-five\n66.ろくじゅうろく (Roku-juu-roku) – Sixty-six\n67.ろくじゅうしち / ろくじゅうなな (Roku-juu-shichi / Roku-juu-nana) – Sixty-seven\n68.ろくじゅうはち (Roku-juu-hachi) – Sixty-eight\n69.ろくじゅうきゅう / ろくじゅうく (Roku-juu-kyuu / Roku-juu-ku) – Sixty-nine\n70.ななじゅう (Nana-juu) – Seventy");
        jTextArea13.setPreferredSize(new java.awt.Dimension(232, 180));
        jScrollPane13.setViewportView(jTextArea13);

        takequiz.setText("Take Quiz");
        takequiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takequizActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel1.setText("JAPANESE COUNTINGS");

        jTextArea14.setColumns(20);
        jTextArea14.setRows(5);
        jTextArea14.setText("81-90\n81 .はちじゅういち (Hachi-juu-ichi) – Eighty-one\n82. はちじゅうに (Hachi-juu-ni) – Eighty-two\n83. はちじゅうさん (Hachi-juu-san) – Eighty-three\n84. はちじゅうし / はちじゅうよん (Hachi-juu-shi / Hachi-juu-yon) – Eighty-four\n85. はちじゅうご (Hachi-juu-go) – Eighty-five\n86. はちじゅうろく (Hachi-juu-roku) – Eighty-six\n87. はちじゅうしち / はちじゅうなな (Hachi-juu-shichi / Hachi-juu-nana) – Eighty-seven\n88. はちじゅうはち (Hachi-juu-hachi) – Eighty-eight\n89.  はちじゅうく (Hachi-juu-kyuu / Hachi-juu-ku)** – Eighty-nine\n90. きゅうじゅう (Kyuu-juu) – Ninety");
        jTextArea14.setPreferredSize(new java.awt.Dimension(232, 180));
        jScrollPane14.setViewportView(jTextArea14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(951, 951, 951)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(takequiz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(takequiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 432, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(800, 800, 800))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void takequizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takequizActionPerformed
        // Check if the user is logged in by verifying the session for a valid userId
        Integer userId = (Integer) SessionManager.getSessionValue("userId");

        System.out.println("Logged in user ID: " + userId);  // Debug print

        if (userId == null) {
            // If user_id is not set, show a message asking the user to log in
            javax.swing.JOptionPane.showMessageDialog(this, "Please log in to take the quiz.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if the user is not logged in
        }

        int quizId = 9; // Assume this is the quiz ID

        if (hasUserTakenQuiz(quizId)) {
            // If the user has already taken the quiz, exit the method
            return;
        }

        // Open quiz window
        Quiz_19 quizFrame = new Quiz_19(quizId);
        quizFrame.setVisible(true);
        quizFrame.pack();
        quizFrame.setLocationRelativeTo(null);

        // Dispose of current frame
        JFrame parentFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        if (parentFrame != null) {
            parentFrame.dispose();
        }
    }//GEN-LAST:event_takequizActionPerformed
    public void loginUser(int userId) {
    SessionManager.setSessionValue("userId", userId);  // Use "userId" to store the session
    System.out.println("User ID set in session: " + userId);
}

private boolean hasUserTakenQuiz(int quizId) {
    Integer userId = (Integer) SessionManager.getSessionValue("userId");  // Use "userId"
    if (userId == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please log in to take the quiz.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return true; // Prevent quiz if not logged in
    }

    String query = "SELECT COUNT(*) FROM responses WHERE user_id = ? AND quiz_id = ?";
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users-database", "root", "");
         PreparedStatement stmt = conn.prepareStatement(query)) {

        stmt.setInt(1, userId);
        stmt.setInt(2, quizId);
        ResultSet rs = stmt.executeQuery();

        if (rs.next() && rs.getInt(1) > 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "You have already taken this quiz.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return true; // User has already taken the quiz
        }

    } catch (SQLException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    return false; // User can take the quiz
}
    public static void main(String[] args) {
      
        // Create a JFrame
        JFrame frame = new JFrame();

        // Set the frame undecorated
        frame.setUndecorated(true);

        // Add the LESSON_14 JPanel to the frame
        LESSON_19 lessonPanel = new LESSON_19();
        frame.add(lessonPanel);

        // Set frame size and location
        frame.setSize(1200, 800); // Make the frame larger
        frame.setLocationRelativeTo(null); // Center the frame on the screen

        // Add a close button (optional, since no title bar is available)
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(1100, 10, 80, 30); // Position it near the top-right
        lessonPanel.setLayout(null); // Use null layout for custom positioning
        lessonPanel.add(closeButton);

        closeButton.addActionListener(e -> System.exit(0)); // Close the application

        // Set frame visibility
        frame.setVisible(true);

        // Ensure the application exits when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JButton takequiz;
    // End of variables declaration//GEN-END:variables

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void pack() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
