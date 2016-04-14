/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafiskinterface;

import java.util.*;
import java.awt.*;
import java.awt.CardLayout;
/**
 *
 * @author Simon
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        CardLayout card = (CardLayout)pnl_Main_MainMiddleWindow.getLayout();
        card.show(pnl_Main_MainMiddleWindow, "card4");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Main_MainBackgroundPanel = new javax.swing.JPanel();
        pnl_Main_TopBorderMenu = new javax.swing.JPanel();
        btn_Main_SkapaMote = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_Main_Education = new javax.swing.JButton();
        btn_Main_Research = new javax.swing.JButton();
        btn_Main_Social = new javax.swing.JButton();
        pnl_Main_SidePanelMenu = new javax.swing.JPanel();
        pnl_Main_MainMiddleWindow = new javax.swing.JPanel();
        pnl_MainMiddleWindow_Utbildning = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl_MainMiddleWindow_Forskning = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnl_MainMiddleWindow_Social = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_Main_Avsluta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1266, 668));
        setResizable(false);

        pnl_Main_MainBackgroundPanel.setBackground(new java.awt.Color(153, 153, 153));

        pnl_Main_TopBorderMenu.setBackground(new java.awt.Color(255, 255, 255));

        btn_Main_SkapaMote.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_Main_SkapaMote.setText("Skapa möte ");
        btn_Main_SkapaMote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Main_SkapaMoteActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("Se möten");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_Main_Education.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_Main_Education.setText("Utbildning");
        btn_Main_Education.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Main_EducationActionPerformed(evt);
            }
        });

        btn_Main_Research.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_Main_Research.setText("Forskning");
        btn_Main_Research.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Main_ResearchActionPerformed(evt);
            }
        });

        btn_Main_Social.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_Main_Social.setText("Social");
        btn_Main_Social.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Main_SocialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_Main_TopBorderMenuLayout = new javax.swing.GroupLayout(pnl_Main_TopBorderMenu);
        pnl_Main_TopBorderMenu.setLayout(pnl_Main_TopBorderMenuLayout);
        pnl_Main_TopBorderMenuLayout.setHorizontalGroup(
            pnl_Main_TopBorderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Main_TopBorderMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_Main_Education, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_Main_Research, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_Main_Social, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btn_Main_SkapaMote)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_Main_TopBorderMenuLayout.setVerticalGroup(
            pnl_Main_TopBorderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Main_TopBorderMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_Main_TopBorderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Main_Education, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Main_Social, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_Main_TopBorderMenuLayout.createSequentialGroup()
                        .addGroup(pnl_Main_TopBorderMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Main_SkapaMote, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_Main_Research, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnl_Main_TopBorderMenuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_Main_SkapaMote, jButton1});

        pnl_Main_SidePanelMenu.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_Main_SidePanelMenuLayout = new javax.swing.GroupLayout(pnl_Main_SidePanelMenu);
        pnl_Main_SidePanelMenu.setLayout(pnl_Main_SidePanelMenuLayout);
        pnl_Main_SidePanelMenuLayout.setHorizontalGroup(
            pnl_Main_SidePanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );
        pnl_Main_SidePanelMenuLayout.setVerticalGroup(
            pnl_Main_SidePanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
        );

        pnl_Main_MainMiddleWindow.setBackground(new java.awt.Color(102, 102, 102));
        pnl_Main_MainMiddleWindow.setLayout(new java.awt.CardLayout());

        pnl_MainMiddleWindow_Utbildning.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setText("Utbildning");

        javax.swing.GroupLayout pnl_MainMiddleWindow_UtbildningLayout = new javax.swing.GroupLayout(pnl_MainMiddleWindow_Utbildning);
        pnl_MainMiddleWindow_Utbildning.setLayout(pnl_MainMiddleWindow_UtbildningLayout);
        pnl_MainMiddleWindow_UtbildningLayout.setHorizontalGroup(
            pnl_MainMiddleWindow_UtbildningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MainMiddleWindow_UtbildningLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(676, Short.MAX_VALUE))
        );
        pnl_MainMiddleWindow_UtbildningLayout.setVerticalGroup(
            pnl_MainMiddleWindow_UtbildningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MainMiddleWindow_UtbildningLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(366, Short.MAX_VALUE))
        );

        pnl_Main_MainMiddleWindow.add(pnl_MainMiddleWindow_Utbildning, "card2");

        pnl_MainMiddleWindow_Forskning.setBackground(new java.awt.Color(0, 102, 204));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setText("Forskning");

        javax.swing.GroupLayout pnl_MainMiddleWindow_ForskningLayout = new javax.swing.GroupLayout(pnl_MainMiddleWindow_Forskning);
        pnl_MainMiddleWindow_Forskning.setLayout(pnl_MainMiddleWindow_ForskningLayout);
        pnl_MainMiddleWindow_ForskningLayout.setHorizontalGroup(
            pnl_MainMiddleWindow_ForskningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MainMiddleWindow_ForskningLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2)
                .addContainerGap(686, Short.MAX_VALUE))
        );
        pnl_MainMiddleWindow_ForskningLayout.setVerticalGroup(
            pnl_MainMiddleWindow_ForskningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MainMiddleWindow_ForskningLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addContainerGap(366, Short.MAX_VALUE))
        );

        pnl_Main_MainMiddleWindow.add(pnl_MainMiddleWindow_Forskning, "card3");

        pnl_MainMiddleWindow_Social.setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel3.setText("Social");

        javax.swing.GroupLayout pnl_MainMiddleWindow_SocialLayout = new javax.swing.GroupLayout(pnl_MainMiddleWindow_Social);
        pnl_MainMiddleWindow_Social.setLayout(pnl_MainMiddleWindow_SocialLayout);
        pnl_MainMiddleWindow_SocialLayout.setHorizontalGroup(
            pnl_MainMiddleWindow_SocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MainMiddleWindow_SocialLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addContainerGap(744, Short.MAX_VALUE))
        );
        pnl_MainMiddleWindow_SocialLayout.setVerticalGroup(
            pnl_MainMiddleWindow_SocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_MainMiddleWindow_SocialLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addContainerGap(366, Short.MAX_VALUE))
        );

        pnl_Main_MainMiddleWindow.add(pnl_MainMiddleWindow_Social, "card4");

        btn_Main_Avsluta.setText("Avsluta");
        btn_Main_Avsluta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Main_AvslutaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_Main_MainBackgroundPanelLayout = new javax.swing.GroupLayout(pnl_Main_MainBackgroundPanel);
        pnl_Main_MainBackgroundPanel.setLayout(pnl_Main_MainBackgroundPanelLayout);
        pnl_Main_MainBackgroundPanelLayout.setHorizontalGroup(
            pnl_Main_MainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Main_TopBorderMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_Main_MainBackgroundPanelLayout.createSequentialGroup()
                .addGroup(pnl_Main_MainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Main_MainBackgroundPanelLayout.createSequentialGroup()
                        .addContainerGap(53, Short.MAX_VALUE)
                        .addComponent(pnl_Main_MainMiddleWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(pnl_Main_MainBackgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Main_Avsluta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(pnl_Main_SidePanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_Main_MainBackgroundPanelLayout.setVerticalGroup(
            pnl_Main_MainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_Main_MainBackgroundPanelLayout.createSequentialGroup()
                .addComponent(pnl_Main_TopBorderMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_Main_MainBackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_Main_MainBackgroundPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnl_Main_SidePanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_Main_MainBackgroundPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(pnl_Main_MainMiddleWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Main_Avsluta)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Main_MainBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Main_MainBackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    private void btn_Main_AvslutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Main_AvslutaActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btn_Main_AvslutaActionPerformed

    private void btn_Main_SkapaMoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Main_SkapaMoteActionPerformed
         GrafikHelper.InitieraSkapaMote();
    }//GEN-LAST:event_btn_Main_SkapaMoteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         GrafikHelper.InitieraSeMoten();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_Main_EducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Main_EducationActionPerformed
        CardLayout card = (CardLayout)pnl_Main_MainMiddleWindow.getLayout();
        card.show(pnl_Main_MainMiddleWindow, "card2"); 
    }//GEN-LAST:event_btn_Main_EducationActionPerformed

    private void btn_Main_ResearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Main_ResearchActionPerformed
        CardLayout card = (CardLayout)pnl_Main_MainMiddleWindow.getLayout();
        card.show(pnl_Main_MainMiddleWindow, "card3"); 
    }//GEN-LAST:event_btn_Main_ResearchActionPerformed

    private void btn_Main_SocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Main_SocialActionPerformed
        CardLayout card = (CardLayout)pnl_Main_MainMiddleWindow.getLayout();
        card.show(pnl_Main_MainMiddleWindow, "card4"); 
    }//GEN-LAST:event_btn_Main_SocialActionPerformed

  
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Main_Avsluta;
    private javax.swing.JButton btn_Main_Education;
    private javax.swing.JButton btn_Main_Research;
    private javax.swing.JButton btn_Main_SkapaMote;
    private javax.swing.JButton btn_Main_Social;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnl_MainMiddleWindow_Forskning;
    private javax.swing.JPanel pnl_MainMiddleWindow_Social;
    private javax.swing.JPanel pnl_MainMiddleWindow_Utbildning;
    private javax.swing.JPanel pnl_Main_MainBackgroundPanel;
    private javax.swing.JPanel pnl_Main_MainMiddleWindow;
    private javax.swing.JPanel pnl_Main_SidePanelMenu;
    private javax.swing.JPanel pnl_Main_TopBorderMenu;
    // End of variables declaration//GEN-END:variables
}
