/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegui;
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author Maggie
 */
public class TicTacToeFrame extends javax.swing.JFrame {

    private String strWhoseTurn = "X";
    private String strPlayerOne = "Player One";
    private String strPlayerTwo = "Player Two";
    private int intPlayerOneScore = 0;
    private int intPlayerTwoScore = 0;
    private String strPlayersTurn = "";
    
    /**
     * Creates new form TicTacToeFrame
     */
    public TicTacToeFrame() {
        initComponents();
        setSize(600,600);
        setLocationRelativeTo(null);
        mGetPlayerNames();
        mSetPlayerName();
        mSetScore();
    }
    
    private void mDraw()
    {
        String strOne = btnOne.getText();
        String strTwo = btnTwo.getText();
        String strThree = btnThree.getText();
        String strFour = btnFour.getText();
        String strFive = btnFive.getText();
        String strSix = btnSix.getText();
        String strSeven = btnSeven.getText();
        String strEight = btnEight.getText();
        String strNine = btnNine.getText();
        
        if(strOne != "" && strTwo != "" && strThree != "" && strFour != "" && strFive != ""
                && strSix != "" && strSeven != "" && strEight != "" && strNine != "")
        {
            JOptionPane.showMessageDialog(this,
                                          "Game is a TIE",
                                          "DRAW!!",
                                          JOptionPane.INFORMATION_MESSAGE);
            mResetGame();
        }
    }
    
    private void mSetScore()
    {   
        lblScore.setText(strPlayerOne + "'s score is: " + String.valueOf(intPlayerOneScore) + "    " + strPlayersTurn + "'s move    " + strPlayerTwo +
                         "'s score is: " + String.valueOf(intPlayerTwoScore));
    }
    
    private void mSetPlayerName()
    {
        if(strWhoseTurn.equalsIgnoreCase("X"))
        {
            strPlayersTurn = strPlayerOne;
        }
        else
        {
            strPlayersTurn = strPlayerTwo;
        }
        
        lblScore.setText(strPlayerOne + "'s score is: " + String.valueOf(intPlayerOneScore) + "    " + strPlayersTurn + "'s move    " + strPlayerTwo +
                         "'s score is: " + String.valueOf(intPlayerTwoScore));
    }

    private void mGetPlayerNames()
    {
        strPlayerOne = JOptionPane.showInputDialog(this,
                                                   "Player One Name:",
                                                   "Player Name",
                                                   JOptionPane.INFORMATION_MESSAGE);
        
        strPlayerTwo = JOptionPane.showInputDialog(this,
                                                   "Player Two Name:",
                                                   "Player Name",
                                                   JOptionPane.INFORMATION_MESSAGE);
        
        if(strPlayerOne.equals(""))
        {
            strPlayerOne = "Player One";
        }
        if(strPlayerTwo.equals(""))
        {
            strPlayerTwo = "Player Two";
        }
                
    }
    
    private void mDetermineWhoseTurn()
    {
        if(strWhoseTurn.equalsIgnoreCase("X"))
        {
            strWhoseTurn = "O";
        }
        else
        {
            strWhoseTurn = "X";
        }
    }
    
    private void mXWins()
    {
        JOptionPane.showMessageDialog(this,
                "Congrats " + strPlayerOne,                       //message shown on JOptionPane
                strPlayerOne + " Wins :)",              //Title shown on JOptionPane
                JOptionPane.INFORMATION_MESSAGE);
        intPlayerOneScore++;
        mResetGame();
    }
    
    private void mOWins()
    {
        JOptionPane.showMessageDialog(this,
                "Congrats " + strPlayerTwo,                    //message shown on JOptionPane
                strPlayerTwo + " Wins :)",            //Title shown on JOptionPane
                JOptionPane.INFORMATION_MESSAGE);
        intPlayerTwoScore++;
        mResetGame();
    }
    
    private void mResetGame()
    {
        btnOne.setText("");
        btnTwo.setText("");
        btnThree.setText("");
        btnFour.setText("");
        btnFive.setText("");
        btnSix.setText("");
        btnSeven.setText("");
        btnEight.setText("");
        btnNine.setText("");
        mSetScore();
    }
    
    private void mDetermineWinner()
    {
        String strOne = btnOne.getText();
        String strTwo = btnTwo.getText();
        String strThree = btnThree.getText();
        String strFour = btnFour.getText();
        String strFive = btnFive.getText();
        String strSix = btnSix.getText();
        String strSeven = btnSeven.getText();
        String strEight = btnEight.getText();
        String strNine = btnNine.getText();
        
        //X win condition
        
        if(strOne == "X" && strTwo == "X" && strThree == "X")
        {
            mXWins();
        }
        
        if(strFour == "X" && strFive == "X" && strSix == "X")
        {
            mXWins();
        }
        
        if(strSeven == "X" && strEight == "X" && strNine == "X")
        {
            mXWins();
        }
        
        if(strOne == "X" && strFour == "X" && strSeven == "X")
        {
            mXWins();
        }
        
        if(strTwo == "X" && strFive == "X" && strEight == "X")
        {
            mXWins();
        }
        
        if(strThree == "X" && strSix == "X" && strNine == "X")
        {
            mXWins();
        }
        
        if(strOne == "X" && strFive == "X" && strNine == "X")
        {
            mXWins();
        }
        
        if(strThree == "X" && strFive == "X" && strSeven == "X")
        {
            mXWins();
        }
        
        // O win Condition
        
        if(strOne == "O" && strTwo == "O" && strThree == "O")
        {
            mOWins();
        }
        
        if(strFour == "O" && strFive == "O" && strSix == "O")
        {
            mOWins();
        }
        
        if(strSeven == "O" && strEight == "O" && strNine == "O")
        {
            mOWins();
        }
        
        if(strOne == "O" && strFour == "O" && strSeven == "O")
        {
            mOWins();
        }
        
        if(strTwo == "O" && strFive == "O" && strEight == "O")
        {
            mOWins();
        }
        
        if(strThree == "O" && strSix == "O" && strNine == "O")
        {
            mOWins();
        }
        
        if(strOne == "O" && strFive == "O" && strNine == "O")
        {
            mOWins();
        }
        
        if(strThree == "O" && strFive == "O" && strSeven == "O")
        {
            mOWins();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblScore = new javax.swing.JLabel();
        pnlPanelGridHolder = new javax.swing.JPanel();
        pnlPanel1 = new javax.swing.JPanel();
        btnOne = new javax.swing.JButton();
        pnlPanel2 = new javax.swing.JPanel();
        btnTwo = new javax.swing.JButton();
        pnlPanel3 = new javax.swing.JPanel();
        btnThree = new javax.swing.JButton();
        pnlPanel4 = new javax.swing.JPanel();
        btnFour = new javax.swing.JButton();
        pnlPanel5 = new javax.swing.JPanel();
        btnFive = new javax.swing.JButton();
        pnlPanel6 = new javax.swing.JPanel();
        btnSix = new javax.swing.JButton();
        pnlPanel7 = new javax.swing.JPanel();
        btnSeven = new javax.swing.JButton();
        pnlPanel8 = new javax.swing.JPanel();
        btnEight = new javax.swing.JButton();
        pnlPanel9 = new javax.swing.JPanel();
        btnNine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        lblScore.setBackground(new java.awt.Color(255, 255, 255));
        lblScore.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblScore.setForeground(new java.awt.Color(255, 255, 255));
        lblScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScore.setText("jLabel1");
        jPanel1.add(lblScore, java.awt.BorderLayout.PAGE_END);

        pnlPanelGridHolder.setBackground(new java.awt.Color(153, 153, 153));
        pnlPanelGridHolder.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        pnlPanel1.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPanel1.setLayout(new java.awt.BorderLayout());

        btnOne.setBackground(new java.awt.Color(255, 255, 255));
        btnOne.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });
        pnlPanel1.add(btnOne, java.awt.BorderLayout.CENTER);

        pnlPanelGridHolder.add(pnlPanel1);

        pnlPanel2.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPanel2.setLayout(new java.awt.BorderLayout());

        btnTwo.setBackground(new java.awt.Color(255, 255, 255));
        btnTwo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });
        pnlPanel2.add(btnTwo, java.awt.BorderLayout.CENTER);

        pnlPanelGridHolder.add(pnlPanel2);

        pnlPanel3.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPanel3.setLayout(new java.awt.BorderLayout());

        btnThree.setBackground(new java.awt.Color(255, 255, 255));
        btnThree.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });
        pnlPanel3.add(btnThree, java.awt.BorderLayout.CENTER);

        pnlPanelGridHolder.add(pnlPanel3);

        pnlPanel4.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPanel4.setLayout(new java.awt.BorderLayout());

        btnFour.setBackground(new java.awt.Color(255, 255, 255));
        btnFour.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });
        pnlPanel4.add(btnFour, java.awt.BorderLayout.CENTER);

        pnlPanelGridHolder.add(pnlPanel4);

        pnlPanel5.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPanel5.setLayout(new java.awt.BorderLayout());

        btnFive.setBackground(new java.awt.Color(255, 255, 255));
        btnFive.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });
        pnlPanel5.add(btnFive, java.awt.BorderLayout.CENTER);

        pnlPanelGridHolder.add(pnlPanel5);

        pnlPanel6.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPanel6.setLayout(new java.awt.BorderLayout());

        btnSix.setBackground(new java.awt.Color(255, 255, 255));
        btnSix.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });
        pnlPanel6.add(btnSix, java.awt.BorderLayout.CENTER);

        pnlPanelGridHolder.add(pnlPanel6);

        pnlPanel7.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPanel7.setLayout(new java.awt.BorderLayout());

        btnSeven.setBackground(new java.awt.Color(255, 255, 255));
        btnSeven.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });
        pnlPanel7.add(btnSeven, java.awt.BorderLayout.CENTER);

        pnlPanelGridHolder.add(pnlPanel7);

        pnlPanel8.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPanel8.setLayout(new java.awt.BorderLayout());

        btnEight.setBackground(new java.awt.Color(255, 255, 255));
        btnEight.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });
        pnlPanel8.add(btnEight, java.awt.BorderLayout.CENTER);

        pnlPanelGridHolder.add(pnlPanel8);

        pnlPanel9.setBackground(new java.awt.Color(255, 255, 255));
        pnlPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlPanel9.setLayout(new java.awt.BorderLayout());

        btnNine.setBackground(new java.awt.Color(255, 255, 255));
        btnNine.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });
        pnlPanel9.add(btnNine, java.awt.BorderLayout.CENTER);

        pnlPanelGridHolder.add(pnlPanel9);

        jPanel1.add(pnlPanelGridHolder, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
       btnOne.setText(strWhoseTurn);
       if(strWhoseTurn.equalsIgnoreCase("X"))
       {
           btnOne.setForeground(Color.red);
       }
       else
       {
           btnOne.setForeground(Color.green);
       }
       mDetermineWhoseTurn();
       mDetermineWinner();
       mDraw();
       mSetPlayerName();
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        btnTwo.setText(strWhoseTurn);
        if(strWhoseTurn.equalsIgnoreCase("X"))
        {
            btnTwo.setForeground(Color.red);
        }
        else
        {
            btnTwo.setForeground(Color.green);
        }
        mDetermineWhoseTurn();
        mDetermineWinner();
        mDraw();
        mSetPlayerName();
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        btnThree.setText(strWhoseTurn);
        if(strWhoseTurn.equalsIgnoreCase("X"))
        {
            btnThree.setForeground(Color.red);
        }
        else
        {
            btnThree.setForeground(Color.green);
        }
        mDetermineWhoseTurn();
        mDetermineWinner();
        mDraw();
        mSetPlayerName();
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        btnFour.setText(strWhoseTurn);
        if(strWhoseTurn.equalsIgnoreCase("X"))
        {
            btnFour.setForeground(Color.red);
        }
        else
        {
            btnFour.setForeground(Color.green);
        }
        mDetermineWhoseTurn();
        mDetermineWinner();
        mDraw();
        mSetPlayerName();
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        btnFive.setText(strWhoseTurn);
        if(strWhoseTurn.equalsIgnoreCase("X"))
        {
            btnFive.setForeground(Color.red);
        }
        else
        {
            btnFive.setForeground(Color.green);
        }
        mDetermineWhoseTurn();
        mDetermineWinner();
        mDraw();
        mSetPlayerName();
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        btnSix.setText(strWhoseTurn);
        if(strWhoseTurn.equalsIgnoreCase("X"))
        {
            btnSix.setForeground(Color.red);
        }
        else
        {
            btnSix.setForeground(Color.green);
        }
        mDetermineWhoseTurn();
        mDetermineWinner();
        mDraw();
        mSetPlayerName();
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        btnSeven.setText(strWhoseTurn);
        if(strWhoseTurn.equalsIgnoreCase("X"))
        {
            btnSeven.setForeground(Color.red);
        }
        else
        {
            btnSeven.setForeground(Color.green);
        }
        mDetermineWhoseTurn();
        mDetermineWinner();
        mDraw();
        mSetPlayerName();
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        btnEight.setText(strWhoseTurn);
        if(strWhoseTurn.equalsIgnoreCase("X"))
        {
            btnEight.setForeground(Color.red);
        }
        else
        {
            btnEight.setForeground(Color.green);
        }
        mDetermineWhoseTurn();
        mDetermineWinner();
        mDraw();
        mSetPlayerName();
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        btnNine.setText(strWhoseTurn);
        if(strWhoseTurn.equalsIgnoreCase("X"))
        {
            btnNine.setForeground(Color.red);
        }
        else
        {
            btnNine.setForeground(Color.green);
        }
        mDetermineWhoseTurn();
        mDetermineWinner();
        mDraw();
        mSetPlayerName();
    }//GEN-LAST:event_btnNineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblScore;
    private javax.swing.JPanel pnlPanel1;
    private javax.swing.JPanel pnlPanel2;
    private javax.swing.JPanel pnlPanel3;
    private javax.swing.JPanel pnlPanel4;
    private javax.swing.JPanel pnlPanel5;
    private javax.swing.JPanel pnlPanel6;
    private javax.swing.JPanel pnlPanel7;
    private javax.swing.JPanel pnlPanel8;
    private javax.swing.JPanel pnlPanel9;
    private javax.swing.JPanel pnlPanelGridHolder;
    // End of variables declaration//GEN-END:variables
}
