/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafiskinterface;

import static com.teamdev.jxbrowser.chromium.ao.d;
import databas.DBClass;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
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
       this.setLocationRelativeTo(null);
        initComponents();
        laggTillNamn();
        addRooms();   
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
        cb_SkapaMote_Minuter = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_SkapaMote_Starttider = new javax.swing.JList<>();
        btn_SkapaMote_LaggTillTid = new javax.swing.JButton();
        btn_SkapaMote_TaBortTid = new javax.swing.JButton();
        Tf_Aktivitet = new javax.swing.JTextField();
        lbl_Aktivitet = new javax.swing.JLabel();
        btn_skapaMote_stang = new javax.swing.JButton();
        lbl_SkapaMote_Beskrivning = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_SkapaMote_Beskrivning = new javax.swing.JTextArea();

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
        lbl_SkapaMote_sal.setText("Plats");

        dp_SkapaMote_datePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dp_SkapaMote_datePickerActionPerformed(evt);
            }
        });

        lbl_SkapaMote_timmar.setText("Starttid timmar");

        cb_SkapaMote_Timmar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        jLabel3.setText("Starttid minuter");

        cb_SkapaMote_Minuter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));

        jList_SkapaMote_Starttider.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jList_SkapaMote_Starttider);

        btn_SkapaMote_LaggTillTid.setText("Lägg till");
        btn_SkapaMote_LaggTillTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SkapaMote_LaggTillTidActionPerformed(evt);
            }
        });

        btn_SkapaMote_TaBortTid.setText("Ta bort");
        btn_SkapaMote_TaBortTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SkapaMote_TaBortTidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_SkapaMote_sal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_SkapaMote_sal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_SkapaMote_tid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dp_SkapaMote_datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_SkapaMote_LaggTillDeltagare))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_SkapaMote_timmar)
                                .addGap(18, 18, 18)
                                .addComponent(cb_SkapaMote_Timmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(lbl_SkapaMote_deltagare))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_SkapaMote_deltagare, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_SkapaMote_Minuter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btn_SkapaMote_ClearDeltagare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_SkapaMote_skapa))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_SkapaMote_LaggTillTid)
                                .addComponent(btn_SkapaMote_TaBortTid))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_SkapaMote_tid)
                            .addComponent(dp_SkapaMote_datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_SkapaMote_timmar)
                            .addComponent(cb_SkapaMote_Timmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_SkapaMote_LaggTillTid))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_SkapaMote_Minuter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_SkapaMote_TaBortTid)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_SkapaMote_ClearDeltagare)
                            .addComponent(btn_SkapaMote_skapa))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_SkapaMote_deltagare)
                            .addComponent(cb_SkapaMote_deltagare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(btn_SkapaMote_LaggTillDeltagare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_SkapaMote_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_SkapaMote_sal))
                        .addGap(101, 101, 101))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_SkapaMote_ClearDeltagare, btn_SkapaMote_skapa});

        Tf_Aktivitet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_AktivitetActionPerformed(evt);
            }
        });

        lbl_Aktivitet.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_Aktivitet.setText("Titel");

        btn_skapaMote_stang.setText("Stäng");
        btn_skapaMote_stang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_skapaMote_stangActionPerformed(evt);
            }
        });

        lbl_SkapaMote_Beskrivning.setText("Beskrivning");

        ta_SkapaMote_Beskrivning.setColumns(20);
        ta_SkapaMote_Beskrivning.setRows(5);
        jScrollPane2.setViewportView(ta_SkapaMote_Beskrivning);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_skapaMote_stang)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_Aktivitet, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_SkapaMote_Beskrivning))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Tf_Aktivitet, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(158, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_SkapaMote_Beskrivning)
                        .addGap(568, 568, 568)
                        .addComponent(btn_skapaMote_stang))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
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
        //Inserts dateTime into the database. Saves the query in a string
        String sqlQuery = database.insertDateToDate_Time(getChoosenDate());      
        //Gets the dateTimeID
        String dateTimeID = getIDwithOneSplit(sqlQuery);
        
    
        //Inserts Title, description, ID to meeting. Saves the meetingID into a string
        String meetingID = laggTillMote();
        
        //inserts into meeting_time
        String meetingTimeID = insertMEETING_TIME(meetingID, dateTimeID);
        
        //Inserts the meetingTimeID into meeting (the one that just got created)
        addMeetingTimeToMeeting(meetingID, meetingTimeID);
        
        addPeopleToAttendees(meetingID);
        
        JOptionPane.showMessageDialog(null, "Du har nu lagt till ett möte");
        //Rensa all input i fälten.
        /*Massa bra kod*/
        
        
    }//GEN-LAST:event_btn_SkapaMote_skapaActionPerformed
    
    public void insertDateTime(){
        //ListModel<String> dates = new ListModel<String>();
       DefaultListModel<String> dlm = (DefaultListModel<String>) jList_SkapaMote_Starttider.getModel();
       ArrayList<String> dateList = new ArrayList<String>();
       
       //Saves the choosen dates into a arraylist
       for (int i = 0; i < dlm.getSize(); i++){
           dateList.add(dlm.get(i));
       }  
    }
    
    /**
     * Gets the choosen date (from datepicker) and time (dropbox) to a string (YYYY-MM-dd HH:mm:ss)
     * @return The choosen date
     */
    public String getChoosenDate() {
        
        //Get the choosen date.
        Date choosendate = dp_SkapaMote_datePicker.getDate();
        Calendar cal = Calendar.getInstance();        
        cal.setTime(choosendate);
        
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH); //0-11
        month = month + 1;
        int year = cal.get(Calendar.YEAR);
        String hour = cb_SkapaMote_Timmar.getSelectedItem().toString();
        String minute = cb_SkapaMote_Minuter.getSelectedItem().toString();
        String seconds = "00";
        
        //Timeformat: YYYY-MM-dd HH:mm:ss
        String finalDate = year + "-" + month + "-" + day + " " + hour + ":" + minute + ":" + seconds;
        
        //Day and month will print out 1, 2, 3... we want 01,02,03...
        if (day < 10 && month < 10) {
            finalDate = year + "-0" + month + "-0" + day + " " + hour + ":" + minute + ":" + seconds;
        }
        if (day < 10 && month >= 10) {
            finalDate = year + "-" + month + "-0" + day + " " + hour + ":" + minute + ":" + seconds;
        }
        if (day >= 10 && month < 10) {
            finalDate = year + "-0" + month + "-" + day + " " + hour + ":" + minute + ":" + seconds;
        }  
        return finalDate;   
    }
   

    /**
     * Lägger till ett möte. Returnerar sql frågan
     */
    public String laggTillMote() {
       
        String title = Tf_Aktivitet.getText();
        String description = ta_SkapaMote_Beskrivning.getText();
        String room = cb_SkapaMote_sal.getSelectedItem().toString();
        //Get the roomid
        String roomID = database.getRoomIDfromRoomname(room);
        
        //Inserts the meeting and saves the sql query to a string. We want to get the auto created ID from the query
        String theSqlQuery = database.addMeeting(title, description, roomID);
        
        //Get the ID from theSqlQuery
        String meetingID = getIDwithTwoSplits(theSqlQuery);
        
        return meetingID;    
    }
    
    
    public String insertMEETING_TIME(String meetingID, String dateTimeID){
        String sqlQuery = database.addMeetingTime(meetingID, dateTimeID);
        //Get the id
        String meeting_timeID = getIDwithOneSplit(sqlQuery);
        return meeting_timeID;
    }
    
    public String getIDwithOneSplit(String sqlQuery){
        String[] firstsplit = sqlQuery.split("[(]");
        
        //First split is INSERT INTO MEETING, second is MEETINGID,TITLE,..... and third is the values we want.
        String[] dateTimeID = firstsplit[1].split(",");
        return dateTimeID[0];
    }
    
    public String getIDwithTwoSplits(String sqlQuery){
        String[] firstsplit = sqlQuery.split("[(]");
        
        //First split is INSERT INTO MEETING, second is MEETINGID,TITLE,..... and third is the values we want.
        String[] meetingID = firstsplit[2].split(",");
        return meetingID[0];
        
    }
    
    public void addMeetingTimeToMeeting(String meetingID, String meetingTimeID){
        database.addMeetingTimeToMeeting(meetingID, meetingTimeID);
    }
    
    
    /**
     * Denna gör inget just nu!
     */
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
     
     
     private void addPeopleToAttendees(String meetingID){
         //Adds people to an array
        String allaPersoner = tf_SkapaMote_deltagandePersoner.getText();
        String[] arraySplit = allaPersoner.split("\\n");
        //Get the PERSONID from the database
        database.addPersonToAttendees(meetingID, arraySplit);
        
        
        
        
        
         
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

    private void btn_skapaMote_stangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_skapaMote_stangActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_skapaMote_stangActionPerformed

    private void btn_SkapaMote_LaggTillTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SkapaMote_LaggTillTidActionPerformed
       String choosenTime = getChoosenDate();
       
       DefaultListModel<String> dlm = (DefaultListModel<String>) jList_SkapaMote_Starttider.getModel();
       
       
       dlm.addElement(choosenTime);
       jList_SkapaMote_Starttider.setModel(dlm);
       
       
    }//GEN-LAST:event_btn_SkapaMote_LaggTillTidActionPerformed

    private void btn_SkapaMote_TaBortTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SkapaMote_TaBortTidActionPerformed
        if(jList_SkapaMote_Starttider.isSelectionEmpty()){
           JOptionPane.showMessageDialog(null, "Du måste välja ett datum att ta bort!");
           
       }
       else { 
        DefaultListModel<String> dlm = (DefaultListModel<String>) jList_SkapaMote_Starttider.getModel();

        dlm.remove(jList_SkapaMote_Starttider.getSelectedIndex());
        jList_SkapaMote_Starttider.setModel(dlm);
       }
    }//GEN-LAST:event_btn_SkapaMote_TaBortTidActionPerformed
   
    
    private void listRoomToCB()
    {
            
            //Fetches the names of all of the rooms, and holds all info in a cb.
            ArrayList<HashMap<String, String>> allHired = database.listAllRooms();
            for (int i = 0; i < allHired.size(); i++)
            {
                String name = allHired.get(i).get("RNAME");
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
        String sql =  "Select RNAME FROM ROOM";
        ArrayList<HashMap<String, String>> roomList = database.hamtaAlla(sql);
        for (int i = 0; i < roomList.size(); i++) {
           cb_SkapaMote_sal.addItem(roomList.get(i).get("RNAME"));
        
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
    private javax.swing.JButton btn_SkapaMote_LaggTillTid;
    private javax.swing.JButton btn_SkapaMote_TaBortTid;
    private javax.swing.JButton btn_SkapaMote_skapa;
    private javax.swing.JButton btn_skapaMote_stang;
    private javax.swing.JComboBox<String> cb_SkapaMote_Minuter;
    private javax.swing.JComboBox<String> cb_SkapaMote_Timmar;
    private javax.swing.JComboBox<String> cb_SkapaMote_deltagare;
    private javax.swing.JComboBox<String> cb_SkapaMote_sal;
    private org.jdesktop.swingx.JXDatePicker dp_SkapaMote_datePicker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList_SkapaMote_Starttider;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_Aktivitet;
    private javax.swing.JLabel lbl_SkapaMote_Beskrivning;
    private javax.swing.JLabel lbl_SkapaMote_deltagare;
    private javax.swing.JLabel lbl_SkapaMote_sal;
    private javax.swing.JLabel lbl_SkapaMote_tid;
    private javax.swing.JLabel lbl_SkapaMote_timmar;
    private javax.swing.JTextArea ta_SkapaMote_Beskrivning;
    private javax.swing.JTextPane tf_SkapaMote_deltagandePersoner;
    // End of variables declaration//GEN-END:variables
}
