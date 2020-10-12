
package privite.school;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.ComponentOrientation;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;

public class Login extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public Login() {
        setLocation(500, 100);
        initComponents();
        con = PriviteSchool.connected();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  
        DefaultListCellRenderer dc = new DefaultListCellRenderer();
       dc.setHorizontalAlignment(DefaultListCellRenderer.RIGHT);
       jComboBox1.setRenderer(dc);
       
        delete();
        count_days("other");
        count_days("f_y_primery");
        count_days("s_y_primery");
        count_days("t_y_primery");
        count_days("fo_y_primery");
        count_days("fi_y_primery");
        count_days("f_y_medum");
        count_days("s_y_medum");
        count_days("t_y_medum");
        count_days("fo_y_medum");
        count_days("f_y_h_school");
        count_days("s_y_h_school");
        count_days("t_y_h_school");
        count_days("preparatory_year");
        add_salary();
        cost();
 
    }
   
    
   
     private void add_cost(String s,String id){
                String re = null;
                String re1 =null;
                String re3= null;
        try {
                        String sql = "select \"الدين/عليه\",\"سعر التدريس\"from '"+s+"' where الرقم='"+id+"' ";
                      pst = con.prepareStatement(sql);
                      rs = pst.executeQuery();
                      re=rs.getString("سعر التدريس");
                      re1=rs.getString("الدين/عليه");
                  int add1 = Integer.parseInt(re1);
                  int add  = Integer.parseInt(re);
                  re3=String.valueOf(add+add1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            
            try {
                rs.close();
                pst.close();
             
            } catch (SQLException ex) {
             
            }
        }
                                   
            try { 
                String query=null;
                   if (s.equals("teacher")) {
                            query = "update teacher set 'الدين/له'='"+re3+"'where الرقم ='"+id+"' ";
                            } else {
                            query = "update '"+s+"' set 'الدين/عليه'='"+re3+"'where الرقم ='"+id+"' ";
                            }
            
            pst = con.prepareStatement(query);
            pst.execute();
            } catch (HeadlessException | SQLException e) {
     JOptionPane.showMessageDialog(null, e);
        }finally{
            
            try {
           
                pst.close();
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
            }
        }

       
    }
     private void count_days(String s){
        int i =0;
        ArrayList<String> check = new ArrayList<>();
        ArrayList<String> id = new ArrayList<>();
         try {
                 String querry = "select الرقم,تفحص from '"+s+"'";
                 pst = con.prepareStatement(querry);
                 rs=pst.executeQuery();
                 while (rs.next()) {                     
                 check.add(rs.getString("تفحص"));
                 id.add(rs.getString("الرقم"));
                 }
                 } catch ( SQLException ex) {
              JOptionPane.showMessageDialog(null, ex);
          }finally{
                 try {
                     rs.close();
                     pst.close();
                 } catch (SQLException e) {}
                 }
   while(i< count1(s)){            
             if (count1(s)!=0) {
             DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
             LocalDate date = LocalDate.parse(check.get(i),f);
             LocalDate date1 = LocalDate.now();
                 
             if (date.equals(date1)) {
                 add_cost(s, id.get(i));
                try { 
                Period p = Period.ofWeeks(4);
                String dates = date.plus(p).format(f);
                String query = "update '"+s+"' set تفحص='"+dates+"'where الرقم ='"+id.get(i)+"' ";
                pst = con.prepareStatement(query);
                pst.execute();
            } catch (HeadlessException | SQLException e) {
     JOptionPane.showMessageDialog(null, e);
        }finally{
            
            try {
           
                pst.close();
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex);
            }
        }
            }
            }
           
             
          i++;
        }

        
    }
     private int count1(String s){
    int c=0;
        try {
            String querry = "select count(الرقم) from '"+s+"'";
            pst = con.prepareStatement(querry);
            rs = pst.executeQuery();
            if (rs.next()) {
              String add = rs.getString("count(الرقم)");
              c= Integer.valueOf(add);
            }
        } catch (NumberFormatException | SQLException e) {
            
        }finally{
            try {
                
                pst.close();
                rs.close();
            } catch (SQLException e) {
            }
        }
        
    return c;
    }
     private void add_salary(){
               if (LocalDate.now().getDayOfMonth()==1) {
               ArrayList<String> name = new ArrayList<>();
               ArrayList<String> salary = new ArrayList<>();
               ArrayList<String> jab = new ArrayList<>();
       try {          
                 String querry = "select الإسم,الراتب,الوظيفة from employee";
                 pst = con.prepareStatement(querry);
                 rs=pst.executeQuery();
                 while (rs.next()) {   
                     
                   name.add(rs.getString("الإسم"));
                   salary.add(rs.getString("الراتب"));
                   jab.add(rs.getString("الوظيفة"));
                   
                 }
                 } catch ( SQLException ex) {
              JOptionPane.showMessageDialog(null, ex);
          }finally{
                 try {
                     rs.close();
                     pst.close();
                 } catch (SQLException e) {
                 }
             }
              LocalDate date = LocalDate.now();
              String date1 = date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
              int i = 0;             
              while (i<name.size()) {                       
                                   
                                         try {
                                String sql ="Insert into movement_stock (الإسم ,الوظيفة,استلام,دفع,التاريخ) values (?,?,?,?,?)";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,name.get(i));
                                pst.setString(2,jab.get(i));
                                pst.setString(3,"/");
                                pst.setString(4,salary.get(i)); 
                                pst.setString(5,date1); 
                                pst.execute();
                                i++;
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{

                                try {

                                    pst.close();
                                } catch (SQLException ex) {

                                }}   
                   }
               
         }
     }
     private void delete(){
      try {
          Period p = Period.ofMonths(5);
          LocalDateTime date = LocalDateTime.now().minus(p);
            String querry = "delete from actions where التاريخ < '"+date+"'";
            pst = con.prepareStatement(querry);
             pst.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
           try {
             
               pst.close();
           } catch (SQLException ex) {
               
           }
        }
}
     private void cost(){
          try {   
              String name ;
              String number ;
              String date1 ;
              int date ;
              Integer period ;
              Double price ;
                 String querry = "select *from cost";
                 pst = con.prepareStatement(querry);
                 rs=pst.executeQuery();
                 while (rs.next()) {   
                   name = rs.getString("الإسم");
                   number = rs.getString("المدة");
                   date1 = rs.getString("التاريخ");
                   period = rs.getInt("العدد");
                   date = rs.getInt("id");
                   price = rs.getDouble("السعر");
                   DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
              
                   LocalDate date2 = LocalDate.parse(date1, f);
                     if (LocalDate.now().equals(date2)) {
                  
                                        try {
                                String sql ="Insert into movement_stock (الإسم ,الوظيفة,استلام,دفع,التاريخ) values (?,?,?,?,?)";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,name);
                                pst.setString(2,"/");
                                pst.setString(3,"/");
                                pst.setDouble(4,price); 
                                pst.setString(5,date1); 
                                pst.execute();
                                
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{
                                try {
                                    pst.close();
                                } catch (SQLException ex) {
                                }}   
                     }
                     LocalDate date3;
                     if (number.equals("يوم")) {
                         date3 = LocalDate.parse(date1, f).plus(Period.ofDays(period));
                     } else {
                         if (number.equals("شهر")) {
                           date3 = LocalDate.parse(date1, f).plus(Period.ofMonths(period));  
                         } else {
                             date3 = LocalDate.parse(date1, f).plus(Period.ofYears(period));
                         }
                    }
            try {
                                
            String query = "update cost set التاريخ='"+date3.format(f)+"' where id = '"+date+"' ";
            pst = con.prepareStatement(query);
            pst.execute();
            } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            }finally{
            try {
            pst.close();
            } catch (SQLException ex) {
            }
        }
            }
                 } catch ( SQLException ex) {
              JOptionPane.showMessageDialog(null, ex);
          }finally{
                 try {
                     rs.close();
                     pst.close();
                 } catch (SQLException e) {
                 }
             }
     
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(0, 0, 0)));

        jLabel3.setBackground(new java.awt.Color(0, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Program Files\\Microsoft Office\\CLIPART\\PUB60COR\\AG00130_.GIF")); // NOI18N
        jLabel3.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(0, 0, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("تسجيل الدخول");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 110, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, 150, -1));

        jPasswordField2.setBackground(new java.awt.Color(0, 0, 255));
        jPasswordField2.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setBorder(null);
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 150, 20));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("إلغاء الأمر");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 180, 120, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "مدير", "أمين المدرسة", "آخر" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, -1));
        jComboBox1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("كلمة السر");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 128, 90, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("إسم المستخدم");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, 20));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("الوظيفة");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 90, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(Color.green);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(Color.white);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            String s = "delete from user";
            pst = con.prepareStatement(s);
            pst.execute();
        } catch (SQLException e) {
        }

        int id = 0 ;
        try{
        String query = "select *from users where الإسم = ? and \"كلمة السر\"=? and الوظيفة = ?";
        
            pst = con.prepareStatement(query);
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jPasswordField2.getText());
            pst.setString(3, jComboBox1.getSelectedItem().toString());
            rs = pst.executeQuery();
            if (jTextField1.getText().equals("") && jPasswordField2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "من فضلك أدخل المعلومات");
          
            }else{

                if (rs.next()) {
                    id = rs.getInt("id");
                    pst.close();
                    rs.close();

                                    try {
                                String sql ="Insert into user (id,الإسم,'كلمة السر',الوظيفة) values (?,?,?,?)";
                                pst = con.prepareStatement(sql);
                                pst.setInt(1, id);
                                pst.setString(2,jTextField1.getText());
                                pst.setString(3,jPasswordField2.getText());
                                pst.setString(4,jComboBox1.getSelectedItem().toString());

                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{
                                try {
                                    pst.close();
                                } catch (SQLException ex) {
                                }
                                    }
                   con.close();
                   school s = new school();
               
                    
                    s.setVisible(true);

                    this.setVisible(false);

                }else{
                    JOptionPane.showMessageDialog(null, "إسم المستخدم وكلمة السر خاطئة");
                    try {
                        rs.close();
                        pst.close();
                    } catch (SQLException e) {
                    }
                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,"error");
        }                  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(Color.white);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(Color.red);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
