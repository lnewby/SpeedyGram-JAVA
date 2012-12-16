/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Steps.java
 *
 * Created on Dec 13, 2009, 3:56:17 PM
 */

package speedygram;

import java.awt.*;
import java.awt.Font.*;
import java.io.*;
import java.io.File.*;
import java.io.IOException.*;
/**
 *
 * @author lnewby
 */
public class Steps extends javax.swing.JFrame {

    /** Creates new form Steps */
    public Steps() {

        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/speedygram/fonts/dakota__.ttf").openStream()));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/speedygram/fonts/gillsansultrabold.ttf").openStream()));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/speedygram/fonts/gillsans.ttf").openStream()));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/speedygram/fonts/gillsansbold.ttf").openStream()));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/speedygram/fonts/lucidagrande.ttf").openStream()));
        } catch (IOException e) {
        } catch (FontFormatException ffe){
        }

        initComponents();
        nameTextField.requestFocusInWindow();
        stepLP2.setVisible(false);
        stepLP3.setVisible(false);
        stepLP4.setVisible(false);
        errLbl.setVisible(false);
        errLbl2.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        readingLevelRadioGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        speedyGramBtn = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        stepLP1 = new javax.swing.JLayeredPane();
        friendCallYouLbl = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        errLbl = new javax.swing.JLabel();
        stepLP2 = new javax.swing.JLayeredPane();
        genderLbl = new javax.swing.JLabel();
        femaleBtn = new javax.swing.JButton();
        maleBtn = new javax.swing.JButton();
        stepLP3 = new javax.swing.JLayeredPane();
        letsGetPersonalLbl = new javax.swing.JLabel();
        gradeLevelCB = new javax.swing.JComboBox();
        elementaryRB = new javax.swing.JRadioButton();
        middleRB = new javax.swing.JRadioButton();
        highRB = new javax.swing.JRadioButton();
        specialEdCB = new javax.swing.JCheckBox();
        elsCB = new javax.swing.JCheckBox();
        freeReducedLunchCB = new javax.swing.JCheckBox();
        gradeLevelLbl = new javax.swing.JLabel();
        readingLevelLbl = new javax.swing.JLabel();
        whichApplyToYouLbl = new javax.swing.JLabel();
        boardLbl = new javax.swing.JLabel();
        nextBtn1 = new javax.swing.JButton();
        errLbl2 = new javax.swing.JLabel();
        stepLP4 = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        readingLevelLbl1 = new javax.swing.JLabel();
        nextBtn2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        borderLbl1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(587, 399));
        jPanel1.setSize(new java.awt.Dimension(587, 399));

        speedyGramBtn.setBackground(new java.awt.Color(255, 255, 255));
        speedyGramBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/speedygram/images/speedy_gram_logo_3.png"))); // NOI18N
        speedyGramBtn.setBorderPainted(false);
        speedyGramBtn.setFocusPainted(false);
        speedyGramBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedyGramBtnActionPerformed(evt);
            }
        });

        friendCallYouLbl.setFont(new java.awt.Font("Gill Sans MT", 0, 36));
        friendCallYouLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        friendCallYouLbl.setText("Friend's call you?");
        friendCallYouLbl.setBounds(110, 60, 320, 50);
        stepLP1.add(friendCallYouLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nameTextField.setFont(new java.awt.Font("Lucida Grande", 1, 18));
        nameTextField.setToolTipText("Type your name in me!");
        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        nameTextField.setBounds(170, 130, 200, 40);
        stepLP1.add(nameTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nextBtn.setText("NEXT");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        nextBtn.setBounds(430, 270, 77, 29);
        stepLP1.add(nextBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        errLbl.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        errLbl.setForeground(new java.awt.Color(255, 0, 51));
        errLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errLbl.setText("error message");
        errLbl.setBounds(60, 180, 420, 22);
        stepLP1.add(errLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        stepLP1.setBounds(0, 0, 550, 320);
        jLayeredPane1.add(stepLP1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        genderLbl.setFont(new java.awt.Font("Gill Sans MT", 0, 36));
        genderLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genderLbl.setText("gender ?");
        genderLbl.setBounds(0, 250, 550, 50);
        stepLP2.add(genderLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        femaleBtn.setBackground(new java.awt.Color(255, 255, 255));
        femaleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/speedygram/images/women.png"))); // NOI18N
        femaleBtn.setBorderPainted(false);
        femaleBtn.setFocusPainted(false);
        femaleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleBtnActionPerformed(evt);
            }
        });
        femaleBtn.setBounds(100, 20, 150, 220);
        stepLP2.add(femaleBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        maleBtn.setBackground(new java.awt.Color(255, 255, 255));
        maleBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/speedygram/images/men.png"))); // NOI18N
        maleBtn.setBorderPainted(false);
        maleBtn.setFocusPainted(false);
        maleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleBtnActionPerformed(evt);
            }
        });
        maleBtn.setBounds(300, 20, 150, 220);
        stepLP2.add(maleBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        stepLP2.setBounds(0, 0, 550, 320);
        jLayeredPane1.add(stepLP2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        letsGetPersonalLbl.setFont(new java.awt.Font("Gill Sans MT", 0, 36));
        letsGetPersonalLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letsGetPersonalLbl.setText("Let's Get Personal");
        letsGetPersonalLbl.setBounds(120, 250, 310, 50);
        stepLP3.add(letsGetPersonalLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gradeLevelCB.setBackground(new java.awt.Color(255, 255, 255));
        gradeLevelCB.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        gradeLevelCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st-4th", "5th-8th", "9th-12th" }));
        gradeLevelCB.setBounds(200, 170, 120, 27);
        stepLP3.add(gradeLevelCB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        elementaryRB.setBackground(new java.awt.Color(255, 255, 255));
        readingLevelRadioGroup.add(elementaryRB);
        elementaryRB.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        elementaryRB.setText("Elementary");
        elementaryRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elementaryRBActionPerformed(evt);
            }
        });
        elementaryRB.setBounds(100, 70, 120, 27);
        stepLP3.add(elementaryRB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        middleRB.setBackground(new java.awt.Color(255, 255, 255));
        readingLevelRadioGroup.add(middleRB);
        middleRB.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        middleRB.setText("Middle");
        middleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleRBActionPerformed(evt);
            }
        });
        middleRB.setBounds(100, 100, 90, 27);
        stepLP3.add(middleRB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        highRB.setBackground(new java.awt.Color(255, 255, 255));
        readingLevelRadioGroup.add(highRB);
        highRB.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        highRB.setText("High");
        highRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highRBActionPerformed(evt);
            }
        });
        highRB.setBounds(100, 130, 80, 27);
        stepLP3.add(highRB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        specialEdCB.setBackground(new java.awt.Color(255, 255, 255));
        specialEdCB.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        specialEdCB.setText("Special Education");
        specialEdCB.setBounds(320, 100, 170, 27);
        stepLP3.add(specialEdCB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        elsCB.setBackground(new java.awt.Color(255, 255, 255));
        elsCB.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        elsCB.setText("ELS");
        elsCB.setBounds(320, 130, 80, 27);
        stepLP3.add(elsCB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        freeReducedLunchCB.setBackground(new java.awt.Color(255, 255, 255));
        freeReducedLunchCB.setFont(new java.awt.Font("Gill Sans MT", 0, 18));
        freeReducedLunchCB.setText("Free & Reduced Lunch");
        freeReducedLunchCB.setBounds(320, 70, 200, 27);
        stepLP3.add(freeReducedLunchCB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gradeLevelLbl.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        gradeLevelLbl.setText("Grade Level");
        gradeLevelLbl.setBounds(50, 170, 130, 29);
        stepLP3.add(gradeLevelLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        readingLevelLbl.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        readingLevelLbl.setText("Reading Level");
        readingLevelLbl.setBounds(50, 30, 140, 30);
        stepLP3.add(readingLevelLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        whichApplyToYouLbl.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        whichApplyToYouLbl.setText("Which apply to you?");
        whichApplyToYouLbl.setBounds(270, 30, 210, 30);
        stepLP3.add(whichApplyToYouLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        boardLbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null));
        boardLbl.setBounds(20, 10, 510, 210);
        stepLP3.add(boardLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nextBtn1.setText("NEXT");
        nextBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtn1ActionPerformed(evt);
            }
        });
        nextBtn1.setBounds(440, 270, 77, 29);
        stepLP3.add(nextBtn1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        errLbl2.setForeground(new java.awt.Color(255, 0, 51));
        errLbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errLbl2.setText("error message");
        errLbl2.setBounds(30, 230, 490, 20);
        stepLP3.add(errLbl2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        stepLP3.setBounds(0, 0, 550, 320);
        jLayeredPane1.add(stepLP3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setText("* Get ALL words correct in a sentence to earn 1 BONUS POINT!");
        jLabel5.setBounds(90, 130, 400, 40);
        stepLP4.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("* Three (3) BONUS Points = BONUS ROUND!!!");
        jLabel1.setBounds(90, 150, 340, 40);
        stepLP4.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        readingLevelLbl1.setFont(new java.awt.Font("Gill Sans MT", 0, 24));
        readingLevelLbl1.setText("How to Play!");
        readingLevelLbl1.setBounds(50, 30, 140, 30);
        stepLP4.add(readingLevelLbl1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nextBtn2.setFont(new java.awt.Font("Gill Sans Bold", 1, 36)); // NOI18N
        nextBtn2.setForeground(new java.awt.Color(0, 51, 204));
        nextBtn2.setText("Let's Play");
        nextBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtn2ActionPerformed(evt);
            }
        });
        nextBtn2.setBounds(160, 230, 250, 60);
        stepLP4.add(nextBtn2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("* A sentence will be presented when you click start.");
        jLabel2.setBounds(90, 70, 340, 30);
        stepLP4.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText("* One word will be highlighted in blue.");
        jLabel3.setBounds(90, 90, 340, 30);
        stepLP4.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setText("* Selected the matching part-of-speech from below!");
        jLabel4.setBounds(90, 110, 340, 30);
        stepLP4.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        borderLbl1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), null));
        borderLbl1.setBounds(20, 20, 510, 190);
        stepLP4.add(borderLbl1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        stepLP4.setBounds(0, 0, 550, 320);
        jLayeredPane1.add(stepLP4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(speedyGramBtn))
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(speedyGramBtn)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void speedyGramBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedyGramBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_speedyGramBtnActionPerformed

    private void maleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleBtnActionPerformed
        // TODO add your handling code here:
        gender = 'M';
        stepLP3.setVisible(true);
        stepLP2.setVisible(false);
        
    }//GEN-LAST:event_maleBtnActionPerformed

    private void nextBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtn1ActionPerformed
        // TODO add your handling code here:
        if (gradeLevel != null){
            stepLP4.setVisible(true);
            stepLP3.setVisible(false);
        } else {
            String prefix = (gender == 'M') ? "Sir" : "Madam";
            errLbl2.setText("Hey there " +prefix+ " "+ nameTextField.getText() + ", are you forgetting something up there?");
            errLbl2.setVisible(true);
        }
    }//GEN-LAST:event_nextBtn1ActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        if (nameTextField.getText().isEmpty()){
            errLbl.setText("Hey, let's get your name first please!");
            errLbl.setVisible(true);
        } else {
            genderLbl.setText(nameTextField.getText() +", what's your gender?");
            stepLP2.setVisible(true);
            stepLP1.setVisible(false);
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void femaleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleBtnActionPerformed
        // TODO add your handling code here:
        gender = 'F';
        stepLP3.setVisible(true);
        stepLP2.setVisible(false);

    }//GEN-LAST:event_femaleBtnActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void elementaryRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elementaryRBActionPerformed
        // TODO add your handling code here:
        gradeLevel = Level.ELEMENTARY;
        Object a = gradeLevelCB.getSelectedItem();
        readingLevel = a.toString();
    }//GEN-LAST:event_elementaryRBActionPerformed

    private void middleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleRBActionPerformed
        // TODO add your handling code here:
        gradeLevel = Level.MIDDLE;
        Object a = gradeLevelCB.getSelectedItem();
        readingLevel = a.toString();
    }//GEN-LAST:event_middleRBActionPerformed

    private void highRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highRBActionPerformed
        // TODO add your handling code here:
        gradeLevel = Level.HIGH;
        Object a = gradeLevelCB.getSelectedItem();
        readingLevel = a.toString();
    }//GEN-LAST:event_highRBActionPerformed

    private void nextBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtn2ActionPerformed
        // TODO add your handling code here:
            gameBoard myProfile = new gameBoard(nameTextField.getText(),gradeLevel,readingLevel,gender,"Other",specialEdCB.isSelected(),elsCB.isSelected(),freeReducedLunchCB.isSelected());
            myProfile.setLocationRelativeTo(null);
            myProfile.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_nextBtn2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Steps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boardLbl;
    private javax.swing.JLabel borderLbl1;
    private javax.swing.JRadioButton elementaryRB;
    private javax.swing.JCheckBox elsCB;
    private javax.swing.JLabel errLbl;
    private javax.swing.JLabel errLbl2;
    private javax.swing.JButton femaleBtn;
    private javax.swing.JCheckBox freeReducedLunchCB;
    private javax.swing.JLabel friendCallYouLbl;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JComboBox gradeLevelCB;
    private javax.swing.JLabel gradeLevelLbl;
    private javax.swing.JRadioButton highRB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel letsGetPersonalLbl;
    private javax.swing.JButton maleBtn;
    private javax.swing.JRadioButton middleRB;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton nextBtn1;
    private javax.swing.JButton nextBtn2;
    private javax.swing.JLabel readingLevelLbl;
    private javax.swing.JLabel readingLevelLbl1;
    private javax.swing.ButtonGroup readingLevelRadioGroup;
    private javax.swing.JCheckBox specialEdCB;
    private javax.swing.JButton speedyGramBtn;
    private javax.swing.JLayeredPane stepLP1;
    private javax.swing.JLayeredPane stepLP2;
    private javax.swing.JLayeredPane stepLP3;
    private javax.swing.JLayeredPane stepLP4;
    private javax.swing.JLabel whichApplyToYouLbl;
    // End of variables declaration//GEN-END:variables
    private Level gradeLevel = null;
    private String readingLevel = null;
    private char gender;
}
