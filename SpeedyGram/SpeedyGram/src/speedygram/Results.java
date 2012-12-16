/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Results.java
 *
 * Created on Dec 16, 2009, 9:41:51 PM
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
public class Results extends javax.swing.JFrame {

    public Results() {

    }
    /** Creates new form Results */
    public Results(Player p,
                   Sentence[] s) {

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
        setLocationRelativeTo(null);

        player = p;
        sentence = s;

        sent1.setText("Sentence 1: " + sentence[0].numberCorrect +" / "+ sentence[0].word.length);
        sent2.setText("Sentence 2: " + sentence[1].numberCorrect +" / "+ sentence[1].word.length);
        sent3.setText("Sentence 3: " + sentence[2].numberCorrect +" / "+ sentence[2].word.length);
        sent4.setText("Sentence 4: " + sentence[3].numberCorrect +" / "+ sentence[3].word.length);

        word1.setText(sentence[0].wordWrong.getWord() + " :: " + sentence[0].wordWrong.getPos());
        word2.setText(sentence[1].wordWrong.getWord() + " :: " + sentence[1].wordWrong.getPos());
        word3.setText(sentence[2].wordWrong.getWord() + " :: " + sentence[2].wordWrong.getPos());
        word4.setText(sentence[3].wordWrong.getWord() + " :: " + sentence[3].wordWrong.getPos());

        scoreLbl.setText("Total Score: " + player.score);
        bonusPtsLbl.setText(""+player.bonus+" Bonus Pts");
        int totalPoints = player.score + player.bonus;
        totalPtsLbl.setText(""+totalPoints+"pts");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        speedyGramBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sent4 = new javax.swing.JLabel();
        sent1 = new javax.swing.JLabel();
        sent2 = new javax.swing.JLabel();
        sent3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        word3 = new javax.swing.JLabel();
        word2 = new javax.swing.JLabel();
        word1 = new javax.swing.JLabel();
        word4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        sendBtn = new javax.swing.JButton();
        quitBtn = new javax.swing.JButton();
        clearBtn1 = new javax.swing.JButton();
        scoreLbl = new javax.swing.JLabel();
        totalPtsLbl = new javax.swing.JLabel();
        bonusPtsLbl = new javax.swing.JLabel();
        plusSign = new javax.swing.JLabel();
        equalSign = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(840, 589));
        setResizable(false);
        setSize(new java.awt.Dimension(840, 603));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 603));
        jPanel1.setSize(new java.awt.Dimension(840, 603));

        jLabel1.setFont(new java.awt.Font("Gill Sans Bold", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("And your results!");
        jLabel1.setBounds(180, 110, 450, 60);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        speedyGramBtn.setBackground(new java.awt.Color(255, 255, 255));
        speedyGramBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/speedygram/images/speedy_gram_logo_3.png"))); // NOI18N
        speedyGramBtn.setBorderPainted(false);
        speedyGramBtn.setFocusPainted(false);
        speedyGramBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speedyGramBtnActionPerformed(evt);
            }
        });
        speedyGramBtn.setBounds(290, 0, 216, 54);
        jLayeredPane1.add(speedyGramBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Gill Sans Bold", 1, 65)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thanks for Playing!");
        jLabel2.setBounds(60, 40, 680, 90);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        sent4.setFont(new java.awt.Font("Gill Sans Bold", 1, 24)); // NOI18N
        sent4.setText("Sentence 4");
        sent4.setBounds(140, 360, 280, 40);
        jLayeredPane1.add(sent4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        sent1.setFont(new java.awt.Font("Gill Sans Bold", 1, 24)); // NOI18N
        sent1.setText("Sentence 1");
        sent1.setBounds(140, 240, 280, 40);
        jLayeredPane1.add(sent1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        sent2.setFont(new java.awt.Font("Gill Sans Bold", 1, 24)); // NOI18N
        sent2.setText("Sentence 2");
        sent2.setBounds(140, 280, 280, 40);
        jLayeredPane1.add(sent2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        sent3.setFont(new java.awt.Font("Gill Sans Bold", 1, 24)); // NOI18N
        sent3.setText("Sentence 3");
        sent3.setBounds(140, 320, 280, 40);
        jLayeredPane1.add(sent3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Number of words correct:");
        jLabel7.setBounds(200, 230, 170, 16);
        jLayeredPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("(word :: part-of-speech)");
        jLabel8.setBounds(450, 230, 200, 20);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        word3.setFont(new java.awt.Font("Gill Sans Bold", 1, 24)); // NOI18N
        word3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word3.setText("Word 3");
        word3.setBounds(370, 320, 350, 40);
        jLayeredPane1.add(word3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        word2.setFont(new java.awt.Font("Gill Sans Bold", 1, 24)); // NOI18N
        word2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word2.setText("Word 2");
        word2.setBounds(370, 280, 350, 40);
        jLayeredPane1.add(word2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        word1.setFont(new java.awt.Font("Gill Sans Bold", 1, 24)); // NOI18N
        word1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word1.setText("Word 1");
        word1.setBounds(370, 240, 350, 40);
        jLayeredPane1.add(word1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        word4.setFont(new java.awt.Font("Gill Sans Bold", 1, 24)); // NOI18N
        word4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        word4.setText("Word 4");
        word4.setBounds(370, 360, 350, 40);
        jLayeredPane1.add(word4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel21.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("So what did you think? Please leave feedback about your Game Experience:");
        jLabel21.setBounds(140, 410, 640, 50);
        jLayeredPane1.add(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jScrollPane1.setBounds(140, 460, 410, 100);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        sendBtn.setText("Send");
        sendBtn.setEnabled(false);
        sendBtn.setBounds(590, 460, 75, 29);
        jLayeredPane1.add(sendBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        quitBtn.setText("Quit");
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitBtnActionPerformed(evt);
            }
        });
        quitBtn.setBounds(700, 530, 76, 29);
        jLayeredPane1.add(quitBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        clearBtn1.setText("Clear");
        clearBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtn1ActionPerformed(evt);
            }
        });
        clearBtn1.setBounds(590, 490, 76, 29);
        jLayeredPane1.add(clearBtn1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        scoreLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        scoreLbl.setText("Total Score: 230 ");
        scoreLbl.setBounds(160, 170, 150, 40);
        jLayeredPane1.add(scoreLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        totalPtsLbl.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24)); // NOI18N
        totalPtsLbl.setForeground(new java.awt.Color(0, 51, 255));
        totalPtsLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalPtsLbl.setText("1000pts");
        totalPtsLbl.setBounds(480, 170, 160, 40);
        jLayeredPane1.add(totalPtsLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bonusPtsLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        bonusPtsLbl.setForeground(new java.awt.Color(51, 153, 0));
        bonusPtsLbl.setText("1000 Bonus Pts");
        bonusPtsLbl.setBounds(340, 170, 120, 40);
        jLayeredPane1.add(bonusPtsLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        plusSign.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24));
        plusSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plusSign.setText("+");
        plusSign.setBounds(300, 170, 40, 40);
        jLayeredPane1.add(plusSign, javax.swing.JLayeredPane.DEFAULT_LAYER);

        equalSign.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 24));
        equalSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equalSign.setText("=");
        equalSign.setBounds(450, 170, 40, 40);
        jLayeredPane1.add(equalSign, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Words to Study:");
        jLabel9.setBounds(500, 220, 110, 16);
        jLayeredPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void speedyGramBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedyGramBtnActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_speedyGramBtnActionPerformed

    private void quitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitBtnActionPerformed
        // TODO add your handling code here:
        splashScreen mySplashScreen = new splashScreen();
        mySplashScreen.setLocationRelativeTo(null);
        mySplashScreen.setVisible(true);
        
        this.dispose();
        //System.exit(0);
    }//GEN-LAST:event_quitBtnActionPerformed

    private void clearBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtn1ActionPerformed
        // TODO add your handling code here:
        textArea.setText("");
    }//GEN-LAST:event_clearBtn1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bonusPtsLbl;
    private javax.swing.JButton clearBtn1;
    private javax.swing.JLabel equalSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel plusSign;
    private javax.swing.JButton quitBtn;
    private javax.swing.JLabel scoreLbl;
    private javax.swing.JButton sendBtn;
    private javax.swing.JLabel sent1;
    private javax.swing.JLabel sent2;
    private javax.swing.JLabel sent3;
    private javax.swing.JLabel sent4;
    private javax.swing.JButton speedyGramBtn;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel totalPtsLbl;
    private javax.swing.JLabel word1;
    private javax.swing.JLabel word2;
    private javax.swing.JLabel word3;
    private javax.swing.JLabel word4;
    // End of variables declaration//GEN-END:variables
    private Player player;
    private Sentence[] sentence = new Sentence[4];
}
