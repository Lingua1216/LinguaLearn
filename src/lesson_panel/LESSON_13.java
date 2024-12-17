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
public class LESSON_13 extends javax.swing.JPanel {

    /**
     * Creates new form LESSON_13
     */
    public LESSON_13() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        takequiz = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("BASIC CHINESE GREETINGS:\nGeneral Greetings:\n1.\t你好 (Nǐ hǎo) - Hello.\n2.\t您好 (Nín hǎo) - Hello (polite/respectful form).\n3.\t早上好 (Zǎoshang hǎo) - Good morning.\n4.\t上午好 (Shàngwǔ hǎo) - Good morning (formal).\n5.\t中午好 (Zhōngwǔ hǎo) - Good afternoon.\n6.\t下午好 (Xiàwǔ hǎo) - Good afternoon.\n7.\t晚上好 (Wǎnshàng hǎo) - Good evening.\n8.\t晚安 (Wǎn’ān) - Good night.\n9.\t嘿 (Hēi) - Hey (informal greeting).\n10.\t喂 (Wèi) - Hello (used on the phone).\n\nCasual or Friendly Greetings:\n\n\n11.\t你怎么样？(Nǐ zěnmeyàng?) - How are you?\n12.\t最近怎么样？(Zuìjìn zěnmeyàng?) - How have you been recently?\n13.\t吃了吗？(Chī le ma?) - Have you eaten? (common casual greeting).\n14.\t好久不见 (Hǎojiǔ bújiàn) - Long time no see.\n15.\t去哪儿？(Qù nǎr?) - Where are you going? (used in passing).\n\n\nSpecific Context Greetings:\n16.\t欢迎 (Huānyíng) - Welcome.\n17.\t辛苦了 (Xīnkǔ le) - Thank you for your hard work.\n18.\t新年快乐 (Xīnnián kuàilè) - Happy New Year.\n19.\t生日快乐 (Shēngrì kuàilè) - Happy Birthday.\n20.\t祝你好运 (Zhù nǐ hǎoyùn) - Wishing you good luck.\n");
        jScrollPane1.setViewportView(jTextArea1);

        takequiz.setText("Take Quiz");
        takequiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takequizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(866, Short.MAX_VALUE)
                .addComponent(takequiz, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(834, 834, 834))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(540, Short.MAX_VALUE)
                .addComponent(takequiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
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

        // Add the LESSON_13 JPanel to the frame
        LESSON_13 lessonPanel = new LESSON_13();
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
    private void takequizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takequizActionPerformed
    // Check if the user is logged in by verifying the session for a valid userId
    Integer userId = (Integer) SessionManager.getSessionValue("userId");

    System.out.println("Logged in user ID: " + userId);  // Debug print

    if (userId == null) {
        // If user_id is not set, show a message asking the user to log in
        javax.swing.JOptionPane.showMessageDialog(this, "Please log in to take the quiz.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if the user is not logged in
    }

    int quizId = 3; // Assume this is the quiz ID

    if (hasUserTakenQuiz(quizId)) {
        // If the user has already taken the quiz, exit the method
        return;
    }

    // Open quiz window
    Quiz_13 quizFrame = new Quiz_13(quizId);
    quizFrame.setVisible(true);
    quizFrame.pack();
    quizFrame.setLocationRelativeTo(null);

    // Dispose of current frame
    JFrame parentFrame = (JFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
    if (parentFrame != null) {
        parentFrame.dispose();
    }
    }//GEN-LAST:event_takequizActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
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
