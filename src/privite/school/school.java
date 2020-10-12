package privite.school;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.RIGHT;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableCellRenderer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class school extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs = null;
    Thread t;
    PreparedStatement pst = null;
    
    Date the = new Date();
    JTable table;
    String s[][];
    int count=1;

    DefaultListModel DML = new DefaultListModel();
   
    public school() {
        
        this.s = new String[][]{{"الأولى","الثانية","الثالثة","الرابعة","الخامسة"}, {"الأولى","الثانية","الثالثة","الرابعة"}, {"الأولى","الثانية","الثالثة"}};
       
        initComponents();
        jLabel111.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
       

jLabel298.setBackground(new java.awt.Color(0, 0, 204));
jLabel298.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
jLabel298.setForeground(new java.awt.Color(255, 255, 255));
jLabel298.setIcon(new javax.swing.ImageIcon("Excel-icon.png")); // NOI18N
jLabel298.setText("تحويل إلى ملف excel");
jLabel298.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
jLabel298.setOpaque(true);
jLabel298.setHorizontalTextPosition(SwingConstants.LEADING);
jLabel122.setBackground(new java.awt.Color(0, 0, 204));
jLabel122.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
jLabel122.setForeground(new java.awt.Color(255, 255, 255));
jLabel122.setIcon(new javax.swing.ImageIcon("Excel-icon.png")); // NOI18N
jLabel122.setText("تحويل إلى ملف excel");
jLabel122.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
jLabel122.setOpaque(true);
jLabel122.setHorizontalTextPosition(SwingConstants.LEADING);
jLabel121.setBackground(new java.awt.Color(0, 0, 204));
jLabel121.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
jLabel121.setForeground(new java.awt.Color(255, 255, 255));
jLabel121.setIcon(new javax.swing.ImageIcon("Excel-icon.png")); // NOI18N
jLabel121.setText("تحويل إلى ملف excel");
jLabel121.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
jLabel121.setOpaque(true);
jLabel121.setHorizontalTextPosition(SwingConstants.LEADING);


        ImageIcon imi = new ImageIcon(Toolkit.getDefaultToolkit().getImage("received_2641437359410580.jpeg"));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  
        add_st.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  
        add_m.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  
        payment.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  
        update.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  
        add_st1.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  
        update1.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  
        add_st2.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  
        update2.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  
        add_cost.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  
        update_cost.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("received_2641437359410580.jpeg")));  

        Image img = imi.getImage();
        Image img2 = img.getScaledInstance(jLabel3.getWidth(),jLabel3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img2);
        jLabel3.setIcon(i2);
        jLabel139.setVisible(false);
        jLabel146.setVisible(false); 
        payment.pack();
        payment.setLocationRelativeTo(null);
        update.pack();
        update.setLocationRelativeTo(null);
        update1.pack();
        update1.setLocationRelativeTo(null);
        update2.pack();
        update2.setLocationRelativeTo(null);
        
        
                
        this.setLocationRelativeTo(null);
        pack();
        
        add_st.pack();
        add_st1.pack();
        add_st2.pack();
        add_cost.pack();
        add_st.setLocationRelativeTo(null);
        add_st1.setLocationRelativeTo(null);
        add_st2.setLocationRelativeTo(null);
        add_cost.setLocationRelativeTo(null);
       
        add_m.pack();
        add_m.setLocationRelativeTo(null);
        con = PriviteSchool.connected();
        jLabel4.setHorizontalTextPosition(JLabel.CENTER);
        jLabel4.setVerticalTextPosition(JLabel.BOTTOM);
        jLabel66.setHorizontalTextPosition(JLabel.CENTER);
        jLabel66.setVerticalTextPosition(JLabel.BOTTOM);
        jLabel91.setHorizontalTextPosition(JLabel.CENTER);
        jLabel91.setVerticalTextPosition(JLabel.BOTTOM);
        jLabel215.setHorizontalTextPosition(JLabel.CENTER);
        jLabel215.setVerticalTextPosition(JLabel.BOTTOM);
        jLabel27.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel298.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel28.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel29.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel82.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel152.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel21.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel22.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel23.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel136.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel16.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel17.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel147.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel33.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel34.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel35.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel84.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel111.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel297.setHorizontalTextPosition(SwingConstants.LEADING);
        jCheckBox1.setHorizontalTextPosition(SwingConstants.LEFT);
          
        jLabel111.setBackground(new Color(0,0,204));
        jLabel111.setOpaque(true);
       
        jLabel5.setHorizontalTextPosition(JLabel.CENTER);
        jLabel5.setVerticalTextPosition(JLabel.BOTTOM);
        jLabel6.setHorizontalTextPosition(JLabel.CENTER);
        jLabel6.setVerticalTextPosition(JLabel.BOTTOM);
        jLabel11.setHorizontalTextPosition(JLabel.CENTER);
        jLabel11.setVerticalTextPosition(JLabel.BOTTOM);
          
        jScrollPane1.getViewport().setBackground(new Color(0,0,204));
        jScrollPane2.getViewport().setBackground(new Color(0,0,204));
        jScrollPane3.getViewport().setBackground(new Color(0,0,204));
        jScrollPane4.getViewport().setBackground(new Color(0,0,204));
        jScrollPane5.getViewport().setBackground(new Color(0,0,204));
        jScrollPane6.getViewport().setBackground(new Color(0,0,204));
        jScrollPane7.getViewport().setBackground(new Color(0,0,204));
        jScrollPane8.getViewport().setBackground(new Color(0,0,204));
        jScrollPane9.getViewport().setBackground(new Color(0,0,204));
        jScrollPane10.getViewport().setBackground(new Color(0,0,204));
        jScrollPane11.getViewport().setBackground(new Color(0,0,204));
        jScrollPane12.getViewport().setBackground(new Color(0,0,204));
        jScrollPane13.getViewport().setBackground(new Color(0,0,204));
        jScrollPane14.getViewport().setBackground(new Color(0,0,204));
        jScrollPane21.getViewport().setBackground(new Color(0,0,204));
    
        jLabel142.setVisible(false);
        jLabel163.setVisible(false);
        jLabel140.setVisible(false);
        jLabel162.setVisible(false);
        jLabel165.setVisible(false);
        jLabel168.setVisible(false);
        jLabel166.setVisible(false);
        jLabel143.setVisible(false);
        jLabel144.setVisible(false);
        jLabel145.setVisible(false);
        jLabel169.setVisible(false);
        jLabel170.setVisible(false);
        jLabel171.setVisible(false);
        jLabel172.setVisible(false);
        jLabel173.setVisible(false);
        jLabel174.setVisible(false);
        jLabel175.setVisible(false);
        jLabel176.setVisible(false);
        jLabel177.setVisible(false);
        jLabel178.setVisible(false);
        jLabel181.setVisible(false);
        jLabel182.setVisible(false);
        jLabel194.setVisible(false);
        jLabel195.setVisible(false);
        jLabel196.setVisible(false);
        jLabel198.setVisible(false);
        jLabel226.setVisible(false);
        jLabel227.setVisible(false);
        jLabel236.setVisible(false);
        jLabel237.setVisible(false);
        jLabel250.setVisible(false);
        jLabel251.setVisible(false);
        jLabel262.setVisible(false);
        jLabel263.setVisible(false);
        jLabel274.setVisible(false);
        jLabel275.setVisible(false);
       update_table3("other",jTable1);
       update_table3("actions",jTable21);
       update_table3("f_y_medum",jTable2);
       update_table3("s_y_medum",jTable3);
       update_table3("t_y_medum",jTable4);
       update_table3("fo_y_medum",jTable5);
       update_table3("f_y_h_school",jTable6);
       update_table3("s_y_h_school",jTable7);
       update_table3("t_y_h_school",jTable8);
       update_table3("f_y_primery",jTable9);
       update_table3("s_y_primery",jTable10);
       update_table3("t_y_primery",jTable11);
       update_table3("fo_y_primery",jTable12);
       update_table3("fi_y_primery",jTable13);
       update_table(jTable15,"الإبتدائي");
       update_table(jTable16,"المتوسط");
       update_table(jTable17,"الثانوي");
       update_table(jTable18,"دروس أخرى");
       update_table(jTable19,"التحضيري");
jTable18.getTableHeader().setEnabled(false);
jTable18.getTableHeader().setResizingAllowed(false);
((DefaultTableCellRenderer)jTable18.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable18.getTableHeader().setReorderingAllowed(false);
jTable18.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable18.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable19.getTableHeader().setEnabled(false);
jTable19.getTableHeader().setResizingAllowed(false);
((DefaultTableCellRenderer)jTable19.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable19.getTableHeader().setReorderingAllowed(false);
jTable19.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable19.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable20.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable20.getTableHeader().setEnabled(false);
jTable20.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
((DefaultTableCellRenderer)jTable20.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jScrollPane20.getViewport().setBackground(new Color(0,0,204));
jTable21.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable21.getTableHeader().setEnabled(false);
jTable21.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable21.getTableHeader().setResizingAllowed(false);
jTable21.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable21.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable16.getTableHeader().setEnabled(false);
jTable16.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable16.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable16.getTableHeader().setResizingAllowed(false);
jTable16.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable16.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable17.getTableHeader().setEnabled(false);
jTable17.getTableHeader().setResizingAllowed(false);
((DefaultTableCellRenderer)jTable19.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable17.getTableHeader().setReorderingAllowed(false);
jTable17.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable17.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable14.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable14.getTableHeader().setEnabled(false);
jTable14.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
((DefaultTableCellRenderer)jTable14.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable13.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable13.getTableHeader().setEnabled(false);
jTable13.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
((DefaultTableCellRenderer)jTable13.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable12.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable12.getTableHeader().setEnabled(false);
jTable12.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable12.getTableHeader().setResizingAllowed(false);
jTable12.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable12.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable11.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable11.getTableHeader().setEnabled(false);
jTable11.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable11.getTableHeader().setResizingAllowed(false);
jTable11.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable11.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable2.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable2.getTableHeader().setEnabled(false);
jTable2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable2.getTableHeader().setResizingAllowed(false);
jTable2.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable2.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable3.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable3.getTableHeader().setEnabled(false);
jTable3.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable3.getTableHeader().setResizingAllowed(false);
jTable3.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable3.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable4.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable4.getTableHeader().setEnabled(false);
jTable4.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable4.getTableHeader().setResizingAllowed(false);
jTable4.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable4.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable5.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable5.getTableHeader().setEnabled(false);
jTable5.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable5.getTableHeader().setResizingAllowed(false);
jTable5.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable5.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable1.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable1.getTableHeader().setEnabled(false);
jTable1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
((DefaultTableCellRenderer)jTable1.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable6.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable6.getTableHeader().setEnabled(false);
jTable6.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable6.getTableHeader().setResizingAllowed(false);
jTable6.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable6.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable7.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable7.getTableHeader().setEnabled(false);
jTable7.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable7.getTableHeader().setResizingAllowed(false);
jTable7.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable7.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable8.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable8.getTableHeader().setEnabled(false);
jTable8.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable8.getTableHeader().setResizingAllowed(false);
jTable8.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable8.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable9.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable9.getTableHeader().setEnabled(false);
jTable9.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable9.getTableHeader().setResizingAllowed(false);
jTable9.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable9.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable10.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable10.getTableHeader().setEnabled(false);
jTable10.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable10.getTableHeader().setResizingAllowed(false);
jTable10.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable2.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);
jTable15.getTableHeader().setFont( new Font("Tahoma",Font.BOLD,16));
jTable15.getTableHeader().setEnabled(false);
jTable15.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
jTable15.getTableHeader().setResizingAllowed(false);
jTable15.getTableHeader().setReorderingAllowed(false);
((DefaultTableCellRenderer)jTable15.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(JLabel.RIGHT);

       
       update_table("preparatory_year",jTable14);
       String s="";
        try {
            String querry = "select الوظيفة from user";
            pst = con.prepareStatement(querry);
            rs= pst.executeQuery();
            if (rs.next()) {
               s= rs.getString("الوظيفة");
            }
        } catch (SQLException e) {
        }
        
     if (!(s.equals("مدير")) && count1("user")!=0) {
                    jLabel277.setVisible(false);
                    jLabel66.setVisible(false);
                    jLabel65.setVisible(false);
                    }

       DefaultListCellRenderer dc = new DefaultListCellRenderer();
       dc.setHorizontalAlignment(DefaultListCellRenderer.RIGHT);
       jComboBox1.setRenderer(dc);
       jComboBox2.setRenderer(dc);
       jComboBox3.setRenderer(dc);
       jComboBox4.setRenderer(dc);
       jComboBox5.setRenderer(dc);
       jComboBox6.setRenderer(dc);
       jComboBox7.setRenderer(dc);
       jComboBox8.setRenderer(dc);
       jComboBox9.setRenderer(dc);
       jComboBox10.setRenderer(dc);
       jComboBox11.setRenderer(dc);
       jComboBox12.setRenderer(dc);
       jComboBox13.setRenderer(dc);
       jComboBox14.setRenderer(dc);
       jComboBox15.setRenderer(dc);
       jComboBox16.setRenderer(dc);
       jComboBox17.setRenderer(dc);
       jComboBox19.setRenderer(dc);
       jComboBox18.setRenderer(dc);
       jComboBox21.setRenderer(dc);
       jComboBox23.setRenderer(dc);
       
       alart(jTable18);
       alart(jTable2);
       alart(jTable3);
       alart(jTable4);
       alart(jTable5);
       alart(jTable6);
       alart(jTable7);
       alart(jTable8);
       alart(jTable9);
       alart(jTable10);
       alart(jTable11);
       alart(jTable12);
       alart(jTable13);
       alart(jTable14);
       alart(jTable15);
       alart(jTable16);
       alart(jTable17);
       alart(jTable18);
       alart(jTable19);
       
//       update_combo("add_m3","/", jComboBox1);
//      update_combo("add_m","الأولى", jComboBox10);
//      update_combo("add_m","الثانية", jComboBox11);
//      update_combo("add_m","الثالثة", jComboBox12);
//      update_combo("add_m","الرابعة", jComboBox13);
//      update_combo("add_m","الخامسة", jComboBox14);
//      update_combo("add_m1","الأولى", jComboBox2);
//      update_combo("add_m1","الثاثية", jComboBox3);
//      update_combo("add_m1","الثالثة", jComboBox4);
//      update_combo("add_m1","الرابعة", jComboBox5);
//      update_combo("add_m2","الأولى", jComboBox6);
//      update_combo("add_m2","الثاثية", jComboBox7);
//      update_combo("add_m2","الثالثة", jComboBox8);
//      update_combo("add_m","", jComboBox15);
//      update_combo("add_m1","", jComboBox16);
//      update_combo("add_m2","", jComboBox17);
//      update_combo("add_m3","", jComboBox19);
         jTable21.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                setHorizontalAlignment(RIGHT);
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
            }
          
          });
            jTable20.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                setHorizontalAlignment(RIGHT);
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
            }
          
          });
      }
     void Export(JTable t,String s) throws  InvalidFormatException, FileNotFoundException, IOException{
                
             XSSFWorkbook ex = new XSSFWorkbook();
             
             try {
                   System.out.println("done");
                
                FileInputStream excel4 = new FileInputStream(s);
                Workbook ex2 = WorkbookFactory.create(excel4);
                     JTabbedPane tb=null;
                     switch(s){
                         case "Elementary school.xlsx":
                             tb = jTabbedPane3;
                             break;
                         case "Middle school.xlsx":
                             tb = jTabbedPane1;
                             break;
                         case "Hight school.xlsx":
                             tb = jTabbedPane2;
                             break;
                         case "teachers.xlsx":
                             tb = jTabbedPane4;
                             break;
                     }
                        
                          
                         if (!(s.equals("other.xlsx")||s.equals("preparatory year.xlsx"))) {
                            System.out.println("done"); 
                      Sheet x;
                    switch(tb.getSelectedIndex()){
                        
                        case 0 :
                            
                           x= ex2.getSheet("Sheet0"); 
                                  {
                    TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = (XSSFRow) x.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                            break;
                        case 1:
                           x= ex2.getSheet("Sheet1"); 
                                                       {
                    TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = (XSSFRow) x.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                            break;
                        case 2:
                            x= ex2.getSheet("Sheet2"); 
                                                        {
                    TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = (XSSFRow) x.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                            break;
                        case 3:
                            x= ex2.getSheet("Sheet3"); 
                                                        {
                    TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = (XSSFRow) x.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                            break;
                        case 4:
                            x= ex2.getSheet("Sheet4"); 
                                                        {
                    TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = (XSSFRow) x.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                            break;
                      
                    }
                         } else {
                         }
         

                FileOutputStream excel = new FileOutputStream(new File(s));
                 ex2.write(excel);
                JOptionPane.showMessageDialog(null, "تمت بنجاح عملية نقل البيانات");
                      
        
         } catch (IOException e) {
             FileOutputStream excel = new FileOutputStream(new File(s));
                if (jPanel3.isVisible()) {
           XSSFSheet creat = ex.createSheet();  
        creat.setRightToLeft(true);
        creat.setColumnWidth(1, 4000);
        creat.setColumnWidth(2, 4000);
        creat.setColumnWidth(5, 4000);
        creat.setColumnWidth(5, 4000);
        creat.setColumnWidth(7, 4000);
           XSSFSheet creat1 = ex.createSheet();  
        creat1.setRightToLeft(true);
        creat1.setColumnWidth(1, 4000);
        creat1.setColumnWidth(2, 4000);
        creat1.setColumnWidth(5, 4000);
        creat1.setColumnWidth(5, 4000);
        creat1.setColumnWidth(7, 4000);
           XSSFSheet creat2 = ex.createSheet();  
        creat2.setRightToLeft(true);
        creat2.setColumnWidth(1, 4000);
        creat2.setColumnWidth(2, 4000);
        creat2.setColumnWidth(5, 4000);
        creat2.setColumnWidth(5, 4000);
        creat2.setColumnWidth(7, 4000);
           XSSFSheet creat3 = ex.createSheet();  
        creat3.setRightToLeft(true);
        creat3.setColumnWidth(1, 4000);
        creat3.setColumnWidth(2, 4000);
        creat3.setColumnWidth(5, 4000);
        creat3.setColumnWidth(5, 4000);
        creat3.setColumnWidth(7, 4000);
        switch(jTabbedPane1.getSelectedIndex()){
            case 0:
            {
                        TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                break;
            case 1:
            {
                        TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat1.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                break;
            case 2:
            {
                    TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat2.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                break;
            case 3:
            {
                    TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat3.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            } 
                break;
        }
         } else if (jPanel4.isVisible()||jPanel21.isVisible()) {
                XSSFSheet creat = ex.createSheet();  
        creat.setRightToLeft(true);
        creat.setColumnWidth(1, 4000);
        creat.setColumnWidth(2, 4000);
        creat.setColumnWidth(5, 4000);
        creat.setColumnWidth(5, 4000);
        creat.setColumnWidth(7, 4000);
                           TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
         } else if (jPanel9.isVisible()) {
            XSSFSheet creat = ex.createSheet();  
        creat.setRightToLeft(true);
        creat.setColumnWidth(1, 4000);
        creat.setColumnWidth(2, 4000);
        creat.setColumnWidth(5, 4000);
        creat.setColumnWidth(5, 4000);
        creat.setColumnWidth(7, 4000);
           XSSFSheet creat1 = ex.createSheet();  
        creat1.setRightToLeft(true);
        creat1.setColumnWidth(1, 4000);
        creat1.setColumnWidth(2, 4000);
        creat1.setColumnWidth(5, 4000);
        creat1.setColumnWidth(5, 4000);
        creat1.setColumnWidth(7, 4000);
           XSSFSheet creat2 = ex.createSheet();  
        creat2.setRightToLeft(true);
        creat2.setColumnWidth(1, 4000);
        creat2.setColumnWidth(2, 4000);
        creat2.setColumnWidth(5, 4000);
        creat2.setColumnWidth(5, 4000);
        creat2.setColumnWidth(7, 4000);
        switch(jTabbedPane2.getSelectedIndex()){
            case 0:
            {
                        TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                break;
            case 1:
            {
                        TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat1.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                break;
            case 2:
            {
                    TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat2.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                break;

        }   
         } else if (jPanel15.isVisible()||jPanel24.isVisible()) {
                      XSSFSheet creat = ex.createSheet();  
        creat.setRightToLeft(true);
        creat.setColumnWidth(1, 4000);
        creat.setColumnWidth(2, 4000);
        creat.setColumnWidth(5, 4000);
        creat.setColumnWidth(5, 4000);
        creat.setColumnWidth(7, 4000);
           XSSFSheet creat1 = ex.createSheet();  
        creat1.setRightToLeft(true);
        creat1.setColumnWidth(1, 4000);
        creat1.setColumnWidth(2, 4000);
        creat1.setColumnWidth(5, 4000);
        creat1.setColumnWidth(5, 4000);
        creat1.setColumnWidth(7, 4000);
           XSSFSheet creat2 = ex.createSheet();  
        creat2.setRightToLeft(true);
        creat2.setColumnWidth(1, 4000);
        creat2.setColumnWidth(2, 4000);
        creat2.setColumnWidth(5, 4000);
        creat2.setColumnWidth(5, 4000);
        creat2.setColumnWidth(7, 4000);
           XSSFSheet creat3 = ex.createSheet();  
        creat3.setRightToLeft(true);
        creat3.setColumnWidth(1, 4000);
        creat3.setColumnWidth(2, 4000);
        creat3.setColumnWidth(5, 4000);
        creat3.setColumnWidth(5, 4000);
        creat3.setColumnWidth(7, 4000);
           XSSFSheet creat4 = ex.createSheet();  
        creat4.setRightToLeft(true);
        creat4.setColumnWidth(1, 4000);
        creat4.setColumnWidth(2, 4000);
        creat4.setColumnWidth(5, 4000);
        creat4.setColumnWidth(5, 4000);
        creat4.setColumnWidth(7, 4000);
        JTabbedPane tp ;
             if (jPanel15.isVisible()) {
                 tp = jTabbedPane3;
             } else {
                 tp = jTabbedPane4;
             }
        switch(tp.getSelectedIndex()){
            case 0:
            {
                        TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                break;
            case 1:
            {
                        TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat1.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                break;
            case 2:
            {
                    TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat2.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                break;
            case 3:
            {
                    TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat3.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                break;
            case 4:
            {
                    TreeMap<String,Object[]> data = new TreeMap<>();
        data.put("0",new Object[]{ t.getModel().getColumnName(0),t.getModel().getColumnName(1),t.getModel().getColumnName(2),t.getModel().getColumnName(3),t.getModel().getColumnName(4),t.getModel().getColumnName(5),t.getModel().getColumnName(6),t.getModel().getColumnName(7)});
        for (int i = 0; i < t.getRowCount(); i++) {
        data.put(String.valueOf(i+1),new Object[]{ t.getModel().getValueAt(i,0),t.getModel().getValueAt(i, 1),t.getModel().getValueAt(i, 2),t.getModel().getValueAt(i, 3),t.getModel().getValueAt(i, 4),t.getModel().getValueAt(i,5),t.getModel().getValueAt(i, 6),t.getModel().getValueAt(i, 7)});
       }
        Set<String> keys = data.keySet();
        XSSFRow row ;
        int roeID= 0;
        for (String key : keys) {
           row = creat4.createRow(roeID++);
           Object[] values = data.get(key);
           int cellsID = 0;
           for (Object value : values) {
               XSSFCell cell = row.createCell(cellsID++);
               cell.setCellValue(value.toString());
           }
        }
            }
                break;

        }}
                   ex.write(excel);
                
                System.out.println(ex.getSheetAt(0));
                JOptionPane.showMessageDialog(null, "تمت بنجاح عملية نقل البيانات");  
         }
  
    }
    private void update(JTable jTable1,String s,String s1,String s2,String s3){
  SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
       String thedate = dateformat.format(jDateChooser10.getDate());
                                Period p = Period.ofWeeks(4);
                                DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                                LocalDate date = LocalDate.parse(thedate, f).plus(p);
                                while (LocalDate.now().toEpochDay()>date.toEpochDay()) {            
                                date = LocalDate.parse(thedate, f).plus(p);
        }
                                
                                String date1 = date.format(f);
       try {
            String query = "update '"+s+"' set الإسم='"+jTextField49.getText()+"' , 'رقم الهاتف' = '"+jTextField50.getText()+"' , 'سعر التدريس' = '"+jTextField51.getText()+"' , 'الدين/عليه' = '"+jTextField52.getText()+"','تاريخ الإنخراط'='"+thedate+"', المادة='"+jComboBox18.getSelectedItem().toString()+"',الاستاذ='"+jComboBox23.getSelectedItem().toString()+"',تفحص='"+date1+"' where الرقم ='"+jTextField47.getText()+"' ";
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
                       String name = null,function=null;
                            try {
                              String sql ="select الإسم,الوظيفة from user";
                              pst = con.prepareStatement(sql);
                              rs = pst.executeQuery();
                                if (rs.next()) {
                                  name = rs.getString("الإسم");
                                  function = rs.getString("الوظيفة");
                                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

                                try {
                                     rs.close();
                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                                LocalDate dates = LocalDate.now();
                                try {
                                String sql ="Insert into actions (الإسم,الوظيفة,'من طرف','وظيفة المستخدم',المستوى,السنة,نوع,التاريخ) values (?,?,?,?,?,?,?,'"+dates+"')";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,jTextField49.getText());
                                pst.setString(2,"تلميذ");
                                pst.setString(3,name);
                                pst.setString(4,function);
                                pst.setString(5,s1);
                                pst.setString(6,s2);
                                pst.setString(7,s3);
                              
                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{
                                try {
                                    pst.close();
                                } catch (SQLException ex) {
                                }}
         update_table3(s,jTable1);
            alart(jTable1);
    update.setVisible(false);   
 }
    
    private void serchF(JList jList4,JTextField jTextField24,JTable jTable2,String s){
             jList4.setVisible(true);
        if(jTextField24.getText().equals("")){
        jList4.setVisible(false);
          
        update_table3(s,jTable2);
        alart(jTable2);
        }
      else{
        search(jTextField24.getText(),s,jList4);  
      }
 }
    private void serchL(JList jList4,JTextField jTextField24,JTable jTable2,String s){
           jTextField24.setText((String) jList4.getSelectedValue());
        jList4.setVisible(false);
      
        try {
            String querry = "select الرقم,الإسم,\"رقم الهاتف\",\"سعر التدريس\",\"الدين/عليه\",\"تاريخ الإنخراط\",المادة,الاستاذ  from '"+s+"' where الإسم = '"+jTextField24.getText()+"'";
            pst = con.prepareStatement(querry);
            rs= pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            
            try {
                rs.close();
                pst.close();
                
            } catch (SQLException ex) {
              
            }
        }
        alart(jTable2);
 }
    private ArrayList fill_list(String s){
        ArrayList de =new ArrayList();
  try{
        String querry = "select الإسم from '"+s+"'";
        pst= con.prepareStatement(querry);
        rs= pst.executeQuery();
        while(rs.next()){
        String v=rs.getString("الإسم");
        de.add(v);
        }
        
  }catch(SQLException e){
  JOptionPane.showMessageDialog(null, e);
  }finally{
            
            try {
                rs.close();
                pst.close();
               
            } catch (SQLException ex) {
             
            }
        }
        return de;
  }
    private ArrayList fill_list1(String s1,String s2){
        ArrayList de =new ArrayList();
  try{
        String querry = "select الإسم from '"+s1+"'where المستوى= '"+s2+"'";
        pst= con.prepareStatement(querry);
        rs= pst.executeQuery();
        while(rs.next()){
        String v=rs.getString("الإسم");
        de.add(v);
        }
        
  }catch(SQLException e){
  JOptionPane.showMessageDialog(null, e);
  }finally{
            
            try {
                rs.close();
                pst.close();
               
            } catch (SQLException ex) {
             
            }
        }
        return de;
  }
    private void setup2(JTable jTable15,String s){
         jComboBox22.removeAllItems();
        if (jTabbedPane4.getSelectedIndex()!=0) {
            update_combo(s,"", jComboBox22);
        }else  jComboBox22.setEnabled(false);
        
        try {
            int j=0, rw = jTable15.getSelectedRow();
            String table_click =(jTable15.getModel().getValueAt(rw, 0).toString());
            
            try {       
            String query="select *from teacher where الرقم='"+table_click+"'";
            pst = con.prepareStatement(query);
            rs= pst.executeQuery();
            if (rs.next()) {
                String add0= rs.getString("الرقم");
                jTextField58.setText(add0);
                String add1= rs.getString("الإسم");
                jTextField59.setText(add1);
                String add2= rs.getString("رقم الهاتف");
                jTextField60.setText(add2);
                 String add4 = rs.getString("سعر التدريس");
                jTextField61.setText(add4);     
                String add3 = rs.getString("الدين/له");
                jTextField62.setText(add3);
                String add5 = rs.getString("المادة");
                String add8 = rs.getString("السنة");
                switch(add8){
                    case "الأولى":
                      add5 += "1"; 
                      break;
                    case "الثانية":
                       add5 += "2";  
                       break;
                    case "الثالثة":
                        add5 += "3";  
                        break;
                    case "الرابعة":
                        add5 += "4";  
                        break;
                    case "الخامسة":
                        add5 += "5"; 
                        break;
                }
                if (jTabbedPane4.getSelectedIndex()!=0) {
                jComboBox22.setSelectedIndex(cout(jComboBox22, add5, j));  
                }
                String add7 = rs.getString("تاريخ الإنخراط");
                Date add6 = new SimpleDateFormat("dd-MM-yyyy").parse(add7);
                jDateChooser12.setDate(add6);
                }
            update2.setVisible(true);
        } catch (SQLException | ParseException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
            } catch (SQLException ex) {
            }}
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "من فضلك حدد الأستاذ الذي تريد تعديل بياناته");
        }  
}
    private void search(String khtak,String tab,JList l){
        
    DefaultListModel daw = new DefaultListModel();
        ArrayList des = fill_list(tab);
                
    des.stream().forEach((de)->{
    String mok = de.toString().toLowerCase();
    
   if(mok.contains(khtak.toLowerCase())) 
   {

    daw.addElement(de);
     
   }
   });

   DML=daw;
    
   l.setModel(DML);
    
    }
    private void search1(String khtak,String tab,String s,JList l){
        
    DefaultListModel daw = new DefaultListModel();
        ArrayList des = fill_list1(tab,s);
                
    des.stream().forEach(de->{
    String mok = de.toString().toLowerCase();
    
   if(mok.contains(khtak.toLowerCase())) 
   {

    daw.addElement(de);
     
   }
   });

   DML=daw;
    
   l.setModel(DML);
    
    }
    private void update_table3(String s,JTable t){
        try {String sql=null;
            if (t!=jTable21) {
                if (s.equals("preparatory_year")) {
               sql = "select الرقم,الإسم,\"رقم الهاتف\",\"سعر التدريس\",\"الدين/عليه\",\"تاريخ الإنخراط\",الأستاذ from '"+s+"' order by الرقم";
                   } else {
               sql = "select الرقم,الإسم,\"رقم الهاتف\",\"سعر التدريس\",\"الدين/عليه\",\"تاريخ الإنخراط\",المادة,الاستاذ from '"+s+"' order by الرقم";
                }
            } else {
               sql = "select *from actions ";
            }
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            t.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            
            try {
                rs.close();
                pst.close();
             
            } catch (SQLException ex) {
             
            }
        } 
    }
    private void update_table(JTable t , String s){
        try {
            String sql = "select الرقم,الإسم,\"رقم الهاتف\",\"سعر التدريس\",\"الدين/له\",\"تاريخ الإنخراط\",المادة,السنة from teacher where المستوى='"+s+"' order by الرقم";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            t.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            
            try {
                rs.close();
                pst.close();
             
            } catch (SQLException ex) {
             
            }
        } 
    }
    private void update_table3(JTable t ){
        try {
            String sql = "select الرقم,الإسم,\"رقم الهاتف\",\"سعر التدريس\",\"الدين/له\",\"تاريخ الإنخراط\",المادة,السنة from other2 order by الرقم";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            t.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            
            try {
                rs.close();
                pst.close();
             
            } catch (SQLException ex) {
             
            }
        } 
    }
    private void update_table(String s,JTable t){
        try {
            String sql ="";
            if (s.equals("other1")) {
            sql = "select الرقم,الإسم,\"رقم الهاتف\",\"سعر التدريس\",\"الدين/عليه\",\"تاريخ الإنخراط\" from '"+s+"' order by الرقم";

            } else {
                 if (t==jTable14) {
            sql = "select الرقم,الإسم,\"رقم الهاتف\",\"سعر التدريس\",\"الدين/عليه\",\"تاريخ الإنخراط\",\"ولي الأمر\",الأستاذ from '"+s+"' order by الرقم";

            } else {
            sql = "select *from '"+s+"' order by الرقم";
            }
            }
           

           
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            t.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            
            try {
                rs.close();
                pst.close();
             
            } catch (SQLException ex) {
             
            }
        } 
    }
    private void update_table(JComboBox c,String s,JTable t){
        
        try {
            String sql = "select الرقم,الإسم,\"رقم الهاتف\",\"سعر التدريس\",\"الدين/عليه\",\"تاريخ الإنخراط\",المادة,الاستاذ  from '"+s+"' where المادة='"+c.getSelectedItem().toString()+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            t.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            
            try {
                rs.close();
                pst.close();
             
            } catch (SQLException ex) {
             
            }
        } 
    }
    private void update_table1(JComboBox c,String s,String s1,JTable t){
        StringBuilder b = new StringBuilder(c.getSelectedItem().toString());
        b.deleteCharAt(c.getSelectedItem().toString().length()-1);
        try {
            String sql= null;
            if (jPanel24.isVisible()) {
                if (jTabbedPane4.getSelectedIndex()==4) {
            sql = "select الرقم,الإسم,\"رقم الهاتف\", \"سعر التدريس\" , \"الدين/له\" , \"تاريخ الإنخراط\" ,المادة ,السنة  from '"+s+"' where المادة='"+c.getSelectedItem().toString()+"' and المستوى='"+s1+"'";
 
                } else {
                                sql = "select الرقم,الإسم,\"رقم الهاتف\", \"سعر التدريس\" , \"الدين/له\" , \"تاريخ الإنخراط\" ,المادة ,السنة  from '"+s+"' where المادة='"+b.toString()+"' and المستوى='"+s1+"'";

                }
  
            } else {
            
            sql = "select الرقم,الإسم,\"رقم الهاتف\", \"سعر التدريس\" , \"الدين/عليه\" , \"تاريخ الإنخراط\" ,المادة ,السنة  from '"+s+"' where المادة='"+b.toString()+"' and المستوى='"+s1+"'";
            }
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            t.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            
            try {
                rs.close();
                pst.close();
             
            } catch (SQLException ex) {
             
            }
        } 
    }
    private void alart(JTable t){
        int i=0, count_t;
        count_t=t.getRowCount();
        ArrayList<Double> ar1 = new ArrayList();
        ArrayList<LocalDate> ar = new ArrayList();
        LocalDate d = LocalDate.now();
        
        try {
            String querry = "select تفحص from teacher where تفحص<= '"+d+"'";
            pst = con.prepareStatement(querry);
            rs = pst.executeQuery();
            while(rs.next()) {
                ar.add(LocalDate.parse(rs.getString("تفحص"), DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            }
        } catch (SQLException e) {
     
        }
        while (i<count_t) {
         
          String table_click1 = t.getModel().getValueAt(i, 4).toString();  
         
          ar1.add(Double.parseDouble(table_click1));
           i++; 
        }
   t.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
       
     @Override
     public Component getTableCellRendererComponent(JTable table , Object value , boolean isSelected , boolean hasFocus , int row , int column){
     JLabel lable1 = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
     //****************************************************
         setHorizontalAlignment(RIGHT);
         setFont( new Font("Tahoma",Font.BOLD,14));
     Color c = Color.white;
        
         if (ar1.get(row)!=0) {
             if (!(t==jTable15||t==jTable16||t==jTable17||t==jTable18||t==jTable19)) {
                      c = Color.RED; 
             if (t==jTable1) {
               jLabel146.setVisible(true);
             } else {
                 if (t==jTable2) {
                     jLabel162.setVisible(true);
                 } else {
                     if (t==jTable3) {
                       jLabel163.setVisible(true);  
                     } else {
                         if (t==jTable4) {
                           jLabel165.setVisible(true);  
                         } else {
                             if (t==jTable5) {
                                jLabel166.setVisible(true); 
                             } else {
                                 if (t==jTable6) {
                                     jLabel168.setVisible(true);
                                 } else {
                                     if (t==jTable7) {
                                         jLabel46.setVisible(true);
                                     } else {
                                         if (t==jTable8) {
                                           jLabel171.setVisible(true);  
                                         }else{
                                             if (t==jTable9) {
                                                 jLabel173.setVisible(true);
                                             }else{
                                                 if (t==jTable10) {
                                                     jLabel175.setVisible(true);
                                                 }else{
                                                     if (t==jTable11) {
                                                         jLabel177.setVisible(true);
                                                     }else{
                                                         if (t==jTable12) {
                                                             jLabel181.setVisible(true);
                                                         }else{
                                                             if (t==jTable13) {
                                                                 jLabel194.setVisible(true);
                                                                
                                                                         
                                                             }else{
                                                              if (t==jTable14) {
                                                                    jLabel198.setVisible(true);
                                                                 }
                                                             }
                                                         }
                                                     }
                                                 }
                                             
                                                     
                                             }
                                         }
                                     }
                                 }
                             }
                         }
                     }
                 }
             }  
             }else{
              LocalDate date=null;
              String table1 = t.getValueAt(row, 0).toString();
                 try {
                     String quirry = "select تفحص from teacher where الرقم = '"+table1+"'";
                     pst = con.prepareStatement(quirry);
                     rs = pst.executeQuery();
                     if (rs.next()) {
                         date = LocalDate.parse(rs.getString("تفحص"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                     }
                 } catch (SQLException e) {
                 }
                 if (date.toEpochDay()<=LocalDate.now().toEpochDay()) {
                                                if (t==jTable15) {
                                                                     c = Color.RED; 
                                                     jLabel226.setVisible(true);
                                                 }else{
                                                     if (t==jTable16) {
                                                         c = Color.RED; 
                                                         jLabel236.setVisible(true);
                                                     }else{
                                                         if (t==jTable17) {
                                                             c = Color.RED; 
                                                             jLabel250.setVisible(true);
                                                         }else{
                                                             if (t==jTable18) {
                                                                 c = Color.RED; 
                                                                 jLabel262.setVisible(true);
                                                                 }else{
                                                              if (t==jTable19) {
                                                                  c = Color.RED; 
                                                                    jLabel274.setVisible(true);
                                                                 }
                                                             }
                                                         }
                                                     }
                                                 } 
                 }

                 
             
             }     }
        lable1.setBackground(c);
        lable1.setForeground(Color.BLACK);
            return lable1;
        }});}  
    private void update_combo(String s,String s2,JComboBox t){
        try {
            String sql = null;
            
            if ( t==jComboBox15||t==jComboBox16||t==jComboBox17||t==jComboBox19||t==jComboBox20||t==jComboBox22 ) {
                 sql = "select name from '"+s+"' ";
                 } else {
                if (t==jComboBox21||t==jComboBox23) {
              
                    if (t==jComboBox21) {
                         sql = "select الإسم from teacher where المستوى='"+s+"' and السنة='"+s2+"'and المادة='"+jComboBox9.getSelectedItem().toString()+"'"; 
                    } else {
                         sql = "select الإسم from teacher where المستوى='"+s+"' and السنة='"+s2+"'and المادة='"+jComboBox18.getSelectedItem().toString()+"'";
                    }
                    } else {
                         sql = "select name from '"+s+"' where year='"+s2+"'";
                }
                }
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {  
                if (t==jComboBox21||t==jComboBox23) {
                    t.addItem(rs.getString("الإسم"));
                } else {
                    if (!(t==jComboBox15||t==jComboBox16||t==jComboBox17||t==jComboBox19||t==jComboBox20||t==jComboBox22)) {
                       StringBuilder b = new StringBuilder(rs.getString("name"));
                       b.deleteCharAt(rs.getString("name").length()-1);
                       t.addItem(b.toString());
                    } else {
                        t.addItem(rs.getString("name"));
                    }
                    
                }

        }
        
            
        } catch (Exception e) {
            
        }finally{
            
            try {
                rs.close();
                pst.close();
             
            } catch (SQLException ex) {
             
            }
        } 
    }
    private void update_combo2(JComboBox t1,JComboBox t){
        try {
            String s1 = "";
                if (jPanel3.isVisible()) 
                s1="المتوسط" ;
                        
             else
                    if (jPanel4.isVisible()) 
                     s1="دروس أخرى";   
                    else 
                        if (jPanel9.isVisible()) 
                       s1 = "الثانوي"; 
                     else 
                            if (jPanel15.isVisible()) 
                        s1 = "الإبتدائي"; 
                   String sql="";
                                if (jPanel21.isVisible()){
                                    s1 = "التحضيري";
                         sql = "select الإسم from teacher where  المستوى='"+s1+"' ";
                                
                                } else
                         sql = "select الإسم from teacher where المادة='"+t1.getSelectedItem().toString()+"' and المستوى='"+s1+"' ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                t.addItem(rs.getString("الإسم"));
                
            }  
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            
            try {
                rs.close();
                pst.close();
             
            } catch (SQLException ex) {
             
            }
        } 
    }
    private int  cout(JComboBox cb,String s,int j){
         
              int i =0;
              while(i<cb.getItemCount())
              {
                  cb.setSelectedIndex(i);
              if(cb.getItemCount()==0||s==null)
              {
               
                  i++;}
              else{
              if( s.equals(cb.getSelectedItem().toString())){
                 
                 j=i; 
              
              break;
              }else{i++;}
              }
              }
     return j;         
    }
    private void add_s(JTable jTable1,String s,String s1,String s2,String s3){
          int i=0;
        String num=null;
        if (jTable1.getRowCount()==0) {
            num="C0001";
        }else{
            while (i<jTable1.getRowCount() ) {
                String numb = jTable1.getValueAt(i,0).toString();

                StringBuilder number = new StringBuilder(numb);
                number.deleteCharAt(0);
                     if(i+1!=Integer.valueOf(number.toString())){
              num="C0001";    
             }  
                if (i+1==Integer.valueOf(number.toString())) {
                    i++;

                    if (jTable1.getRowCount()==i) {

                        if (0<(i+1)&&(i+1)<10) {
                            num="C000"+String.valueOf(i+1);

                        }else{
                            if (10<(i+1)&&(i+1)<100) {
                                num="C00"+String.valueOf(i+1);
                            }else{
                                if (100<=(i+1)&&(i+1)<1000) {
                                    num="C0"+String.valueOf(i+1);
                                }else{
                                    if (1000<=(i+1)) {
                                        num="C"+String.valueOf(i+1);
                                    }
                                }}}
                                i= jTable1.getRowCount()+1;

                            }

                        }else{

                            if (0<i&&i<10) {
                                num="C000"+String.valueOf(i+1);

                            }else{
                                if (10<i&&i<100) {
                                    num="C00"+String.valueOf(i+1);
                                }else{
                                    if (100<=i&&i<1000) {
                                        num="C0"+String.valueOf(i+1);
                                    }else{
                                        if (1000<=i) {
                                            num="C"+String.valueOf(i+1);
                                        }
                                    }}}

                                    i= jTable1.getRowCount()+1;
                                }

                            }}
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        String thedate = dateformat.format(jDateChooser1.getDate());
                            try {
                                String sql ="Insert into '"+s+"' (الرقم,الإسم ,'رقم الهاتف','سعر التدريس','الدين/عليه','تاريخ الإنخراط',المادة,الاستاذ,تفحص) values (?,?,?,?,?,?,?,?,?)";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,num);
                                pst.setString(2,jTextField2.getText());
                                pst.setString(3,jTextField3.getText());
                                pst.setString(4,jTextField4.getText());
                                pst.setString(5,jTextField5.getText());
                                pst.setString(6,thedate);
                                pst.setString(7,jComboBox9.getSelectedItem().toString());
                                pst.setString(8,jComboBox21.getSelectedItem().toString());
                                Period p = Period.ofWeeks(4);
                                DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                                LocalDate date = LocalDate.parse(thedate, f).plus(p);
                                String date1 = date.format(f);
                                pst.setString(9,date1);

                                pst.execute();
                                

                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }catch(NullPointerException ex){
                            }
                            finally{

                                try {

                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                            String name = null,function=null;
                            try {
                              String sql ="select الإسم,الوظيفة from user";
                              pst = con.prepareStatement(sql);
                              rs = pst.executeQuery();
                                if (rs.next()) {
                                  name = rs.getString("الإسم");
                                  function = rs.getString("الوظيفة");
                                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

                                try {
                                     rs.close();
                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                            LocalDate dates = LocalDate.now();
                                try {
                                String sql ="Insert into actions (الإسم,الوظيفة,'من طرف','وظيفة المستخدم',المستوى,السنة,نوع,التاريخ) values (?,?,?,?,?,?,?,'"+dates+"')";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,jTextField2.getText());
                                pst.setString(2,"تلميذ");
                                pst.setString(3,name);
                                pst.setString(4,function);
                                pst.setString(5,s1);
                                pst.setString(6,s2);
                                pst.setString(7,s3);
                           
                                        
                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{
                                try {
                                    pst.close();
                                } catch (SQLException ex) {
                                }}
                                add_st.setVisible(false);
                                update_table3(s,jTable1);
                                alart(jTable1);
                                
                                jTextField2.setText("");
                                jTextField3.setText("");
                                jTextField4.setText("");
                                jTextField5.setText("");
                                jDateChooser1.setDate(null);
                                jComboBox9.removeAllItems();
   }
    private void delete(JTable jTable1,String s,String s1,String s2){
         int p=JOptionPane.showConfirmDialog(null, "هل تريد حقا الحذف ","delete",JOptionPane.YES_NO_OPTION);
        if(p==0)

        {
            int rw = jTable1.getSelectedRow();
            System.out.println(rw);
            String table_click =(jTable1.getModel().getValueAt(rw, 0).toString());

            try {
                String que = "delete from '"+s+"' where الرقم='"+table_click+"'";
                pst = con.prepareStatement(que);

                pst.execute();

            } catch (SQLException e) {

            }finally{

                try {

                    pst.close();
                } catch (SQLException ex) {

                }
            }
            if (jTable1 !=jTable20) {
             String name = null,function=null;
                            try {
                              String sql ="select الإسم,الوظيفة from user";
                              pst = con.prepareStatement(sql);
                              rs = pst.executeQuery();
                                if (rs.next()) {
                                  name = rs.getString("الإسم");
                                  function = rs.getString("الوظيفة");
                                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

                                try {
                                     rs.close();
                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                            LocalDate dates = LocalDate.now();
                            int row = jTable1.getSelectedRow();
                            String name1 = jTable1.getModel().getValueAt(row, 1).toString();
                                try {
                                String sql ="Insert into actions (الإسم,الوظيفة,'من طرف','وظيفة المستخدم',المستوى,السنة,نوع,التاريخ) values (?,?,?,?,?,?,?,'"+dates+"')";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,name1);
                                pst.setString(2,"تلميذ"); 
                                pst.setString(3,name);
                                pst.setString(4,function);
                                pst.setString(5,s1);
                                pst.setString(6,s2);
                                pst.setString(7,"حذف");
                             
                                        
                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{
                                try {
                                    pst.close();
                                } catch (SQLException ex) {
                                }}    
            }
             
        }
            if (jPanel40.isVisible()) {
            update_table("movement_stock",jTable20);
        } else {
        }
            update_table3(s, jTable1);
            alart(jTable1);
            if (jPanel40.isVisible()) {
              jTable20.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                setHorizontalAlignment(RIGHT);
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
            }
          
          });
        }
 }
    private void delete2(JTable jTable15,String s){
        try {
            int rw = jTable15.getSelectedRow();
            int p=JOptionPane.showConfirmDialog(null, "هل تريد حقا حذف هذا الأستاذ","delete",JOptionPane.YES_NO_OPTION);
        if(p==0)
            
        {
            
           String table_click =(jTable15.getModel().getValueAt(rw, 0).toString());
            
                        try {
            String que = "delete from teacher where الرقم='"+table_click+"'";
            pst = con.prepareStatement(que);
            
            pst.execute();
           
            
        } catch (SQLException e) {
            
        }finally{
            
            try {
          
                pst.close();
            } catch (SQLException ex) {
            
            }
        }
                     String name = null,function=null;
                            try {
                              String sql ="select الإسم,الوظيفة from user";
                              pst = con.prepareStatement(sql);
                              rs = pst.executeQuery();
                                if (rs.next()) {
                                  name = rs.getString("الإسم");
                                  function = rs.getString("الوظيفة");
                                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

                                try {
                                     rs.close();
                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                            int row = jTable15.getSelectedRow();
                            String name1 = jTable15.getModel().getValueAt(row, 2).toString();
                                                            Date dates = new Date();
                                                           
                                try {
                                String sql ="Insert into actions (الإسم,الوظيفة,'من طرف','وظيفة المستخدم',المستوى,السنة,نوع,التاريخ) values (?,?,?,?,?,?,?,'"+new java.sql.Date(dates.getTime())+"')";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,name1);
                                    if (jPanel24.isVisible()) {
                                       pst.setString(2,"أستاذ"); 
                                    } else {
                                        pst.setString(2,"تلميذ");
                                    }
                                pst.setString(3,name);
                                pst.setString(4,function);
                                pst.setString(5,s);
                                pst.setString(6,"/");
                                pst.setString(7,"حذف");
                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{
                                try {
                                    pst.close();
                                } catch (SQLException ex) {
                                }} }
        update_table(jTable15, s);
            alart(jTable15);
        } catch (ArrayIndexOutOfBoundsException e) {
          JOptionPane.showMessageDialog(null, "من فضلك حدد الأستاذ الذي تريد حذفه");  
        }

   }
    private void delete_m(JComboBox jComboBox15,String s){
       int p= JOptionPane.showConfirmDialog(null, "هل تريد حقا حذف هذه المادة","delete",JOptionPane.YES_NO_OPTION);
        if (p==0) {
             String item =  jComboBox15.getSelectedItem().toString();
        try {
            String que = "delete from '"+s+"' where name='"+item+"'";
            pst = con.prepareStatement(que);
            pst.execute();
           
            
        } catch (SQLException e) {
            
        }finally{
            
            try {
          
                pst.close();
            } catch (SQLException ex) {
            
            }
        }
        
        int i=1;
        while (i<jComboBox15.getItemCount()) { 
            
            jComboBox15.removeItemAt(i);
          }
        
      update_combo("add_m3","/", jComboBox1);
      update_combo("add_m","الأولى", jComboBox10);
      update_combo("add_m","الثاثية", jComboBox11);
      update_combo("add_m","الثالثة", jComboBox12);
      update_combo("add_m","الرابعة", jComboBox13);
      update_combo("add_m","الخامسة", jComboBox14);
      update_combo("add_m1","الأولى", jComboBox2);
      update_combo("add_m1","الثاثية", jComboBox3);
      update_combo("add_m1","الثالثة", jComboBox4);
      update_combo("add_m1","الرابعة", jComboBox5);
      update_combo("add_m2","الأولى", jComboBox6);
      update_combo("add_m2","الثاثية", jComboBox7);
      update_combo("add_m2","الثالثة", jComboBox8);


      update_combo("add_m","", this.jComboBox15);
      update_combo("add_m1","", jComboBox16);
      update_combo("add_m2","", jComboBox17);
      update_combo("add_m3","", jComboBox19);        }
   }
    private void add_m(JComboBox jComboBox15,String s){
     try {                            
                            String sql ="Insert into '"+s+"' (name,year) values (?,?)";
                            pst = con.prepareStatement(sql);
                            if (jTabbedPane4.getSelectedIndex()==4) {
                             pst.setString(1,jTextField1.getText());
                             pst.setString(2,"/");
                            } else {
                            switch(jComboBox24.getSelectedIndex()){
                                case 0:
                                    pst.setString(1,jTextField1.getText()+"1");
                                    break;
                                case 1:
                                    pst.setString(1,jTextField1.getText()+"2");
                                    break;
                                case 2:
                                    pst.setString(1,jTextField1.getText()+"3");
                                    break;
                                case 3:
                                    pst.setString(1,jTextField1.getText()+"4");
                                    break;
                                case 4:
                                    pst.setString(1,jTextField1.getText()+"5");
                                    break;
                            }
                            pst.setString(2,jComboBox24.getSelectedItem().toString());
                            
                            }

                   
                            pst.execute();
                            } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e);
                            }finally{

                            try {

                                pst.close();
                            } catch (SQLException ex) {

                            }}
                            int i=1;
                            while (i<jComboBox15.getItemCount()) {
                                jComboBox15.removeItemAt(i);
                            }
                            update_combo(s,"", jComboBox15);
                            add_m.setVisible(false);
   }
    private void serchF2(JList jList18,JTextField jTextField39,JTable jTable15,String s){
        jList18.setVisible(true);
        if(jTextField39.getText().equals("")){
        jList18.setVisible(false);
          
        update_table(jTable15,s);
        alart(jTable15);
        }
      else{
        search1(jTextField39.getText(),"teacher",s,jList18);  
      }
    }
    private void serchL2(JList jList18,JTextField jTextField39,JTable jTable15){
                     jTextField39.setText(jList18.getSelectedValue().toString());
        jList18.setVisible(false);
      
        try {
            String querry = "select الرقم,الإسم,\"رقم الهاتف\",\"سعر التدريس\",\"الدين/له\",\"تاريخ الإنخراط\",المادة,السنة  from teacher where الإسم = '"+jTextField39.getText()+"'";
            pst = con.prepareStatement(querry);
            rs= pst.executeQuery();
            jTable15.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            
            try {
                rs.close();
                pst.close();
                
            } catch (SQLException ex) {
              
            }
        }
        alart(jTable15);
    }
    private void add_T(JTable jTable15,String s,String s2,String s3,String s4,String s5) {
            int i=0;
        String num=null;
        if (jTable15.getRowCount()==0) {
            num=s2+"0001";
        }else{
            while (i<jTable15.getRowCount() ) {
                String numb = jTable15.getValueAt(i,0).toString();

                StringBuilder number = new StringBuilder(numb);
                number.delete(0,2);
                     if(i+1!=Integer.valueOf(number.toString())){
              num=s2+"0001";    
             }  
                if (i+1==Integer.valueOf(number.toString())) {
                    i++;

                    if (jTable15.getRowCount()==i) {

                        if (0<(i+1)&&(i+1)<10) {
                            num=s2+"000"+String.valueOf(i+1);

                        }else{
                            if (10<(i+1)&&(i+1)<100) {
                                num=s2+"00"+String.valueOf(i+1);
                            }else{
                                if (100<=(i+1)&&(i+1)<1000) {
                                    num=s2+"0"+String.valueOf(i+1);
                                }else{
                                    if (1000<=(i+1)) {
                                        num=s2+String.valueOf(i+1);
                                    }
                                }}}
                                i= jTable15.getRowCount()+1;

                            }

                        }else{

                            if (0<i&&i<10) {
                                num=s2+"000"+String.valueOf(i+1);

                            }else{
                                if (10<i&&i<100) {
                                    num=s2+"00"+String.valueOf(i+1);
                                }else{
                                    if (100<=i&&i<1000) {
                                        num=s2+"0"+String.valueOf(i+1);
                                    }else{
                                        if (1000<=i) {
                                            num=s2+String.valueOf(i+1);
                                        }
                                    }}}

                                    i= jTable15.getRowCount()+1;
                                }

                            }}
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        String thedate = dateformat.format(jDateChooser3.getDate());
                            try {
                                String sql ="Insert into teacher (الرقم,الإسم ,'رقم الهاتف','سعر التدريس','الدين/له','تاريخ الإنخراط',المستوى,المادة,السنة,تفحص) values (?,?,?,?,?,?,?,?,?,?)";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,num);
                                pst.setString(2,jTextField11.getText());
                                pst.setString(3,jTextField12.getText());
                                pst.setString(4,jTextField13.getText());
                                pst.setString(5,"0");
                                pst.setString(6,thedate);
                                pst.setString(7,s);
                                if (jTabbedPane4.getSelectedIndex()!=0) {
                                    if (jTabbedPane4.getSelectedIndex()==4) {
                                        pst.setString(8, jComboBox20.getSelectedItem().toString());
                                    } else {
                                StringBuilder s1 = new StringBuilder(jComboBox20.getSelectedItem().toString());
                                pst.setString(8,s1.deleteCharAt(jComboBox20.getSelectedItem().toString().length()-1).toString());  
                                    }
                              
                                    if (jTabbedPane4.getSelectedIndex()!=0) {
                                     
                                 switch(jComboBox20.getSelectedItem().toString().charAt(jComboBox20.getSelectedItem().toString().length()-1)){
                                    case '1':
                                     pst.setString(9,"الأولى");
                                     break;
                                    case '2':                                       
                                     pst.setString(9,"الثانية"); 
                                     break;
                                     case'3':
                                     pst.setString(9,"الثالثة"); 
                                     break;
                                     case '4':
                                     pst.setString(9,"الرابعة"); 
                                     break;
                                     case '5':
                                     pst.setString(9,"الخامسة");
                                     break;
                                     default:
                                     pst.setString(9,"/");    
                                } 
                                    } else {
                                     pst.setString(9,"/");   
                                    }

                                } else {
                                  pst.setString(8,"/");  
                                  pst.setString(9,"/");  
                                }
                                DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                                LocalDate date = LocalDate.parse(thedate, f1).plus(Period.ofWeeks(4));
                               
                                
                                pst.setString(10,date.toString());

                                pst.execute();
                                

                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{

                                try {

                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                                   String name = null,function=null;
                            try {
                              String sql ="select الإسم,الوظيفة from user";
                              pst = con.prepareStatement(sql);
                              rs = pst.executeQuery();
                                if (rs.next()) {
                                  name = rs.getString("الإسم");
                                  function = rs.getString("الوظيفة");
                                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

                                try {
                                     rs.close();
                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                                   Date dates = new Date();
                                 try {
                                String sql ="Insert into actions (الإسم,الوظيفة,'من طرف','وظيفة المستخدم',المستوى,السنة,نوع,التاريخ) values (?,?,?,?,?,?,?,'"+new java.sql.Date(dates.getTime())+"')";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,jTextField11.getText());
                                pst.setString(2,"أستاذ");
                                pst.setString(3,name);
                                pst.setString(4,function);
                                pst.setString(5,s3);
                                pst.setString(6,s4);
                                pst.setString(7,s5);
                         
                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{
                                try {
                                    pst.close();
                                } catch (SQLException ex) {
                                }}
                                add_st2.setVisible(false);
                                update_table(jTable15,s);
                                alart(jTable15);
                                jTextField11.setText("");
                                jTextField12.setText("");
                                jTextField13.setText("");
                                jDateChooser3.setDate(null);
                                jComboBox20.removeAllItems();
    }
    private void setup(JTable jTable2,String s,String s1,String s3){
         jComboBox18.removeAllItems();
         jComboBox23.removeAllItems();
         update_combo(s,s1,jComboBox18);
         
         try {
            int j=0, rw = jTable2.getSelectedRow();
            String table_click =(jTable2.getModel().getValueAt(rw, 0).toString());
            try {       
            String query="select *from '"+s3+"' where الرقم='"+table_click+"'";
            pst = con.prepareStatement(query);
            rs= pst.executeQuery();
            if (rs.next()) {
                String add0= rs.getString("الرقم");
                jTextField47.setText(add0);
                String add1= rs.getString("الإسم");
                jTextField49.setText(add1);
                String add2= rs.getString("رقم الهاتف");
                jTextField50.setText(add2);
                 String add4 = rs.getString("سعر التدريس");
                jTextField51.setText(add4);     
                String add3 = rs.getString("الدين/عليه");
                jTextField52.setText(add3);
                String add5 = rs.getString("المادة");
                if (jComboBox18.getItemCount()!=0) {
                   jComboBox18.setSelectedIndex(cout(jComboBox18, add5, j)); 
                }               
                String add7 = rs.getString("تاريخ الإنخراط");
                Date add6 = new SimpleDateFormat("dd-MM-yyyy").parse(add7);
                jDateChooser10.setDate(add6);
                String add8 = rs.getString("الاستاذ");
                                if (jComboBox23.getItemCount()!=0) {
                update_combo2(jComboBox18, jComboBox23);
                jComboBox23.setSelectedIndex(cout(jComboBox23, add8, j));
                }  
                }
                update.setVisible(true);
        } catch (SQLException | ParseException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
            } catch (SQLException ex) {
            
            }}
            
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "من فضلك حدد التلميذ الذي تريد تعديل بياناته");
        }
  }
    private void update2(JTable jTable,String s){
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
       String thedate = dateformat.format(jDateChooser12.getDate());
                                       DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                
                                LocalDate date = LocalDate.parse(thedate, f1).plus(Period.ofWeeks(4));
                                System.out.println(date);
                                                       while (date.toEpochDay()< LocalDate.now().toEpochDay())            
                                                   date = date.plus(Period.ofWeeks(4));      
        
       try {
           String query ="";
                                    if (jTabbedPane4.getSelectedIndex()!=0) {
                                        if (jTabbedPane4.getSelectedIndex()==4) {
                                    query = "update teacher set الإسم='"+jTextField59.getText()+"' , 'رقم الهاتف' = '"+jTextField60.getText()+"' , 'سعر التدريس' = '"+jTextField61.getText()+"' , 'الدين/له' = '"+jTextField62.getText()+"','تاريخ الإنخراط'='"+thedate+"', المادة='"+jComboBox22.getSelectedItem().toString()+"',السنة='/',تفحص='"+date+"' where الرقم ='"+jTextField58.getText()+"' ";                                   
    
                                        } else {
                                        }
                                    StringBuilder modile = new StringBuilder(jComboBox22.getSelectedItem().toString());
                                    modile.deleteCharAt(jComboBox22.getSelectedItem().toString().length()-1);
                                    switch(jComboBox22.getSelectedItem().toString().charAt(jComboBox22.getSelectedItem().toString().length()-1)){
                                    case '1':
                                    String s1 = "الأولى"; 
                                    query = "update teacher set الإسم='"+jTextField59.getText()+"' , 'رقم الهاتف' = '"+jTextField60.getText()+"' , 'سعر التدريس' = '"+jTextField61.getText()+"' , 'الدين/له' = '"+jTextField62.getText()+"','تاريخ الإنخراط'='"+thedate+"', المادة='"+modile+"',السنة='"+s1+"',تفحص='"+date+"' where الرقم ='"+jTextField58.getText()+"' ";                                   
                                    break;
                                    case '2': 
                                    s1 = "الثانية";
                                    query = "update teacher set الإسم='"+jTextField59.getText()+"' , 'رقم الهاتف' = '"+jTextField60.getText()+"' , 'سعر التدريس' = '"+jTextField61.getText()+"' , 'الدين/له' = '"+jTextField62.getText()+"','تاريخ الإنخراط'='"+thedate+"', المادة='"+modile+"',السنة='"+s1+"',تفحص='"+date+"' where الرقم ='"+jTextField58.getText()+"' "; 
                                    break;
                                    case'3':
                                    s1 = "الثالثة";
                                    query = "update teacher set الإسم='"+jTextField59.getText()+"' , 'رقم الهاتف' = '"+jTextField60.getText()+"' , 'سعر التدريس' = '"+jTextField61.getText()+"' , 'الدين/له' = '"+jTextField62.getText()+"','تاريخ الإنخراط'='"+thedate+"', المادة='"+modile+"',السنة='"+s1+"',تفحص='"+date+"' where الرقم ='"+jTextField58.getText()+"' ";  
                                     break;
                                     case '4':
                                         s1 = "الرابعة";
                                     query = "update teacher set الإسم='"+jTextField59.getText()+"' , 'رقم الهاتف' = '"+jTextField60.getText()+"' , 'سعر التدريس' = '"+jTextField61.getText()+"' , 'الدين/له' = '"+jTextField62.getText()+"','تاريخ الإنخراط'='"+thedate+"', المادة='"+modile+"', السنة='"+s1+"',تفحص='"+date+"' where الرقم ='"+jTextField58.getText()+"' "; 
                                     break;
                                     case '5':
                                         s1 = "الخامسة";
                                     query = "update teacher set الإسم='"+jTextField59.getText()+"' , 'رقم الهاتف' = '"+jTextField60.getText()+"' , 'سعر التدريس' = '"+jTextField61.getText()+"' , 'الدين/له' = '"+jTextField62.getText()+"','تاريخ الإنخراط'='"+thedate+"', المادة='"+modile+"', السنة='"+s1+"',تفحص='"+date+"' where الرقم ='"+jTextField58.getText()+"' "; 
                                     break;
                                     
                                } 
           } else {
             query = "update teacher set الإسم='"+jTextField59.getText()+"' , 'رقم الهاتف' = '"+jTextField60.getText()+"' , 'سعر التدريس' = '"+jTextField61.getText()+"' , 'الدين/له' = '"+jTextField62.getText()+"','تاريخ الإنخراط'='"+thedate+"', المادة='/',تفحص='"+date+"' where الرقم ='"+jTextField58.getText()+"' ";                                   

           }
               
            
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
                               String name = null,function=null;
                            try {
                              String sql ="select الإسم,الوظيفة from user";
                              pst = con.prepareStatement(sql);
                              rs = pst.executeQuery();
                                if (rs.next()) {
                                  name = rs.getString("الإسم");
                                  function = rs.getString("الوظيفة");
                                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

                                try {
                                     rs.close();
                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                              Date dates = new Date();
                                java.sql.Date date1 = new java.sql.Date(dates.getTime());
                                try {
                                String sql ="Insert into actions (الإسم,الوظيفة,'من طرف','وظيفة المستخدم',المستوى,السنة,نوع,التاريخ) values (?,?,?,?,?,?,?,'"+date1+"')";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,jTextField59.getText());
                                pst.setString(2,"أستاذ");
                                pst.setString(3,name);
                                pst.setString(4,function);
                                pst.setString(5,s);
                                pst.setString(6,"/");
                                pst.setString(7,"تعديل");
                              
                                        
                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{
                                try {
                                    pst.close();
                                } catch (SQLException ex) {
                                }}
       jTextField58.setText("");
       jTextField59.setText("");
       jTextField60.setText("");
       jTextField61.setText("");
       jTextField62.setText("");
       jDateChooser12.setDate(null);
       jComboBox22.removeAllItems();
    update_table(jTable,s);
    alart(jTable);
    update2.setVisible(false);
}
    private void setup_p(JTable jTable2){
           jCheckBox1.setSelected(false);
        jTextField46.setText("");
        jLabel150.setText("");
                
        try {
            int row = jTable2.getSelectedRow();
        String debt = jTable2.getValueAt(row, 4).toString();
        jLabel148.setText(debt);
        payment.setVisible(true);
        
        
        } catch (ArrayIndexOutOfBoundsException e) {
           JOptionPane.showMessageDialog(null, "من فضلك حدد التلميذ الذي تريد تعديل مستحقاته"); 
        }   
    }
@SuppressWarnings("null")
    private void payment(JTable jTable1,String s,String s2,String s1){
     int table_click1;
    table_click1 = jTable1.getSelectedRow();
        String table_click = jTable1.getValueAt(table_click1, 0).toString();
        try {
            String query="";
            if (jPanel24.isVisible()) {
                 query = "update teacher set 'الدين/له'='"+jLabel150.getText()+"'where الرقم ='"+table_click+"' ";
            } else {
                 query = "update '"+s+"' set 'الدين/عليه'='"+jLabel150.getText()+"'where الرقم ='"+table_click+"' ";
            }
           
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
                   LocalDate date1= null;
       LocalDate date2 = LocalDate.now();
                     if (jPanel24.isVisible()) {
             
                         try {
                              String sql ="select تفحص from teacher where الرقم ='"+table_click+"'";
                              pst = con.prepareStatement(sql);
                              rs = pst.executeQuery();
                                if(rs.next()) {
                                  date1=LocalDate.parse(rs.getString("تفحص"), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                                }
              
          
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

                                try {
                                     rs.close();
                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                      
        }
    if (jPanel24.isVisible()) {
        System.out.println(date2+"+"+date1);
                               while (date2.toEpochDay()>= date1.toEpochDay()) {
                                           date1=date1.plus(Period.ofWeeks(4));
                               
                               }
                                                     try{  
                String query = "update teacher set تفحص='"+date1+"'where الرقم ='"+table_click+"' ";
            
           
            pst = con.prepareStatement(query);
            pst.execute();
            
            
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        }finally{
            
            try {
           
                pst.close();
            } catch (SQLException ex) {
             
            }
                         
        }  
    }

                        
  
        
           
        int table_click2 = jTable1.getSelectedRow();
        String name = jTable1.getModel().getValueAt(table_click2,1).toString();
        java.sql.Date date = new java.sql.Date(new Date().getTime()) ;
        
        
                            try {
                                String sql ="Insert into movement_stock (الإسم ,الوظيفة,استلام,دفع,التاريخ) values (?,?,?,?,'"+date+"')";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,name);
                                if (jPanel24.isVisible()) {
                                pst.setString(2,"أستاذ");
                                pst.setString(3,"/");
                                pst.setString(4,jTextField46.getText()); 
                                } else {
                                pst.setString(2,"تلميذ");
                                pst.setString(3,jTextField46.getText());
                                pst.setString(4,"/"); 
                                }

                               
                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{

                                try {

                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                            
                                String name1 = null,function=null;
                            try {
                              String sql ="select الإسم,الوظيفة from user";
                              pst = con.prepareStatement(sql);
                              rs = pst.executeQuery();
                                if (rs.next()) {
                                  name1 = rs.getString("الإسم");
                                  function = rs.getString("الوظيفة");
                                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

                                try {
                                     rs.close();
                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                              Date dates = new Date();
                              if (jPanel24.isVisible()) {
                               int row = jTable1.getSelectedRow();
                               table_click = jTable1.getModel().getValueAt(row, 7).toString();
                                }
               
                                try {
                                String sql ="Insert into actions (الإسم,الوظيفة,'من طرف','وظيفة المستخدم',المستوى,السنة,نوع,التاريخ) values (?,?,?,?,?,?,?,'"+new java.sql.Date(dates.getTime())+"')";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,name);
                                 if (jPanel24.isVisible()) {
                                pst.setString(2,"أستاذ");
                                 } else {
                                pst.setString(2,"تلميذ");
                                 }
                                
                                pst.setString(3,name1);
                                pst.setString(4,function);
                                    if (jPanel3.isVisible()){ 
                                pst.setString(5,"المتوسط");
                                pst.setString(6,s1);
                                    }  else {
                                        if (jPanel4.isVisible()) {
                                pst.setString(5,"دروس أخرى");
                                pst.setString(6,s1);
                                        }else{ 
                                        if (jPanel9.isVisible()){ 
                                pst.setString(5,"الثانوي");
                                pst.setString(6,s1);
                                        }else{ 
                                       if (jPanel15.isVisible()){ 
                                pst.setString(5,"الإبتدائي");
                                pst.setString(6,s1);
                                       } else {
                                           if (jPanel21.isVisible()) {
                                pst.setString(5,"التحضيري");
                                pst.setString(6,s1); 
                                           } else {
                                pst.setString(5,s);
                                pst.setString(6,table_click); 
                                           }
                                     
                                       }}}}
                                        
                                       
                                      
                                      
                                    
                                
                                pst.setString(7,s2);
                               
                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{
                                try {
                                    pst.close();
                                } catch (SQLException ex) {
                                }}
        if (!jPanel24.isVisible()) {
                                         int price = 0;
                                String id = null;
                               int row = jTable1.getSelectedRow();
                               System.out.println(row);
                               String table_cleck = jTable1.getModel().getValueAt(row, 6).toString();
                               String table_cleck1 = jTable1.getModel().getValueAt(row, 7).toString();
                             
                               String sql = null;
                                      
                                  try {
                                      if (jPanel21.isVisible()) {
                                      sql ="select \"سعر التدريس\",الرقم from teacher where المستوى='التحضيري' and الإسم='"+table_cleck1+"' ";
   
                                      } else {
                                      sql ="select \"سعر التدريس\",الرقم from teacher where المادة='"+table_cleck+"' and الإسم='"+table_cleck1+"' and السنة='"+s1+"' ";

                                      }
                              pst = con.prepareStatement(sql);
                              rs = pst.executeQuery();
                                if (rs.next()) {
                                  price = rs.getInt("سعر التدريس");
                                  id = rs.getString("الرقم");
                                    System.out.println(price);
                                    System.out.println(id);
                                                              }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

                                try {
                                     rs.close();
                                    pst.close();
                                } catch (SQLException ex) {

                                }} 
                                  price = price*Integer.valueOf(jTextField46.getText())/100;
                                    
                                  try {
            String query="";
            
           
                
                 query = "update teacher set 'الدين/له'='"+price+"'where الرقم ='"+id+"' ";
            
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
         


                                
        jCheckBox1.setSelected(false);
        jTextField46.setText("");
        jLabel150.setText("");
        if (jPanel24.isVisible()) 
            update_table(jTable1, s);
        else 
            if (jPanel21.isVisible()||jPanel40.isVisible()) 
              update_table(s,jTable1);  
            else 
                update_table3(s, jTable1);
        alart(jTable1);
        payment.setVisible(false);   
        }
    private void check(JTable jTable3,String s,JLabel jLabel142){
           if (count==1) {
        ArrayList<String> diff3 = new ArrayList<>();
     ArrayList<ArrayList<String>> dif = new ArrayList<>();
     
        int i=0;
        while(i< jTable3.getRowCount()){
             String table_click1 = jTable3.getValueAt(i, 4).toString();
         
                    
                    if (Integer.valueOf(table_click1)!=0) {
                    
                    diff3.add(jTable3.getModel().getValueAt(i, 0).toString());
                    
                    }
                   i++;     
        }
               
        try {
               
            for (String integer : diff3) {
              
              String querry = "select *from '"+s+"' where الرقم = '"+integer+"'";
              ArrayList<String> diff4 = new ArrayList<>();
            pst = con.prepareStatement(querry);
            rs= pst.executeQuery();   
                if (rs.next()) {
            diff4.add(rs.getString("الرقم"));
            diff4.add(rs.getString("الإسم"));
            diff4.add(rs.getString("رقم الهاتف"));
            diff4.add(rs.getString("سعر التدريس"));
            if (jPanel24.isVisible()) {
              diff4.add(rs.getString("الدين/له")); 
            }else{
            diff4.add(rs.getString("الدين/عليه"));
            }
            diff4.add(rs.getString("تاريخ الإنخراط"));
            if (!jPanel21.isVisible()) {
            diff4.add(rs.getString("المادة")); 
            }
            if (jPanel24.isVisible()) {
            diff4.add(rs.getString("السنة"));   
            }
            
            dif.add(diff4);
            }
            }
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            
            try {
                rs.close();
                pst.close();
                
            } catch (SQLException ex) {
              
            }
            
        }
            
        dif.forEach((arrayList) -> {
           try {
               String sql ="";
               if (jPanel24.isVisible()) {
              sql ="Insert into other2 (الرقم,الإسم,'رقم الهاتف','سعر التدريس','الدين/له','تاريخ الإنخراط',المادة,السنة) values (?,?,?,?,?,?,?,?)";
               } else {
                   if (jPanel21.isVisible()) {
                 sql ="Insert into other1 (الرقم,الإسم,'رقم الهاتف','سعر التدريس','الدين/عليه','تاريخ الإنخراط') values (?,?,?,?,?,?)";  
               } else {
                 sql ="Insert into other1 (الرقم,الإسم,'رقم الهاتف','سعر التدريس','الدين/عليه','تاريخ الإنخراط',المادة) values (?,?,?,?,?,?,?)";
               }
               }
               
            pst = con.prepareStatement(sql);
            pst.setString(1,arrayList.get(0));
            pst.setString(2,arrayList.get(1));
            pst.setString(3,arrayList.get(2));
            pst.setString(4,arrayList.get(3));
            pst.setString(5,arrayList.get(4));
            pst.setString(6,arrayList.get(5));
               if (!jPanel21.isVisible()) {
                 pst.setString(7,arrayList.get(6));  
               }
               if (jPanel21.isVisible()) {
                 pst.setString(8,arrayList.get(7));  
               }
            
            pst.execute();
            } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        }finally{
        try {
        pst.close();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            }
        }
      });
                if (jPanel24.isVisible()) {
                    update_table3(jTable3);
               } else {
                     if (jPanel21.isVisible()) {
                   update_table("other1", jTable3);
               } else {
                   update_table3("other1", jTable3);
               }
               }
              
          
count=0;
            alart(jTable3);
            jLabel142.setVisible(true);
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
    private void back(JTable jTable2,JLabel jLabel140,String s){
       try {
           String query=null;
           if (jPanel24.isVisible()) {
             query="delete from other2";  
           } else {
             query="delete from other1";
           }
                
                pst = con.prepareStatement(query);
                pst.execute();
                }catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }finally{
            
            try {
           
                
                pst.close();
            } catch (SQLException ex) {
              
            }}
          if (jPanel24.isVisible()) {
              update_table(jTable2, s);
          } else {
              update_table3(s, jTable2);
          }
        
        alart(jTable2);
        count=1;
        jLabel140.setVisible(false);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_st = new javax.swing.JFrame();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel93 = new javax.swing.JLabel();
        jComboBox21 = new javax.swing.JComboBox<>();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        add_m = new javax.swing.JFrame();
        jPanel39 = new javax.swing.JPanel();
        jLabel294 = new javax.swing.JLabel();
        jComboBox24 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel293 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        payment = new javax.swing.JFrame();
        jPanel31 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel149 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        update = new javax.swing.JFrame();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jTextField47 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jDateChooser10 = new com.toedter.calendar.JDateChooser();
        jComboBox18 = new javax.swing.JComboBox<>();
        jLabel186 = new javax.swing.JLabel();
        jComboBox23 = new javax.swing.JComboBox<>();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        add_st1 = new javax.swing.JFrame();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jTextField10 = new javax.swing.JTextField();
        jLabel292 = new javax.swing.JLabel();
        jComboBox25 = new javax.swing.JComboBox<>();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        update1 = new javax.swing.JFrame();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jTextField48 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jDateChooser11 = new com.toedter.calendar.JDateChooser();
        jTextField57 = new javax.swing.JTextField();
        jLabel295 = new javax.swing.JLabel();
        jComboBox26 = new javax.swing.JComboBox<>();
        jLabel213 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        add_st2 = new javax.swing.JFrame();
        jPanel30 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jLabel264 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel266 = new javax.swing.JLabel();
        jLabel267 = new javax.swing.JLabel();
        jLabel278 = new javax.swing.JLabel();
        jLabel279 = new javax.swing.JLabel();
        jComboBox20 = new javax.swing.JComboBox<>();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel280 = new javax.swing.JLabel();
        jLabel281 = new javax.swing.JLabel();
        update2 = new javax.swing.JFrame();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel283 = new javax.swing.JLabel();
        jLabel284 = new javax.swing.JLabel();
        jLabel285 = new javax.swing.JLabel();
        jLabel286 = new javax.swing.JLabel();
        jLabel287 = new javax.swing.JLabel();
        jLabel288 = new javax.swing.JLabel();
        jLabel289 = new javax.swing.JLabel();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jDateChooser12 = new com.toedter.calendar.JDateChooser();
        jComboBox22 = new javax.swing.JComboBox<>();
        jLabel290 = new javax.swing.JLabel();
        jLabel291 = new javax.swing.JLabel();
        add_cost = new javax.swing.JFrame();
        jPanel41 = new javax.swing.JPanel();
        jTextField14 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        update_cost = new javax.swing.JFrame();
        jPanel42 = new javax.swing.JPanel();
        jTextField16 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel277 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel51 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jList4 = new javax.swing.JList<>();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLabel52 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jList5 = new javax.swing.JList<>();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jLabel53 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jList6 = new javax.swing.JList<>();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jLabel54 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jList7 = new javax.swing.JList<>();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel298 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel50 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jList3 = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel297 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        jLabel55 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jList8 = new javax.swing.JList<>();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLayeredPane9 = new javax.swing.JLayeredPane();
        jLabel56 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jList9 = new javax.swing.JList<>();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jLayeredPane10 = new javax.swing.JLayeredPane();
        jLabel63 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jList10 = new javax.swing.JList<>();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel92 = new javax.swing.JLabel();
        jLayeredPane16 = new javax.swing.JLayeredPane();
        jLabel127 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jList16 = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLayeredPane12 = new javax.swing.JLayeredPane();
        jLabel99 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jList12 = new javax.swing.JList<>();
        jLabel100 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLayeredPane13 = new javax.swing.JLayeredPane();
        jLabel109 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jList13 = new javax.swing.JList<>();
        jLabel110 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLayeredPane14 = new javax.swing.JLayeredPane();
        jLabel119 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jList14 = new javax.swing.JList<>();
        jLabel120 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel185 = new javax.swing.JLabel();
        jLayeredPane17 = new javax.swing.JLayeredPane();
        jLabel128 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jList17 = new javax.swing.JList<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLayeredPane11 = new javax.swing.JLayeredPane();
        jLabel129 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jList11 = new javax.swing.JList<>();
        jLabel130 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel29 = new javax.swing.JPanel();
        jLayeredPane21 = new javax.swing.JLayeredPane();
        jLabel265 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jList21 = new javax.swing.JList<>();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable19 = new javax.swing.JTable();
        jLabel268 = new javax.swing.JLabel();
        jLabel269 = new javax.swing.JLabel();
        jLabel270 = new javax.swing.JLabel();
        jLabel271 = new javax.swing.JLabel();
        jLabel272 = new javax.swing.JLabel();
        jLabel273 = new javax.swing.JLabel();
        jLabel274 = new javax.swing.JLabel();
        jLabel275 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel216 = new javax.swing.JLabel();
        jLayeredPane18 = new javax.swing.JLayeredPane();
        jLabel217 = new javax.swing.JLabel();
        jTextField39 = new javax.swing.JTextField();
        jList18 = new javax.swing.JList<>();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel226 = new javax.swing.JLabel();
        jLabel227 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jLayeredPane15 = new javax.swing.JLayeredPane();
        jLabel228 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jList15 = new javax.swing.JList<>();
        jLabel229 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable16 = new javax.swing.JTable();
        jLabel230 = new javax.swing.JLabel();
        jLabel231 = new javax.swing.JLabel();
        jLabel232 = new javax.swing.JLabel();
        jLabel233 = new javax.swing.JLabel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        jLabel238 = new javax.swing.JLabel();
        jLabel239 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jLayeredPane19 = new javax.swing.JLayeredPane();
        jLabel240 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jList19 = new javax.swing.JList<>();
        jLabel241 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable17 = new javax.swing.JTable();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel246 = new javax.swing.JLabel();
        jLabel247 = new javax.swing.JLabel();
        jLabel248 = new javax.swing.JLabel();
        jLabel249 = new javax.swing.JLabel();
        jLabel250 = new javax.swing.JLabel();
        jLabel251 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jComboBox19 = new javax.swing.JComboBox<>();
        jLayeredPane20 = new javax.swing.JLayeredPane();
        jLabel252 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jList20 = new javax.swing.JList<>();
        jLabel253 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable18 = new javax.swing.JTable();
        jLabel254 = new javax.swing.JLabel();
        jLabel255 = new javax.swing.JLabel();
        jLabel256 = new javax.swing.JLabel();
        jLabel257 = new javax.swing.JLabel();
        jLabel258 = new javax.swing.JLabel();
        jLabel259 = new javax.swing.JLabel();
        jLabel260 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel263 = new javax.swing.JLabel();
        jLabel276 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable20 = new javax.swing.JTable();
        jLabel282 = new javax.swing.JLabel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel296 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable21 = new javax.swing.JTable();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();

        add_st.setUndecorated(true);

        jPanel13.setBackground(new java.awt.Color(0, 0, 102));

        jPanel14.setBackground(new java.awt.Color(0, 51, 204));

        jTextField2.setBackground(new java.awt.Color(0, 51, 204));
        jTextField2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel71.setText("الاسم واللقب");

        jTextField3.setBackground(new java.awt.Color(0, 51, 204));
        jTextField3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));

        jTextField4.setBackground(new java.awt.Color(0, 51, 204));
        jTextField4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(0, 51, 204));
        jTextField5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setEnabled(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel77.setText("رقم الهاتف");

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel78.setText("سعر التدريس");

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel79.setText("الدين /عليه");

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel80.setText("تاريخ الإنخراط");

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel81.setText("المادة");

        jComboBox9.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox9PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel93.setBackground(new java.awt.Color(255, 255, 255));
        jLabel93.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel93.setText("الأستاذ");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox21, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("إلغاء");
        jLabel75.setOpaque(true);
        jLabel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel75MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel75MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel75MouseExited(evt);
            }
        });

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("موافق");
        jLabel76.setOpaque(true);
        jLabel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel76MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel76MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel76MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout add_stLayout = new javax.swing.GroupLayout(add_st.getContentPane());
        add_st.getContentPane().setLayout(add_stLayout);
        add_stLayout.setHorizontalGroup(
            add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_stLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        add_stLayout.setVerticalGroup(
            add_stLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel39.setBackground(new java.awt.Color(0, 0, 204));

        jLabel294.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel294.setForeground(new java.awt.Color(255, 255, 255));
        jLabel294.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel294.setText("السنة");

        jComboBox24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DefaultListCellRenderer dc = new DefaultListCellRenderer();
        dc.setHorizontalAlignment(DefaultListCellRenderer.RIGHT);
        jComboBox24.setRenderer(dc);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("موافق");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel293.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel293.setForeground(new java.awt.Color(255, 255, 255));
        jLabel293.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel293.setText("المادة");

        jTextField1.setBackground(new java.awt.Color(0, 0, 204));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel293, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel294, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jLabel293, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel294, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout add_mLayout = new javax.swing.GroupLayout(add_m.getContentPane());
        add_m.getContentPane().setLayout(add_mLayout);
        add_mLayout.setHorizontalGroup(
            add_mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        add_mLayout.setVerticalGroup(
            add_mLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel31.setBackground(new java.awt.Color(0, 0, 204));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 204));
        jCheckBox1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("دفع جميع المسحقات");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel149.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel149.setText("الدين");

        jLabel148.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));

        jTextField46.setBackground(new java.awt.Color(0, 0, 204));
        jTextField46.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField46.setForeground(new java.awt.Color(255, 255, 255));
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField46KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField46KeyTyped(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setText("موافق");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel150.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));

        jLabel151.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(255, 255, 255));
        jLabel151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel151.setText("الباقي");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(121, 121, 121))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel31Layout.createSequentialGroup()
                                        .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57))))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(26, 26, 26)
                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel150, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout paymentLayout = new javax.swing.GroupLayout(payment.getContentPane());
        payment.getContentPane().setLayout(paymentLayout);
        paymentLayout.setHorizontalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        paymentLayout.setVerticalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        update.setUndecorated(true);

        jPanel32.setBackground(new java.awt.Color(0, 0, 51));

        jPanel33.setBackground(new java.awt.Color(0, 0, 204));

        jLabel153.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel153.setText("الرقم");
        jLabel153.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel154.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel154.setText("الإسم");
        jLabel154.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel155.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel155.setText("رقم الهاتف");
        jLabel155.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel156.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel156.setText("سعر التدريس");
        jLabel156.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel157.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel157.setText("الدين/عليه");
        jLabel157.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel158.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel158.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel158.setText("تاريخ الإخراط");
        jLabel158.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel159.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel159.setText("المادة");
        jLabel159.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTextField47.setBackground(new java.awt.Color(0, 0, 204));
        jTextField47.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField47.setForeground(new java.awt.Color(255, 255, 255));
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setEnabled(false);
        jTextField47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField47ActionPerformed(evt);
            }
        });

        jTextField49.setBackground(new java.awt.Color(0, 0, 204));
        jTextField49.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField49.setForeground(new java.awt.Color(255, 255, 255));
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField49ActionPerformed(evt);
            }
        });

        jTextField50.setBackground(new java.awt.Color(0, 0, 204));
        jTextField50.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField50.setForeground(new java.awt.Color(255, 255, 255));
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField50ActionPerformed(evt);
            }
        });

        jTextField51.setBackground(new java.awt.Color(0, 0, 204));
        jTextField51.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField51.setForeground(new java.awt.Color(255, 255, 255));
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField51ActionPerformed(evt);
            }
        });

        jTextField52.setBackground(new java.awt.Color(0, 0, 204));
        jTextField52.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField52.setForeground(new java.awt.Color(255, 255, 255));
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField52ActionPerformed(evt);
            }
        });

        jComboBox18.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox18PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel186.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel186.setText("الأستاذ");
        jLabel186.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel33Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox18, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooser10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField51)
                                    .addComponent(jTextField50, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(jTextField52)
                                    .addComponent(jComboBox23, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel155, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel156, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel158, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel159, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel186, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(56, 56, 56))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField47, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField49)
                    .addComponent(jLabel154, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField50)
                    .addComponent(jLabel155, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField51)
                    .addComponent(jLabel156, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField52)
                    .addComponent(jLabel157, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel158, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel159, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jComboBox18))
                .addGap(31, 31, 31)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel186, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jComboBox23))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel160.setBackground(new java.awt.Color(255, 255, 255));
        jLabel160.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(0, 0, 0));
        jLabel160.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel160.setText("إلغاء الامر");
        jLabel160.setOpaque(true);
        jLabel160.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel160MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel160MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel160MouseExited(evt);
            }
        });

        jLabel161.setBackground(new java.awt.Color(255, 255, 255));
        jLabel161.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(0, 0, 0));
        jLabel161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel161.setText("موافق");
        jLabel161.setOpaque(true);
        jLabel161.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel161MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel161MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel161MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel161, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel161, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel160, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update.getContentPane());
        update.getContentPane().setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add_st1.setUndecorated(true);

        jPanel22.setBackground(new java.awt.Color(0, 0, 102));

        jPanel23.setBackground(new java.awt.Color(0, 51, 204));

        jTextField6.setBackground(new java.awt.Color(0, 51, 204));
        jTextField6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel131.setBackground(new java.awt.Color(255, 255, 255));
        jLabel131.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel131.setText("الاسم واللقب");

        jTextField7.setBackground(new java.awt.Color(0, 51, 204));
        jTextField7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));

        jTextField8.setBackground(new java.awt.Color(0, 51, 204));
        jTextField8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });

        jTextField9.setBackground(new java.awt.Color(0, 51, 204));
        jTextField9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setEnabled(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel132.setBackground(new java.awt.Color(255, 255, 255));
        jLabel132.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel132.setText("رقم الهاتف");

        jLabel197.setBackground(new java.awt.Color(255, 255, 255));
        jLabel197.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(255, 255, 255));
        jLabel197.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel197.setText("سعر التدريس");

        jLabel201.setBackground(new java.awt.Color(255, 255, 255));
        jLabel201.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel201.setForeground(new java.awt.Color(255, 255, 255));
        jLabel201.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel201.setText("الدين /عليه");

        jLabel202.setBackground(new java.awt.Color(255, 255, 255));
        jLabel202.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(255, 255, 255));
        jLabel202.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel202.setText("تاريخ الإنخراط");

        jLabel203.setBackground(new java.awt.Color(255, 255, 255));
        jLabel203.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(255, 255, 255));
        jLabel203.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel203.setText("ولي الأمر");

        jTextField10.setBackground(new java.awt.Color(0, 51, 204));
        jTextField10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });

        jLabel292.setBackground(new java.awt.Color(255, 255, 255));
        jLabel292.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel292.setForeground(new java.awt.Color(255, 255, 255));
        jLabel292.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel292.setText("الأستاذ");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField6)
                    .addComponent(jTextField7)
                    .addComponent(jTextField8)
                    .addComponent(jTextField9)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox25, 0, 159, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel132, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel197, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel201, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel202, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel203, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel131, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel292, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel132, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel197, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel201, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel203, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel292, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLabel204.setBackground(new java.awt.Color(255, 255, 255));
        jLabel204.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(0, 0, 0));
        jLabel204.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel204.setText("إلغاء");
        jLabel204.setOpaque(true);
        jLabel204.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel204MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel204MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel204MouseExited(evt);
            }
        });

        jLabel205.setBackground(new java.awt.Color(255, 255, 255));
        jLabel205.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel205.setForeground(new java.awt.Color(0, 0, 0));
        jLabel205.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel205.setText("موافق");
        jLabel205.setOpaque(true);
        jLabel205.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel205MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel205MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel205MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(499, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout add_st1Layout = new javax.swing.GroupLayout(add_st1.getContentPane());
        add_st1.getContentPane().setLayout(add_st1Layout);
        add_st1Layout.setHorizontalGroup(
            add_st1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_st1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        add_st1Layout.setVerticalGroup(
            add_st1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_st1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        update1.setUndecorated(true);

        jPanel34.setBackground(new java.awt.Color(0, 0, 51));

        jPanel35.setBackground(new java.awt.Color(0, 0, 204));

        jLabel206.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel206.setForeground(new java.awt.Color(255, 255, 255));
        jLabel206.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel206.setText("الرقم");
        jLabel206.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel207.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(255, 255, 255));
        jLabel207.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel207.setText("الإسم");
        jLabel207.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel208.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(255, 255, 255));
        jLabel208.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel208.setText("رقم الهاتف");
        jLabel208.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel209.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel209.setForeground(new java.awt.Color(255, 255, 255));
        jLabel209.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel209.setText("سعر التدريس");
        jLabel209.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel210.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(255, 255, 255));
        jLabel210.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel210.setText("الدين/عليه");
        jLabel210.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel211.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel211.setForeground(new java.awt.Color(255, 255, 255));
        jLabel211.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel211.setText("تاريخ الإخراط");
        jLabel211.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel212.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel212.setForeground(new java.awt.Color(255, 255, 255));
        jLabel212.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel212.setText("ولي الامر");
        jLabel212.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTextField48.setBackground(new java.awt.Color(0, 0, 204));
        jTextField48.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField48.setForeground(new java.awt.Color(255, 255, 255));
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setEnabled(false);
        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        jTextField53.setBackground(new java.awt.Color(0, 0, 204));
        jTextField53.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField53.setForeground(new java.awt.Color(255, 255, 255));
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField53ActionPerformed(evt);
            }
        });

        jTextField54.setBackground(new java.awt.Color(0, 0, 204));
        jTextField54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField54.setForeground(new java.awt.Color(255, 255, 255));
        jTextField54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField54ActionPerformed(evt);
            }
        });

        jTextField55.setBackground(new java.awt.Color(0, 0, 204));
        jTextField55.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField55.setForeground(new java.awt.Color(255, 255, 255));
        jTextField55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField55ActionPerformed(evt);
            }
        });

        jTextField56.setBackground(new java.awt.Color(0, 0, 204));
        jTextField56.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField56.setForeground(new java.awt.Color(255, 255, 255));
        jTextField56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField56ActionPerformed(evt);
            }
        });

        jTextField57.setBackground(new java.awt.Color(0, 0, 204));
        jTextField57.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField57.setForeground(new java.awt.Color(255, 255, 255));
        jTextField57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField57ActionPerformed(evt);
            }
        });

        jLabel295.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel295.setForeground(new java.awt.Color(255, 255, 255));
        jLabel295.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel295.setText("الأستاذ");
        jLabel295.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel210, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel35Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jDateChooser11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField55)
                                    .addComponent(jTextField54, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(jTextField56)
                                    .addComponent(jTextField57)
                                    .addComponent(jComboBox26, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel208, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel209, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel211, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel212, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel295, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(56, 56, 56))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField48, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel206, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField53)
                    .addComponent(jLabel207, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField54)
                    .addComponent(jLabel208, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField55)
                    .addComponent(jLabel209, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField56)
                    .addComponent(jLabel210, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel211, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel212, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel295, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jComboBox26))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel213.setBackground(new java.awt.Color(255, 255, 255));
        jLabel213.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel213.setForeground(new java.awt.Color(0, 0, 0));
        jLabel213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel213.setText("إلغاء الامر");
        jLabel213.setOpaque(true);
        jLabel213.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel213MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel213MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel213MouseExited(evt);
            }
        });

        jLabel214.setBackground(new java.awt.Color(255, 255, 255));
        jLabel214.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel214.setForeground(new java.awt.Color(0, 0, 0));
        jLabel214.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel214.setText("موافق");
        jLabel214.setOpaque(true);
        jLabel214.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel214MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel214MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel214MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel214, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel213, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout update1Layout = new javax.swing.GroupLayout(update1.getContentPane());
        update1.getContentPane().setLayout(update1Layout);
        update1Layout.setHorizontalGroup(
            update1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        update1Layout.setVerticalGroup(
            update1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add_st2.setUndecorated(true);

        jPanel30.setBackground(new java.awt.Color(0, 0, 102));

        jPanel36.setBackground(new java.awt.Color(0, 51, 204));

        jTextField11.setBackground(new java.awt.Color(0, 51, 204));
        jTextField11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel264.setBackground(new java.awt.Color(255, 255, 255));
        jLabel264.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel264.setForeground(new java.awt.Color(255, 255, 255));
        jLabel264.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel264.setText("الاسم واللقب");

        jTextField12.setBackground(new java.awt.Color(0, 51, 204));
        jTextField12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField13.setBackground(new java.awt.Color(0, 51, 204));
        jTextField13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField13KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });

        jLabel266.setBackground(new java.awt.Color(255, 255, 255));
        jLabel266.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel266.setForeground(new java.awt.Color(255, 255, 255));
        jLabel266.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel266.setText("رقم الهاتف");

        jLabel267.setBackground(new java.awt.Color(255, 255, 255));
        jLabel267.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel267.setForeground(new java.awt.Color(255, 255, 255));
        jLabel267.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel267.setText("سعر التدريس");

        jLabel278.setBackground(new java.awt.Color(255, 255, 255));
        jLabel278.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel278.setForeground(new java.awt.Color(255, 255, 255));
        jLabel278.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel278.setText("تاريخ الإنخراط");

        jLabel279.setBackground(new java.awt.Color(255, 255, 255));
        jLabel279.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel279.setForeground(new java.awt.Color(255, 255, 255));
        jLabel279.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel279.setText("المادة");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField11)
                    .addComponent(jTextField12)
                    .addComponent(jTextField13)
                    .addComponent(jComboBox20, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel266, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel267, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel278, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel279, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel264, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel264, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel266, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel267, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel278, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel279, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel280.setBackground(new java.awt.Color(255, 255, 255));
        jLabel280.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel280.setForeground(new java.awt.Color(0, 0, 0));
        jLabel280.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel280.setText("إلغاء");
        jLabel280.setOpaque(true);
        jLabel280.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel280MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel280MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel280MouseExited(evt);
            }
        });

        jLabel281.setBackground(new java.awt.Color(255, 255, 255));
        jLabel281.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel281.setForeground(new java.awt.Color(0, 0, 0));
        jLabel281.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel281.setText("موافق");
        jLabel281.setOpaque(true);
        jLabel281.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel281MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel281MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel281MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel280, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel281, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(365, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel281, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel280, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel30Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(93, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout add_st2Layout = new javax.swing.GroupLayout(add_st2.getContentPane());
        add_st2.getContentPane().setLayout(add_st2Layout);
        add_st2Layout.setHorizontalGroup(
            add_st2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_st2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        add_st2Layout.setVerticalGroup(
            add_st2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, add_st2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        update2.setUndecorated(true);

        jPanel37.setBackground(new java.awt.Color(0, 0, 51));

        jPanel38.setBackground(new java.awt.Color(0, 0, 204));

        jLabel283.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel283.setForeground(new java.awt.Color(255, 255, 255));
        jLabel283.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel283.setText("الرقم");
        jLabel283.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel284.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel284.setForeground(new java.awt.Color(255, 255, 255));
        jLabel284.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel284.setText("الإسم");
        jLabel284.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel285.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel285.setForeground(new java.awt.Color(255, 255, 255));
        jLabel285.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel285.setText("رقم الهاتف");
        jLabel285.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel286.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel286.setForeground(new java.awt.Color(255, 255, 255));
        jLabel286.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel286.setText("سعر التدريس");
        jLabel286.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel287.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel287.setForeground(new java.awt.Color(255, 255, 255));
        jLabel287.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel287.setText("الدين/له");
        jLabel287.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel288.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel288.setForeground(new java.awt.Color(255, 255, 255));
        jLabel288.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel288.setText("تاريخ الإخراط");
        jLabel288.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel289.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel289.setForeground(new java.awt.Color(255, 255, 255));
        jLabel289.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel289.setText("المادة");
        jLabel289.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTextField58.setBackground(new java.awt.Color(0, 0, 204));
        jTextField58.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField58.setForeground(new java.awt.Color(255, 255, 255));
        jTextField58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField58.setEnabled(false);
        jTextField58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField58ActionPerformed(evt);
            }
        });

        jTextField59.setBackground(new java.awt.Color(0, 0, 204));
        jTextField59.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField59.setForeground(new java.awt.Color(255, 255, 255));
        jTextField59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField59ActionPerformed(evt);
            }
        });

        jTextField60.setBackground(new java.awt.Color(0, 0, 204));
        jTextField60.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField60.setForeground(new java.awt.Color(255, 255, 255));
        jTextField60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField60ActionPerformed(evt);
            }
        });

        jTextField61.setBackground(new java.awt.Color(0, 0, 204));
        jTextField61.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField61.setForeground(new java.awt.Color(255, 255, 255));
        jTextField61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField61ActionPerformed(evt);
            }
        });
        jTextField61.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField61KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField61KeyTyped(evt);
            }
        });

        jTextField62.setBackground(new java.awt.Color(0, 0, 204));
        jTextField62.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField62.setForeground(new java.awt.Color(255, 255, 255));
        jTextField62.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel287, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel38Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jLabel284, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel283, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox22, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jDateChooser12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField61)
                                    .addComponent(jTextField60, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(jTextField62))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel285, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel286, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel288, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel289, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(56, 56, 56))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField58, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel283, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField59, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel284, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField60, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel285, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField61, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel286, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField62, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel287, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel288, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel289, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jComboBox22))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel290.setBackground(new java.awt.Color(255, 255, 255));
        jLabel290.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel290.setForeground(new java.awt.Color(0, 0, 0));
        jLabel290.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel290.setText("إلغاء الامر");
        jLabel290.setOpaque(true);
        jLabel290.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel290MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel290MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel290MouseExited(evt);
            }
        });

        jLabel291.setBackground(new java.awt.Color(255, 255, 255));
        jLabel291.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel291.setForeground(new java.awt.Color(0, 0, 0));
        jLabel291.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel291.setText("موافق");
        jLabel291.setOpaque(true);
        jLabel291.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel291MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel291MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel291MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel290, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel291, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel291, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel290, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout update2Layout = new javax.swing.GroupLayout(update2.getContentPane());
        update2.getContentPane().setLayout(update2Layout);
        update2Layout.setHorizontalGroup(
            update2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        update2Layout.setVerticalGroup(
            update2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel41.setBackground(new java.awt.Color(0, 0, 204));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("إسم التكلفة ");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("السعر");

        jButton4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("موافق");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField14)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField15)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout add_costLayout = new javax.swing.GroupLayout(add_cost.getContentPane());
        add_cost.getContentPane().setLayout(add_costLayout);
        add_costLayout.setHorizontalGroup(
            add_costLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        add_costLayout.setVerticalGroup(
            add_costLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel42.setBackground(new java.awt.Color(0, 0, 204));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("إسم التكلفة ");

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("السعر");

        jButton5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("موافق");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField16)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField17)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout update_costLayout = new javax.swing.GroupLayout(update_cost.getContentPane());
        update_cost.getContentPane().setLayout(update_costLayout);
        update_costLayout.setHorizontalGroup(
            update_costLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        update_costLayout.setVerticalGroup(
            update_costLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1, 600));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("رفقـــــــــــــاء الإمتيـــــــــاز");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("Categories-applications-education-school-icon.png"));
        jLabel4.setText("الإبتدائية");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 204));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("illustrator-old-school-icon.png"));
        jLabel5.setText("المتوسط");
        jLabel5.setOpaque(true);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 204));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("Categories-applications-education-university-icon.png"));
        jLabel6.setText("الثانوية");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 204));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon("My-Documents-icon.png"));
        jLabel11.setText("دروس أخرى");
        jLabel11.setOpaque(true);
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });

        jLabel91.setBackground(new java.awt.Color(0, 0, 204));
        jLabel91.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setIcon(new javax.swing.ImageIcon("1584693215601237646183914826399.jpg"));
        jLabel91.setText("السنة التحضيرية");
        jLabel91.setOpaque(true);
        jLabel91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel91MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel91MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel91MouseExited(evt);
            }
        });

        jLabel215.setBackground(new java.awt.Color(0, 0, 204));
        jLabel215.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel215.setForeground(new java.awt.Color(255, 255, 255));
        jLabel215.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel215.setIcon(new javax.swing.ImageIcon("15848009038698948731085402799543.jpg"));
        jLabel215.setText("الاساتذة");
        jLabel215.setOpaque(true);
        jLabel215.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel215MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel215MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel215MouseExited(evt);
            }
        });

        jLabel277.setBackground(new java.awt.Color(0, 0, 204));
        jLabel277.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel277.setForeground(new java.awt.Color(255, 255, 255));
        jLabel277.setIcon(new javax.swing.ImageIcon("15855817856047665272612371336844.jpg"));
        jLabel277.setText("حركة الخزينة");
        jLabel277.setOpaque(true);
        jLabel277.setHorizontalTextPosition(JLabel.CENTER);
        jLabel277.setVerticalTextPosition(JLabel.BOTTOM);
        jLabel277.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel277MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel277MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel277MouseExited(evt);
            }
        });

        jLabel65.setBackground(new java.awt.Color(0, 0, 204));
        jLabel65.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setIcon(new javax.swing.ImageIcon("settingschool.png"));
        jLabel65.setText("إعدادات");
        jLabel65.setOpaque(true);
        jLabel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel65MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel65MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel65MouseExited(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon("logout.png"));
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jLabel66.setBackground(new java.awt.Color(0, 0, 204));
        jLabel66.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setIcon(new javax.swing.ImageIcon("Calendar-icon.png"));
        jLabel66.setText("الأحداث الجارية");
        jLabel66.setOpaque(true);
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel66MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel66MouseExited(evt);
            }
        });

        jLabel94.setBackground(new java.awt.Color(0, 0, 204));
        jLabel94.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("تغـــــــــــــــــــــــــــــــــــيير كلـــــــــــــــــــمة الســـــر");
        jLabel94.setOpaque(true);
        jLabel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel94MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel94MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel94MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel277, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel11)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel215, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel277, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel66))
                .addContainerGap())
        );

        jLabel65.setHorizontalTextPosition(JLabel.CENTER);
        jLabel65.setVerticalTextPosition(JLabel.BOTTOM);

        jPanel2.add(jPanel1, "card2");

        jPanel3.setBackground(new java.awt.Color(0, 0, 204));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 204));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(0, 0, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 219, 30));

        jLayeredPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setBackground(new java.awt.Color(0, 0, 0,0));
        jLabel51.setIcon(new javax.swing.ImageIcon("search2.png"));
        jLabel51.setOpaque(true);
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });
        jLayeredPane4.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

        jTextField24.setBackground(new java.awt.Color(0, 0, 204));
        jTextField24.setForeground(new java.awt.Color(255, 255, 255));
        jTextField24.setBorder(null);
        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField24KeyReleased(evt);
            }
        });
        jLayeredPane4.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

        jList4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList4MouseClicked(evt);
            }
        });
        jLayeredPane4.add(jList4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

        jPanel5.add(jLayeredPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 350, 290));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("المادة");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 90, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1020, 220));

        jLabel21.setBackground(new java.awt.Color(0, 0, 204));
        jLabel21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
        jLabel21.setText("إضافة");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel21.setOpaque(true);
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

        jLabel22.setBackground(new java.awt.Color(0, 0, 204));
        jLabel22.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
        jLabel22.setText("حذف");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel22.setOpaque(true);
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
        });
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

        jLabel23.setBackground(new java.awt.Color(0, 0, 204));
        jLabel23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
        jLabel23.setText("دفع");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel23.setOpaque(true);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 70, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("السنــــــــة الأولـــــــــــــــــــــــــى");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

        jLabel135.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel135.setText("   بحث بالإسم");
        jPanel5.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 138, 35));

        jLabel136.setBackground(new java.awt.Color(0, 0, 204));
        jLabel136.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel136.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
        jLabel136.setText("تعديل");
        jLabel136.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel136.setOpaque(true);
        jLabel136.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel136MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel136MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel136MouseExited(evt);
            }
        });
        jPanel5.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 70, -1));

        jLabel162.setBackground(new java.awt.Color(255, 51, 0));
        jLabel162.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel162.setText("تنبيه");
        jLabel162.setOpaque(true);
        jLabel162.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel162MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

        jLabel140.setBackground(new java.awt.Color(0, 0, 51));
        jLabel140.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel140.setText("عودة");
        jLabel140.setOpaque(true);
        jLabel140.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel140MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

        jTabbedPane1.addTab("السنة الأولى", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 0, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox3.setBackground(new java.awt.Color(0, 0, 204));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
        jComboBox3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel6.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 219, 30));

        jLayeredPane5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setBackground(new java.awt.Color(0, 0, 0,0));
        jLabel52.setIcon(new javax.swing.ImageIcon("search2.png"));
        jLabel52.setOpaque(true);
        jLayeredPane5.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

        jTextField25.setBackground(new java.awt.Color(0, 0, 204));
        jTextField25.setForeground(new java.awt.Color(255, 255, 255));
        jTextField25.setBorder(null);
        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField25KeyReleased(evt);
            }
        });
        jLayeredPane5.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

        jList5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList5MouseClicked(evt);
            }
        });
        jLayeredPane5.add(jList5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

        jPanel6.add(jLayeredPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 350, 330));

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("   بحث بالإسم");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 138, 35));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1020, 250));

        jLabel27.setBackground(new java.awt.Color(0, 0, 204));
        jLabel27.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
        jLabel27.setText("إضافة");
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel27.setOpaque(true);
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

        jLabel28.setBackground(new java.awt.Color(0, 0, 204));
        jLabel28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
        jLabel28.setText("حذف");
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel28.setOpaque(true);
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel28MouseExited(evt);
            }
        });
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

        jLabel29.setBackground(new java.awt.Color(0, 0, 204));
        jLabel29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
        jLabel29.setText("تعديل");
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel29.setOpaque(true);
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel29MouseExited(evt);
            }
        });
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 70, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("السنــــــــة الثانيـــــــــــــــــــــــــة");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

        jLabel163.setBackground(new java.awt.Color(255, 51, 0));
        jLabel163.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(255, 255, 255));
        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel163.setText("تنبيه");
        jLabel163.setOpaque(true);
        jLabel163.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel163MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

        jLabel142.setBackground(new java.awt.Color(0, 0, 51));
        jLabel142.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel142.setText("عودة");
        jLabel142.setOpaque(true);
        jLabel142.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel142MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

        jLabel72.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("المادة");
        jPanel6.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 90, -1));

        jLabel82.setBackground(new java.awt.Color(0, 0, 204));
        jLabel82.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
        jLabel82.setText("دفع");
        jLabel82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel82.setOpaque(true);
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel82MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel82MouseExited(evt);
            }
        });
        jPanel6.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 70, -1));

        jTabbedPane1.addTab("السنة الثانية", jPanel6);

        jPanel7.setBackground(new java.awt.Color(0, 0, 204));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
        jComboBox4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox4PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel7.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 219, 30));

        jLayeredPane6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setBackground(new java.awt.Color(0, 0, 0,0));
        jLabel53.setIcon(new javax.swing.ImageIcon("search2.png"));
        jLabel53.setOpaque(true);
        jLayeredPane6.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

        jTextField26.setBackground(new java.awt.Color(0, 0, 204));
        jTextField26.setForeground(new java.awt.Color(255, 255, 255));
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setBorder(null);
        jTextField26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField26KeyReleased(evt);
            }
        });
        jLayeredPane6.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

        jList6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList6MouseClicked(evt);
            }
        });
        jLayeredPane6.add(jList6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

        jPanel7.add(jLayeredPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 350, 330));

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("   بحث بالإسم");
        jPanel7.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 138, 35));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1020, 260));

        jLabel33.setBackground(new java.awt.Color(0, 0, 204));
        jLabel33.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
        jLabel33.setText("إضافة");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel33.setOpaque(true);
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });
        jPanel7.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

        jLabel34.setBackground(new java.awt.Color(0, 0, 204));
        jLabel34.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
        jLabel34.setText("حذف");
        jLabel34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel34.setOpaque(true);
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel34MouseExited(evt);
            }
        });
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

        jLabel35.setBackground(new java.awt.Color(0, 0, 204));
        jLabel35.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
        jLabel35.setText("تعديل");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel35.setOpaque(true);
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel35MouseExited(evt);
            }
        });
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 70, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("السنــــــــة الثـــــــــــــــــــــالثة");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

        jLabel83.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("المادة");
        jPanel7.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 90, 30));

        jLabel84.setBackground(new java.awt.Color(0, 0, 204));
        jLabel84.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
        jLabel84.setText("دفع");
        jLabel84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel84.setOpaque(true);
        jLabel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel84MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel84MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel84MouseExited(evt);
            }
        });
        jPanel7.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 70, -1));

        jLabel165.setBackground(new java.awt.Color(255, 51, 0));
        jLabel165.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(255, 255, 255));
        jLabel165.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel165.setText("تنبيه");
        jLabel165.setOpaque(true);
        jLabel165.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel165MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

        jLabel143.setBackground(new java.awt.Color(0, 0, 51));
        jLabel143.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel143.setText("عودة");
        jLabel143.setOpaque(true);
        jLabel143.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel143MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

        jTabbedPane1.addTab("السنة الثالثة", jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 0, 204));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
        jComboBox5.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox5PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel8.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 219, 30));

        jLayeredPane7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setBackground(new java.awt.Color(0, 0, 0,0));
        jLabel54.setIcon(new javax.swing.ImageIcon("search2.png"));
        jLabel54.setOpaque(true);
        jLayeredPane7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

        jTextField27.setBackground(new java.awt.Color(0, 0, 204));
        jTextField27.setForeground(new java.awt.Color(255, 255, 255));
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setBorder(null);
        jTextField27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField27KeyReleased(evt);
            }
        });
        jLayeredPane7.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

        jList7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList7MouseClicked(evt);
            }
        });
        jLayeredPane7.add(jList7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

        jPanel8.add(jLayeredPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 340, 330));

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("   بحث بالإسم");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 138, 35));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1020, 240));

        jLabel39.setBackground(new java.awt.Color(0, 0, 204));
        jLabel39.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel39.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
        jLabel39.setText("إضافة");
        jLabel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel39.setOpaque(true);
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel39MouseExited(evt);
            }
        });
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

        jLabel40.setBackground(new java.awt.Color(0, 0, 204));
        jLabel40.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel40.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
        jLabel40.setText("حذف");
        jLabel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel40.setOpaque(true);
        jLabel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel40MouseExited(evt);
            }
        });
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

        jLabel41.setBackground(new java.awt.Color(0, 0, 204));
        jLabel41.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel41.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
        jLabel41.setText("تعديل");
        jLabel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel41.setOpaque(true);
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel41MouseExited(evt);
            }
        });
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 70, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("السنــــــــة الرابـــــــــــــــــعة");
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

        jLabel73.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("المادة");
        jPanel8.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 110, 90, 30));

        jLabel74.setBackground(new java.awt.Color(0, 0, 204));
        jLabel74.setHorizontalTextPosition(SwingConstants.LEADING);
        jLabel74.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
        jLabel74.setText("دفع");
        jLabel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel74.setOpaque(true);
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel74MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel74MouseExited(evt);
            }
        });
        jPanel8.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 70, -1));

        jLabel166.setBackground(new java.awt.Color(255, 51, 0));
        jLabel166.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel166.setText("تنبيه");
        jLabel166.setOpaque(true);
        jLabel166.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel166MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

        jLabel144.setBackground(new java.awt.Color(0, 0, 51));
        jLabel144.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("عودة");
        jLabel144.setOpaque(true);
        jLabel144.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel144MouseClicked(evt);
            }
        });
        jPanel8.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

        jTabbedPane1.addTab("السنة الرابعة", jPanel8);

        jLabel164.setBackground(new java.awt.Color(0, 0, 204));
        jLabel164.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(255, 255, 255));
        jLabel164.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel164.setIcon(new javax.swing.ImageIcon("2-Hot-Home-icon.png"));
        jLabel164.setText("عودة");
        jLabel164.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel164.setOpaque(true);
        jLabel164.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel164MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel164MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel164MouseExited(evt);
            }
        });

        jLabel298.setBackground(new java.awt.Color(0, 0, 204));
        jLabel298.setText("jLabel298");
        jLabel298.setOpaque(true);
        jLabel298.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel298MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel298MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel298MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel164, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel298, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel164, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel298, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        jPanel2.add(jPanel3, "card3");

        jPanel4.setBackground(new java.awt.Color(0, 0, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 219, 30));

        jLayeredPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setBackground(new java.awt.Color(0, 0, 0,0));
        jLabel50.setIcon(new javax.swing.ImageIcon("search2.png"));
        jLabel50.setOpaque(true);
        jLayeredPane3.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

        jTextField23.setBackground(new java.awt.Color(0, 0, 204));
        jTextField23.setForeground(new java.awt.Color(255, 255, 255));
        jTextField23.setBorder(null);
        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField23KeyReleased(evt);
            }
        });
        jLayeredPane3.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

        jList3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jLayeredPane3.add(jList3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

        jPanel4.add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 350, 390));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("   بحث بالإسم");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 80, 138, 35));

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }};
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jTable1.setRowHeight(20);
            jTable1.getTableHeader().setResizingAllowed(false);
            jTable1.getTableHeader().setReorderingAllowed(false);
            jScrollPane1.setViewportView(jTable1);

            jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1020, 310));

            jLabel15.setBackground(new java.awt.Color(0, 0, 204));
            jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel15.setForeground(new java.awt.Color(255, 255, 255));
            jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel15.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel15.setText("إضافة");
            jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel15.setOpaque(true);
            jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel15MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel15MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel15MouseExited(evt);
                }
            });
            jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, 70, -1));

            jLabel16.setBackground(new java.awt.Color(0, 0, 204));
            jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel16.setForeground(new java.awt.Color(255, 255, 255));
            jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel16.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel16.setText("حذف");
            jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel16.setOpaque(true);
            jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel16MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel16MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel16MouseExited(evt);
                }
            });
            jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 70, -1));

            jLabel17.setBackground(new java.awt.Color(0, 0, 204));
            jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel17.setForeground(new java.awt.Color(255, 255, 255));
            jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel17.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel17.setText("تعديل");
            jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel17.setOpaque(true);
            jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel17MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel17MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel17MouseExited(evt);
                }
            });
            jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 70, -1));

            jLabel139.setBackground(new java.awt.Color(0, 0, 51));
            jLabel139.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel139.setForeground(new java.awt.Color(255, 255, 255));
            jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel139.setText("عودة");
            jLabel139.setOpaque(true);
            jLabel139.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel139MouseClicked(evt);
                }
            });
            jPanel4.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 120, -1));

            jLabel141.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel141.setForeground(new java.awt.Color(255, 255, 255));
            jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel141.setText("المواد");
            jPanel4.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 80, 30));

            jLabel146.setBackground(new java.awt.Color(255, 51, 0));
            jLabel146.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel146.setForeground(new java.awt.Color(255, 255, 255));
            jLabel146.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel146.setText("تنبيه");
            jLabel146.setOpaque(true);
            jLabel146.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel146MouseClicked(evt);
                }
            });
            jPanel4.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 120, 30));

            jLabel147.setBackground(new java.awt.Color(0, 0, 204));
            jLabel147.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel147.setForeground(new java.awt.Color(255, 255, 255));
            jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel147.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel147.setText("دفع");
            jLabel147.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel147.setOpaque(true);
            jLabel147.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel147MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel147MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel147MouseExited(evt);
                }
            });
            jPanel4.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 70, -1));

            jLabel152.setBackground(new java.awt.Color(0, 0, 204));
            jLabel152.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel152.setForeground(new java.awt.Color(255, 255, 255));
            jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel152.setIcon(new javax.swing.ImageIcon("2-Hot-Home-icon.png"));
            jLabel152.setText("عودة");
            jLabel152.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel152.setOpaque(true);
            jLabel152.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel152MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel152MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel152MouseExited(evt);
                }
            });
            jPanel4.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

            jLabel297.setBackground(new java.awt.Color(0, 0, 204));
            jLabel297.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel297.setForeground(new java.awt.Color(255, 255, 255));
            jLabel297.setIcon(new javax.swing.ImageIcon("Excel-icon.png"));
            jLabel297.setText("تحويل إلى ملف excel");
            jLabel297.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel297.setOpaque(true);
            jLabel297.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel297MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel297MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel297MouseExited(evt);
                }
            });
            jPanel4.add(jLabel297, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 190, 40));

            jPanel2.add(jPanel4, "card4");

            jPanel9.setBackground(new java.awt.Color(0, 0, 204));

            jPanel10.setBackground(new java.awt.Color(0, 0, 204));
            jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox6.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox6PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jComboBox6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox6ActionPerformed(evt);
                }
            });
            jPanel10.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 219, 30));

            jLayeredPane8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel55.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel55.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel55.setOpaque(true);
            jLabel55.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jLabel55KeyReleased(evt);
                }
            });
            jLayeredPane8.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField28.setBackground(new java.awt.Color(0, 0, 204));
            jTextField28.setForeground(new java.awt.Color(255, 255, 255));
            jTextField28.setBorder(null);
            jTextField28.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField28KeyReleased(evt);
                }
            });
            jLayeredPane8.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList8.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList8MouseClicked(evt);
                }
            });
            jLayeredPane8.add(jList8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel10.add(jLayeredPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 350, 290));

            jLabel42.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel42.setForeground(new java.awt.Color(255, 255, 255));
            jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel42.setText("   بحث بالإسم");
            jPanel10.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 138, 35));

            jTable6.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane6.setViewportView(jTable6);

            jPanel10.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 1020, 220));

            jLabel45.setBackground(new java.awt.Color(0, 0, 204));
            jLabel45.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel45.setForeground(new java.awt.Color(255, 255, 255));
            jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel45.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel45.setText("إضافة");
            jLabel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel45.setOpaque(true);
            jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel45MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel45MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel45MouseExited(evt);
                }
            });
            jPanel10.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel46.setBackground(new java.awt.Color(0, 0, 204));
            jLabel46.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel46.setForeground(new java.awt.Color(255, 255, 255));
            jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel46.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel46.setText("حذف");
            jLabel46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel46.setOpaque(true);
            jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel46MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel46MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel46MouseExited(evt);
                }
            });
            jPanel10.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel47.setBackground(new java.awt.Color(0, 0, 204));
            jLabel47.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel47.setForeground(new java.awt.Color(255, 255, 255));
            jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel47.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel47.setText("تعديل");
            jLabel47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel47.setOpaque(true);
            jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel47MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel47MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel47MouseExited(evt);
                }
            });
            jPanel10.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 70, -1));

            jLabel48.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel48.setForeground(new java.awt.Color(255, 255, 255));
            jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel48.setText("السنــــــــة الأولـــــــــــــــــــــــــى");
            jLabel48.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel10.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel85.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel85.setForeground(new java.awt.Color(255, 255, 255));
            jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel85.setText("المادة");
            jPanel10.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 90, 30));

            jLabel86.setBackground(new java.awt.Color(0, 0, 204));
            jLabel86.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel86.setForeground(new java.awt.Color(255, 255, 255));
            jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel86.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel86.setText("دفع");
            jLabel86.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel86.setOpaque(true);
            jLabel86.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel86MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel86MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel86MouseExited(evt);
                }
            });
            jPanel10.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 70, -1));

            jLabel145.setBackground(new java.awt.Color(0, 0, 51));
            jLabel145.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel145.setForeground(new java.awt.Color(255, 255, 255));
            jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel145.setText("عودة");
            jLabel145.setOpaque(true);
            jLabel145.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel145MouseClicked(evt);
                }
            });
            jPanel10.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 120, -1));

            jLabel168.setBackground(new java.awt.Color(255, 51, 0));
            jLabel168.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel168.setForeground(new java.awt.Color(255, 255, 255));
            jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel168.setText("تنبيه");
            jLabel168.setOpaque(true);
            jLabel168.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel168MouseClicked(evt);
                }
            });
            jPanel10.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 120, 30));

            jTabbedPane2.addTab("السنة الأولى", jPanel10);

            jPanel11.setBackground(new java.awt.Color(0, 0, 204));
            jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox7.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox7PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jPanel11.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 219, 30));

            jLayeredPane9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel56.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel56.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel56.setOpaque(true);
            jLayeredPane9.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField29.setBackground(new java.awt.Color(0, 0, 204));
            jTextField29.setForeground(new java.awt.Color(255, 255, 255));
            jTextField29.setBorder(null);
            jTextField29.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField29KeyReleased(evt);
                }
            });
            jLayeredPane9.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 8, 180, 30));

            jList9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList9.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList9MouseClicked(evt);
                }
            });
            jLayeredPane9.add(jList9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel11.add(jLayeredPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 350, 330));

            jLabel49.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel49.setForeground(new java.awt.Color(255, 255, 255));
            jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel49.setText("   بحث بالإسم");
            jPanel11.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 120, 35));

            jTable7.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane7.setViewportView(jTable7);

            jPanel11.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1020, 270));

            jLabel59.setBackground(new java.awt.Color(0, 0, 204));
            jLabel59.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel59.setForeground(new java.awt.Color(255, 255, 255));
            jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel59.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel59.setText("إضافة");
            jLabel59.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel59.setOpaque(true);
            jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel59MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel59MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel59MouseExited(evt);
                }
            });
            jPanel11.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel60.setBackground(new java.awt.Color(0, 0, 204));
            jLabel60.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel60.setForeground(new java.awt.Color(255, 255, 255));
            jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel60.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel60.setText("حذف");
            jLabel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel60.setOpaque(true);
            jLabel60.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel60MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel60MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel60MouseExited(evt);
                }
            });
            jPanel11.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel61.setBackground(new java.awt.Color(0, 0, 204));
            jLabel61.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel61.setForeground(new java.awt.Color(255, 255, 255));
            jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel61.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel61.setText("تعديل");
            jLabel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel61.setOpaque(true);
            jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel61MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel61MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel61MouseExited(evt);
                }
            });
            jPanel11.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 70, -1));

            jLabel62.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel62.setForeground(new java.awt.Color(255, 255, 255));
            jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel62.setText("السنــــــــة الثانيـــــــــــــــــــــــــة");
            jLabel62.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel11.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel87.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel87.setForeground(new java.awt.Color(255, 255, 255));
            jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel87.setText("المادة");
            jPanel11.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 100, 30));

            jLabel88.setBackground(new java.awt.Color(0, 0, 204));
            jLabel88.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel88.setForeground(new java.awt.Color(255, 255, 255));
            jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel88.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel88.setText("دفع");
            jLabel88.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel88.setOpaque(true);
            jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel88MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel88MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel88MouseExited(evt);
                }
            });
            jPanel11.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 70, -1));

            jLabel169.setBackground(new java.awt.Color(0, 0, 51));
            jLabel169.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel169.setForeground(new java.awt.Color(255, 255, 255));
            jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel169.setText("عودة");
            jLabel169.setOpaque(true);
            jLabel169.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel169MouseClicked(evt);
                }
            });
            jPanel11.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 120, -1));

            jLabel170.setBackground(new java.awt.Color(255, 51, 0));
            jLabel170.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel170.setForeground(new java.awt.Color(255, 255, 255));
            jLabel170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel170.setText("تنبيه");
            jLabel170.setOpaque(true);
            jLabel170.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel170MouseClicked(evt);
                }
            });
            jPanel11.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 120, 30));

            jTabbedPane2.addTab("السنة الثانية", jPanel11);

            jPanel12.setBackground(new java.awt.Color(0, 0, 204));
            jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox8.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox8PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jPanel12.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 219, 30));

            jLayeredPane10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel63.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel63.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel63.setOpaque(true);
            jLayeredPane10.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField30.setBackground(new java.awt.Color(0, 0, 204));
            jTextField30.setForeground(new java.awt.Color(255, 255, 255));
            jTextField30.setBorder(null);
            jTextField30.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField30KeyReleased(evt);
                }
            });
            jLayeredPane10.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList10.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList10MouseClicked(evt);
                }
            });
            jLayeredPane10.add(jList10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel12.add(jLayeredPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 350, 330));

            jLabel64.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel64.setForeground(new java.awt.Color(255, 255, 255));
            jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel64.setText("   بحث بالإسم");
            jPanel12.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, 120, 35));

            jTable8.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane8.setViewportView(jTable8);

            jPanel12.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1020, 260));

            jLabel67.setBackground(new java.awt.Color(0, 0, 204));
            jLabel67.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel67.setForeground(new java.awt.Color(255, 255, 255));
            jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel67.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel67.setText("إضافة");
            jLabel67.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel67.setOpaque(true);
            jLabel67.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel67MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel67MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel67MouseExited(evt);
                }
            });
            jPanel12.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel68.setBackground(new java.awt.Color(0, 0, 204));
            jLabel68.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel68.setForeground(new java.awt.Color(255, 255, 255));
            jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel68.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel68.setText("حذف");
            jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel68.setOpaque(true);
            jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel68MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel68MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel68MouseExited(evt);
                }
            });
            jPanel12.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel69.setBackground(new java.awt.Color(0, 0, 204));
            jLabel69.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel69.setForeground(new java.awt.Color(255, 255, 255));
            jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel69.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel69.setText("تعديل");
            jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel69.setOpaque(true);
            jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel69MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel69MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel69MouseExited(evt);
                }
            });
            jPanel12.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 70, -1));

            jLabel70.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel70.setForeground(new java.awt.Color(255, 255, 255));
            jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel70.setText("السنــــــــة الثـــــــــــــــــــــالثة");
            jLabel70.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel12.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel89.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel89.setForeground(new java.awt.Color(255, 255, 255));
            jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel89.setText("المادة");
            jPanel12.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 80, 30));

            jLabel90.setBackground(new java.awt.Color(0, 0, 204));
            jLabel90.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel90.setForeground(new java.awt.Color(255, 255, 255));
            jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel90.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel90.setText("دفع");
            jLabel90.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel90.setOpaque(true);
            jLabel90.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel90MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel90MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel90MouseExited(evt);
                }
            });
            jPanel12.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 70, -1));

            jLabel171.setBackground(new java.awt.Color(255, 51, 0));
            jLabel171.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel171.setForeground(new java.awt.Color(255, 255, 255));
            jLabel171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel171.setText("تنبيه");
            jLabel171.setOpaque(true);
            jLabel171.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel171MouseClicked(evt);
                }
            });
            jPanel12.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 120, 30));

            jLabel172.setBackground(new java.awt.Color(0, 0, 51));
            jLabel172.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel172.setForeground(new java.awt.Color(255, 255, 255));
            jLabel172.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel172.setText("عودة");
            jLabel172.setOpaque(true);
            jLabel172.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel172MouseClicked(evt);
                }
            });
            jPanel12.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 120, -1));

            jTabbedPane2.addTab("السنة الثالثة", jPanel12);

            jLabel167.setBackground(new java.awt.Color(0, 0, 204));
            jLabel167.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel167.setForeground(new java.awt.Color(255, 255, 255));
            jLabel167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel167.setIcon(new javax.swing.ImageIcon("2-Hot-Home-icon.png"));
            jLabel167.setText("عودة");
            jLabel167.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel167.setOpaque(true);
            jLabel167.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel167MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel167MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel167MouseExited(evt);
                }
            });

            jLabel121.setText("jLabel112");
            jLabel121.setOpaque(true);
            jLabel121.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel121MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel121MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel121MouseExited(evt);
                }
            });

            javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
            jPanel9.setLayout(jPanel9Layout);
            jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane2)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(62, 62, 62))
            );
            jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel167, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(10, 10, 10)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGap(0, 0, 0))
            );

            jPanel2.add(jPanel9, "card5");

            jPanel15.setBackground(new java.awt.Color(0, 0, 204));

            jTabbedPane3.setBackground(new java.awt.Color(0, 0, 204));
            jTabbedPane3.setForeground(new java.awt.Color(0, 0, 0));
            jTabbedPane3.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTabbedPane3MouseClicked(evt);
                }
            });

            jPanel16.setBackground(new java.awt.Color(0, 0, 204));
            jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox10.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox10PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jComboBox10.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox10ActionPerformed(evt);
                }
            });
            jPanel16.add(jComboBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 219, 30));

            jLabel92.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel92.setForeground(new java.awt.Color(255, 255, 255));
            jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel92.setText("المادة");
            jPanel16.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 90, 30));

            jLayeredPane16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel127.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel127.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel127.setOpaque(true);
            jLayeredPane16.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField37.setBackground(new java.awt.Color(0, 0, 204));
            jTextField37.setForeground(new java.awt.Color(255, 255, 255));
            jTextField37.setBorder(null);
            jTextField37.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField37KeyReleased(evt);
                }
            });
            jLayeredPane16.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList16.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList16MouseClicked(evt);
                }
            });
            jLayeredPane16.add(jList16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel16.add(jLayeredPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 350, 270));

            jTable9.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane9.setViewportView(jTable9);

            jPanel16.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1020, 220));

            jLabel95.setBackground(new java.awt.Color(0, 0, 204));
            jLabel95.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel95.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel95.setForeground(new java.awt.Color(255, 255, 255));
            jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel95.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel95.setText("إضافة");
            jLabel95.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel95.setOpaque(true);
            jLabel95.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel95MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel95MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel95MouseExited(evt);
                }
            });
            jPanel16.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel96.setBackground(new java.awt.Color(0, 0, 204));
            jLabel96.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel96.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel96.setForeground(new java.awt.Color(255, 255, 255));
            jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel96.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel96.setText("حذف");
            jLabel96.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel96.setOpaque(true);
            jLabel96.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel96MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel96MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel96MouseExited(evt);
                }
            });
            jPanel16.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel97.setBackground(new java.awt.Color(0, 0, 204));
            jLabel97.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel97.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel97.setForeground(new java.awt.Color(255, 255, 255));
            jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel97.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel97.setText("دفع");
            jLabel97.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel97.setOpaque(true);
            jLabel97.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel97MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel97MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel97MouseExited(evt);
                }
            });
            jPanel16.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 70, -1));

            jLabel98.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel98.setForeground(new java.awt.Color(255, 255, 255));
            jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel98.setText("السنــــــــة الأولـــــــــــــــــــــــــى");
            jLabel98.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel16.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel137.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel137.setForeground(new java.awt.Color(255, 255, 255));
            jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel137.setText("   بحث بالإسم");
            jPanel16.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 138, 35));

            jLabel138.setBackground(new java.awt.Color(0, 0, 204));
            jLabel138.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel138.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel138.setForeground(new java.awt.Color(255, 255, 255));
            jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel138.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel138.setText("تعديل");
            jLabel138.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel138.setOpaque(true);
            jLabel138.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel138MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel138MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel138MouseExited(evt);
                }
            });
            jPanel16.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 70, -1));

            jLabel173.setBackground(new java.awt.Color(255, 51, 0));
            jLabel173.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel173.setForeground(new java.awt.Color(255, 255, 255));
            jLabel173.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel173.setText("تنبيه");
            jLabel173.setOpaque(true);
            jLabel173.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel173MouseClicked(evt);
                }
            });
            jPanel16.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

            jLabel174.setBackground(new java.awt.Color(0, 0, 51));
            jLabel174.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel174.setForeground(new java.awt.Color(255, 255, 255));
            jLabel174.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel174.setText("عودة");
            jLabel174.setOpaque(true);
            jLabel174.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel174MouseClicked(evt);
                }
            });
            jPanel16.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

            jTabbedPane3.addTab("السنة الأولى", jPanel16);

            jPanel17.setBackground(new java.awt.Color(0, 0, 204));
            jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox11.setBackground(new java.awt.Color(0, 0, 204));
            jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox11.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox11PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jPanel17.add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 219, 30));

            jLayeredPane12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel99.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel99.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel99.setOpaque(true);
            jLayeredPane12.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField32.setBackground(new java.awt.Color(0, 0, 204));
            jTextField32.setForeground(new java.awt.Color(255, 255, 255));
            jTextField32.setBorder(null);
            jTextField32.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField32KeyReleased(evt);
                }
            });
            jLayeredPane12.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList12.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList12MouseClicked(evt);
                }
            });
            jLayeredPane12.add(jList12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel17.add(jLayeredPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 350, 330));

            jLabel100.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel100.setForeground(new java.awt.Color(255, 255, 255));
            jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel100.setText("   بحث بالإسم");
            jPanel17.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 138, 35));

            jTable10.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane10.setViewportView(jTable10);

            jPanel17.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1020, 250));

            jLabel103.setBackground(new java.awt.Color(0, 0, 204));
            jLabel103.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel103.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel103.setForeground(new java.awt.Color(255, 255, 255));
            jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel103.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel103.setText("إضافة");
            jLabel103.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel103.setOpaque(true);
            jLabel103.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel103MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel103MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel103MouseExited(evt);
                }
            });
            jPanel17.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel104.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel104.setBackground(new java.awt.Color(0, 0, 204));
            jLabel104.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel104.setForeground(new java.awt.Color(255, 255, 255));
            jLabel104.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel104.setText("حذف");
            jLabel104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel104.setOpaque(true);
            jLabel104.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel104MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel104MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel104MouseExited(evt);
                }
            });
            jPanel17.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel105.setBackground(new java.awt.Color(0, 0, 204));
            jLabel105.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel105.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel105.setForeground(new java.awt.Color(255, 255, 255));
            jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel105.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel105.setText("تعديل");
            jLabel105.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel105.setOpaque(true);
            jLabel105.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel105MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel105MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel105MouseExited(evt);
                }
            });
            jPanel17.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 70, -1));

            jLabel106.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel106.setForeground(new java.awt.Color(255, 255, 255));
            jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel106.setText("السنــــــــة الثانيـــــــــــــــــــــــــة");
            jLabel106.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel17.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel175.setBackground(new java.awt.Color(255, 51, 0));
            jLabel175.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel175.setForeground(new java.awt.Color(255, 255, 255));
            jLabel175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel175.setText("تنبيه");
            jLabel175.setOpaque(true);
            jLabel175.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel175MouseClicked(evt);
                }
            });
            jPanel17.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

            jLabel176.setBackground(new java.awt.Color(0, 0, 51));
            jLabel176.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel176.setForeground(new java.awt.Color(255, 255, 255));
            jLabel176.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel176.setText("عودة");
            jLabel176.setOpaque(true);
            jLabel176.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel176MouseClicked(evt);
                }
            });
            jPanel17.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

            jLabel107.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel107.setForeground(new java.awt.Color(255, 255, 255));
            jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel107.setText("المادة");
            jPanel17.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 90, -1));

            jLabel108.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel108.setBackground(new java.awt.Color(0, 0, 204));
            jLabel108.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel108.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel108.setForeground(new java.awt.Color(255, 255, 255));
            jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel108.setText("دفع");
            jLabel108.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel108.setOpaque(true);
            jLabel108.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel108MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel108MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel108MouseExited(evt);
                }
            });
            jPanel17.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 70, -1));

            jTabbedPane3.addTab("السنة الثانية", jPanel17);

            jPanel18.setBackground(new java.awt.Color(0, 0, 204));
            jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox12.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox12PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jComboBox12.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox12ActionPerformed(evt);
                }
            });
            jPanel18.add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 219, 30));

            jLayeredPane13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel109.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel109.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel109.setOpaque(true);
            jLayeredPane13.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField33.setBackground(new java.awt.Color(0, 0, 204));
            jTextField33.setForeground(new java.awt.Color(255, 255, 255));
            jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            jTextField33.setBorder(null);
            jTextField33.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField33KeyReleased(evt);
                }
            });
            jLayeredPane13.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList13.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList13MouseClicked(evt);
                }
            });
            jLayeredPane13.add(jList13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel18.add(jLayeredPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 350, 330));

            jLabel110.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel110.setForeground(new java.awt.Color(255, 255, 255));
            jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel110.setText("   بحث بالإسم");
            jPanel18.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 138, 35));

            jTable11.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane11.setViewportView(jTable11);

            jPanel18.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1020, 260));

            jLabel113.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel113.setBackground(new java.awt.Color(0, 0, 204));
            jLabel113.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel113.setForeground(new java.awt.Color(255, 255, 255));
            jLabel113.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel113.setText("إضافة");
            jLabel113.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel113.setOpaque(true);
            jLabel113.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel113MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel113MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel113MouseExited(evt);
                }
            });
            jPanel18.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel114.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel114.setBackground(new java.awt.Color(0, 0, 204));
            jLabel114.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel114.setForeground(new java.awt.Color(255, 255, 255));
            jLabel114.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel114.setText("حذف");
            jLabel114.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel114.setOpaque(true);
            jLabel114.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel114MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel114MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel114MouseExited(evt);
                }
            });
            jPanel18.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel115.setBackground(new java.awt.Color(0, 0, 204));
            jLabel115.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel115.setForeground(new java.awt.Color(255, 255, 255));
            jLabel115.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel115.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel115.setText("تعديل");
            jLabel115.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel115.setOpaque(true);
            jLabel115.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel115MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel115MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel115MouseExited(evt);
                }
            });
            jPanel18.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 70, -1));

            jLabel116.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel116.setForeground(new java.awt.Color(255, 255, 255));
            jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel116.setText("السنــــــــة الثـــــــــــــــــــــالثة");
            jLabel116.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel18.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel117.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel117.setForeground(new java.awt.Color(255, 255, 255));
            jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel117.setText("المادة");
            jPanel18.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 90, 30));

            jLabel118.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel118.setBackground(new java.awt.Color(0, 0, 204));
            jLabel118.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel118.setForeground(new java.awt.Color(255, 255, 255));
            jLabel118.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel118.setText("دفع");
            jLabel118.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel118.setOpaque(true);
            jLabel118.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel118MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel118MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel118MouseExited(evt);
                }
            });
            jPanel18.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 70, -1));

            jLabel177.setBackground(new java.awt.Color(255, 51, 0));
            jLabel177.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel177.setForeground(new java.awt.Color(255, 255, 255));
            jLabel177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel177.setText("تنبيه");
            jLabel177.setOpaque(true);
            jLabel177.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel177MouseClicked(evt);
                }
            });
            jPanel18.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

            jLabel178.setBackground(new java.awt.Color(0, 0, 51));
            jLabel178.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel178.setForeground(new java.awt.Color(255, 255, 255));
            jLabel178.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel178.setText("عودة");
            jLabel178.setOpaque(true);
            jLabel178.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel178MouseClicked(evt);
                }
            });
            jPanel18.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

            jTabbedPane3.addTab("السنة الثالثة", jPanel18);

            jPanel19.setBackground(new java.awt.Color(0, 0, 204));
            jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox13.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox13PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jPanel19.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 219, 30));

            jLayeredPane14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel119.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel119.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel119.setOpaque(true);
            jLayeredPane14.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField34.setBackground(new java.awt.Color(0, 0, 204));
            jTextField34.setForeground(new java.awt.Color(255, 255, 255));
            jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            jTextField34.setBorder(null);
            jTextField34.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField34KeyReleased(evt);
                }
            });
            jLayeredPane14.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList14.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList14MouseClicked(evt);
                }
            });
            jLayeredPane14.add(jList14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel19.add(jLayeredPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 340, 330));

            jLabel120.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel120.setForeground(new java.awt.Color(255, 255, 255));
            jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel120.setText("   بحث بالإسم");
            jPanel19.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 138, 35));

            jTable12.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane12.setViewportView(jTable12);

            jPanel19.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1020, 240));

            jLabel123.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel123.setBackground(new java.awt.Color(0, 0, 204));
            jLabel123.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel123.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel123.setForeground(new java.awt.Color(255, 255, 255));
            jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel123.setText("إضافة");
            jLabel123.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel123.setOpaque(true);
            jLabel123.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel123MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel123MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel123MouseExited(evt);
                }
            });
            jPanel19.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel124.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel124.setBackground(new java.awt.Color(0, 0, 204));
            jLabel124.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel124.setForeground(new java.awt.Color(255, 255, 255));
            jLabel124.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel124.setText("حذف");
            jLabel124.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel124.setOpaque(true);
            jLabel124.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel124MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel124MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel124MouseExited(evt);
                }
            });
            jPanel19.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel125.setBackground(new java.awt.Color(0, 0, 204));
            jLabel125.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel125.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel125.setForeground(new java.awt.Color(255, 255, 255));
            jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel125.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel125.setText("تعديل");
            jLabel125.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel125.setOpaque(true);
            jLabel125.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel125MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel125MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel125MouseExited(evt);
                }
            });
            jPanel19.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 70, -1));

            jLabel126.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel126.setForeground(new java.awt.Color(255, 255, 255));
            jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel126.setText("السنــــــــة الرابـــــــــــــــــعة");
            jLabel126.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel19.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel179.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel179.setForeground(new java.awt.Color(255, 255, 255));
            jLabel179.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel179.setText("المادة");
            jPanel19.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 110, 90, 30));

            jLabel180.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel180.setBackground(new java.awt.Color(0, 0, 204));
            jLabel180.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel180.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel180.setForeground(new java.awt.Color(255, 255, 255));
            jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel180.setText("دفع");
            jLabel180.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel180.setOpaque(true);
            jLabel180.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel180MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel180MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel180MouseExited(evt);
                }
            });
            jPanel19.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 70, -1));

            jLabel181.setBackground(new java.awt.Color(255, 51, 0));
            jLabel181.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel181.setForeground(new java.awt.Color(255, 255, 255));
            jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel181.setText("تنبيه");
            jLabel181.setOpaque(true);
            jLabel181.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel181MouseClicked(evt);
                }
            });
            jPanel19.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

            jLabel182.setBackground(new java.awt.Color(0, 0, 51));
            jLabel182.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel182.setForeground(new java.awt.Color(255, 255, 255));
            jLabel182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel182.setText("عودة");
            jLabel182.setOpaque(true);
            jLabel182.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel182MouseClicked(evt);
                }
            });
            jPanel19.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

            jTabbedPane3.addTab("السنة الرابعة", jPanel19);

            jPanel20.setBackground(new java.awt.Color(0, 0, 204));
            jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox14.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox14PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jComboBox14.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox14ActionPerformed(evt);
                }
            });
            jPanel20.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 219, 30));

            jLabel185.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel185.setForeground(new java.awt.Color(255, 255, 255));
            jLabel185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel185.setText("المادة");
            jPanel20.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 90, 30));

            jLayeredPane17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel128.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel128.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel128.setOpaque(true);
            jLayeredPane17.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField38.setBackground(new java.awt.Color(0, 0, 204));
            jTextField38.setForeground(new java.awt.Color(255, 255, 255));
            jTextField38.setBorder(null);
            jTextField38.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField38KeyReleased(evt);
                }
            });
            jLayeredPane17.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList17.setDragEnabled(true);
            jList17.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList17MouseClicked(evt);
                }
            });
            jLayeredPane17.add(jList17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel20.add(jLayeredPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 350, 270));

            jTable13.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jTable13.getTableHeader().setResizingAllowed(false);
            jTable13.getTableHeader().setReorderingAllowed(false);
            jScrollPane13.setViewportView(jTable13);

            jPanel20.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1020, 220));

            jLabel188.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel188.setBackground(new java.awt.Color(0, 0, 204));
            jLabel188.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel188.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel188.setForeground(new java.awt.Color(255, 255, 255));
            jLabel188.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel188.setText("إضافة");
            jLabel188.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel188.setOpaque(true);
            jLabel188.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel188MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel188MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel188MouseExited(evt);
                }
            });
            jPanel20.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel189.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel189.setBackground(new java.awt.Color(0, 0, 204));
            jLabel189.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel189.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel189.setForeground(new java.awt.Color(255, 255, 255));
            jLabel189.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel189.setText("حذف");
            jLabel189.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel189.setOpaque(true);
            jLabel189.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel189MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel189MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel189MouseExited(evt);
                }
            });
            jPanel20.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel190.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel190.setBackground(new java.awt.Color(0, 0, 204));
            jLabel190.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel190.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel190.setForeground(new java.awt.Color(255, 255, 255));
            jLabel190.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel190.setText("دفع");
            jLabel190.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel190.setOpaque(true);
            jLabel190.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel190MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel190MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel190MouseExited(evt);
                }
            });
            jPanel20.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 70, -1));

            jLabel191.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel191.setForeground(new java.awt.Color(255, 255, 255));
            jLabel191.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel191.setText("السنــــــــة الخــــــــــامســــــــــــة");
            jLabel191.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel20.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel192.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel192.setForeground(new java.awt.Color(255, 255, 255));
            jLabel192.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel192.setText("   بحث بالإسم");
            jPanel20.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 138, 35));

            jLabel193.setBackground(new java.awt.Color(0, 0, 204));
            jLabel193.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel193.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel193.setForeground(new java.awt.Color(255, 255, 255));
            jLabel193.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel193.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel193.setText("تعديل");
            jLabel193.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel193.setOpaque(true);
            jLabel193.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel193MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel193MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel193MouseExited(evt);
                }
            });
            jPanel20.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 70, -1));

            jLabel194.setBackground(new java.awt.Color(255, 51, 0));
            jLabel194.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel194.setForeground(new java.awt.Color(255, 255, 255));
            jLabel194.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel194.setText("تنبيه");
            jLabel194.setOpaque(true);
            jLabel194.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel194MouseClicked(evt);
                }
            });
            jPanel20.add(jLabel194, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

            jLabel195.setBackground(new java.awt.Color(0, 0, 51));
            jLabel195.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel195.setForeground(new java.awt.Color(255, 255, 255));
            jLabel195.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel195.setText("عودة");
            jLabel195.setOpaque(true);
            jLabel195.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel195MouseClicked(evt);
                }
            });
            jPanel20.add(jLabel195, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

            jTabbedPane3.addTab("السنة الخامسة", jPanel20);

            jLabel183.setBackground(new java.awt.Color(0, 0, 204));
            jLabel183.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel183.setForeground(new java.awt.Color(255, 255, 255));
            jLabel183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel183.setIcon(new javax.swing.ImageIcon("2-Hot-Home-icon.png"));
            jLabel183.setText("عودة");
            jLabel183.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel183.setOpaque(true);
            jLabel183.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel183MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel183MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel183MouseExited(evt);
                }
            });

            jLabel111.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel111.setForeground(new java.awt.Color(255, 255, 255));
            jLabel111.setIcon(new javax.swing.ImageIcon("Excel-icon.png"));
            jLabel111.setText("تحويل إلى ملفexcel");
            jLabel111.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel111MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel111MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel111MouseExited(evt);
                }
            });

            javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
            jPanel15.setLayout(jPanel15Layout);
            jPanel15Layout.setHorizontalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane3)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(47, 47, 47))
            );
            jPanel15Layout.setVerticalGroup(
                jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel183)
                        .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
            );

            jPanel2.add(jPanel15, "card3");

            jPanel21.setBackground(new java.awt.Color(0, 0, 204));
            jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLayeredPane11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel129.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel129.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel129.setOpaque(true);
            jLayeredPane11.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField31.setBackground(new java.awt.Color(0, 0, 204));
            jTextField31.setForeground(new java.awt.Color(255, 255, 255));
            jTextField31.setBorder(null);
            jTextField31.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField31ActionPerformed(evt);
                }
            });
            jTextField31.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField31KeyReleased(evt);
                }
            });
            jLayeredPane11.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList11.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList11MouseClicked(evt);
                }
            });
            jLayeredPane11.add(jList11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel21.add(jLayeredPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 350, 390));

            jLabel130.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel130.setForeground(new java.awt.Color(255, 255, 255));
            jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel130.setText("   بحث بالإسم");
            jPanel21.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 138, 35));

            jTable14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
            jTable14.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jTable14.setRowHeight(20);
            jTable14.getTableHeader().setResizingAllowed(false);
            jTable14.getTableHeader().setReorderingAllowed(false);
            jScrollPane14.setViewportView(jTable14);

            jPanel21.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 1020, 310));

            jLabel133.setBackground(new java.awt.Color(0, 0, 204));
            jLabel133.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel133.setForeground(new java.awt.Color(255, 255, 255));
            jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel133.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel133.setText("إضافة");
            jLabel133.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel133.setOpaque(true);
            jLabel133.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel133MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel133MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel133MouseExited(evt);
                }
            });
            jPanel21.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 480, 70, -1));

            jLabel134.setBackground(new java.awt.Color(0, 0, 204));
            jLabel134.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel134.setForeground(new java.awt.Color(255, 255, 255));
            jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel134.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel134.setText("حذف");
            jLabel134.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel134.setOpaque(true);
            jLabel134.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel134MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel134MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel134MouseExited(evt);
                }
            });
            jPanel21.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 70, -1));

            jLabel184.setBackground(new java.awt.Color(0, 0, 204));
            jLabel184.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel184.setForeground(new java.awt.Color(255, 255, 255));
            jLabel184.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel184.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel184.setText("تعديل");
            jLabel184.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel184.setOpaque(true);
            jLabel184.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel184MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel184MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel184MouseExited(evt);
                }
            });
            jPanel21.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, 70, -1));

            jLabel196.setBackground(new java.awt.Color(0, 0, 51));
            jLabel196.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel196.setForeground(new java.awt.Color(255, 255, 255));
            jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel196.setText("عودة");
            jLabel196.setOpaque(true);
            jLabel196.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel196MouseClicked(evt);
                }
            });
            jPanel21.add(jLabel196, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 120, -1));

            jLabel198.setBackground(new java.awt.Color(255, 51, 0));
            jLabel198.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel198.setForeground(new java.awt.Color(255, 255, 255));
            jLabel198.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel198.setText("تنبيه");
            jLabel198.setOpaque(true);
            jLabel198.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel198MouseClicked(evt);
                }
            });
            jPanel21.add(jLabel198, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 120, 30));

            jLabel199.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel199.setBackground(new java.awt.Color(0, 0, 204));
            jLabel199.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel199.setForeground(new java.awt.Color(255, 255, 255));
            jLabel199.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel199.setText("دفع");
            jLabel199.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel199.setOpaque(true);
            jLabel199.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel199MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel199MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel199MouseExited(evt);
                }
            });
            jPanel21.add(jLabel199, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 70, -1));

            jLabel200.setBackground(new java.awt.Color(0, 0, 204));
            jLabel200.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel200.setForeground(new java.awt.Color(255, 255, 255));
            jLabel200.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel200.setIcon(new javax.swing.ImageIcon("2-Hot-Home-icon.png"));
            jLabel200.setText("عودة");
            jLabel200.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel200.setOpaque(true);
            jLabel200.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel200MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel200MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel200MouseExited(evt);
                }
            });
            jPanel21.add(jLabel200, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

            jLabel187.setBackground(new java.awt.Color(0, 0, 204));
            jLabel187.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel187.setForeground(new java.awt.Color(255, 255, 255));
            jLabel187.setIcon(new javax.swing.ImageIcon("Excel-icon.png"));
            jLabel187.setText("تحويل إلى ملف excel");
            jLabel187.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel187.setOpaque(true);
            jLabel187.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel187MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel187MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel187MouseExited(evt);
                }
            });
            jPanel21.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 210, 40));

            jPanel2.add(jPanel21, "card4");

            jPanel24.setBackground(new java.awt.Color(0, 0, 204));

            jTabbedPane4.setForeground(new java.awt.Color(0, 0, 0));
            jTabbedPane4.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTabbedPane4MouseClicked(evt);
                }
            });

            jPanel29.setBackground(new java.awt.Color(0, 0, 204));
            jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLayeredPane21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel265.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel265.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel265.setOpaque(true);
            jLayeredPane21.add(jLabel265, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField41.setBackground(new java.awt.Color(0, 0, 204));
            jTextField41.setForeground(new java.awt.Color(255, 255, 255));
            jTextField41.setBorder(null);
            jTextField41.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField41KeyReleased(evt);
                }
            });
            jLayeredPane21.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList21.setDragEnabled(true);
            jList21.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList21MouseClicked(evt);
                }
            });
            jLayeredPane21.add(jList21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel29.add(jLayeredPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 350, 270));

            jTable19.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jTable19.getTableHeader().setResizingAllowed(false);
            jTable19.getTableHeader().setReorderingAllowed(false);
            jScrollPane19.setViewportView(jTable19);

            jPanel29.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1020, 220));
            jScrollPane19.getViewport().setBackground(new Color(0,0,204));

            jLabel268.setBackground(new java.awt.Color(0, 0, 204));
            jLabel268.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel268.setForeground(new java.awt.Color(255, 255, 255));
            jLabel268.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel268.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel268.setText("إضافة");
            jLabel268.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel268.setOpaque(true);
            jLabel268.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel268MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel268MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel268MouseExited(evt);
                }
            });
            jPanel29.add(jLabel268, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel269.setBackground(new java.awt.Color(0, 0, 204));
            jLabel269.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel269.setForeground(new java.awt.Color(255, 255, 255));
            jLabel269.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel269.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel269.setText("حذف");
            jLabel269.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel269.setOpaque(true);
            jLabel269.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel269MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel269MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel269MouseExited(evt);
                }
            });
            jPanel29.add(jLabel269, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel270.setBackground(new java.awt.Color(0, 0, 204));
            jLabel270.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel270.setForeground(new java.awt.Color(255, 255, 255));
            jLabel270.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel270.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel270.setText("دفع");
            jLabel270.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel270.setOpaque(true);
            jLabel270.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel270MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel270MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel270MouseExited(evt);
                }
            });
            jPanel29.add(jLabel270, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 70, -1));

            jLabel271.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel271.setForeground(new java.awt.Color(255, 255, 255));
            jLabel271.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel271.setText("السنة التحضـــــــــــــــــــــــــيرية");
            jLabel271.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel29.add(jLabel271, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel272.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel272.setForeground(new java.awt.Color(255, 255, 255));
            jLabel272.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel272.setText("   بحث بالإسم");
            jPanel29.add(jLabel272, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 138, 35));

            jLabel273.setBackground(new java.awt.Color(0, 0, 204));
            jLabel273.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel273.setForeground(new java.awt.Color(255, 255, 255));
            jLabel273.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel273.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel273.setText("تعديل");
            jLabel273.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel273.setOpaque(true);
            jLabel273.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel273MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel273MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel273MouseExited(evt);
                }
            });
            jPanel29.add(jLabel273, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 70, -1));

            jLabel274.setBackground(new java.awt.Color(255, 51, 0));
            jLabel274.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel274.setForeground(new java.awt.Color(255, 255, 255));
            jLabel274.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel274.setText("تنبيه");
            jLabel274.setOpaque(true);
            jLabel274.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel274MouseClicked(evt);
                }
            });
            jPanel29.add(jLabel274, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

            jLabel275.setBackground(new java.awt.Color(0, 0, 51));
            jLabel275.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel275.setForeground(new java.awt.Color(255, 255, 255));
            jLabel275.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel275.setText("عودة");
            jLabel275.setOpaque(true);
            jLabel275.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel275MouseClicked(evt);
                }
            });
            jPanel29.add(jLabel275, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

            jTabbedPane4.addTab("تخضيري", jPanel29);

            jPanel25.setBackground(new java.awt.Color(0, 0, 204));
            jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox15.setRenderer(dc);
            jComboBox15.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox15PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jComboBox15.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox15ActionPerformed(evt);
                }
            });
            jPanel25.add(jComboBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 219, 30));

            jLabel216.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel216.setForeground(new java.awt.Color(255, 255, 255));
            jLabel216.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel216.setText("المادة");
            jPanel25.add(jLabel216, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 90, 30));

            jLayeredPane18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel217.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel217.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel217.setOpaque(true);
            jLayeredPane18.add(jLabel217, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField39.setBackground(new java.awt.Color(0, 0, 204));
            jTextField39.setForeground(new java.awt.Color(255, 255, 255));
            jTextField39.setBorder(null);
            jTextField39.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField39KeyReleased(evt);
                }
            });
            jLayeredPane18.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList18.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList18MouseClicked(evt);
                }
            });
            jLayeredPane18.add(jList18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel25.add(jLayeredPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 350, 270));

            jScrollPane15.getViewport().setBackground(new Color(0,0,204));

            jTable15.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane15.setViewportView(jTable15);

            jPanel25.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1020, 220));

            jLabel218.setBackground(new java.awt.Color(0, 0, 204));
            jLabel218.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel218.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel218.setForeground(new java.awt.Color(255, 255, 255));
            jLabel218.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel218.setText("حذف");
            jLabel218.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel218.setOpaque(true);
            jLabel218.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel218MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel218MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel218MouseExited(evt);
                }
            });
            jPanel25.add(jLabel218, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, -1));

            jLabel219.setBackground(new java.awt.Color(0, 0, 204));
            jLabel219.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel219.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel219.setForeground(new java.awt.Color(255, 255, 255));
            jLabel219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel219.setText("إضافة");
            jLabel219.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel219.setOpaque(true);
            jLabel219.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel219MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel219MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel219MouseExited(evt);
                }
            });
            jPanel25.add(jLabel219, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 70, -1));

            jLabel220.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel220.setBackground(new java.awt.Color(0, 0, 204));
            jLabel220.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel220.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel220.setForeground(new java.awt.Color(255, 255, 255));
            jLabel220.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel220.setText("إضافة");
            jLabel220.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel220.setOpaque(true);
            jLabel220.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel220MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel220MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel220MouseExited(evt);
                }
            });
            jPanel25.add(jLabel220, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel221.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel221.setBackground(new java.awt.Color(0, 0, 204));
            jLabel221.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel221.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel221.setForeground(new java.awt.Color(255, 255, 255));
            jLabel221.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel221.setText("حذف");
            jLabel221.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel221.setOpaque(true);
            jLabel221.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel221MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel221MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel221MouseExited(evt);
                }
            });
            jPanel25.add(jLabel221, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel222.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel222.setBackground(new java.awt.Color(0, 0, 204));
            jLabel222.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel222.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel222.setForeground(new java.awt.Color(255, 255, 255));
            jLabel222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel222.setText("دفع");
            jLabel222.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel222.setOpaque(true);
            jLabel222.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel222MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel222MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel222MouseExited(evt);
                }
            });
            jPanel25.add(jLabel222, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 70, -1));

            jLabel223.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel223.setForeground(new java.awt.Color(255, 255, 255));
            jLabel223.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel223.setText("المستوى الإبتدائــــــــــــي");
            jLabel223.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel25.add(jLabel223, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel224.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel224.setForeground(new java.awt.Color(255, 255, 255));
            jLabel224.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel224.setText("   بحث بالإسم");
            jPanel25.add(jLabel224, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 140, 138, 35));

            jLabel225.setBackground(new java.awt.Color(0, 0, 204));
            jLabel225.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel225.setHorizontalTextPosition(SwingConstants.LEADING);
            jLabel225.setForeground(new java.awt.Color(255, 255, 255));
            jLabel225.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel225.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel225.setText("تعديل");
            jLabel225.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel225.setOpaque(true);
            jLabel225.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel225MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel225MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel225MouseExited(evt);
                }
            });
            jPanel25.add(jLabel225, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 70, -1));

            jLabel226.setBackground(new java.awt.Color(255, 51, 0));
            jLabel226.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel226.setForeground(new java.awt.Color(255, 255, 255));
            jLabel226.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel226.setText("تنبيه");
            jLabel226.setOpaque(true);
            jLabel226.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel226MouseClicked(evt);
                }
            });
            jPanel25.add(jLabel226, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

            jLabel227.setBackground(new java.awt.Color(0, 0, 51));
            jLabel227.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel227.setForeground(new java.awt.Color(255, 255, 255));
            jLabel227.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel227.setText("عودة");
            jLabel227.setOpaque(true);
            jLabel227.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel227MouseClicked(evt);
                }
            });
            jPanel25.add(jLabel227, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

            jTabbedPane4.addTab("الإبتدائي", jPanel25);

            jPanel26.setBackground(new java.awt.Color(0, 0, 204));
            jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox16.setBackground(new java.awt.Color(0, 0, 204));
            jComboBox16.setRenderer(dc);
            jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox16.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox16PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jPanel26.add(jComboBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 219, 30));

            jLayeredPane15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel228.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel228.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel228.setOpaque(true);
            jLayeredPane15.add(jLabel228, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField35.setBackground(new java.awt.Color(0, 0, 204));
            jTextField35.setForeground(new java.awt.Color(255, 255, 255));
            jTextField35.setBorder(null);
            jTextField35.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField35KeyReleased(evt);
                }
            });
            jLayeredPane15.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList15.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList15MouseClicked(evt);
                }
            });
            jLayeredPane15.add(jList15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel26.add(jLayeredPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 350, 330));

            jLabel229.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel229.setForeground(new java.awt.Color(255, 255, 255));
            jLabel229.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel229.setText("   بحث بالإسم");
            jPanel26.add(jLabel229, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 138, 35));

            jScrollPane16.getViewport().setBackground(new Color(0,0,204));

            jTable16.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane16.setViewportView(jTable16);

            jPanel26.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1020, 250));

            jLabel230.setBackground(new java.awt.Color(0, 0, 204));
            jLabel230.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel230.setForeground(new java.awt.Color(255, 255, 255));
            jLabel230.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel230.setText("حذف");
            jLabel230.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel230.setOpaque(true);
            jLabel230.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel230MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel230MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel230MouseExited(evt);
                }
            });
            jPanel26.add(jLabel230, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, -1));

            jLabel231.setBackground(new java.awt.Color(0, 0, 204));
            jLabel231.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel231.setForeground(new java.awt.Color(255, 255, 255));
            jLabel231.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel231.setText("إضافة");
            jLabel231.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel231.setOpaque(true);
            jLabel231.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel231MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel231MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel231MouseExited(evt);
                }
            });
            jPanel26.add(jLabel231, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 70, -1));

            jLabel232.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel232.setBackground(new java.awt.Color(0, 0, 204));
            jLabel232.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel232.setForeground(new java.awt.Color(255, 255, 255));
            jLabel232.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel232.setText("إضافة");
            jLabel232.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel232.setOpaque(true);
            jLabel232.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel232MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel232MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel232MouseExited(evt);
                }
            });
            jPanel26.add(jLabel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel233.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel233.setBackground(new java.awt.Color(0, 0, 204));
            jLabel233.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel233.setForeground(new java.awt.Color(255, 255, 255));
            jLabel233.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel233.setText("حذف");
            jLabel233.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel233.setOpaque(true);
            jLabel233.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel233MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel233MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel233MouseExited(evt);
                }
            });
            jPanel26.add(jLabel233, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel234.setBackground(new java.awt.Color(0, 0, 204));
            jLabel234.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel234.setForeground(new java.awt.Color(255, 255, 255));
            jLabel234.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel234.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel234.setText("تعديل");
            jLabel234.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel234.setOpaque(true);
            jLabel234.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel234MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel234MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel234MouseExited(evt);
                }
            });
            jPanel26.add(jLabel234, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 70, -1));

            jLabel235.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel235.setForeground(new java.awt.Color(255, 255, 255));
            jLabel235.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel235.setText("المستوى المتوســـــــــــــــــــــط");
            jLabel235.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel26.add(jLabel235, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel236.setBackground(new java.awt.Color(255, 51, 0));
            jLabel236.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel236.setForeground(new java.awt.Color(255, 255, 255));
            jLabel236.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel236.setText("تنبيه");
            jLabel236.setOpaque(true);
            jLabel236.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel236MouseClicked(evt);
                }
            });
            jPanel26.add(jLabel236, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

            jLabel237.setBackground(new java.awt.Color(0, 0, 51));
            jLabel237.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel237.setForeground(new java.awt.Color(255, 255, 255));
            jLabel237.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel237.setText("عودة");
            jLabel237.setOpaque(true);
            jLabel237.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel237MouseClicked(evt);
                }
            });
            jPanel26.add(jLabel237, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

            jLabel238.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel238.setForeground(new java.awt.Color(255, 255, 255));
            jLabel238.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel238.setText("المادة");
            jPanel26.add(jLabel238, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 90, -1));

            jLabel239.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel239.setBackground(new java.awt.Color(0, 0, 204));
            jLabel239.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel239.setForeground(new java.awt.Color(255, 255, 255));
            jLabel239.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel239.setText("دفع");
            jLabel239.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel239.setOpaque(true);
            jLabel239.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel239MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel239MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel239MouseExited(evt);
                }
            });
            jPanel26.add(jLabel239, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 70, -1));

            jTabbedPane4.addTab("المتوسط", jPanel26);

            jPanel27.setBackground(new java.awt.Color(0, 0, 204));
            jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox17.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox17PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jComboBox17.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jComboBox17ActionPerformed(evt);
                }
            });
            jPanel27.add(jComboBox17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 219, 30));

            jLayeredPane19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel240.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel240.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel240.setOpaque(true);
            jLayeredPane19.add(jLabel240, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField36.setBackground(new java.awt.Color(0, 0, 204));
            jTextField36.setForeground(new java.awt.Color(255, 255, 255));
            jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            jTextField36.setBorder(null);
            jTextField36.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField36KeyReleased(evt);
                }
            });
            jLayeredPane19.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList19.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList19MouseClicked(evt);
                }
            });
            jLayeredPane19.add(jList19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel27.add(jLayeredPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 350, 320));

            jLabel241.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel241.setForeground(new java.awt.Color(255, 255, 255));
            jLabel241.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel241.setText("   بحث بالإسم");
            jPanel27.add(jLabel241, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 138, 35));

            jTable17.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane17.setViewportView(jTable17);

            jPanel27.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1020, 260));
            jScrollPane17.getViewport().setBackground(new Color(0,0,204));

            jLabel242.setBackground(new java.awt.Color(0, 0, 204));
            jLabel242.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel242.setForeground(new java.awt.Color(255, 255, 255));
            jLabel242.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel242.setText("حذف");
            jLabel242.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel242.setOpaque(true);
            jLabel242.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel242MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel242MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel242MouseExited(evt);
                }
            });
            jPanel27.add(jLabel242, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, -1));

            jLabel243.setBackground(new java.awt.Color(0, 0, 204));
            jLabel243.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel243.setForeground(new java.awt.Color(255, 255, 255));
            jLabel243.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel243.setText("إضافة");
            jLabel243.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel243.setOpaque(true);
            jLabel243.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel243MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel243MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel243MouseExited(evt);
                }
            });
            jPanel27.add(jLabel243, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 70, -1));

            jLabel244.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel244.setBackground(new java.awt.Color(0, 0, 204));
            jLabel244.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel244.setForeground(new java.awt.Color(255, 255, 255));
            jLabel244.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel244.setText("إضافة");
            jLabel244.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel244.setOpaque(true);
            jLabel244.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel244MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel244MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel244MouseExited(evt);
                }
            });
            jPanel27.add(jLabel244, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel245.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel245.setBackground(new java.awt.Color(0, 0, 204));
            jLabel245.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel245.setForeground(new java.awt.Color(255, 255, 255));
            jLabel245.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel245.setText("حذف");
            jLabel245.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel245.setOpaque(true);
            jLabel245.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel245MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel245MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel245MouseExited(evt);
                }
            });
            jPanel27.add(jLabel245, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel246.setBackground(new java.awt.Color(0, 0, 204));
            jLabel246.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel246.setForeground(new java.awt.Color(255, 255, 255));
            jLabel246.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel246.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel246.setText("تعديل");
            jLabel246.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel246.setOpaque(true);
            jLabel246.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel246MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel246MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel246MouseExited(evt);
                }
            });
            jPanel27.add(jLabel246, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 70, -1));

            jLabel247.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel247.setForeground(new java.awt.Color(255, 255, 255));
            jLabel247.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel247.setText("المســــــــــــــــــــــــتوي الثانوي");
            jLabel247.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel27.add(jLabel247, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel248.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel248.setForeground(new java.awt.Color(255, 255, 255));
            jLabel248.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel248.setText("المادة");
            jPanel27.add(jLabel248, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 90, 30));

            jLabel249.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel249.setBackground(new java.awt.Color(0, 0, 204));
            jLabel249.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel249.setForeground(new java.awt.Color(255, 255, 255));
            jLabel249.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel249.setText("دفع");
            jLabel249.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel249.setOpaque(true);
            jLabel249.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel249MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel249MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel249MouseExited(evt);
                }
            });
            jPanel27.add(jLabel249, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 70, -1));

            jLabel250.setBackground(new java.awt.Color(255, 51, 0));
            jLabel250.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel250.setForeground(new java.awt.Color(255, 255, 255));
            jLabel250.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel250.setText("تنبيه");
            jLabel250.setOpaque(true);
            jLabel250.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel250MouseClicked(evt);
                }
            });
            jPanel27.add(jLabel250, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

            jLabel251.setBackground(new java.awt.Color(0, 0, 51));
            jLabel251.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel251.setForeground(new java.awt.Color(255, 255, 255));
            jLabel251.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel251.setText("عودة");
            jLabel251.setOpaque(true);
            jLabel251.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel251MouseClicked(evt);
                }
            });
            jPanel27.add(jLabel251, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

            jTabbedPane4.addTab("الثانوي", jPanel27);

            jPanel28.setBackground(new java.awt.Color(0, 0, 204));
            jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jComboBox19.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "جميع المواد" }));
            jComboBox19.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
                public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                }
                public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                    jComboBox19PopupMenuWillBecomeInvisible(evt);
                }
                public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                }
            });
            jPanel28.add(jComboBox19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 219, 30));
            jComboBox19.setRenderer(dc);

            jLayeredPane20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel252.setBackground(new java.awt.Color(0, 0, 0,0));
            jLabel252.setIcon(new javax.swing.ImageIcon("search2.png"));
            jLabel252.setOpaque(true);
            jLayeredPane20.add(jLabel252, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 300, -1));

            jTextField40.setBackground(new java.awt.Color(0, 0, 204));
            jTextField40.setForeground(new java.awt.Color(255, 255, 255));
            jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            jTextField40.setBorder(null);
            jTextField40.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTextField40KeyReleased(evt);
                }
            });
            jLayeredPane20.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, 28));

            jList20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
            jList20.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jList20MouseClicked(evt);
                }
            });
            jLayeredPane20.add(jList20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 180, -1));

            jPanel28.add(jLayeredPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 340, 330));

            jLabel253.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel253.setForeground(new java.awt.Color(255, 255, 255));
            jLabel253.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel253.setText("   بحث بالإسم");
            jPanel28.add(jLabel253, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, 138, 35));

            jTable18.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane18.setViewportView(jTable18);

            jPanel28.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1020, 240));
            jScrollPane18.getViewport().setBackground(new Color(0,0,204));

            jLabel254.setBackground(new java.awt.Color(0, 0, 204));
            jLabel254.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel254.setForeground(new java.awt.Color(255, 255, 255));
            jLabel254.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel254.setText("حذف");
            jLabel254.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel254.setOpaque(true);
            jLabel254.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel254MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel254MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel254MouseExited(evt);
                }
            });
            jPanel28.add(jLabel254, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, -1));

            jLabel255.setBackground(new java.awt.Color(0, 0, 204));
            jLabel255.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel255.setForeground(new java.awt.Color(255, 255, 255));
            jLabel255.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel255.setText("إضافة");
            jLabel255.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel255.setOpaque(true);
            jLabel255.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel255MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel255MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel255MouseExited(evt);
                }
            });
            jPanel28.add(jLabel255, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 70, -1));

            jLabel256.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel256.setBackground(new java.awt.Color(0, 0, 204));
            jLabel256.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel256.setForeground(new java.awt.Color(255, 255, 255));
            jLabel256.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel256.setText("إضافة");
            jLabel256.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel256.setOpaque(true);
            jLabel256.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel256MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel256MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel256MouseExited(evt);
                }
            });
            jPanel28.add(jLabel256, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 70, -1));

            jLabel257.setBackground(new java.awt.Color(0, 0, 204));
            jLabel257.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel257.setForeground(new java.awt.Color(255, 255, 255));
            jLabel257.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel257.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel257.setText("حذف");
            jLabel257.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel257.setOpaque(true);
            jLabel257.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel257MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel257MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel257MouseExited(evt);
                }
            });
            jPanel28.add(jLabel257, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 440, 70, -1));

            jLabel258.setBackground(new java.awt.Color(0, 0, 204));
            jLabel258.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel258.setForeground(new java.awt.Color(255, 255, 255));
            jLabel258.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel258.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel258.setText("تعديل");
            jLabel258.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel258.setOpaque(true);
            jLabel258.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel258MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel258MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel258MouseExited(evt);
                }
            });
            jPanel28.add(jLabel258, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 70, -1));

            jLabel259.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
            jLabel259.setForeground(new java.awt.Color(255, 255, 255));
            jLabel259.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel259.setText("دروس اخـــــــــــــــــــــــــــرى");
            jLabel259.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
            jPanel28.add(jLabel259, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 500, 50));

            jLabel260.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel260.setForeground(new java.awt.Color(255, 255, 255));
            jLabel260.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel260.setText("المادة");
            jPanel28.add(jLabel260, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 110, 90, 30));

            jLabel261.setIcon(new javax.swing.ImageIcon("payment-icon.png"));
            jLabel261.setBackground(new java.awt.Color(0, 0, 204));
            jLabel261.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel261.setForeground(new java.awt.Color(255, 255, 255));
            jLabel261.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel261.setText("دفع");
            jLabel261.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel261.setOpaque(true);
            jLabel261.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel261MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel261MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel261MouseExited(evt);
                }
            });
            jPanel28.add(jLabel261, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 70, -1));

            jLabel262.setBackground(new java.awt.Color(255, 51, 0));
            jLabel262.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel262.setForeground(new java.awt.Color(255, 255, 255));
            jLabel262.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel262.setText("تنبيه");
            jLabel262.setOpaque(true);
            jLabel262.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel262MouseClicked(evt);
                }
            });
            jPanel28.add(jLabel262, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 120, 30));

            jLabel263.setBackground(new java.awt.Color(0, 0, 51));
            jLabel263.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel263.setForeground(new java.awt.Color(255, 255, 255));
            jLabel263.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel263.setText("عودة");
            jLabel263.setOpaque(true);
            jLabel263.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel263MouseClicked(evt);
                }
            });
            jPanel28.add(jLabel263, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 120, -1));

            jTabbedPane4.addTab("دروس أخرى", jPanel28);

            jLabel276.setBackground(new java.awt.Color(0, 0, 204));
            jLabel276.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel276.setForeground(new java.awt.Color(255, 255, 255));
            jLabel276.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel276.setIcon(new javax.swing.ImageIcon("2-Hot-Home-icon.png"));
            jLabel276.setText("عودة");
            jLabel276.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel276.setOpaque(true);
            jLabel276.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel276MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel276MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel276MouseExited(evt);
                }
            });

            jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            jLabel122.setText("jLabel122");
            jLabel122.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel122MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel122MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel122MouseExited(evt);
                }
            });

            javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
            jPanel24.setLayout(jPanel24Layout);
            jPanel24Layout.setHorizontalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane4)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addComponent(jLabel276, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(77, 77, 77))
            );
            jPanel24Layout.setVerticalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel276)
                        .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jTabbedPane4)
                    .addGap(6, 6, 6))
            );

            jPanel2.add(jPanel24, "card3");

            jPanel40.setBackground(new java.awt.Color(0, 0, 204));

            jDateChooser6.setDateFormatString("yyyy-MM-dd");

            jTable20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
            jTable20.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "الرقم", "الإسم", "الوظيفة", "استلام", "دفع", "التاريخ"
                }
            ));
            jTable20.setRowHeight(20);
            jTable20.getTableHeader().setResizingAllowed(false);
            jTable20.getTableHeader().setReorderingAllowed(false);
            jScrollPane20.setViewportView(jTable20);

            jLabel282.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel282.setForeground(new java.awt.Color(255, 255, 255));
            jLabel282.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel282.setText("إلى");

            jDateChooser7.setDateFormatString("yyyy-MM-dd");

            jLabel14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel14.setForeground(new java.awt.Color(255, 255, 255));
            jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel14.setText("من");

            jLabel26.setBackground(new java.awt.Color(0, 0, 204));
            jLabel26.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel26.setForeground(new java.awt.Color(255, 255, 255));
            jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel26.setIcon(new javax.swing.ImageIcon("Button-Add-icon.png"));
            jLabel26.setText("إضافة");
            jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel26.setOpaque(true);
            jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel26MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel26MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel26MouseExited(evt);
                }
            });

            jLabel31.setBackground(new java.awt.Color(0, 0, 204));
            jLabel31.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel31.setForeground(new java.awt.Color(255, 255, 255));
            jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel31.setIcon(new javax.swing.ImageIcon("Misc-Delete-Database-icon.png"));
            jLabel31.setText("حذف");
            jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel31.setOpaque(true);
            jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel31MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel31MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel31MouseExited(evt);
                }
            });

            jLabel32.setBackground(new java.awt.Color(0, 0, 204));
            jLabel32.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel32.setForeground(new java.awt.Color(255, 255, 255));
            jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel32.setIcon(new javax.swing.ImageIcon("Actions-document-edit-icon (2).png"));
            jLabel32.setText("تعديل");
            jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel32.setOpaque(true);
            jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel32MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel32MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel32MouseExited(evt);
                }
            });

            jLabel296.setBackground(new java.awt.Color(0, 0, 204));
            jLabel296.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel296.setForeground(new java.awt.Color(255, 255, 255));
            jLabel296.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel296.setIcon(new javax.swing.ImageIcon("2-Hot-Home-icon.png"));
            jLabel296.setText("عودة");
            jLabel296.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel296.setOpaque(true);
            jLabel296.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel296MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel296MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel296MouseExited(evt);
                }
            });

            jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jButton3.setText("موافق");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton3ActionPerformed(evt);
                }
            });

            jPanel43.setBackground(new java.awt.Color(153, 0, 102));

            jLabel37.setBackground(new java.awt.Color(0, 0, 102));
            jLabel37.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel37.setForeground(new java.awt.Color(255, 255, 255));
            jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel37.setText("الدخل الإجمالي");
            jLabel37.setOpaque(true);

            jLabel38.setBackground(new java.awt.Color(255, 255, 255));
            jLabel38.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel38.setForeground(new java.awt.Color(0, 0, 0));
            jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel38.setOpaque(true);

            jLabel43.setBackground(new java.awt.Color(0, 0, 102));
            jLabel43.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel43.setForeground(new java.awt.Color(255, 255, 255));
            jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel43.setText("المصـــــاريف");
            jLabel43.setOpaque(true);

            jLabel44.setBackground(new java.awt.Color(255, 255, 255));
            jLabel44.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel44.setForeground(new java.awt.Color(0, 0, 0));
            jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel44.setOpaque(true);

            jLabel57.setBackground(new java.awt.Color(255, 255, 255));
            jLabel57.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel57.setForeground(new java.awt.Color(0, 0, 0));
            jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel57.setOpaque(true);

            jLabel58.setBackground(new java.awt.Color(0, 0, 102));
            jLabel58.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jLabel58.setForeground(new java.awt.Color(255, 255, 255));
            jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel58.setText("الفـــــــــائدة");
            jLabel58.setOpaque(true);

            javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
            jPanel43.setLayout(jPanel43Layout);
            jPanel43Layout.setHorizontalGroup(
                jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(60, 60, 60)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
            jPanel43Layout.setVerticalGroup(
                jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            );

            javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
            jPanel40.setLayout(jPanel40Layout);
            jPanel40Layout.setHorizontalGroup(
                jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane20)
                .addGroup(jPanel40Layout.createSequentialGroup()
                    .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel40Layout.createSequentialGroup()
                            .addGap(245, 245, 245)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104)
                            .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel282, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jDateChooser7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel40Layout.createSequentialGroup()
                            .addGap(740, 740, 740)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel40Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel296, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jPanel40Layout.setVerticalGroup(
                jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel40Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel296, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)
                    .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jDateChooser6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel282, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDateChooser7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGap(56, 56, 56)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel32)
                        .addComponent(jLabel31)
                        .addComponent(jLabel26))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(74, 74, 74))
            );

            jPanel2.add(jPanel40, "card10");

            jPanel44.setBackground(new java.awt.Color(0, 0, 204));

            jTable21.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String [] {
                    "Title 1", "Title 2", "Title 3", "Title 4"
                }
            ));
            jScrollPane21.setViewportView(jTable21);

            jDateChooser4.setDateFormatString("dd-MM-yyyy");

            jDateChooser5.setDateFormatString("dd-MM-yyyy");

            jButton6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            jButton6.setText("موافق");
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton6ActionPerformed(evt);
                }
            });

            jLabel101.setBackground(new java.awt.Color(0, 0, 204));
            jLabel101.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel101.setForeground(new java.awt.Color(255, 255, 255));
            jLabel101.setIcon(new javax.swing.ImageIcon("2-Hot-Home-icon.png"));
            jLabel101.setText("عودة");
            jLabel101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            jLabel101.setOpaque(true);
            jLabel101.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jLabel101MouseClicked(evt);
                }
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jLabel101MouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jLabel101MouseExited(evt);
                }
            });

            jLabel102.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
            jLabel102.setForeground(new java.awt.Color(255, 255, 255));
            jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel102.setText("إلى");

            javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
            jPanel44.setLayout(jPanel44Layout);
            jPanel44Layout.setHorizontalGroup(
                jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(72, 72, 72)
                    .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49)
                    .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(122, 122, 122))
                .addGroup(jPanel44Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel44Layout.setVerticalGroup(
                jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel44Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel101)
                    .addGap(36, 36, 36)
                    .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(232, 232, 232))
            );

            jPanel2.add(jPanel44, "card10");

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
      jLabel4.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
     jLabel4.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
    jLabel5.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
       jLabel5.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
     jPanel1.setVisible(false);
     jPanel15.setVisible(true);
       update_table3("f_y_primery",jTable9);
       update_table3("s_y_primery",jTable10);
       update_table3("t_y_primery",jTable11);
       update_table3("fo_y_primery",jTable12);
       update_table3("fi_y_primery",jTable13);
      update_combo("add_m","الأولى", jComboBox10);
      update_combo("add_m","الثانية", jComboBox11);
      update_combo("add_m","الثالثة", jComboBox12);
      update_combo("add_m","الرابعة", jComboBox13);
      update_combo("add_m","الخامسة", jComboBox14);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
     jPanel3.setVisible(true);
      jPanel1.setVisible(false);
           update_table3("f_y_medum",jTable2);
       update_table3("s_y_medum",jTable3);
       update_table3("t_y_medum",jTable4);
       update_table3("fo_y_medum",jTable5);
      update_combo("add_m1","الأولى", jComboBox2);
      update_combo("add_m1","الثاثية", jComboBox3);
      update_combo("add_m1","الثالثة", jComboBox4);
      update_combo("add_m1","الرابعة", jComboBox5);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
      jLabel11.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel11MouseEntered

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        jLabel11.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
    jPanel4.setVisible(true);
    jPanel1.setVisible(false);
    update_table3("other",jTable1);
    update_combo("add_m3","/", jComboBox1);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jTextField24KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField24KeyReleased
              
      
        serchF(jList4, jTextField24, jTable2,"f_y_medum");
    }//GEN-LAST:event_jTextField24KeyReleased

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked

        serchL(jList4, jTextField24, jTable2, "f_y_medum");
    }//GEN-LAST:event_jList4MouseClicked

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
        jLabel21.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        jLabel21.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel21MouseExited

    private void jTextField25KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField25KeyReleased
    
        serchF(jList5, jTextField25, jTable3,"s_y_medum");
    }//GEN-LAST:event_jTextField25KeyReleased

    private void jList5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList5MouseClicked
jTextField25.setText(jList5.getSelectedValue());
        jList5.setVisible(false);
      
        try {
            String querry = "select الرقم,الإسم,\"رقم الهاتف\",\"سعر التدريس\",\"الدين/عليه\",\"تاريخ الإنخراط\",المادة,الاستاذ  from s_y_medum where الإسم = '"+jTextField25.getText()+"'";
            pst = con.prepareStatement(querry);
            rs= pst.executeQuery();
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            
            try {
                rs.close();
                pst.close();
                
            } catch (SQLException ex) {
              
            }
        }
        alart(jTable3);
        serchL(jList5, jTextField25, jTable2, "s_y_medum");
    }//GEN-LAST:event_jList5MouseClicked

    private void jLabel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseEntered
        jLabel27.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel27MouseEntered

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        jLabel27.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel27MouseExited

    private void jTextField26KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField26KeyReleased
     serchF(jList6, jTextField26, jTable4, "t_y_medum");
    }//GEN-LAST:event_jTextField26KeyReleased

    private void jList6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList6MouseClicked
       serchL(jList6, jTextField26, jTable4, "t_y_medum");
    }//GEN-LAST:event_jList6MouseClicked

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
      jLabel33.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
       jLabel33.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel33MouseExited

    private void jTextField27KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField27KeyReleased
     serchF(jList7, jTextField27, jTable5, "fo_y_medum");
    }//GEN-LAST:event_jTextField27KeyReleased

    private void jList7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList7MouseClicked
serchL(jList7, jTextField27, jTable5, "fo_y_medum");
    }//GEN-LAST:event_jList7MouseClicked

    private void jLabel39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseEntered
       jLabel39.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel39MouseEntered

    private void jLabel39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseExited
     jLabel39.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel39MouseExited

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        jPanel9.setVisible(true);
        jPanel1.setVisible(false);
       update_table3("f_y_h_school",jTable6);
       update_table3("s_y_h_school",jTable7);
       update_table3("t_y_h_school",jTable8);
      update_combo("add_m2","الأولى", jComboBox6);
      update_combo("add_m2","الثاثية", jComboBox7);
      update_combo("add_m2","الثالثة", jComboBox8);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseClicked
         add_st.setVisible(false);
                                jTextField2.setText("");
                                jTextField3.setText("");
                                jTextField4.setText("");
                                jTextField5.setText("");
                                jDateChooser1.setDate(null);
                                jComboBox9.removeAllItems();
                                jComboBox21.removeAllItems();
    }//GEN-LAST:event_jLabel75MouseClicked

    private void jLabel75MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseEntered
        jLabel75.setBackground( new Color(255,153,0));
    }//GEN-LAST:event_jLabel75MouseEntered

    private void jLabel75MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel75MouseExited
        jLabel75.setBackground(Color.white);
    }//GEN-LAST:event_jLabel75MouseExited

    private void jLabel76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseClicked
        if (jPanel4.isVisible()) 
        add_s(jTable1, "other","دروس أخرى","/","إضافة");
        else
            if (jPanel3.isVisible()) 
               switch(jTabbedPane1.getSelectedIndex()){
                case 0 :
                add_s(jTable2, "f_y_medum","المتوسط","الأولى","إضافة");
                break;
                case 1 :
                add_s(jTable3, "s_y_medum","المتوسط","الثانية","إضافة");
                break;
                case 2:
                add_s(jTable4, "t_y_medum","المتوسط","الثالثة","إضافة");
                break;
                case 3:
                add_s(jTable5, "fo_y_medum","المتوسط","الرابعة","إضافة");
                break;
            } 
            else
            if (jPanel9.isVisible()) 
            switch(jTabbedPane2.getSelectedIndex()){
                case 0 :
                add_s(jTable6, "f_y_h_school","الثانوي","الأولى","إضافة");
                break;
                case 1 :
                add_s(jTable7, "s_y_h_school","الثانوي","الثانية","إضافة");
                break;
                case 2 :
                add_s(jTable8, "t_y_h_school","الثانوي","الثالثة","إضافة");
                break;
            }
                else
                if (jPanel15.isVisible()) 
                switch(jTabbedPane3.getSelectedIndex()){
                case 0 :
                add_s(jTable9, "f_y_primery","الإبتدائي","الأولى","إضافة");
                break; 
                case 1 :
                add_s(jTable10, "s_y_primery","الإبتدائي","الثانية","إضافة");
                break; 
                case 2 :
                add_s(jTable11, "t_y_primery","الإبتدائي","الثالثة","إضافة");
                break;
                case 3 :
                add_s(jTable12, "fo_y_primery","الإبتدائي","الرابعة","إضافة");
                break;
                case 4 :
                add_s(jTable9, "fi_y_primery","الإبتدائي","الخامسة","إضافة");             
                break;
                        } 
                    
       jComboBox9.removeAllItems();
       jComboBox21.removeAllItems();
        
       
                                
    }//GEN-LAST:event_jLabel76MouseClicked

    private void jLabel76MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseEntered
        jLabel76.setBackground(Color.green);
    }//GEN-LAST:event_jLabel76MouseEntered

    private void jLabel76MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel76MouseExited
        jLabel76.setBackground(Color.white);
    }//GEN-LAST:event_jLabel76MouseExited

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
     
      update_combo("add_m1","الرابعة", jComboBox9);
      update_combo("المتوسط","الرابعة", jComboBox21);
       if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
       update_combo("add_m1","الأولى", jComboBox9);
       update_combo("المتوسط","الأولى", jComboBox21);
           System.out.print(jComboBox9.getItemCount());
           System.out.print(jComboBox21.getItemCount());
        if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
            jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
        

    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
     
      update_combo("add_m1","الثانية", jComboBox9);
      update_combo("المتوسط","الثانية", jComboBox21);
       if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
    
    update_combo("add_m1","الثالثة", jComboBox9);
    update_combo("المتوسط","الثالثة", jComboBox21);
     if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
       
      delete(jTable2,"f_y_medum","المتوسط","الأولى");            
        
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
      delete(jTable3,"s_y_medum","المتوسط","الثانية");
      
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
       delete(jTable4,"t_y_medum","المتوسط","الثالثة");
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseClicked
      delete(jTable5,"fo_y_medum","المتوسط","الرابعة");        
      
    }//GEN-LAST:event_jLabel40MouseClicked

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
      jLabel22.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
      jLabel22.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
      jLabel23.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
      jLabel23.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel23MouseExited

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        jTextField5.setText(jTextField4.getText());
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            jTextField46.setText(jLabel148.getText());
           jLabel150.setText("0");
        }else{
        jTextField46.setText("");
        jLabel150.setText("");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField46KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField46KeyReleased
        try {
            if (!jTextField46.getText().equals("")) {
                double pay = Double.parseDouble(jLabel148.getText())-Double.parseDouble(jTextField46.getText());
       jLabel150.setText(String.valueOf(pay));
            }else{
            jLabel150.setText("");
            
            }
                  
          
  
        } catch ( NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"من فضلك الرقم بشكل صحيح");
            jLabel150.setText("");
            jTextField46.setText("");
        }
   
 
      

        
    }//GEN-LAST:event_jTextField46KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (!(jLabel150.getText().equals(""))) {
               if (jPanel4.isVisible()) {
                   payment(jTable1, "other","قبض","");
        }else{
             if (jPanel3.isVisible()) {
              switch(jTabbedPane1.getSelectedIndex()){
                  case 0:
                   payment(jTable2, "f_y_medum","قبض","الأولى");
        break;
                  case 1:
                       payment(jTable3, "s_y_medum","قبض","الثانية");
        break;
                  case 2:
                         
                      payment(jTable4, "t_y_medum","قبض","الثالثة");
        break;
                  case 3:
                         
                     payment(jTable5, "fo_y_medum","قبض","الرابعة");  
        break;
              }   
             }else{
               if (jPanel9.isVisible()) {
              switch(jTabbedPane2.getSelectedIndex()){
                  case 0:
                     payment(jTable6, "f_y_h_school","قبض","الأولى");
        break;
                  case 1:
                     
                     payment(jTable7, "s_y_h_school","قبض","الثانية"); 
        break;
                  case 2:
                     payment(jTable7, "t_y_h_school","قبض","الثالثة"); 
                        
        break;

             }}else{
                if (jPanel15.isVisible()) {
              switch(jTabbedPane3.getSelectedIndex()){
                  case 0:
                    payment(jTable9, "f_y_primery","قبض","الأولى"); 
        break;
                  case 1:
                  
                     payment(jTable10, "s_y_primery","قبض","الثانية");
        break;
                  case 2:
                  
                     payment(jTable11, "t_y_primery","قبض","الثالثة");
        break;
                  case 3:
                  
                     payment(jTable12, "fo_y_primery","قبض","الرابعة"); 
        break;
                  case 4:
                  
                     payment(jTable13, "fi_y_primery","قبض","الخامسة");
        break;
              }
                }else{
                    if (jPanel21.isVisible()) {
                        
                         payment(jTable14, "preparatory_year","قبض","");      
                    }else{
                        if (jPanel24.isVisible()) {
                            switch(jTabbedPane4.getSelectedIndex()){
                                case 1:
                          payment(jTable15, "الإبتدائي","دفع","");
                          break;
                                case 2:
                          payment(jTable16, "المتوسط","دفع","");
                          break;
                                case 3:
                          payment(jTable17, "الثانوي","دفع","");
                          break;
                                case 4:
                          payment(jTable18, "دروس أخرى","دفع","");
                                    break;
                                case 0:
                          payment(jTable19, "التحضيري","دفع","");
                          break;
                                        
                            
                            }
                        }
                    }
                }
               }}
         } 
        }
 
    
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField47ActionPerformed

    private void jTextField49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField49ActionPerformed

    private void jTextField50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField50ActionPerformed

    private void jTextField51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField51ActionPerformed

    private void jTextField52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField52ActionPerformed

    private void jLabel161MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel161MouseClicked
        if (jPanel4.isVisible()) 
            update(jTable1, "other","دروس أخرى","/","تعديل");
        else
            if (jPanel3.isVisible()) 
             switch(jTabbedPane1.getSelectedIndex()){
                     case 0:
                     update(jTable2, "f_y_medum","متوسط","الأولى","تعديل");
                     break;
                     case 1:
                     update(jTable3, "s_y_medum","متوسط","الثانية","تعديل");
                     break;
                     case 2:
                     update(jTable4, "t_y_medum","متوسط","الثالثة","تعديل");
                     break;
                     case 3:
                     update(jTable5, "fo_y_medum","متوسط","الرابعة","تعديل");
                     break;
        }   
        else
                        if (jPanel9.isVisible()) 
             switch(jTabbedPane2.getSelectedIndex()){
                     case 0:
                     update(jTable6, "f_y_h_school","الثانوي","الأولى","تعديل");
                     break;
                     case 1:
                     update(jTable7, "s_y_h_school","الثانوي","الثانية","تعديل");
                     break;
                     case 2:
                     update(jTable8, "t_y_h_school","الثانوي","الثالثة","تعديل");
                     break;
                      }
                      else
                     if (jPanel15.isVisible()) 
                     switch(jTabbedPane3.getSelectedIndex()){
                          case 0:
                          update(jTable9, "f_y_primery","الإبتدائي","الأولى","تعديل");
                          break;
                          case 1:
                          update(jTable10, "s_y_primery","الإبتدائي","الثانية","تعديل");
                          break;
                          case 2:
                          update(jTable11, "t_y_primery","الإبتدائي","الثالثة","تعديل");
                          break;
                          case 3:
                          update(jTable12, "fo_y_primery","الإبتدائي","الرابعة","تعديل");
                          break;
                          case 4:
                          update(jTable13, "fi_y_primery","الإبتدائي","الرابعة","تعديل");
                          break;
             }
                                     
               
                        
            
        
      
    }//GEN-LAST:event_jLabel161MouseClicked

    private void jLabel161MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel161MouseEntered
        jLabel161.setBackground(Color.green);
    }//GEN-LAST:event_jLabel161MouseEntered

    private void jLabel161MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel161MouseExited
        jLabel161.setBackground(Color.white);
    }//GEN-LAST:event_jLabel161MouseExited

    private void jLabel160MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel160MouseClicked
      update.setVisible(false);
      jTextField47.setText("");
      jTextField49.setText("");
      jTextField50.setText("");
      jTextField51.setText("");
      jTextField52.setText("");
      jDateChooser10.setDate(null);
      jComboBox18.removeAllItems();
      jComboBox23.removeAllItems();
    }//GEN-LAST:event_jLabel160MouseClicked

    private void jLabel160MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel160MouseEntered
       jLabel160.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel160MouseEntered

    private void jLabel160MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel160MouseExited
       jLabel160.setBackground(Color.white);
    }//GEN-LAST:event_jLabel160MouseExited

    private void jLabel136MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel136MouseEntered
      jLabel136.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel136MouseEntered

    private void jLabel136MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel136MouseExited
      jLabel136.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel136MouseExited

    private void jLabel162MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel162MouseClicked
      check(jTable2, "f_y_medum", jLabel140);
    }//GEN-LAST:event_jLabel162MouseClicked

    private void jLabel140MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel140MouseClicked
        back(jTable2, jLabel140,"f_y_medum" );
    }//GEN-LAST:event_jLabel140MouseClicked

    private void jLabel136MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel136MouseClicked
        setup(jTable2, "add_m1", "الأولى", "f_y_medum");
      update_combo("المتوسط","الأولى", jComboBox21);
    }//GEN-LAST:event_jLabel136MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
          setup_p(jTable2);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel164MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel164MouseClicked
        jPanel3.setVisible(false);
        jPanel1.setVisible(true);        
    }//GEN-LAST:event_jLabel164MouseClicked

    private void jLabel164MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel164MouseEntered
        jLabel164.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel164MouseEntered

    private void jLabel164MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel164MouseExited
        jLabel164.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel164MouseExited

    private void jLabel163MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel163MouseClicked
        check(jTable3, "s_y_medum", jLabel142);
    }//GEN-LAST:event_jLabel163MouseClicked

    private void jLabel142MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel142MouseClicked
        back(jTable3, jLabel142, "s_y_medum");
    }//GEN-LAST:event_jLabel142MouseClicked

    private void jLabel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseEntered
      jLabel28.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel28MouseEntered

    private void jLabel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseEntered
       jLabel29.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel29MouseEntered

    private void jLabel82MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseEntered
        jLabel82.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel82MouseEntered

    private void jLabel28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseExited
       jLabel28.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel28MouseExited

    private void jLabel29MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseExited
      jLabel29.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel29MouseExited

    private void jLabel82MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseExited
        jLabel82.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel82MouseExited

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
         setup(jTable3, "add_m1", "الثانية", "s_y_medum");
        update_combo("الإبتدائي","الثانية", jComboBox23);
        update_combo("المتوسط","الثانية", jComboBox21);
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel82MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82MouseClicked
                setup_p(jTable3);
    }//GEN-LAST:event_jLabel82MouseClicked

    private void jComboBox3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox3PopupMenuWillBecomeInvisible
            if (jComboBox3.getSelectedIndex()==0) {
            update_table3("s_y_medum", jTable3);
        }else{
        update_table(jComboBox3, "s_y_medum", jTable3);
        }
            alart(jTable3);
    }//GEN-LAST:event_jComboBox3PopupMenuWillBecomeInvisible

    private void jComboBox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeInvisible
          if (jComboBox2.getSelectedIndex()==0) {
            update_table3("f_y_medum", jTable2);
        }else{
        update_table(jComboBox2, "f_y_medum", jTable2);
        }
          alart(jTable2);
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeInvisible

    private void jComboBox4PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox4PopupMenuWillBecomeInvisible
       if (jComboBox4.getSelectedIndex()==0) {
            update_table3("t_y_medum", jTable4);
        }else{
        update_table(jComboBox4, "t_y_medum", jTable4);
        }
            alart(jTable4);
    }//GEN-LAST:event_jComboBox4PopupMenuWillBecomeInvisible

    private void jLabel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseEntered
       jLabel34.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel34MouseEntered

    private void jLabel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseEntered
     jLabel35.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel35MouseEntered

    private void jLabel84MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseEntered
       jLabel84.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel84MouseEntered

    private void jLabel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseExited
       jLabel34.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel34MouseExited

    private void jLabel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseExited
        jLabel35.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel35MouseExited

    private void jLabel84MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseExited
       jLabel84.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel84MouseExited

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
         setup(jTable4, "add_m1", "الثالثة", "t_y_medum");  
         update_combo("المتوسط","الثالثة", jComboBox21);
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel84MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel84MouseClicked
   jCheckBox1.setSelected(false);
        jTextField46.setText("");
        jLabel150.setText("");
                
        try {
            int row = jTable4.getSelectedRow();
        String debt = jTable4.getValueAt(row, 4).toString();
        jLabel148.setText(debt);
        payment.setVisible(true);
        
        
        } catch (ArrayIndexOutOfBoundsException e) {
           JOptionPane.showMessageDialog(null, "من فضلك حدد التلميذ الذي تريد تعديل مستحقاته"); 
        } 
        setup_p(jTable4);
                
    }//GEN-LAST:event_jLabel84MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (!(jTextField1.getText().equals(""))) {
                            switch(jTabbedPane4.getSelectedIndex()) {
                        case 1:
                           add_m(jComboBox15, "add_m");
                            break;
                        case 2:
                           add_m(jComboBox16, "add_m1");
                            break;
                        case 3:
                           add_m(jComboBox17, "add_m2");
                            break;
                        case 4:
                           add_m(jComboBox19, "add_m3");
                          break;
                            }     
         add_m.setVisible(false);
         }else 
         JOptionPane.showMessageDialog(null, "من فضلك اكتب المادة");
                            
       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel165MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel165MouseClicked
        check(jTable4, "t_y_medum", jLabel143);
    }//GEN-LAST:event_jLabel165MouseClicked

    private void jLabel143MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel143MouseClicked
        back(jTable4, jLabel143, "t_y_medum");
                
    }//GEN-LAST:event_jLabel143MouseClicked

    private void jLabel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseEntered
       jLabel40.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel40MouseEntered

    private void jLabel41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseEntered
        jLabel41.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel41MouseEntered

    private void jLabel41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseExited
       jLabel41.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel41MouseExited

    private void jLabel74MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseEntered
        jLabel74.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel74MouseEntered

    private void jLabel74MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseExited
        jLabel74.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel74MouseExited

    private void jLabel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel40MouseExited
        jLabel40.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel40MouseExited

    private void jComboBox5PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox5PopupMenuWillBecomeInvisible
        if (jComboBox5.getSelectedIndex()==0) {
            update_table3("fo_y_medum", jTable5);
        }else{
        update_table(jComboBox5, "fo_y_medum", jTable5);
        }
            alart(jTable5);
    }//GEN-LAST:event_jComboBox5PopupMenuWillBecomeInvisible

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
          setup(jTable5, "add_m1", "الرابعة", "fo_y_medum");
          update_combo("المتوسط","الرابعة", jComboBox21);
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
             setup_p(jTable5);
    }//GEN-LAST:event_jLabel74MouseClicked

    private void jLabel166MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel166MouseClicked
     check(jTable5, "fo_y_medum", jLabel144);
    }//GEN-LAST:event_jLabel166MouseClicked

    private void jLabel144MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel144MouseClicked
      back(jTable5, jLabel144, "fo_y_medum");
    }//GEN-LAST:event_jLabel144MouseClicked

    private void jLabel167MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel167MouseClicked
        jPanel9.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jLabel167MouseClicked

    private void jLabel167MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel167MouseEntered
     
       jLabel167.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel167MouseEntered

    private void jLabel167MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel167MouseExited
  jLabel167.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel167MouseExited

    private void jLabel183MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel183MouseClicked
       jPanel15.setVisible(false);
       jPanel1.setVisible(true);
    }//GEN-LAST:event_jLabel183MouseClicked

    private void jLabel183MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel183MouseEntered
jLabel183.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel183MouseEntered

    private void jLabel183MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel183MouseExited
        jLabel183.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel183MouseExited

    private void jLabel195MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel195MouseClicked
       back(jTable13, jLabel194, "fi_y_primery");
    }//GEN-LAST:event_jLabel195MouseClicked

    private void jLabel194MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel194MouseClicked
   check(jTable13, "fi_y_primery", jLabel194);
    }//GEN-LAST:event_jLabel194MouseClicked

    private void jLabel193MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel193MouseExited
        jLabel193.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel193MouseExited

    private void jLabel193MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel193MouseEntered
     jLabel193.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel193MouseEntered

    private void jLabel193MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel193MouseClicked
         setup(jTable13, "add_m", "الخامسة", "fi_y_primery"); 
         update_combo("الإبتدائي","الخامسة", jComboBox21);
    }//GEN-LAST:event_jLabel193MouseClicked

    private void jLabel190MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel190MouseExited
      jLabel190.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel190MouseExited

    private void jLabel190MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel190MouseEntered
      jLabel190.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel190MouseEntered

    private void jLabel190MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel190MouseClicked
              setup_p(jTable13);
    }//GEN-LAST:event_jLabel190MouseClicked

    private void jLabel189MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel189MouseExited
        jLabel189.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel189MouseExited

    private void jLabel189MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel189MouseEntered
     jLabel189.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel189MouseEntered

    private void jLabel189MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel189MouseClicked
      delete(jTable13,"fi_y_primery","الإبتدائي","الخامسة");
    }//GEN-LAST:event_jLabel189MouseClicked

    private void jLabel188MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel188MouseExited
       jLabel188.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel188MouseExited

    private void jLabel188MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel188MouseEntered
        jLabel188.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel188MouseEntered

    private void jLabel188MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel188MouseClicked
     
    update_combo("add_m","الخامسة", jComboBox9); 
    update_combo("الإبتدائي","الخامسة", jComboBox21);
     if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel188MouseClicked

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jComboBox14PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox14PopupMenuWillBecomeInvisible
        if (jComboBox14.getSelectedIndex()==0) {
            update_table3("fi_y_primery", jTable13);
        }else{
        update_table(jComboBox14, "fi_y_primery", jTable13);
        }
          alart(jTable13);
    }//GEN-LAST:event_jComboBox14PopupMenuWillBecomeInvisible

    private void jLabel182MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel182MouseClicked
       back(jTable12, jLabel182, "fo_y_primery");
    }//GEN-LAST:event_jLabel182MouseClicked

    private void jLabel181MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel181MouseClicked
    check(jTable12, "fo_y_primery", jLabel182);
    }//GEN-LAST:event_jLabel181MouseClicked

    private void jLabel180MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel180MouseExited
      jLabel180.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel180MouseExited

    private void jLabel180MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel180MouseEntered
     jLabel180.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel180MouseEntered

    private void jLabel180MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel180MouseClicked
             setup_p(jTable12);
    }//GEN-LAST:event_jLabel180MouseClicked

    private void jLabel125MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel125MouseExited
     jLabel125.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel125MouseExited

    private void jLabel125MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel125MouseEntered
      jLabel125.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel125MouseEntered

    private void jLabel125MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel125MouseClicked
        setup(jTable12, "add_m", "الرابعة", "fo_y_primery");  
        update_combo("الإبتدائي","الرابعة", jComboBox21);
    }//GEN-LAST:event_jLabel125MouseClicked

    private void jLabel124MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel124MouseExited
      jLabel124.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel124MouseExited

    private void jLabel124MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel124MouseEntered
        jLabel124.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel124MouseEntered

    private void jLabel124MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel124MouseClicked
     delete(jTable12,"fo_y_primery","الإبتدائي","الرابعة");
    }//GEN-LAST:event_jLabel124MouseClicked

    private void jLabel123MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel123MouseExited
       jLabel123.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel123MouseExited

    private void jLabel123MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel123MouseEntered
      jLabel123.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel123MouseEntered

    private void jLabel123MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel123MouseClicked
   
    update_combo("add_m","الرابعة", jComboBox9); 
    update_combo("الإبتدائي","الرابعة", jComboBox21);
    System.out.print(jComboBox9.getItemCount());
    System.out.print(jComboBox21.getItemCount());
     if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel123MouseClicked

    private void jList14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList14MouseClicked
             jTextField34.setText(jList14.getSelectedValue());
        jList14.setVisible(false);
      
        try {
            String querry = "select الرقم,الإسم,\"رقم الهاتف\",\"سعر التدريس\",\"الدين/عليه\",\"تاريخ الإنخراط\",المادة,الاستاذ  from fo_y_primery where الإسم = '"+jTextField34.getText()+"'";
            pst = con.prepareStatement(querry);
            rs= pst.executeQuery();
            jTable12.setModel(DbUtils.resultSetToTableModel(rs));
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            
            try {
                rs.close();
                pst.close();
                
            } catch (SQLException ex) {
              
            }
        }
        alart(jTable12);
    }//GEN-LAST:event_jList14MouseClicked

    private void jTextField34KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField34KeyReleased
        serchF(jList14, jTextField34, jTable12, "fo_y_primery");
    }//GEN-LAST:event_jTextField34KeyReleased

    private void jComboBox13PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox13PopupMenuWillBecomeInvisible
         serchL(jList14, jTextField34, jTable12, "fo_y_primery"); 
    }//GEN-LAST:event_jComboBox13PopupMenuWillBecomeInvisible

    private void jLabel178MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel178MouseClicked
          back(jTable11, jLabel178, "t_y_primery");
    }//GEN-LAST:event_jLabel178MouseClicked

    private void jLabel177MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel177MouseClicked
   check(jTable11, "t_y_primery", jLabel178);
    }//GEN-LAST:event_jLabel177MouseClicked

    private void jLabel118MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel118MouseExited
    jLabel118.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel118MouseExited

    private void jLabel118MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel118MouseEntered
      jLabel118.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel118MouseEntered

    private void jLabel118MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel118MouseClicked
           setup_p(jTable11);
    }//GEN-LAST:event_jLabel118MouseClicked

    private void jLabel115MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel115MouseExited
        jLabel115.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel115MouseExited

    private void jLabel115MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel115MouseEntered
      jLabel115.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel115MouseEntered

    private void jLabel115MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel115MouseClicked
          setup(jTable11, "add_m", "الثالثة", "t_y_primery");  
          update_combo("الإبتدائي","الثالثة", jComboBox21);
    }//GEN-LAST:event_jLabel115MouseClicked

    private void jLabel114MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseExited
       jLabel114.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel114MouseExited

    private void jLabel114MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseEntered
       jLabel114.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel114MouseEntered

    private void jLabel114MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel114MouseClicked
         delete(jTable11,"t_y_primery","الإبتدائي","الثالثة");
    }//GEN-LAST:event_jLabel114MouseClicked

    private void jLabel113MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MouseExited
      jLabel113.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel113MouseExited

    private void jLabel113MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MouseEntered
        jLabel113.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel113MouseEntered

    private void jLabel113MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel113MouseClicked
    
    update_combo("add_m","الثالثة", jComboBox9); 
    update_combo("الإبتدائي","الثالثة", jComboBox21);
     if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel113MouseClicked

    private void jList13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList13MouseClicked
        serchL(jList13, jTextField33, jTable11, "t_y_primery");
    }//GEN-LAST:event_jList13MouseClicked

    private void jTextField33KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField33KeyReleased
         serchF(jList13, jTextField33, jTable11, "t_y_primery");
    }//GEN-LAST:event_jTextField33KeyReleased

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jComboBox12PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox12PopupMenuWillBecomeInvisible
          if (jComboBox12.getSelectedIndex()==0) {
            update_table3("t_y_primery", jTable11);
        }else{
        update_table(jComboBox12, "t_y_primery", jTable11);
        }
          alart(jTable11);
    }//GEN-LAST:event_jComboBox12PopupMenuWillBecomeInvisible

    private void jLabel108MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel108MouseExited
      jLabel108.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel108MouseExited

    private void jLabel108MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel108MouseEntered
      jLabel108.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel108MouseEntered

    private void jLabel108MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel108MouseClicked
          setup_p(jTable10);
    }//GEN-LAST:event_jLabel108MouseClicked

    private void jLabel176MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel176MouseClicked
     back(jTable10, jLabel176, "s_y_primery");
    }//GEN-LAST:event_jLabel176MouseClicked

    private void jLabel175MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel175MouseClicked
      check(jTable10, "s_y_primery", jLabel176);
    }//GEN-LAST:event_jLabel175MouseClicked

    private void jLabel105MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel105MouseExited
       jLabel105.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel105MouseExited

    private void jLabel105MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel105MouseEntered
      jLabel105.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel105MouseEntered

    private void jLabel105MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel105MouseClicked
        setup(jTable10, "add_m", "الثانية", "s_y_primery");   
        update_combo("الإبتدائي","الثانية", jComboBox23);
    }//GEN-LAST:event_jLabel105MouseClicked

    private void jLabel104MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel104MouseExited
        jLabel104.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel104MouseExited

    private void jLabel104MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel104MouseEntered
      jLabel104.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel104MouseEntered

    private void jLabel104MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel104MouseClicked
        delete(jTable10,"s_y_primery","الإبتدائي","الثانية");
    }//GEN-LAST:event_jLabel104MouseClicked

    private void jLabel103MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel103MouseExited
        jLabel103.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel103MouseExited

    private void jLabel103MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel103MouseEntered
       jLabel103.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel103MouseEntered

    private void jLabel103MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel103MouseClicked
   
    update_combo("add_m","الثانية", jComboBox9); 
    update_combo("الإبتدائي","الثانية", jComboBox21);
     if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel103MouseClicked

    private void jList12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList12MouseClicked
      serchL(jList12, jTextField32, jTable10, "s_y_primery");
    }//GEN-LAST:event_jList12MouseClicked

    private void jTextField32KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField32KeyReleased
      serchF(jList12, jTextField32, jTable10, "s_y_primery");
    }//GEN-LAST:event_jTextField32KeyReleased

    private void jComboBox11PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox11PopupMenuWillBecomeInvisible
       if (jComboBox11.getSelectedIndex()==0) {
            update_table3("s_y_primery", jTable10);
        }else{
        update_table(jComboBox11, "s_y_primery", jTable10);
        }
          alart(jTable10);

    }//GEN-LAST:event_jComboBox11PopupMenuWillBecomeInvisible

    private void jLabel174MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel174MouseClicked
    back(jTable9, jLabel174, "f_y_primery");
    }//GEN-LAST:event_jLabel174MouseClicked

    private void jLabel173MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel173MouseClicked
        check(jTable9, "f_y_primery", jLabel174);
    }//GEN-LAST:event_jLabel173MouseClicked

    private void jLabel138MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel138MouseExited
     jLabel138.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel138MouseExited

    private void jLabel138MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel138MouseEntered
     jLabel138.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel138MouseEntered

    private void jLabel138MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel138MouseClicked
       setup(jTable9, "add_m", "الأولى", "f_y_primery");     
       update_combo("الإبتدائي","الأولى", jComboBox23);
    }//GEN-LAST:event_jLabel138MouseClicked

    private void jLabel97MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseExited
       jLabel97.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel97MouseExited

    private void jLabel97MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseEntered
      jLabel97.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel97MouseEntered

    private void jLabel97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseClicked
             setup_p(jTable9);
    }//GEN-LAST:event_jLabel97MouseClicked

    private void jLabel96MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseExited
        jLabel96.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel96MouseExited

    private void jLabel96MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseEntered
        jLabel96.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel96MouseEntered

    private void jLabel96MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel96MouseClicked
      delete(jTable9,"f_y_primery","الإبتدائي","الأولى");
    }//GEN-LAST:event_jLabel96MouseClicked

    private void jLabel95MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel95MouseExited
        jLabel95.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel95MouseExited

    private void jLabel95MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel95MouseEntered
      jLabel95.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel95MouseEntered

    private void jLabel95MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel95MouseClicked
   
    update_combo("add_m","الأولى", jComboBox9);      
    update_combo("الإبتدائي","الأولى", jComboBox21); 
        System.out.println(jComboBox9.getItemCount());
        System.out.println(jComboBox21.getItemCount());
     if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel95MouseClicked

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox10PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox10PopupMenuWillBecomeInvisible
        if (jComboBox10.getSelectedIndex()==0) {
            update_table3("f_y_primery", jTable9);
        }else{
        update_table(jComboBox10, "f_y_primery", jTable9);
        }
          alart(jTable9);
    }//GEN-LAST:event_jComboBox10PopupMenuWillBecomeInvisible

    private void jTabbedPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane3MouseClicked
            try {
                String query="delete from other1";
                pst = con.prepareStatement(query);
                pst.execute();
                }catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }finally{
            
            try {
           
                
                pst.close();
            } catch (SQLException ex) {
              
            }}
       update_table3("other",jTable1);
       update_table3("f_y_medum",jTable2);
       update_table3("s_y_medum",jTable3);
       update_table3("t_y_medum",jTable4);
       update_table3("fo_y_medum",jTable5);
       update_table3("f_y_h_school",jTable6);
       update_table3("s_y_h_school",jTable7);
       update_table3("t_y_h_school",jTable8);
       update_table3("f_y_primery",jTable9);
       update_table3("s_y_primery",jTable10);
       update_table3("t_y_primery",jTable11);
       update_table3("fo_y_primery",jTable12);
       alart(jTable1);
       alart(jTable2);
       alart(jTable3);
       alart(jTable4);
       alart(jTable5);
       alart(jTable6);
       alart(jTable7);
       alart(jTable8);
       alart(jTable9);
       alart(jTable10);
       alart(jTable11);
       alart(jTable12);
    }//GEN-LAST:event_jTabbedPane3MouseClicked

    private void jTextField37KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField37KeyReleased
       serchF(jList16, jTextField37, jTable9, "f_y_primery");
    }//GEN-LAST:event_jTextField37KeyReleased

    private void jList16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList16MouseClicked
        serchL(jList16, jTextField37, jTable9, "f_y_primery");
    }//GEN-LAST:event_jList16MouseClicked

    private void jTextField38KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField38KeyReleased
        serchF(jList17, jTextField38, jTable13, "fi_y_primery");
    }//GEN-LAST:event_jTextField38KeyReleased

    private void jList17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList17MouseClicked
        serchL(jList17, jTextField38, jTable13, "fi_y_primery");
    }//GEN-LAST:event_jList17MouseClicked

    private void jLabel91MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel91MouseClicked
        jPanel1.setVisible(false);
        jPanel21.setVisible(true);
        update_table("preparatory_year",jTable14);
    }//GEN-LAST:event_jLabel91MouseClicked

    private void jLabel91MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel91MouseEntered
        jLabel91.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel91MouseEntered

    private void jLabel91MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel91MouseExited
        jLabel91.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel91MouseExited

    private void jTextField31KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField31KeyReleased
             serchF(jList11, jTextField31, jTable14, "preparatory_year");
    }//GEN-LAST:event_jTextField31KeyReleased

    private void jList11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList11MouseClicked
        serchL(jList11, jTextField31, jTable14, "preparatory_year");
    }//GEN-LAST:event_jList11MouseClicked

    private void jLabel133MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel133MouseClicked
       
        update_combo2(jComboBox1, jComboBox25);
         if (jComboBox25.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st1.setVisible(true);
        }
    }//GEN-LAST:event_jLabel133MouseClicked

    private void jLabel133MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel133MouseEntered
      jLabel133.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel133MouseEntered

    private void jLabel133MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel133MouseExited
        jLabel133.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel133MouseExited

    private void jLabel134MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel134MouseClicked
      delete(jTable14,"preparatory_year","تحضيري","/");
    }//GEN-LAST:event_jLabel134MouseClicked

    private void jLabel134MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel134MouseEntered
     jLabel134.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel134MouseEntered

    private void jLabel134MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel134MouseExited
    jLabel113.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel134MouseExited

    private void jLabel184MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel184MouseClicked
        int j = 0;  
        update_combo2(jComboBox1, jComboBox26);
        try {
            int  rw = jTable14.getSelectedRow();
            String table_click =(jTable14.getModel().getValueAt(rw, 0).toString());
            
            try {       
            String query="select *from preparatory_year where الرقم='"+table_click+"'";
            pst = con.prepareStatement(query);
            rs= pst.executeQuery();
            if (rs.next()) {
                String add0= rs.getString("الرقم");
                jTextField48.setText(add0);
                String add1= rs.getString("الإسم");
                jTextField53.setText(add1);
                String add2= rs.getString("رقم الهاتف");
                jTextField54.setText(add2);
                String add4 = rs.getString("سعر التدريس");
                jTextField55.setText(add4);     
                String add3 = rs.getString("الدين/عليه");
                jTextField56.setText(add3);
                String add5 = rs.getString("ولي الأمر");
                jTextField57.setText(add5);
                String add7 = rs.getString("تاريخ الإنخراط");
                Date add6 = new SimpleDateFormat("dd-MM-yyyy").parse(add7);
                jDateChooser11.setDate(add6);
                String add8 = rs.getString("الأستاذ");
                if (jComboBox26.getItemCount()!=0) {
                 jComboBox26.setSelectedIndex(cout(jComboBox26, add8, j)); 
                }  
                }
            update1.setVisible(true);
        } catch (SQLException | ParseException e) {
            JOptionPane.showMessageDialog(null,e);
            }finally{
            try {
                rs.close();
                pst.close();
            } catch (SQLException ex) {
             }}
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "من فضلك حدد التلميذ الذي تريد تعديل بياناته");
        }

    }//GEN-LAST:event_jLabel184MouseClicked

    private void jLabel184MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel184MouseEntered
        jLabel184.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel184MouseEntered

    private void jLabel184MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel184MouseExited
        jLabel184.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel184MouseExited

    private void jLabel196MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel196MouseClicked
        back(jTable14, jLabel196, "preparatory_year");
    }//GEN-LAST:event_jLabel196MouseClicked

    private void jLabel198MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel198MouseClicked
        check(jTable14, "preparatory_year", jLabel196);        
    }//GEN-LAST:event_jLabel198MouseClicked

    private void jLabel199MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel199MouseClicked
            setup_p(jTable14);
    }//GEN-LAST:event_jLabel199MouseClicked

    private void jLabel199MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel199MouseEntered
       jLabel199.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel199MouseEntered

    private void jLabel199MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel199MouseExited
        jLabel199.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel199MouseExited

    private void jLabel200MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel200MouseClicked
        jPanel21.setVisible(false);
        jPanel2.setVisible(true);
            try {
                String query="delete from other1";
                pst = con.prepareStatement(query);
                pst.execute();
                }catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, e);
                    }finally{
            
            try {
           
                
                pst.close();
            } catch (SQLException ex) {
              
            }}
       update_table3("other",jTable1);
       update_table3("f_y_medum",jTable2);
       update_table3("s_y_medum",jTable3);
       update_table3("t_y_medum",jTable4);
       update_table3("fo_y_medum",jTable5);
       update_table3("f_y_h_school",jTable6);
       update_table3("s_y_h_school",jTable7);
       update_table3("t_y_h_school",jTable8);
       update_table3("f_y_primery",jTable9);
       update_table3("s_y_primery",jTable10);
       update_table3("t_y_primery",jTable11);
       update_table3("fo_y_primery",jTable12);
       update_table3("fi_y_primery",jTable13);
       update_table("preparatory_year",jTable14);
       //update_table("employee",new primery().jTable1);
       alart(jTable1);
       alart(jTable2);
       alart(jTable3);
       alart(jTable4);
       alart(jTable5);
       alart(jTable6);
       alart(jTable7);
       alart(jTable8);
       alart(jTable9);
       alart(jTable10);
       alart(jTable11);
       alart(jTable12);
       alart(jTable13);
       alart(jTable14);
    }//GEN-LAST:event_jLabel200MouseClicked

    private void jLabel200MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel200MouseEntered
       jLabel200.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel200MouseEntered

    private void jLabel200MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel200MouseExited
            jLabel200.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel200MouseExited

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
            jTextField9.setText(jTextField8.getText());        
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jLabel204MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel204MouseClicked
        add_st1.setVisible(false);
    }//GEN-LAST:event_jLabel204MouseClicked

    private void jLabel204MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel204MouseEntered
       jLabel204.setBackground( new Color(255,153,0));
    }//GEN-LAST:event_jLabel204MouseEntered

    private void jLabel204MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel204MouseExited
       jLabel204.setBackground(Color.white);
    }//GEN-LAST:event_jLabel204MouseExited

    private void jLabel205MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel205MouseClicked
           int i=0;
        String num=null;
        if (jTable14.getRowCount()==0) {
            num="C0001";
        }else{
            while (i<jTable14.getRowCount() ) {
                String numb = jTable14.getValueAt(i,0).toString();

                StringBuilder number = new StringBuilder(numb);
                number.deleteCharAt(0);
                     if(i+1!=Integer.valueOf(number.toString())){
              num="C0001";    
             }  
                if (i+1==Integer.valueOf(number.toString())) {
                    i++;

                    if (jTable14.getRowCount()==i) {

                        if (0<(i+1)&&(i+1)<10) {
                            num="C000"+String.valueOf(i+1);

                        }else{
                            if (10<(i+1)&&(i+1)<100) {
                                num="C00"+String.valueOf(i+1);
                            }else{
                                if (100<=(i+1)&&(i+1)<1000) {
                                    num="C0"+String.valueOf(i+1);
                                }else{
                                    if (1000<=(i+1)) {
                                        num="C"+String.valueOf(i+1);
                                    }
                                }}}
                                i= jTable14.getRowCount()+1;

                            }

                        }else{

                            if (0<i&&i<10) {
                                num="C000"+String.valueOf(i+1);

                            }else{
                                if (10<i&&i<100) {
                                    num="C00"+String.valueOf(i+1);
                                }else{
                                    if (100<=i&&i<1000) {
                                        num="C0"+String.valueOf(i+1);
                                    }else{
                                        if (1000<=i) {
                                            num="C"+String.valueOf(i+1);
                                        }
                                    }}}

                                    i= jTable14.getRowCount()+1;
                                }

                            }}
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        String thedate = dateformat.format(jDateChooser2.getDate());
                            try {
                                String sql ="Insert into preparatory_year (الرقم,الإسم ,'رقم الهاتف','سعر التدريس','الدين/عليه','تاريخ الإنخراط','ولي الأمر',الأستاذ,تفحص) values (?,?,?,?,?,?,?,?,?)";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,num);
                                pst.setString(2,jTextField6.getText());
                                pst.setString(3,jTextField7.getText());
                                pst.setString(4,jTextField8.getText());
                                pst.setString(5,jTextField9.getText());
                                pst.setString(6,thedate);
                                pst.setString(7,jTextField10.getText());
                                pst.setString(8,jComboBox25.getSelectedItem().toString());
                                String date = LocalDate.parse(thedate, DateTimeFormatter.ofPattern("dd-MM-yyyy")).plus(Period.ofWeeks(4)).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                                
                                pst.setString(9,date);
                                pst.execute();
                                

                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{

                                try {

                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                                   String name = null,function=null;
                            try {
                              String sql ="select الإسم,الوظيفة from user";
                              pst = con.prepareStatement(sql);
                              rs = pst.executeQuery();
                                if (rs.next()) {
                                  name = rs.getString("الإسم");
                                  function = rs.getString("الوظيفة");
                                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

                                try {
                                     rs.close();
                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                               LocalDate dates = LocalDate.now();
                                try {
                                String sql ="Insert into actions (الإسم,الوظيفة,'من طرف','وظيفة المستخدم',المستوى,السنة,نوع,التاريخ) values (?,?,?,?,?,?,?,'"+dates+"')";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,jTextField2.getText());
                                pst.setString(2,"تلميذ");
                                pst.setString(3,name);
                                pst.setString(4,function);
                                pst.setString(5,"تحضيري");
                                pst.setString(6,"/");
                                pst.setString(7,"إضافة");

                                        
                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{
                                try {
                                    pst.close();
                                } catch (SQLException ex) {
                                }}
                                add_st1.setVisible(false);
                                update_table3("preparatory_year",jTable14);
                                alart(jTable14);
                                jTextField6.setText("");
                                jTextField7.setText("");
                                jTextField8.setText("");
                                jTextField9.setText("");
                                jTextField10.setText("");
    }//GEN-LAST:event_jLabel205MouseClicked

    private void jLabel205MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel205MouseEntered
       jLabel205.setBackground(Color.green);
    }//GEN-LAST:event_jLabel205MouseEntered

    private void jLabel205MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel205MouseExited
       jLabel205.setBackground(Color.white);
    }//GEN-LAST:event_jLabel205MouseExited

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void jTextField53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField53ActionPerformed

    private void jTextField54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField54ActionPerformed

    private void jTextField55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField55ActionPerformed

    private void jTextField56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField56ActionPerformed

    private void jLabel213MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel213MouseClicked
      update1.setVisible(false);
    }//GEN-LAST:event_jLabel213MouseClicked

    private void jLabel213MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel213MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel213MouseEntered

    private void jLabel213MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel213MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel213MouseExited

    private void jLabel214MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel214MouseClicked
       SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
       String thedate = dateformat.format(jDateChooser11.getDate());
                                       Period p = Period.ofWeeks(4);
                                DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                                LocalDate date = LocalDate.parse(thedate, f).plus(p);
                                while (LocalDate.now().toEpochDay() > date.toEpochDay()) {            
                                date = LocalDate.parse(thedate, f).plus(p);
                                   }
                                String date1 = date.format(f);
       try {
            String query = "update preparatory_year set الإسم='"+jTextField53.getText()+"' , 'رقم الهاتف' = '"+jTextField54.getText()+"' , 'سعر التدريس' = '"+jTextField55.getText()+"' , 'الدين/عليه' = '"+jTextField56.getText()+"','تاريخ الإنخراط'='"+thedate+"', 'ولي الأمر'='"+jTextField57.getText()+"',تفحص='"+date1+"' where الرقم ='"+jTextField48.getText()+"' ";
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
              String name = null,function=null;
                            try {
                              String sql ="select الإسم,الوظيفة from user";
                              pst = con.prepareStatement(sql);
                              rs = pst.executeQuery();
                                if (rs.next()) {
                                  name = rs.getString("الإسم");
                                  function = rs.getString("الوظيفة");
                                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{

                                try {
                                     rs.close();
                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                            LocalDate dates = LocalDate.now();
                                try {
                                String sql ="Insert into actions (الإسم,الوظيفة,'من طرف','وظيفة المستخدم',المستوى,السنة,نوع,التاريخ) values (?,?,?,?,?,?,?,'"+dates+"')";
                                pst = con.prepareStatement(sql);
                                pst.setString(1,jTextField2.getText());
                                pst.setString(2,"تلميذ");
                                pst.setString(3,name);
                                pst.setString(4,function);
                                pst.setString(5,"تحضيري");
                                pst.setString(6,"/");
                                pst.setString(7,"تعديل");

                                        
                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{
                                try {
                                    pst.close();
                                } catch (SQLException ex) {
                                }}
         update_table("preparatory_year",jTable14);
            alart(jTable14);
    update1.setVisible(false);
    }//GEN-LAST:event_jLabel214MouseClicked

    private void jLabel214MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel214MouseEntered
        jLabel214.setBackground(Color.green);
    }//GEN-LAST:event_jLabel214MouseEntered

    private void jLabel214MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel214MouseExited
       jLabel214.setBackground(Color.white);
    }//GEN-LAST:event_jLabel214MouseExited

    private void jTextField57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField57ActionPerformed

    private void jLabel215MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel215MouseClicked
        jPanel24.setVisible(true);
        jPanel1.setVisible(false);
       update_table(jTable15,"الإبتدائي");
       update_table(jTable16,"المتوسط");
       update_table(jTable17,"الثانوي");
       update_table(jTable18,"دروس أخرى");
       update_table(jTable19,"التحضيري");
    }//GEN-LAST:event_jLabel215MouseClicked

    private void jLabel215MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel215MouseEntered
        jLabel215.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel215MouseEntered

    private void jLabel215MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel215MouseExited
        jLabel215.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel215MouseExited

    private void jComboBox15PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox15PopupMenuWillBecomeInvisible
      if (jComboBox15.getSelectedIndex()==0) {
            update_table(jTable15, "الإبتدائي");
        }else{
            update_table1(jComboBox15, "teacher","الإبتدائي", jTable15);
        }
        alart(jTable15);
    }//GEN-LAST:event_jComboBox15PopupMenuWillBecomeInvisible

    private void jComboBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox15ActionPerformed

    private void jTextField39KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField39KeyReleased
       serchF2(jList18, jTextField39, jTable15, "الإبتدائي");
    }//GEN-LAST:event_jTextField39KeyReleased

    private void jList18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList18MouseClicked
        serchL2(jList18, jTextField39, jTable15);
    }//GEN-LAST:event_jList18MouseClicked

    private void jLabel220MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel220MouseClicked
       add_st2.setVisible(true);
        update_combo("add_m","", jComboBox20);
        jComboBox20.setEnabled(true);
    }//GEN-LAST:event_jLabel220MouseClicked

    private void jLabel220MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel220MouseEntered
      jLabel220.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel220MouseEntered

    private void jLabel220MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel220MouseExited
      jLabel220.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel220MouseExited

    private void jLabel221MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel221MouseClicked
        delete2(jTable15, "الإبتدائي");
    }//GEN-LAST:event_jLabel221MouseClicked

    private void jLabel221MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel221MouseEntered
       jLabel221.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel221MouseEntered

    private void jLabel221MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel221MouseExited
       jLabel221.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel221MouseExited

    private void jLabel222MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel222MouseClicked
              setup_p(jTable15);
    }//GEN-LAST:event_jLabel222MouseClicked

    private void jLabel222MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel222MouseEntered
        jLabel222.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel222MouseEntered

    private void jLabel222MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel222MouseExited
     jLabel222.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel222MouseExited

    private void jLabel225MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel225MouseClicked
          setup2(jTable15, "add_m");       
    }//GEN-LAST:event_jLabel225MouseClicked

    private void jLabel225MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel225MouseEntered
       jLabel225.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel225MouseEntered

    private void jLabel225MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel225MouseExited
        jLabel225.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel225MouseExited

    private void jLabel226MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel226MouseClicked
        check(jTable15, "teacher", jLabel227);
    }//GEN-LAST:event_jLabel226MouseClicked

    private void jLabel227MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel227MouseClicked
        back(jTable15, jLabel227, "الإبتدائي");
    }//GEN-LAST:event_jLabel227MouseClicked

    private void jComboBox16PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox16PopupMenuWillBecomeInvisible
         if (jComboBox16.getSelectedIndex()==0) {
            update_table(jTable16, "المتوسط");
        }else{
            update_table1(jComboBox16, "teacher","المتوسط", jTable16);
        }
        alart(jTable16);
    }//GEN-LAST:event_jComboBox16PopupMenuWillBecomeInvisible

    private void jTextField35KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField35KeyReleased
        serchF2(jList15, jTextField35, jTable16,"المتوسط" );
    }//GEN-LAST:event_jTextField35KeyReleased

    private void jList15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList15MouseClicked
        serchL2(jList15, jTextField35, jTable16);
    }//GEN-LAST:event_jList15MouseClicked

    private void jLabel230MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel230MouseClicked
       delete_m(jComboBox16,"add_m1");

    }//GEN-LAST:event_jLabel230MouseClicked

    private void jLabel230MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel230MouseEntered
        jLabel230.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel230MouseEntered

    private void jLabel230MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel230MouseExited
        jLabel230.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel230MouseExited

    private void jLabel231MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel231MouseClicked
        jComboBox24.removeAllItems();
        add_m.setVisible(true);
        int i=0 ;
        while (i<s[1].length) {            
            jComboBox24.addItem(s[1][i]);
            i++;
        }
    }//GEN-LAST:event_jLabel231MouseClicked

    private void jLabel231MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel231MouseEntered
     jLabel231.setBackground(Color.green);
    }//GEN-LAST:event_jLabel231MouseEntered

    private void jLabel231MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel231MouseExited
        jLabel231.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel231MouseExited

    private void jLabel232MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel232MouseClicked
        add_st2.setVisible(true);
        update_combo("add_m1","", jComboBox20);        
        jComboBox20.setEnabled(true);
    }//GEN-LAST:event_jLabel232MouseClicked

    private void jLabel232MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel232MouseEntered
       jLabel232.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel232MouseEntered

    private void jLabel232MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel232MouseExited
    jLabel232.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel232MouseExited

    private void jLabel233MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel233MouseClicked
         delete2(jTable16, "المتوسط");       
    }//GEN-LAST:event_jLabel233MouseClicked

    private void jLabel233MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel233MouseEntered
        jLabel233.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel233MouseEntered

    private void jLabel233MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel233MouseExited
        jLabel233.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel233MouseExited

    private void jLabel234MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel234MouseClicked
          setup2(jTable16, "add_m1");      
    }//GEN-LAST:event_jLabel234MouseClicked

    private void jLabel234MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel234MouseEntered
           jLabel234.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel234MouseEntered

    private void jLabel234MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel234MouseExited
        jLabel234.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel234MouseExited

    private void jLabel236MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel236MouseClicked
       check(jTable16, "teacher", jLabel237);
    }//GEN-LAST:event_jLabel236MouseClicked

    private void jLabel237MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel237MouseClicked
            back(jTable16, jLabel237, "المتوسط");
    }//GEN-LAST:event_jLabel237MouseClicked

    private void jLabel239MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel239MouseClicked
              setup_p(jTable16);
    }//GEN-LAST:event_jLabel239MouseClicked

    private void jLabel239MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel239MouseEntered
       jLabel239.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel239MouseEntered

    private void jLabel239MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel239MouseExited
       jLabel239.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel239MouseExited

    private void jComboBox17PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox17PopupMenuWillBecomeInvisible
         if (jComboBox17.getSelectedIndex()==0) {
            update_table(jTable17, "الثانوي");
        }else{
            update_table1(jComboBox17, "teacher","الثانوي", jTable17);
        }
        alart(jTable17);
    }//GEN-LAST:event_jComboBox17PopupMenuWillBecomeInvisible

    private void jComboBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox17ActionPerformed

    private void jTextField36KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField36KeyReleased
        serchF2(jList19, jTextField36, jTable17,"الثانوي" );
    }//GEN-LAST:event_jTextField36KeyReleased

    private void jList19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList19MouseClicked
        serchL2(jList19, jTextField36, jTable17);
    }//GEN-LAST:event_jList19MouseClicked

    private void jLabel242MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel242MouseClicked
          delete_m(jComboBox17,"add_m2");
    }//GEN-LAST:event_jLabel242MouseClicked

    private void jLabel242MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel242MouseEntered
       jLabel242.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel242MouseEntered

    private void jLabel242MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel242MouseExited
       jLabel242.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel242MouseExited

    private void jLabel243MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel243MouseClicked
           jComboBox24.removeAllItems();
        add_m.setVisible(true);
        int i=0 ;
        while (i<s[2].length) {            
            jComboBox24.addItem(s[2][i]);
            i++;
        }
    }//GEN-LAST:event_jLabel243MouseClicked

    private void jLabel243MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel243MouseEntered
       jLabel243.setBackground(Color.green);
    }//GEN-LAST:event_jLabel243MouseEntered

    private void jLabel243MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel243MouseExited
        jLabel243.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel243MouseExited

    private void jLabel244MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel244MouseClicked
       add_st2.setVisible(true);
        update_combo("add_m2","", jComboBox20);  
        jComboBox20.setEnabled(true);
    }//GEN-LAST:event_jLabel244MouseClicked

    private void jLabel244MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel244MouseEntered
        jLabel244.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel244MouseEntered

    private void jLabel244MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel244MouseExited
        jLabel244.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel244MouseExited

    private void jLabel245MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel245MouseClicked
   delete2(jTable17, "الثانوي");
    }//GEN-LAST:event_jLabel245MouseClicked

    private void jLabel245MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel245MouseEntered
        jLabel245.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel245MouseEntered

    private void jLabel245MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel245MouseExited
       jLabel245.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel245MouseExited

    private void jLabel246MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel246MouseClicked
        setup2(jTable17, "add_m2");         
    }//GEN-LAST:event_jLabel246MouseClicked

    private void jLabel246MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel246MouseEntered
        jLabel246.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel246MouseEntered

    private void jLabel246MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel246MouseExited
       jLabel246.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel246MouseExited

    private void jLabel249MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel249MouseClicked
             setup_p(jTable17);
    }//GEN-LAST:event_jLabel249MouseClicked

    private void jLabel249MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel249MouseEntered
        jLabel249.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel249MouseEntered

    private void jLabel249MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel249MouseExited
        jLabel249.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel249MouseExited

    private void jLabel250MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel250MouseClicked
    check(jTable17, "teacher", jLabel251);
    }//GEN-LAST:event_jLabel250MouseClicked

    private void jLabel251MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel251MouseClicked
             back(jTable17, jLabel251, "الثانوي");
    }//GEN-LAST:event_jLabel251MouseClicked

    private void jComboBox19PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox19PopupMenuWillBecomeInvisible
           if (jComboBox19.getSelectedIndex()==0) {
            update_table(jTable18, "دروس أخرى");
        }else{
            update_table1(jComboBox19, "teacher","دروس أخرى", jTable18);
        }
        alart(jTable18);
    }//GEN-LAST:event_jComboBox19PopupMenuWillBecomeInvisible

    private void jTextField40KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField40KeyReleased
        serchF2(jList20, jTextField40, jTable18, "دروس أخرى");
    }//GEN-LAST:event_jTextField40KeyReleased

    private void jList20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList20MouseClicked
        serchL2(jList20, jTextField40, jTable18);
    }//GEN-LAST:event_jList20MouseClicked

    private void jLabel254MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel254MouseClicked
   delete_m(jComboBox19,"add_m3");
    }//GEN-LAST:event_jLabel254MouseClicked

    private void jLabel254MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel254MouseEntered
        jLabel254.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel254MouseEntered

    private void jLabel254MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel254MouseExited
     jLabel254.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel254MouseExited

    private void jLabel255MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel255MouseClicked
             jComboBox24.removeAllItems();
             jComboBox24.setEnabled(false);
             add_m.setVisible(true);
       
    }//GEN-LAST:event_jLabel255MouseClicked

    private void jLabel255MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel255MouseEntered
      jLabel255.setBackground(Color.green);
    }//GEN-LAST:event_jLabel255MouseEntered

    private void jLabel255MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel255MouseExited
       jLabel255.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel255MouseExited

    private void jLabel256MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel256MouseClicked
         add_st2.setVisible(true);
        update_combo("add_m3","", jComboBox20);    
        jComboBox20.setEnabled(true);
    }//GEN-LAST:event_jLabel256MouseClicked

    private void jLabel256MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel256MouseEntered
       jLabel256.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel256MouseEntered

    private void jLabel256MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel256MouseExited
        jLabel256.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel256MouseExited

    private void jLabel257MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel257MouseClicked
   delete2(jTable18, "دروس أخرى");       
    }//GEN-LAST:event_jLabel257MouseClicked

    private void jLabel257MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel257MouseEntered
       jLabel257.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel257MouseEntered

    private void jLabel257MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel257MouseExited
        jLabel257.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel257MouseExited

    private void jLabel258MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel258MouseClicked
        setup2(jTable18, "add_m3");        
    }//GEN-LAST:event_jLabel258MouseClicked

    private void jLabel258MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel258MouseEntered
      jLabel258.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel258MouseEntered

    private void jLabel258MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel258MouseExited
        jLabel258.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel258MouseExited

    private void jLabel261MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel261MouseClicked
              setup_p(jTable18);
    }//GEN-LAST:event_jLabel261MouseClicked

    private void jLabel261MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel261MouseEntered
        jLabel261.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel261MouseEntered

    private void jLabel261MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel261MouseExited
       jLabel261.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel261MouseExited

    private void jLabel262MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel262MouseClicked
      check(jTable18, "teacher", jLabel263);
    }//GEN-LAST:event_jLabel262MouseClicked

    private void jLabel263MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel263MouseClicked
       back(jTable18, jLabel263, "دروس أخرى");
    }//GEN-LAST:event_jLabel263MouseClicked

    private void jTextField41KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField41KeyReleased
        serchF2(jList21, jTextField41, jTable19, "التحضيري");
    }//GEN-LAST:event_jTextField41KeyReleased

    private void jList21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList21MouseClicked
        serchL2(jList21, jTextField41, jTable19);
    }//GEN-LAST:event_jList21MouseClicked

    private void jLabel268MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel268MouseClicked
          add_st2.setVisible(true);
          jComboBox20.setEnabled(false);
    }//GEN-LAST:event_jLabel268MouseClicked

    private void jLabel268MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel268MouseEntered
       jLabel268.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel268MouseEntered

    private void jLabel268MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel268MouseExited
        jLabel268.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel268MouseExited

    private void jLabel269MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel269MouseClicked
    delete2(jTable19, "التحضيري");
    }//GEN-LAST:event_jLabel269MouseClicked

    private void jLabel269MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel269MouseEntered
     jLabel269.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel269MouseEntered

    private void jLabel269MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel269MouseExited
       jLabel269.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel269MouseExited

    private void jLabel270MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel270MouseClicked
                 setup_p(jTable19);
    }//GEN-LAST:event_jLabel270MouseClicked

    private void jLabel270MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel270MouseEntered
       jLabel270.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel270MouseEntered

    private void jLabel270MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel270MouseExited
        jLabel270.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel270MouseExited

    private void jLabel274MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel274MouseClicked
     check(jTable19, "teacher", jLabel274);
    }//GEN-LAST:event_jLabel274MouseClicked

    private void jLabel275MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel275MouseClicked
    back(jTable19, jLabel274, "التحضيري");
    }//GEN-LAST:event_jLabel275MouseClicked

    private void jTabbedPane4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane4MouseClicked
        
    }//GEN-LAST:event_jTabbedPane4MouseClicked

    private void jLabel276MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel276MouseClicked
        jPanel24.setVisible(false);
        jPanel1.setVisible(true);
                
    }//GEN-LAST:event_jLabel276MouseClicked

    private void jLabel276MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel276MouseEntered
       jLabel276.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel276MouseEntered

    private void jLabel276MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel276MouseExited
     jLabel276.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel276MouseExited

    private void jLabel218MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel218MouseExited
       jLabel218.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel218MouseExited

    private void jLabel218MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel218MouseEntered
      jLabel218.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel218MouseEntered

    private void jLabel218MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel218MouseClicked
            delete_m(jComboBox15,"add_m");
    }//GEN-LAST:event_jLabel218MouseClicked

    private void jLabel219MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel219MouseExited
       jLabel219.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel219MouseExited

    private void jLabel219MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel219MouseEntered
       jLabel219.setBackground(Color.green);
    }//GEN-LAST:event_jLabel219MouseEntered

    private void jLabel219MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel219MouseClicked
        jComboBox24.removeAllItems();
        add_m.setVisible(true);
        int i=0 ;
        while (i<s[0].length) {            
            jComboBox24.addItem(s[0][i]);
            i++;
        }
    }//GEN-LAST:event_jLabel219MouseClicked

    private void jTextField13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyReleased
        if (Integer.valueOf(jTextField13.getText())>=100) {
            JOptionPane.showMessageDialog(null, "لايجب ان تتخطى النسبة المئوية  100%");
            jTextField13.setText("");
        }
    }//GEN-LAST:event_jTextField13KeyReleased

    private void jLabel280MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel280MouseClicked
        add_st2.setVisible(false);
                                jTextField11.setText("");
                                jTextField12.setText("");
                                jTextField13.setText("");
                                jDateChooser3.setDate(null);
                                jComboBox20.removeAllItems();
    }//GEN-LAST:event_jLabel280MouseClicked

    private void jLabel280MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel280MouseEntered
        jLabel280.setBackground( new Color(255,153,0));
    }//GEN-LAST:event_jLabel280MouseEntered

    private void jLabel280MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel280MouseExited
      jLabel280.setBackground(Color.white);
    }//GEN-LAST:event_jLabel280MouseExited

    private void jLabel281MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel281MouseClicked
        
        switch(jTabbedPane4.getSelectedIndex()){
                case 1 :
               add_T(jTable15,"الإبتدائي","TP","الإبتدائي","/","إضافة");
                break;
                case 2 :
               add_T(jTable16,"المتوسط","TM","المتوسط","/","إضافة");                                
                break;
                case 3 :
               add_T(jTable17,"الثانوي","TH","الثانوي","/","إضافة");
                break;
                case 4 :
               add_T(jTable18,"دروس أخرى","TO","دروس أخرى","/","إضافة");
                break;
                case 0 :
               add_T(jTable19,"التحضيري","T","التحضيري","/","إضافة");
                break;
      }
    }//GEN-LAST:event_jLabel281MouseClicked

    private void jLabel281MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel281MouseEntered
        jLabel281.setBackground( Color.green);
    }//GEN-LAST:event_jLabel281MouseEntered

    private void jLabel281MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel281MouseExited
      jLabel281.setBackground( Color.white);
    }//GEN-LAST:event_jLabel281MouseExited

    private void jTextField58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField58ActionPerformed

    private void jTextField59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField59ActionPerformed

    private void jTextField60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField60ActionPerformed

    private void jTextField61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField61ActionPerformed

    private void jLabel290MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel290MouseClicked
       update2.setVisible(false);
       jTextField58.setText("");
       jTextField59.setText("");
       jTextField60.setText("");
       jTextField61.setText("");
       jTextField62.setText("");
       jDateChooser12.setDate(null);
       jComboBox22.removeAllItems();
    }//GEN-LAST:event_jLabel290MouseClicked

    private void jLabel290MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel290MouseEntered
       jLabel290.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel290MouseEntered

    private void jLabel290MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel290MouseExited
        jLabel290.setBackground(Color.WHITE);
    }//GEN-LAST:event_jLabel290MouseExited

    private void jLabel291MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel291MouseClicked
                 switch(jTabbedPane4.getSelectedIndex()){
                 case 1:
                     update2(jTable15, "الإبتدائي");
                 break;
                 case 2:
                     update2(jTable16, "المتوسط");
                 break;
                 case 3:
                     update2(jTable17, "الثانوي");
                 break;
                 case 4:
                     update2(jTable18, "دروس أخرى");
                 break;
                 case 0:
                     update2(jTable19, "التحضيري");
                 break;
    }
    }//GEN-LAST:event_jLabel291MouseClicked

    private void jLabel291MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel291MouseEntered
       jLabel291.setBackground(Color.green);
    }//GEN-LAST:event_jLabel291MouseEntered

    private void jLabel291MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel291MouseExited
        jLabel291.setBackground(Color.white);
    }//GEN-LAST:event_jLabel291MouseExited

    private void jTextField46KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField46KeyTyped
              char c = evt.getKeyChar();
        if (Character.isDigit(c)||KeyEvent.VK_PERIOD==c) {
           
        }else{
        getToolkit().beep();
        evt.consume(); 
        
        }
    }//GEN-LAST:event_jTextField46KeyTyped

    private void jLabel273MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel273MouseExited
        jLabel273.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel273MouseExited

    private void jLabel273MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel273MouseEntered
        jLabel273.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel273MouseEntered

    private void jLabel273MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel273MouseClicked
        setup2(jTable19, "");       
    }//GEN-LAST:event_jLabel273MouseClicked

    private void jLabel277MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel277MouseClicked
        jPanel40.setVisible(true);
        jPanel1.setVisible(false);
        update_table("movement_stock",jTable20);
    }//GEN-LAST:event_jLabel277MouseClicked

    private void jLabel277MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel277MouseEntered
        jLabel277.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel277MouseEntered

    private void jLabel277MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel277MouseExited
       jLabel277.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel277MouseExited

    private void jLabel152MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel152MouseExited
        jLabel152.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel152MouseExited

    private void jLabel152MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel152MouseEntered
        jLabel152.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel152MouseEntered

    private void jLabel152MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel152MouseClicked
        jPanel4.setVisible(false);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jLabel152MouseClicked

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
        jLabel17.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        jLabel17.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        setup(jTable1, "add_m3", "/", "other");      
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        jLabel16.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
      delete(jTable1,"other","دروس أخرى","/");
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseExited
        jLabel15.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel15MouseExited

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered
        jLabel15.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        
        update_combo("add_m3","/", jComboBox9);
        update_combo("دروس أخرى","/", jComboBox21);
         if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel146MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel146MouseClicked
    check(jTable1, "other", jLabel139);
    }//GEN-LAST:event_jLabel146MouseClicked

    private void jLabel139MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel139MouseClicked
     back(jTable1, jLabel139, "other");
    }//GEN-LAST:event_jLabel139MouseClicked

    private void jLabel147MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel147MouseExited
        jLabel147.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel147MouseExited

    private void jLabel147MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel147MouseEntered
        jLabel147.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel147MouseEntered

    private void jLabel147MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel147MouseClicked
               setup_p(jTable1);
    }//GEN-LAST:event_jLabel147MouseClicked

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        if (jComboBox1.getSelectedIndex()==0) {
            update_table3("other", jTable1);
        }else{
            update_table(jComboBox1, "other", jTable1);
        }
        alart(jTable1);
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
         serchL(jList3, jTextField23, jTable1, "other");
    }//GEN-LAST:event_jList3MouseClicked

    private void jTextField23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyReleased
      serchF(jList3, jTextField23, jTable1, "other");
    }//GEN-LAST:event_jTextField23KeyReleased

    private void jLabel172MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel172MouseClicked
       back(jTable8, jLabel172, "t_y_h_school");
    }//GEN-LAST:event_jLabel172MouseClicked

    private void jLabel171MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel171MouseClicked
     check(jTable8, "t_y_h_school", jLabel172);
    }//GEN-LAST:event_jLabel171MouseClicked

    private void jLabel90MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseExited
        jLabel90.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel90MouseExited

    private void jLabel90MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseEntered
        jLabel90.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel90MouseEntered

    private void jLabel90MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel90MouseClicked
             setup_p(jTable8);
    }//GEN-LAST:event_jLabel90MouseClicked

    private void jLabel69MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseExited
        jLabel69.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel69MouseExited

    private void jLabel69MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseEntered
        jLabel69.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel69MouseEntered

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
         setup(jTable7, "add_m2", "الثالثة", "t_y_h_school"); 
         update_combo("الثانوي","الثالثة", jComboBox21);
    }//GEN-LAST:event_jLabel69MouseClicked

    private void jLabel68MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseExited
        jLabel68.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel68MouseExited

    private void jLabel68MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseEntered
        jLabel68.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel68MouseEntered

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        delete(jTable8,"t_y_h_scool","الثانوي","الثالثة");
    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel67MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseExited
        jLabel67.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel67MouseExited

    private void jLabel67MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseEntered
        jLabel67.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel67MouseEntered

    private void jLabel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel67MouseClicked
        update_combo("add_m2","الثالثة", jComboBox9);
        update_combo("الثانوي","الثالثة", jComboBox21);
         if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel67MouseClicked

    private void jList10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList10MouseClicked
        serchL(jList10, jTextField30, jTable8, "t_y_h_school");
    }//GEN-LAST:event_jList10MouseClicked

    private void jTextField30KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField30KeyReleased
        serchF(jList10, jTextField30, jTable8, "t_y_h_school");
    }//GEN-LAST:event_jTextField30KeyReleased

    private void jComboBox8PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox8PopupMenuWillBecomeInvisible
        if (jComboBox8.getSelectedIndex()==0) {
            update_table3("t_y_h_school", jTable8);
        }else{
            update_table(jComboBox8, "t_y_h_school", jTable8);
        }
        alart(jTable8);
    }//GEN-LAST:event_jComboBox8PopupMenuWillBecomeInvisible

    private void jLabel170MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel170MouseClicked
      check(jTable7, "s_y_h_school", jLabel169);
    }//GEN-LAST:event_jLabel170MouseClicked

    private void jLabel169MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel169MouseClicked
        back(jTable7, jLabel169, "s_y_h_school");
    }//GEN-LAST:event_jLabel169MouseClicked

    private void jLabel88MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseExited
        jLabel88.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel88MouseExited

    private void jLabel88MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseEntered
        jLabel88.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel88MouseEntered

    private void jLabel88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseClicked
             setup_p(jTable7);
    }//GEN-LAST:event_jLabel88MouseClicked

    private void jLabel61MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseExited
        jLabel61.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel61MouseExited

    private void jLabel61MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseEntered
        jLabel61.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel61MouseEntered

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        setup(jTable7, "add_m2", "الثانية", "s_y_h_school");
        update_combo("الثانوي","الثانية", jComboBox21);
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jLabel60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseExited
        jLabel60.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel60MouseExited

    private void jLabel60MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseEntered
        jLabel60.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel60MouseEntered

    private void jLabel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel60MouseClicked
      delete(jTable7,"s_y_h_scool","الثانوي","الثانية");
    }//GEN-LAST:event_jLabel60MouseClicked

    private void jLabel59MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseExited
        jLabel59.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel59MouseExited

    private void jLabel59MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseEntered
        jLabel59.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel59MouseEntered

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked
        update_combo("add_m2","الثانية", jComboBox9);
        update_combo("الثانوي","الثانية", jComboBox21);
         if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel59MouseClicked

    private void jList9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList9MouseClicked
        serchL(jList9, jTextField29, jTable7, "s_y_h_school");
    }//GEN-LAST:event_jList9MouseClicked

    private void jTextField29KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField29KeyReleased
        serchF(jList9, jTextField29, jTable7, "s_y_h_school");
    }//GEN-LAST:event_jTextField29KeyReleased

    private void jComboBox7PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox7PopupMenuWillBecomeInvisible
        if (jComboBox7.getSelectedIndex()==0) {
            update_table3("s_y_h_school", jTable7);
        }else{
            update_table(jComboBox7, "s_y_h_school", jTable7);
        }
        alart(jTable7);
    }//GEN-LAST:event_jComboBox7PopupMenuWillBecomeInvisible

    private void jLabel168MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel168MouseClicked
                 check(jTable6, "f_y_h_school", jLabel145);
    }//GEN-LAST:event_jLabel168MouseClicked

    private void jLabel145MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel145MouseClicked
        back(jTable6, jLabel145, "f_y_h_school");
    }//GEN-LAST:event_jLabel145MouseClicked

    private void jLabel86MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseExited
        jLabel86.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel86MouseExited

    private void jLabel86MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseEntered
        jLabel86.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel86MouseEntered

    private void jLabel86MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel86MouseClicked
              setup_p(jTable6);
    }//GEN-LAST:event_jLabel86MouseClicked

    private void jLabel47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseExited
        jLabel47.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel47MouseExited

    private void jLabel47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseEntered
        jLabel47.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel47MouseEntered

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel47MouseClicked
        setup(jTable6, "add_m2", "الأولى", "f_y_h_school"); 
        update_combo("الثانوي","الأولى", jComboBox21);
    }//GEN-LAST:event_jLabel47MouseClicked

    private void jLabel46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseExited
        jLabel46.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel46MouseExited

    private void jLabel46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseEntered
        jLabel46.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel46MouseEntered

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
       delete(jTable6,"f_y_h_scool","الثانوي","الأولى");
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseExited
        jLabel45.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel45MouseExited

    private void jLabel45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseEntered
        jLabel45.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel45MouseEntered

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        
        update_combo("add_m2","الأولى", jComboBox9);
        update_combo("الثانوي","الأولى", jComboBox21);
         if (jComboBox9.getItemCount()==0||jComboBox21.getItemCount()==0) {
            JOptionPane.showMessageDialog(null, "لا يمكن إضافة تلاميذ");
              jComboBox9.removeAllItems();
            jComboBox21.removeAllItems();
        } else {
            add_st.setVisible(true);
        }
    }//GEN-LAST:event_jLabel45MouseClicked

    private void jList8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList8MouseClicked
        serchL(jList8, jTextField28, jTable6, "f_y_h_school");
    }//GEN-LAST:event_jList8MouseClicked

    private void jTextField28KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField28KeyReleased
        serchF(jList8, jTextField28, jTable6, "f_y_h_school");
    }//GEN-LAST:event_jTextField28KeyReleased

    private void jLabel55KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel55KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel55KeyReleased

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox6PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox6PopupMenuWillBecomeInvisible
        if (jComboBox6.getSelectedIndex()==0) {
            update_table3("f_y_h_school", jTable6);
        }else{
            update_table(jComboBox6, "f_y_h_school", jTable6);
        }
        alart(jTable6);

    }//GEN-LAST:event_jComboBox6PopupMenuWillBecomeInvisible

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
         jTextField14.setText("");
         jTextField15.setText("");
         add_cost.setVisible(true);
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseEntered

    private void jLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseExited

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        delete(jTable20, "movement_stock","","");
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseEntered

    private void jLabel31MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseExited

    private void jLabel296MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel296MouseClicked
        jPanel40.setVisible(false);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jLabel296MouseClicked

    private void jLabel296MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel296MouseEntered
         jLabel296.setBackground(new Color(255,153,0));        
    }//GEN-LAST:event_jLabel296MouseEntered

    private void jLabel296MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel296MouseExited
         jLabel296.setBackground(new Color(0,0,204));       
    }//GEN-LAST:event_jLabel296MouseExited

    private void jComboBox9PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox9PopupMenuWillBecomeInvisible
        jComboBox21.removeAllItems();
        if (jPanel15.isVisible()) {
            switch(jTabbedPane3.getSelectedIndex()){
            
                case 0:
                 update_combo("الإبتدائي","الأولى", jComboBox21);
                    break;
                case 1:
                    update_combo("الإبتدائي","الثانية", jComboBox21);
                    break;
                case 2:
                    update_combo("الإبتدائي","الثالثة", jComboBox21);
                    break;
                case 3:
                    update_combo("الإبتدائي","الرابعة", jComboBox21);
                    break;
                case 4:
                    update_combo("الإبتدائي","الخامسة", jComboBox21);
                    break;
            }
        } else {
               if (jPanel3.isVisible()) {
            switch(jTabbedPane1.getSelectedIndex()){
            
                case 0:
                 update_combo("المتوسط","الأولى", jComboBox21);
                    break;
                case 1:
                    update_combo("المتوسط","الثانية", jComboBox21);
                    break;
                case 2:
                    update_combo("المتوسط","الثالثة", jComboBox21);
                    break;
                case 3:
                    update_combo("المتوسط","الرابعة", jComboBox21);
                    break;
              
            }
                
            } else {
                            if (jPanel9.isVisible()) {
            switch(jTabbedPane2.getSelectedIndex()){
            
                case 0:
                 update_combo("الثانوي","الأولى", jComboBox21);
                    break;
                case 1:
                    update_combo("الثانوي","الثانية", jComboBox21);
                    break;
                case 2:
                    update_combo("الثانوي","الثالثة", jComboBox21);
                    break;
             
              
            }
                       
                   } else {
                                if (jPanel4.isVisible()) {
                                  update_combo("دروس أخرى","/", jComboBox21);  
                                }
                   }
            }
        }

        
    }//GEN-LAST:event_jComboBox9PopupMenuWillBecomeInvisible

    private void jComboBox18PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox18PopupMenuWillBecomeInvisible
         jComboBox23.removeAllItems();
        if (jPanel15.isVisible()) {
            switch(jTabbedPane3.getSelectedIndex()){
            
                case 0:
                 update_combo("الإبتدائي","الأولى", jComboBox23);
                    break;
                case 1:
                    update_combo("الإبتدائي","الثانية", jComboBox23);
                    break;
                case 2:
                    update_combo("الإبتدائي","الثالثة", jComboBox23);
                    break;
                case 3:
                    update_combo("الإبتدائي","الرابعة", jComboBox23);
                    break;
                case 4:
                    update_combo("الإبتدائي","الخامسة", jComboBox23);
                    break;
            }
        } else {
               if (jPanel3.isVisible()) {
            switch(jTabbedPane1.getSelectedIndex()){
            
                case 0:
                 update_combo("المتوسط","الأولى", jComboBox23);
                    break;
                case 1:
                    update_combo("المتوسط","الثانية", jComboBox23);
                    break;
                case 2:
                    update_combo("المتوسط","الثالثة", jComboBox23);
                    break;
                case 3:
                    update_combo("المتوسط","الرابعة", jComboBox23);
                    break;
              
            }
                
            } else {
                            if (jPanel9.isVisible()) {
            switch(jTabbedPane2.getSelectedIndex()){
            
                case 0:
                 update_combo("الثانوي","الأولى", jComboBox23);
                    break;
                case 1:
                    update_combo("الثانوي","الثانية", jComboBox23);
                    break;
                case 2:
                    update_combo("الثانوي","الثالثة", jComboBox23);
                    break;
             
              
            }
                       
                   } else {
                                if (jPanel4.isVisible()) {
                                  update_combo("دروس أخرى","/", jComboBox23);  
                                }
                   }
            }
        }
    }//GEN-LAST:event_jComboBox18PopupMenuWillBecomeInvisible

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
       String thedate1 =dateformat.format(jDateChooser7.getDate());
       String thedate2 =dateformat.format(jDateChooser6.getDate());
      
        
        try {
            String querry = "select *from movement_stock where التاريخ between '"+thedate1+"'  and '"+thedate2+"'";
            pst = con.prepareStatement(querry);
            rs = pst.executeQuery();
          jTable20.setModel(DbUtils.resultSetToTableModel(rs));  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
           try {
               rs.close();
               pst.close();
           } catch (SQLException ex) {
               
           }
        }
        double sum1 = 0.0;
        double sum4 = 0.0;
        int i=0;
        while (i<jTable20.getRowCount()) {  
            try {
                
                 String value1 = jTable20.getModel().getValueAt(i, 4).toString();
                 sum1+= Double.parseDouble(value1);
                 i++;
            } catch (NumberFormatException e) {
                
                i++;
            }}
        i=0;
        while (i<jTable20.getRowCount()) {  
            try {
                
                 String value2 = jTable20.getModel().getValueAt(i, 3).toString();
                 
                 sum4 += Double.parseDouble(value2);
                 i++;
            } catch (NumberFormatException e) {
              
                i++;
            }}

        double sum3 = sum4-sum1;
       jLabel38.setText(sum4+"");
       jLabel44.setText(sum1+"");
       jLabel57.setText(sum3+"");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseExited

    private void jLabel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseEntered

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
              int row = jTable20.getSelectedRow();
              String table_click = jTable20.getModel().getValueAt(row, 0).toString();
             try {
            String sql = "select الإسم,دفع from movement_stock where الرقم='"+table_click+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
                 if (rs.next()) {
                    jTextField14.setText(rs.getString("الإسم"));
                    jTextField15.setText(rs.getString("دفع"));
                 }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            
            try {
                rs.close();
                pst.close();
             
            } catch (SQLException ex) {
             
            }
        }
             add_cost.setVisible(true);
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel65MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseEntered
        jLabel65.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel65MouseEntered

    private void jLabel65MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseExited
       jLabel65.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel65MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel65MouseClicked
    try {
        pst.close();
        rs.close();
        con.close();
         } catch (SQLException ex) {
        
    }
        setEnabled(false);
       new setting().setVisible(true);
    }//GEN-LAST:event_jLabel65MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int i=0;
        String num=null;
        if (jTable20.getRowCount()==0) {

            num="C0001";
        }else{
            while (i<jTable20.getRowCount() ) {
                String numb = jTable20.getValueAt(i,0).toString();

                StringBuilder number = new StringBuilder(numb);
                number.deleteCharAt(0);
                if(i+1!=Integer.valueOf(number.toString())){
                    num="C0001";
                }
                if (i+1==Integer.valueOf(number.toString())) {
                    i++;

                    if (jTable20.getRowCount()==i) {

                        if (0<(i+1)&&(i+1)<10) {
                            num="C000"+String.valueOf(i+1);

                        }else{
                            if (10<(i+1)&&(i+1)<100) {
                                num="C00"+String.valueOf(i+1);
                            }else{
                                if (100<=(i+1)&&(i+1)<1000) {
                                    num="C0"+String.valueOf(i+1);
                                }else{
                                    if (1000<=(i+1)) {
                                        num="C"+String.valueOf(i+1);
                                    }
                                }}}
                                i= jTable20.getRowCount()+1;

                            }

                        }else{

                            if (0<i&&i<10) {
                                num="C000"+String.valueOf(i+1);

                            }else{
                                if (10<i&&i<100) {
                                    num="C00"+String.valueOf(i+1);
                                }else{
                                    if (100<=i&&i<1000) {
                                        num="C0"+String.valueOf(i+1);
                                    }else{
                                        if (1000<=i) {
                                            num="C"+String.valueOf(i+1);
                                        }
                                    }}}

                                    i= jTable20.getRowCount()+1;
                                }

                            }}

                            java.sql.Date date = new java.sql.Date(new Date().getTime()) ;
                            String namec = jTextField14.getText();
                            String cost = jTextField15.getText();

                            try {
                                String sql ="Insert into movement_stock (الرقم,الإسم ,الوظيفة,استلام,دفع,التاريخ) values ('"+num+"','"+namec+"','/','/','"+cost+"','"+date+"')";
                                pst = con.prepareStatement(sql);
                                pst.execute();
                            } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null, e);
                            }finally{

                                try {

                                    pst.close();
                                } catch (SQLException ex) {

                                }}
                                add_cost.setVisible(false);
                                update_table("movement_stock",jTable20);
                                  jTable20.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                setHorizontalAlignment(RIGHT);
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
            }
          
          });
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int row = jTable20.getSelectedRow();
        String table_click = jTable20.getModel().getValueAt(row, 0).toString();
        try{
            String query = "update movement_stock set الإسم='"+jTextField16.getText()+"' , استلام = '"+jTextField17.getText()+"' where الرقم ='"+table_click+"' ";
            pst = con.prepareStatement(query);
            pst.execute();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                pst.close();
            } catch (SQLException ex) {

            }}
          jTable20.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                setHorizontalAlignment(RIGHT);
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
          
          });
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel66MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseEntered
        jLabel66.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel66MouseEntered

    private void jLabel66MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseExited
      jLabel66.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel66MouseExited

    private void jLabel94MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseEntered
     jLabel94.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel94MouseEntered

    private void jLabel94MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseExited
      jLabel94.setBackground(new Color(0,0,204));        
    }//GEN-LAST:event_jLabel94MouseExited

    private void jLabel94MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel94MouseClicked
      String name = null, password = null;
     int id=0;
        
            try {       
            String query="select *from user";
            pst = con.prepareStatement(query);
            rs= pst.executeQuery();
            if (rs.next()) {
                name= rs.getString("الإسم");
                password= rs.getString("كلمة السر");
                id= rs.getInt("id");
                }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pst.close();
                con.close();
            } catch (SQLException ex) {
            
            }}
       
            setEnabled(false);
            
          change_user_info user = new change_user_info();
         user.jTextField1.setText(name);
         user.jPasswordField2.setText(password);
         user.jLabel1.setText(String.valueOf(id));
         
         
         user.setVisible(true);
       
    }//GEN-LAST:event_jLabel94MouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        jPanel44.setVisible(true);
        jPanel1.setVisible(false);
        update_table3("actions",jTable21);
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel101MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel101MouseExited
         jLabel101.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel101MouseExited

    private void jLabel101MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel101MouseEntered
        jLabel101.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_jLabel101MouseEntered

    private void jLabel101MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel101MouseClicked
        jPanel44.setVisible(false);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jLabel101MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        String thedate1 =dateformat.format(jDateChooser4.getDate());
        String thedate2 =dateformat.format(jDateChooser5.getDate());

        try {
            String querry = "select *from actions where التاريخ between '"+thedate1+"'  and '"+thedate2+"'";
            pst = con.prepareStatement(querry);
            rs = pst.executeQuery();
            jTable21.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try {
                rs.close();
                pst.close();
            } catch (SQLException ex) {

            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel298MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel298MouseClicked
        try {
               switch(jTabbedPane1.getSelectedIndex()){
        case 0:
            Export(jTable2,"Middle school.xlsx");
            break;
        case 1:
            Export(jTable3,"Middle school.xlsx");
            break;
        case 2:
            Export(jTable4,"Middle school.xlsx");
            break;
        case 3:
            Export(jTable5,"Middle school.xlsx");
            break;
        
    }  
        } catch (IOException e) {
        } catch (InvalidFormatException ex) {
        Logger.getLogger(school.class.getName()).log(Level.SEVERE, null, ex);
    }
   
    }//GEN-LAST:event_jLabel298MouseClicked

    private void jLabel297MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel297MouseClicked
    try {
        Export(jTable1,"other.xlsx");
    } catch (IOException ex) {
        Logger.getLogger(school.class.getName()).log(Level.SEVERE, null, ex);
    } catch (InvalidFormatException ex) {
        Logger.getLogger(school.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jLabel297MouseClicked

    private void jLabel111MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseClicked
        try {
            switch(jTabbedPane3.getSelectedIndex()){
        case 0:
            Export(jTable9,"Elementary school.xlsx");
            break;
        case 1:
            Export(jTable10,"Elementary school.xlsx");
            break;
        case 2:
            Export(jTable11,"Elementary school.xlsx");
            break;
        case 3:
            Export(jTable12,"Elementary school.xlsx");
            break;
        case 4:
            Export(jTable13,"Elementary school.xlsx");
            break;
       }
        } catch (IOException e) {
        } catch (InvalidFormatException ex) {
        Logger.getLogger(school.class.getName()).log(Level.SEVERE, null, ex);
    }
           
    }//GEN-LAST:event_jLabel111MouseClicked

    private void jLabel187MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel187MouseClicked
    try {
        
        Export(jTable14,"preparatory year.xlsx");
    } catch (IOException ex) {
        
    } catch (InvalidFormatException ex) {
        Logger.getLogger(school.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jLabel187MouseClicked

    private void jLabel122MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel122MouseClicked
      try {
            switch(jTabbedPane4.getSelectedIndex()){
        case 0:
            Export(jTable19,"teachers.xlsx");
            break;
        case 1:
            Export(jTable15,"teachers.xlsx");
            break;
        case 2:
            Export(jTable16,"teachers.xlsx");
            break;
        case 3:
            Export(jTable17,"teachers.xlsx");
            break;
        case 4:
            Export(jTable18,"teachers.xlsx");
            break;
       }
        } catch (IOException | InvalidFormatException e) {
        }
    }//GEN-LAST:event_jLabel122MouseClicked

    private void jLabel121MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel121MouseClicked
         try {
            switch(jTabbedPane2.getSelectedIndex()){
                case 0:
                Export(jTable6,"hight school.xlsx");
                break;
                case 1:
                Export(jTable7,"hight school.xlsx");
                break;
                case 2:
                Export(jTable8,"hight school.xlsx");
                break;
            }
        } catch (IOException e) {
        } catch (InvalidFormatException ex) {
        Logger.getLogger(school.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jLabel121MouseClicked

    private void jLabel298MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel298MouseEntered
        jLabel298.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel298MouseEntered

    private void jLabel297MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel297MouseEntered
        jLabel297.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel297MouseEntered

    private void jLabel121MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel121MouseEntered
        jLabel121.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel121MouseEntered

    private void jLabel111MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseEntered
        jLabel111.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel111MouseEntered

    private void jLabel187MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel187MouseEntered
        jLabel187.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel187MouseEntered

    private void jLabel122MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel122MouseEntered
        jLabel122.setBackground(new Color(204,102,0));
    }//GEN-LAST:event_jLabel122MouseEntered

    private void jLabel298MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel298MouseExited
      jLabel298.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel298MouseExited

    private void jLabel297MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel297MouseExited
        jLabel297.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel297MouseExited

    private void jLabel121MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel121MouseExited
       jLabel121.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel121MouseExited

    private void jLabel111MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel111MouseExited
        jLabel111.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel111MouseExited

    private void jLabel187MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel187MouseExited
       jLabel187.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel187MouseExited

    private void jLabel122MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel122MouseExited
       jLabel122.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jLabel122MouseExited

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
       char c = evt.getKeyChar();
        if (!(Character.isDigit(c)||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField61KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField61KeyTyped
           char c = evt.getKeyChar();
        if (!(Character.isDigit(c)||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField61KeyTyped

    private void jTextField61KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField61KeyReleased
           if (Integer.valueOf(jTextField61.getText())>=100) {
            JOptionPane.showMessageDialog(null, "لايجب ان تتخطى النسبة المئوية  100%");
            jTextField61.setText("");
        }
    }//GEN-LAST:event_jTextField61KeyReleased
    public static void main(String args[]) {
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(school.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
          new school().setVisible(true);
                 
                  
               
        });   
          

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame add_cost;
    private javax.swing.JFrame add_m;
    private javax.swing.JFrame add_st;
    private javax.swing.JFrame add_st1;
    private javax.swing.JFrame add_st2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser10;
    private com.toedter.calendar.JDateChooser jDateChooser11;
    private com.toedter.calendar.JDateChooser jDateChooser12;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel227;
    private javax.swing.JLabel jLabel228;
    private javax.swing.JLabel jLabel229;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel230;
    private javax.swing.JLabel jLabel231;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel246;
    private javax.swing.JLabel jLabel247;
    private javax.swing.JLabel jLabel248;
    private javax.swing.JLabel jLabel249;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel250;
    private javax.swing.JLabel jLabel251;
    private javax.swing.JLabel jLabel252;
    private javax.swing.JLabel jLabel253;
    private javax.swing.JLabel jLabel254;
    private javax.swing.JLabel jLabel255;
    private javax.swing.JLabel jLabel256;
    private javax.swing.JLabel jLabel257;
    private javax.swing.JLabel jLabel258;
    private javax.swing.JLabel jLabel259;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel260;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
    private javax.swing.JLabel jLabel268;
    private javax.swing.JLabel jLabel269;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel270;
    private javax.swing.JLabel jLabel271;
    private javax.swing.JLabel jLabel272;
    private javax.swing.JLabel jLabel273;
    private javax.swing.JLabel jLabel274;
    private javax.swing.JLabel jLabel275;
    private javax.swing.JLabel jLabel276;
    public javax.swing.JLabel jLabel277;
    private javax.swing.JLabel jLabel278;
    private javax.swing.JLabel jLabel279;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel280;
    private javax.swing.JLabel jLabel281;
    private javax.swing.JLabel jLabel282;
    private javax.swing.JLabel jLabel283;
    private javax.swing.JLabel jLabel284;
    private javax.swing.JLabel jLabel285;
    private javax.swing.JLabel jLabel286;
    private javax.swing.JLabel jLabel287;
    private javax.swing.JLabel jLabel288;
    private javax.swing.JLabel jLabel289;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel290;
    private javax.swing.JLabel jLabel291;
    private javax.swing.JLabel jLabel292;
    private javax.swing.JLabel jLabel293;
    private javax.swing.JLabel jLabel294;
    private javax.swing.JLabel jLabel295;
    private javax.swing.JLabel jLabel296;
    private javax.swing.JLabel jLabel297;
    private javax.swing.JLabel jLabel298;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    public javax.swing.JLabel jLabel65;
    public javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLayeredPane jLayeredPane10;
    private javax.swing.JLayeredPane jLayeredPane11;
    private javax.swing.JLayeredPane jLayeredPane12;
    private javax.swing.JLayeredPane jLayeredPane13;
    private javax.swing.JLayeredPane jLayeredPane14;
    private javax.swing.JLayeredPane jLayeredPane15;
    private javax.swing.JLayeredPane jLayeredPane16;
    private javax.swing.JLayeredPane jLayeredPane17;
    private javax.swing.JLayeredPane jLayeredPane18;
    private javax.swing.JLayeredPane jLayeredPane19;
    private javax.swing.JLayeredPane jLayeredPane20;
    private javax.swing.JLayeredPane jLayeredPane21;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JLayeredPane jLayeredPane9;
    private javax.swing.JList<String> jList10;
    private javax.swing.JList<String> jList11;
    private javax.swing.JList<String> jList12;
    private javax.swing.JList<String> jList13;
    private javax.swing.JList<String> jList14;
    private javax.swing.JList<String> jList15;
    private javax.swing.JList<String> jList16;
    private javax.swing.JList<String> jList17;
    private javax.swing.JList<String> jList18;
    private javax.swing.JList<String> jList19;
    private javax.swing.JList<String> jList20;
    private javax.swing.JList<String> jList21;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JList<String> jList7;
    private javax.swing.JList<String> jList8;
    private javax.swing.JList<String> jList9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    public javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable16;
    private javax.swing.JTable jTable17;
    private javax.swing.JTable jTable18;
    private javax.swing.JTable jTable19;
    private javax.swing.JTable jTable2;
    public javax.swing.JTable jTable20;
    private javax.swing.JTable jTable21;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JFrame payment;
    private javax.swing.JFrame update;
    private javax.swing.JFrame update1;
    private javax.swing.JFrame update2;
    private javax.swing.JFrame update_cost;
    // End of variables declaration//GEN-END:variables
}
