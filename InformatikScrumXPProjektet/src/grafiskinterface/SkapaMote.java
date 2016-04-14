/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafiskinterface;

import databas.DBClass;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author TeknikFix
 */
public class SkapaMote extends javax.swing.JFrame {

    
        ArrayList<String> deltagare;
        int deltagareNumber;
        
        
    private DBClass database = new DBClass();    
    /**
     * Creates new form SkapaMote
     */
    public SkapaMote() {
       // listHiredToCB();
        initComponents();
        laggTillNamn();
        addRooms();
        
        //Sätter rätt datumformat till datepickern
        dp_SkapaMote_datePicker.setFormats("YYYY.MM.dd");
    }

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
        cb_SkapaMote_deltagare = new javax.swing.JComboBox<>();
        cb_SkapaMote_sal = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tf_SkapaMote_deltagandePersoner = new javax.swing.JTextPane();
        lbl_SkapaMote_deltagare = new javax.swing.JLabel();
        btn_SkapaMote_skapa = new javax.swing.JButton();
        btn_SkapaMote_LaggTillDeltagare = new javax.swing.JButton();
        btn_SkapaMote_ClearDeltagare = new javax.swing.JButton();
        lbl_SkapaMote_tid = new javax.swing.JLabel();
        lbl_SkapaMote_sal = new javax.swing.JLabel();
        dp_SkapaMote_datePicker = new org.jdesktop.swingx.JXDatePicker();
        lbl_SkapaMote_timmar = new javax.swing.JLabel();
        cb_SkapaMote_Timmar = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Tf_Aktivitet = new javax.swing.JTextField();
        lbl_Aktivitet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Skapa nytt möte");

        cb_SkapaMote_deltagare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_SkapaMote_deltagareActionPerformed(evt);
            }
        });

        cb_SkapaMote_sal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_SkapaMote_salActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tf_SkapaMote_deltagandePersoner);

        lbl_SkapaMote_deltagare.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SkapaMote_deltagare.setText("Deltagare");

        btn_SkapaMote_skapa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_SkapaMote_skapa.setText("Skapa möte");
        btn_SkapaMote_skapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SkapaMote_skapaActionPerformed(evt);
            }
        });

        btn_SkapaMote_LaggTillDeltagare.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_SkapaMote_LaggTillDeltagare.setText("+");
        btn_SkapaMote_LaggTillDeltagare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SkapaMote_LaggTillDeltagareActionPerformed(evt);
            }
        });

        btn_SkapaMote_ClearDeltagare.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_SkapaMote_ClearDeltagare.setText("Rensa");
        btn_SkapaMote_ClearDeltagare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SkapaMote_ClearDeltagareActionPerformed(evt);
            }
        });

        lbl_SkapaMote_tid.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SkapaMote_tid.setText("Datum");

        lbl_SkapaMote_sal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SkapaMote_sal.setText("Sal");

        dp_SkapaMote_datePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_SkapaMote_datePickerActionPerformed(evt);
            }
        });

        lbl_SkapaMote_timmar.setText("Timmar");

        cb_SkapaMote_Timmar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel3.setText("Minuter");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(btn_SkapaMote_ClearDeltagare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_SkapaMote_skapa)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_SkapaMote_deltagare)
                                    .addComponent(lbl_SkapaMote_tid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_SkapaMote_deltagare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dp_SkapaMote_datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_SkapaMote_sal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_SkapaMote_sal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_SkapaMote_LaggTillDeltagare, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lbl_SkapaMote_timmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_SkapaMote_Timmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_SkapaMote_tid)
                    .addComponent(dp_SkapaMote_datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SkapaMote_timmar)
                    .addComponent(cb_SkapaMote_Timmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_SkapaMote_deltagare)
                            .addComponent(cb_SkapaMote_deltagare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_SkapaMote_LaggTillDeltagare)
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_SkapaMote_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_SkapaMote_sal))
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_SkapaMote_ClearDeltagare)
                    .addComponent(btn_SkapaMote_skapa))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_SkapaMote_ClearDeltagare, btn_SkapaMote_skapa});

        Tf_Aktivitet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_AktivitetActionPerformed(evt);
            }
        });

        lbl_Aktivitet.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_Aktivitet.setText("Aktivitet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_Aktivitet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tf_Aktivitet, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_Aktivitet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Aktivitet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Tf_Aktivitet, lbl_Aktivitet});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_SkapaMote_salActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_SkapaMote_salActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_SkapaMote_salActionPerformed

    private void cb_SkapaMote_deltagareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_SkapaMote_deltagareActionPerformed
        
    }//GEN-LAST:event_cb_SkapaMote_deltagareActionPerformed

    private void btn_SkapaMote_skapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SkapaMote_skapaActionPerformed
       
        laggTillMote();  
        
    }//GEN-LAST:event_btn_SkapaMote_skapaActionPerformed

    
    

// Metod  Lägger in ett nytt Möte
    public void laggTillMote() {
       
        String title = Tf_Aktivitet.getText();
        String room = cb_SkapaMote_sal.getSelectedItem().toString();
        //Get the roomid
        String roomID = database.getRoomIDfromRoomname(room);
        //Timeformate: YYYY-MM-dd HH:mm:ss
        
        //Get the choosen date
        Date choosendate = dp_SkapaMote_datePicker.getDate();
        Calendar cal = Calendar.getInstance();        
        cal.setTime(choosendate);
        
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH); //0-11
        month = month + 1;
        int year = cal.get(Calendar.YEAR);
        
        System.out.println(title + " " + room + " " + roomID + " " + year + " " + month + " " + day);
        
        
        
        
        
        
       /*String selectedSal = cb_SkapaMote_sal.getSelectedItem().toString();
       String selectedDeltagare = tf_SkapaMote_deltagandePersoner.getText();
       Date valtDatum = dp_SkapaMote_datePicker.getDate();
       String title = Tf_Aktivitet.getText();
       //Här hämtar vi ID till motsvarande del i comboboxen
        String sqlPID = "SELECT PERSONID FROM PERSON WHERE NAME = "
                + "'" + selectedDeltagare + "'";
        
        String personId = database.getId(sqlPID);
        
       //Här hämtar vi ID till motsvarande rumsnamn.
        String sqlRoomId = "SELECT ROOMID FROM ROOM WHERE NAME = "
                + "'" + selectedSal + "'";
        
        String roomId = database.getId(sqlRoomId);
        System.out.println("Vårt PID är " + personId + " vårt Room ID är " + roomId);
        
        System.out.println("Salnamn" + selectedSal + " deltagare " + selectedDeltagare + "Datum" + valtDatum); 
        
        //title = aktivitets namn ifyllt av användare
        //roomId = salens id i combobox
        //personId = deltagarens id i textpanel
        //valtDatum = det valda datumet från pickern
        
        
         String newSqlValues = "'" + title + "', '" + roomId + "', '" + personId + "', '" + valtDatum + "'";
         System.out.println(newSqlValues);
       


               
                //Kör metoden i databasklassen
                boolean test = false;
                test = database.insertIntoTableWithAutoIncrement("MEETING", newSqlValues);
                if (test == true) {
                    JOptionPane.showMessageDialog(null, "Mötet " + title + " är nu inlagt i databasen.");
                    this.dispose();
                    
                }*/

            
    }
    

    
     private void listHiredToCB()
    {
            
            //Fetches the names of all of the staff, and holds all info in a cb.
            ArrayList<HashMap<String, String>> allHired = database.listAllHired();
            for (int i = 0; i < allHired.size(); i++)
            {
                String name = allHired.get(i).get("NAMN");
                cb_SkapaMote_deltagare.addItem(name);
            }
    }
     
     
        //Adds people to the text box.
    private void btn_SkapaMote_LaggTillDeltagareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SkapaMote_LaggTillDeltagareActionPerformed
        
        String selectedDeltagare = cb_SkapaMote_deltagare.getSelectedItem().toString();
        String meetingList;
        meetingList = tf_SkapaMote_deltagandePersoner.getText();
        
        if (meetingList.equals(""))
        {
            tf_SkapaMote_deltagandePersoner.setText(selectedDeltagare);        
        }
        else
        {
        tf_SkapaMote_deltagandePersoner.setText(meetingList + "\n" + selectedDeltagare);
        }
        
       
        /*String selectedItem = cb_SkapaMote_deltagare.getSelectedItem().toString();
        
        for (deltagareNumber = 0; deltagare.size() < deltagareNumber; deltagareNumber ++)
        {
            deltagare.add(selectedItem);
        }
        for (int i = 0; deltagare.size() < i; i ++)
        {
           String namn = deltagare.get(i);
            System.out.println(namn);
        }
 */       
    }//GEN-LAST:event_btn_SkapaMote_LaggTillDeltagareActionPerformed

    

    
    
    private void btn_SkapaMote_ClearDeltagareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SkapaMote_ClearDeltagareActionPerformed
      tf_SkapaMote_deltagandePersoner.setText("");
    }//GEN-LAST:event_btn_SkapaMote_ClearDeltagareActionPerformed

    private void Tf_AktivitetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_AktivitetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_AktivitetActionPerformed

    private void dp_SkapaMote_datePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dp_SkapaMote_datePickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dp_SkapaMote_datePickerActionPerformed
   
    
         private void listRoomToCB()
    {
            
            //Fetches the names of all of the rooms, and holds all info in a cb.
            ArrayList<HashMap<String, String>> allHired = database.listAllRooms();
            for (int i = 0; i < allHired.size(); i++)
            {
                String name = allHired.get(i).get("NAMN");
                cb_SkapaMote_sal.addItem(name);
            }
       
    }  
         // Lägger till namn i Comboboxen
    public void laggTillNamn() {
        String sql =  "Select NAME FROM PERSON";
        ArrayList<HashMap<String, String>> projektLista = database.hamtaAlla(sql);
        for (int i = 0; i < projektLista.size(); i++) {
           cb_SkapaMote_deltagare.addItem(projektLista.get(i).get("NAME"));
        }
        
       }
    //Adds rooms to the combobox
    public void addRooms() {
        String sql =  "Select NAME FROM ROOM";
        ArrayList<HashMap<String, String>> roomList = database.hamtaAlla(sql);
        for (int i = 0; i < roomList.size(); i++) {
           cb_SkapaMote_sal.addItem(roomList.get(i).get("NAME"));
        
        }
    
    }
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
            java.util.logging.Logger.getLogger(SkapaMote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SkapaMote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SkapaMote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SkapaMote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SkapaMote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tf_Aktivitet;
    private javax.swing.JButton btn_SkapaMote_ClearDeltagare;
    private javax.swing.JButton btn_SkapaMote_LaggTillDeltagare;
    private javax.swing.JButton btn_SkapaMote_skapa;
    private javax.swing.JComboBox<String> cb_SkapaMote_Timmar;
    private javax.swing.JComboBox<String> cb_SkapaMote_deltagare;
    private javax.swing.JComboBox<String> cb_SkapaMote_sal;
    private org.jdesktop.swingx.JXDatePicker dp_SkapaMote_datePicker;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Aktivitet;
    private javax.swing.JLabel lbl_SkapaMote_deltagare;
    private javax.swing.JLabel lbl_SkapaMote_sal;
    private javax.swing.JLabel lbl_SkapaMote_tid;
    private javax.swing.JLabel lbl_SkapaMote_timmar;
    private javax.swing.JTextPane tf_SkapaMote_deltagandePersoner;
    // End of variables declaration//GEN-END:variables
}
