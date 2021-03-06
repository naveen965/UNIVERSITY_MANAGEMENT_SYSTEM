/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserStudent;

import UMSStudent.StudentLogin;
import UMSStudent.StudentSignup;
import UniversityManagementSystem.Login;
import UniversityManagementSystem.SignUp;
import javax.swing.ImageIcon;

/**
 *
 * @author Naveen Rajasekara
 */
public class StudentMain extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public StudentMain() {
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

        jPanel1 = new javax.swing.JPanel();
        signUp = new javax.swing.JButton();
        signin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        signUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signupmouseexit.png"))); // NOI18N
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signUpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signUpMouseReleased(evt);
            }
        });
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        jPanel1.add(signUp);
        signUp.setBounds(670, 450, 170, 80);

        signin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signinmouseexit.png"))); // NOI18N
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signinMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                signinMouseReleased(evt);
            }
        });
        signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinActionPerformed(evt);
            }
        });
        jPanel1.add(signin);
        signin.setBounds(230, 450, 170, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 80, 430, 550);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/main2.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(560, 80, 400, 550);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Main.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1090, 700);

        jLabel4.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLabel4.setText("University Management System");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(290, 40, 520, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1103, 727));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/sign.png"));
        jLabel2.setIcon(II);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/main2.png"));
        jLabel2.setIcon(II);
    }//GEN-LAST:event_jLabel2MouseExited

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/signupbuttonclick.png"));
        signUp.setIcon(II);
    }//GEN-LAST:event_signUpMouseClicked

    private void signUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/signup-default.png"));
        signUp.setIcon(II);
        ImageIcon II1 = new ImageIcon(getClass().getResource("/Images/sign.png"));
        jLabel2.setIcon(II1);
    }//GEN-LAST:event_signUpMouseEntered

    private void signUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/signupmouseexit.png"));
        signUp.setIcon(II);
    }//GEN-LAST:event_signUpMouseExited

    private void signUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/signupbuttonclick.png"));
        signUp.setIcon(II);
    }//GEN-LAST:event_signUpMousePressed

    private void signUpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/signupmouseexit.png"));
        signUp.setIcon(II);
    }//GEN-LAST:event_signUpMouseReleased

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/signinbuttonclick.png"));
        signin.setIcon(II);
    }//GEN-LAST:event_signinMouseClicked

    private void signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/signin-default.png"));
        signin.setIcon(II);
        ImageIcon II1 = new ImageIcon(getClass().getResource("/Images/log.png"));
        jLabel3.setIcon(II1);
    }//GEN-LAST:event_signinMouseEntered

    private void signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/signinmouseexit.png"));
        signin.setIcon(II);
    }//GEN-LAST:event_signinMouseExited

    private void signinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/signinbuttonclick.png"));
        signin.setIcon(II);
    }//GEN-LAST:event_signinMousePressed

    private void signinMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/signinmouseexit.png"));
        signin.setIcon(II);
    }//GEN-LAST:event_signinMouseReleased

    private void signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinActionPerformed
        setVisible(false);
        StudentLogin object = new StudentLogin();
        object.setVisible(true);
    }//GEN-LAST:event_signinActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/log.png"));
        jLabel3.setIcon(II);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/main1.png"));
        jLabel3.setIcon(II);
    }//GEN-LAST:event_jLabel3MouseExited

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        setVisible(false);
        StudentSignup object = new StudentSignup();
        object.setVisible(true);
    }//GEN-LAST:event_signUpActionPerformed

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
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton signUp;
    private javax.swing.JButton signin;
    // End of variables declaration//GEN-END:variables
}
