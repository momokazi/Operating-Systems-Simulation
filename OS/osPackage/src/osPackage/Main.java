package osPackage;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
      
    }
   
     public JTable getjTable_t1() {
        return jTable_t1;
    }
    public JTable getjTable_fcfs() {
        return jTable_fcfs;
    }
    public JTable getjTable_p() {
        return jTable_p;
    }
  

    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_pid = new javax.swing.JTextField();
        jTextField_pname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_ppriority = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_pAT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_ms = new javax.swing.JTextField();
        jButton_save = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jTextField_pBT = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_pid1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_pid2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_pid3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_pid4 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_pid5 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jTextField_pid6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField_pid7 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField1_p = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jTextField1_s = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField2_f = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jButton40 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_fcfs = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_p = new javax.swing.JTable();
        jButton29 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        new javax.swing.JScrollPane();
        new javax.swing.JButton();
        new javax.swing.JTextField();
        new javax.swing.JLabel();
        new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        new javax.swing.JLabel();
        new javax.swing.JTextField();
        new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_t1 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OS Project");
        setResizable(false);
        setSize(new java.awt.Dimension(750, 550));

        jTabbedPane1.setBackground(new java.awt.Color(75,75,75));
        jTabbedPane1.setToolTipText("OS PROJECT");
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(750, 550));

        jPanel1.setBackground(new java.awt.Color(75,75,75));

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 5, 20)); 
        jButton1.setForeground(new java.awt.Color(102, 102, 0));
        jButton1.setText("Process Management");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 5, 20)); 
        jButton2.setForeground(new java.awt.Color(102, 102, 0));
        jButton2.setText("Memory Management");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", 5, 20)); 
        jButton3.setForeground(new java.awt.Color(102, 102, 0));
        jButton3.setText("Scheduling");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 5, 20)); 
        jButton5.setForeground(new java.awt.Color(102, 102, 0));
        jButton5.setText("PCB");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 0));
        jButton6.setFont(new java.awt.Font("Times New Roman", 5, 20)); 
        jButton6.setForeground(new java.awt.Color(102, 102, 0));
        jButton6.setText("EXIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

       
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(242, 242, 242)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(137, 137, 137)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(47, Short.MAX_VALUE))
);

jPanel1Layout.setVerticalGroup(
    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addComponent(jButton1)
            .addGap(31, 31, 31)
            .addComponent(jButton2)
            .addGap(32, 32, 32)
            .addComponent(jButton3)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jLabel28))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jButton5)))
            .addGap(20, 20, 20)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton6)
                .addComponent(jLabel32))
            .addGap(30, 30, 30)
            .addComponent(jLabel34)
            .addContainerGap(176, Short.MAX_VALUE))
);

        jTabbedPane1.addTab("Main Menu", jPanel1);

        jPanel10.setBackground(new java.awt.Color(75,75,75));

        jButton7.setBackground(new java.awt.Color(75,75,75));
        jButton7.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); 
        jButton7.setForeground(new java.awt.Color(255, 255, 102));
        jButton7.setText("CREATE PROCESS");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 0), null, new java.awt.Color(51, 51, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(75,75,75));
        jButton11.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); 
        jButton11.setForeground(new java.awt.Color(255, 255, 102));
        jButton11.setText("RESUME PROCESS");
        jButton11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 0), null, new java.awt.Color(51, 51, 0)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(75,75,75));
        jButton12.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); 
        jButton12.setForeground(new java.awt.Color(255, 255, 102));
        jButton12.setText("SUSPEND PROCESS");
        jButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 0), null, new java.awt.Color(51, 51, 0)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(75,75,75));
        jButton13.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); 
        jButton13.setForeground(new java.awt.Color(255, 255, 102));
        jButton13.setText("DISTROY PROCESS");
        jButton13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 0), null, new java.awt.Color(51, 51, 0)));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(75,75,75));
        jButton14.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); 
        jButton14.setForeground(new java.awt.Color(255, 255, 102));
        jButton14.setText("BLOCK PROCESS");
        jButton14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 0), null, new java.awt.Color(51, 51, 0)));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(75,75,75));
        jButton15.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); 
        jButton15.setForeground(new java.awt.Color(255, 255, 102));
        jButton15.setText("WAKEUP PROCESS");
        jButton15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 0), null, new java.awt.Color(51, 51, 0)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(75,75,75));
        jButton16.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); 
        jButton16.setForeground(new java.awt.Color(255, 255, 102));
        jButton16.setText("DISPATCH PROCESS");
        jButton16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 0), null, new java.awt.Color(51, 51, 0)));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(75,75,75));
        jButton17.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); 
        jButton17.setForeground(new java.awt.Color(255, 255, 102));
        jButton17.setText("CHANGE PRIORITY");
        jButton17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 0), null, new java.awt.Color(51, 51, 0)));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(75,75,75));
        jButton18.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); 
        jButton18.setForeground(new java.awt.Color(255, 255, 102));
        jButton18.setText("MAIN MENU");
        jButton18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 0), null, new java.awt.Color(51, 51, 0)));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); 
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("PCB MENU");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addGap(18, 18, 18)
                .addComponent(jButton14)
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addGap(18, 18, 18)
                .addComponent(jButton16)
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.setBackground(new java.awt.Color(75,75,75));

        jPanel19.setBackground(new java.awt.Color(204, 204, 0));

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("ID");

        jTextField_pid.setBackground(new java.awt.Color(75,75,75));
        jTextField_pid.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_pid.setForeground(new java.awt.Color(255, 255, 255));

        jTextField_pname.setBackground(new java.awt.Color(75,75,75));
        jTextField_pname.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_pname.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("NAME");

        jLabel6.setBackground(new java.awt.Color(153, 153, 255));
        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("PRIORITY");

        jTextField_ppriority.setBackground(new java.awt.Color(75,75,75));
        jTextField_ppriority.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_ppriority.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(153, 153, 255));
        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("ARRIVAL TIME");

        jTextField_pAT.setBackground(new java.awt.Color(75,75,75));
        jTextField_pAT.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_pAT.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(153, 153, 255));
        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("BURST TIME");

        jTextField_ms.setBackground(new java.awt.Color(75,75,75));
        jTextField_ms.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_ms.setForeground(new java.awt.Color(255, 255, 255));

        jButton_save.setBackground(new java.awt.Color(75,75,75));
        jButton_save.setFont(new java.awt.Font("Segoe UI", 3, 14)); 
        jButton_save.setForeground(new java.awt.Color(255, 255, 255));
        jButton_save.setText("SAVE");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(153, 153, 255));
        jLabel29.setFont(new java.awt.Font("Verdana", 0, 14)); 
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("MEMORY SIZE");

        jTextField_pBT.setBackground(new java.awt.Color(75,75,75));
        jTextField_pBT.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_pBT.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3)
                        .addGap(76, 76, 76)
                        .addComponent(jTextField_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_pname, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_ppriority, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_pAT, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_ms, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_pBT, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton_save, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_ppriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_pAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField_pBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel29)
                    .addComponent(jTextField_ms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jButton_save)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab1", jPanel11);

        jPanel12.setBackground(new java.awt.Color(75,75,75));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("Destroy the Process");

        jTextField_pid1.setBackground(new java.awt.Color(75,75,75));
        jTextField_pid1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_pid1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setBackground(new java.awt.Color(153, 153, 255));
        jLabel9.setFont(new java.awt.Font("Verdana", 3, 18)); 
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("ID");

        jButton8.setBackground(new java.awt.Color(102, 102, 0));
        jButton8.setFont(new java.awt.Font("Segoe UI", 3, 15)); 
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("DestroyProcess");
        jButton8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel10))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jTextField_pid1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_pid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(jButton8)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab2", jPanel12);

        jPanel13.setBackground(new java.awt.Color(75,75,75));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        jLabel11.setForeground(new java.awt.Color(102, 102, 0));
        jLabel11.setText("Resume the Process");

        jTextField_pid2.setBackground(new java.awt.Color(75,75,75));
        jTextField_pid2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_pid2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setBackground(new java.awt.Color(153, 153, 255));
        jLabel17.setFont(new java.awt.Font("Verdana", 3, 18)); 
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("ID");

        jButton24.setBackground(new java.awt.Color(102, 102, 0));
        jButton24.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("ResumeProcess");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel11))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_pid2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addGap(44, 44, 44)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_pid2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(jButton24)
                .addContainerGap(216, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel13Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("tab3", jPanel13);

        jPanel14.setBackground(new java.awt.Color(75,75,75));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        jLabel12.setForeground(new java.awt.Color(102, 102, 0));
        jLabel12.setText("Suspend the Process");

        jTextField_pid3.setBackground(new java.awt.Color(75,75,75));
        jTextField_pid3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_pid3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setBackground(new java.awt.Color(153, 153, 255));
        jLabel18.setFont(new java.awt.Font("Verdana", 3, 18)); 
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("ID");

        jButton25.setBackground(new java.awt.Color(102, 102, 0));
        jButton25.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("SuspendProcess");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel12))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField_pid3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel12)
                .addGap(43, 43, 43)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_pid3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jButton25)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab4", jPanel14);

        jPanel15.setBackground(new java.awt.Color(75,75,75));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        jLabel13.setForeground(new java.awt.Color(102, 102, 0));
        jLabel13.setText("Block the Process");

        jTextField_pid4.setBackground(new java.awt.Color(75,75,75));
        jTextField_pid4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_pid4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setBackground(new java.awt.Color(153, 153, 255));
        jLabel19.setFont(new java.awt.Font("Verdana", 3, 18)); 
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("ID");

        jButton26.setBackground(new java.awt.Color(102, 102, 0));
        jButton26.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("BlockedProcess");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel13))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_pid4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_pid4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(jButton26)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab5", jPanel15);

        jPanel16.setBackground(new java.awt.Color(75,75,75));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        jLabel14.setForeground(new java.awt.Color(102, 102, 0));
        jLabel14.setText("Wakeup the Process");

        jTextField_pid5.setBackground(new java.awt.Color(75,75,75));
        jTextField_pid5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_pid5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel20.setBackground(new java.awt.Color(153, 153, 255));
        jLabel20.setFont(new java.awt.Font("Verdana", 3, 18)); 
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("ID");

        jButton27.setBackground(new java.awt.Color(102, 102, 0));
        jButton27.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("WakeupProcess");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel14))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jTextField_pid5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel14)
                .addGap(23, 23, 23)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_pid5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(jButton27)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab6", jPanel16);

        jPanel17.setBackground(new java.awt.Color(75,75,75));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        jLabel15.setForeground(new java.awt.Color(102, 102, 0));
        jLabel15.setText("Dispatch the Process");

        jTextField_pid6.setBackground(new java.awt.Color(75,75,75));
        jTextField_pid6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_pid6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setBackground(new java.awt.Color(153, 153, 255));
        jLabel21.setFont(new java.awt.Font("Verdana", 3, 18)); 
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("ID");

        jButton23.setBackground(new java.awt.Color(102, 102, 0));
        jButton23.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("DispatchProcess");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel15))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jTextField_pid6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_pid6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(jButton23)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab7", jPanel17);

        jPanel18.setBackground(new java.awt.Color(75,75,75));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); 
        jLabel16.setForeground(new java.awt.Color(102, 102, 0));
        jLabel16.setText("Change the Priority");

        jTextField_pid7.setBackground(new java.awt.Color(75,75,75));
        jTextField_pid7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); 
        jTextField_pid7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel22.setBackground(new java.awt.Color(153, 153, 255));
        jLabel22.setFont(new java.awt.Font("Verdana", 3, 18)); 
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("ID");

        jTextField1_p.setBackground(new java.awt.Color(75,75,75));
        jTextField1_p.setFont(new java.awt.Font("Segoe UI", 0, 18)); 
        jTextField1_p.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText(" PRIORITY");

        jButton28.setBackground(new java.awt.Color(102, 102, 0));
        jButton28.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("ChangePriority");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel16))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_pid7, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(jTextField1_p))))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel16)
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_pid7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_p, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addComponent(jButton28)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("tab8", jPanel18);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PCB", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(204,204,0));

        jLabel30.setBackground(new java.awt.Color(51, 51, 0));
        jLabel30.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); 
        jLabel30.setForeground(new java.awt.Color(102, 102, 0));
        jLabel30.setText("Memory Management");

        jButton19.setBackground(new java.awt.Color(75, 75, 75));
        jButton19.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); 
        jButton19.setForeground(new java.awt.Color(204, 204, 0));
        jButton19.setText("LRU input");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(75, 75, 75));
        jButton32.setFont(new java.awt.Font("Segoe UI Symbol", 3, 14)); 
        jButton32.setForeground(new java.awt.Color(204, 204, 0));
        jButton32.setText("LRU  Output");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(75,75,75));
        jButton39.setFont(new java.awt.Font("Segoe UI Semibold", 2, 12)); 
        jButton39.setForeground(new java.awt.Color(255, 255, 102));
        jButton39.setText("MAIN MENU");
        jButton39.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 102, 0), null, new java.awt.Color(51, 51, 0)));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel30)
                .addGap(35, 35, 35)
                .addComponent(jButton19)
                .addGap(30, 30, 30)
                .addComponent(jButton32)
                .addGap(57, 57, 57)
                .addComponent(jButton39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.setBackground(new java.awt.Color(75,75,75));

        jPanel8.setBackground(new java.awt.Color(75,75,75));

        jLabel31.setText("Page Replacement Algorithm");

        jLabel36.setText("Refrecnce String");

        jLabel37.setText("Frame Size");

        jButton40.setText("Submit");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel31))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel36))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel37)))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2_f, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1_s, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton40))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel31)
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(44, 44, 44)
                .addComponent(jButton40)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("LRU input", jPanel8);

        jPanel9.setBackground(new java.awt.Color(75,75,75));

        jLabel38.setText("Refrence String  : ");

        jLabel39.setText("Page Fault   :  ");

        jLabel40.setText("page Hit    : ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel38)))
                .addGap(51, 51, 51)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(11, 11, 11)))
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addContainerGap(293, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("LRU output", jPanel9);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Memory", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel24.setBackground(new java.awt.Color(102, 102, 0));

        jLabel5.setFont(new java.awt.Font("SimSun", 3, 18)); 
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("CPU Scheduling");

        jButton31.setBackground(new java.awt.Color(75,75,75));
        jButton31.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jButton31.setForeground(new java.awt.Color(204, 204, 0));
        jButton31.setText("MAIN MENU");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(75,75,75));
        jButton20.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jButton20.setForeground(new java.awt.Color(204, 204, 0));
        jButton20.setText("FCFS");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(75,75,75));
        jButton37.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jButton37.setForeground(new java.awt.Color(204, 204, 0));
        jButton37.setText("Priority");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
jPanel24.setLayout(jPanel24Layout);
jPanel24Layout.setHorizontalGroup(
    jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel24Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton31)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)))
            .addContainerGap(63, Short.MAX_VALUE))
);

jPanel24Layout.setVerticalGroup(
    jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel24Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addComponent(jButton20)
            .addGap(26, 26, 26)
            .addComponent(jButton37)
            .addGap(44, 44, 44)
            .addComponent(jButton31)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);


        jTabbedPane5.setBackground(new java.awt.Color(75,75,75));

        jPanel25.setBackground(new java.awt.Color(75,75,75));

        jTable_fcfs.setAutoCreateRowSorter(true);
        jTable_fcfs.setBackground(new java.awt.Color(75,75,75));
        jTable_fcfs.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        jTable_fcfs.setForeground(new java.awt.Color(255, 255, 255));
        jTable_fcfs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "AT", "BT", "WT", "TAT", "CT"
            }
        ));
        jScrollPane1.setViewportView(jTable_fcfs);

        jButton9.setBackground(new java.awt.Color(75,75,75));
        jButton9.setFont(new java.awt.Font("Segoe UI", 3, 14)); 
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("FCFS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel33.setBackground(new java.awt.Color(75,75,75));
        jLabel33.setFont(new java.awt.Font("SimSun", 3, 18)); 
        jLabel33.setForeground(new java.awt.Color(204, 204, 0));
        jLabel33.setText("First Come First Serve");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jButton9))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel33)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel33)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton9)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("FirstComeFirstServe", jPanel25);

        jPanel26.setBackground(new java.awt.Color(75,75,75));

        jTable_p.setBackground(new java.awt.Color(75,75,75));
        jTable_p.setFont(new java.awt.Font("Segoe UI", 3, 14)); 
        jTable_p.setForeground(new java.awt.Color(255, 255, 255));
        jTable_p.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "AT", "BT", "WT", "TAT", "CT"
            }
        ));
        jTable_p.setCellSelectionEnabled(true);
        jScrollPane3.setViewportView(jTable_p);

        jButton29.setBackground(new java.awt.Color(75,75,75));
        jButton29.setFont(new java.awt.Font("Segoe UI", 3, 14)); 
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("Priority");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jLabel44.setBackground(new java.awt.Color(75,75,75));
        jLabel44.setFont(new java.awt.Font("SimSun", 3, 18)); 
        jLabel44.setForeground(new java.awt.Color(204, 204, 0));
        jLabel44.setText("Priority");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jButton29))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel44)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel44)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton29)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Priority", jPanel26);

        jPanel27.setBackground(new java.awt.Color(75,75,75));

        
        
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane5)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane5)
        );

        jTabbedPane1.addTab("Scheduling", jPanel4);

        jTabbedPane1.addTab("", jPanel5);

        jPanel6.setBackground(new java.awt.Color(102, 102, 0));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jButton22.setBackground(new java.awt.Color(75,75,75));
        jButton22.setFont(new java.awt.Font("Segoe UI", 3, 18)); 
        jButton22.setForeground(new java.awt.Color(204, 204, 0));
        jButton22.setText("MAIN MENU");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jTable_t1.setBackground(new java.awt.Color(75,75,75));
        jTable_t1.setForeground(new java.awt.Color(255, 255, 255));
        jTable_t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "AT", "BT", "STATE", "PRIORITY"
            }
        ));
        jScrollPane2.setViewportView(jTable_t1);

        jLabel23.setBackground(new java.awt.Color(204, 153, 0));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 5, 22));
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("PROCESS CONTROL BLOCK ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );

        jTabbedPane1.addTab("ALL PCB", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane1.setSelectedIndex(0);
    }
     Test obj = new Test();
     
    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {
        
        int pid = parseInt(jTextField_pid.getText());
        String pname = jTextField_pname.getText();
        int priority = parseInt(jTextField_ppriority.getText());
        int arivalTime = parseInt(jTextField_pAT.getText());
        int burstTime= parseInt(jTextField_pBT.getText());
        int memorySize =parseInt(jTextField_ms.getText());

       
        obj.CreateProcess(pid, pname, priority, arivalTime, burstTime,memorySize);
        JOptionPane.showMessageDialog(null, "Process id Created");
        clear();

    }

      public void clear(){
        jTextField_pid.setText("");
        jTextField_pname.setText("");
        jTextField_ppriority.setText("");
        jTextField_pAT.setText("");
        jTextField_pBT.setText("");
        jTextField_ms.setText("");
    }
    
      int check; 
      boolean found; 
    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane1.setSelectedIndex(0);
    }

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane2.setSelectedIndex(7);
    }
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane2.setSelectedIndex(6);
    }

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane2.setSelectedIndex(5);
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane2.setSelectedIndex(4);
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane2.setSelectedIndex(1);
           
    
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane2.setSelectedIndex(3);
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane2.setSelectedIndex(2);
    }

     
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane2.setSelectedIndex(0);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane1.setSelectedIndex(2);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane1.setSelectedIndex(1);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane1.setSelectedIndex(3);
    }

     
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane1.setSelectedIndex(5);
         JTable t= getjTable_t1();
        obj.display(t);
        
    }
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
          int  pid = parseInt(jTextField_pid1.getText());
         boolean found = obj.delete(pid);
         if(found == false){
             JOptionPane.showMessageDialog(null, "Wrong input");
             jTextField_pid1.setText("");
         }
         else{
           JOptionPane.showMessageDialog(null, "Process id deleted"); 
           jTextField_pid1.setText("");
         }
         
 

    }
  
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
        int pid = parseInt(jTextField_pid2.getText());
       check =  obj.resume(pid);
       if(check == 1){
           JOptionPane.showMessageDialog(null, "Process is Resumed");
           jTextField_pid2.setText("");
       }
       else if(check == 2){
           JOptionPane.showMessageDialog(null, "ERROR! Process is not resumes because it is not is suspended state");
           jTextField_pid2.setText("");
       }
       else {
           JOptionPane.showMessageDialog(null, "ERROR!, Process is not found");
           jTextField_pid2.setText("");
       }
    }

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {
         int pid = parseInt(jTextField_pid3.getText());
       check =  obj.suspend(pid);
       if(check == 1){
           JOptionPane.showMessageDialog(null, "Process is Suspend");
           jTextField_pid3.setText("");
       }
       else if(check == 2){
           JOptionPane.showMessageDialog(null, "ERROR! Process is not suspend because it is not is block or waiting state");
           jTextField_pid3.setText("");
       }
       else {
           JOptionPane.showMessageDialog(null, "ERROR!, Process is not found");
           jTextField_pid3.setText("");
       }
    }
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {
           int pid = parseInt(jTextField_pid4.getText());
       check =  obj.block(pid);
       if(check == 1){
           JOptionPane.showMessageDialog(null, "Process is Blocked");
           jTextField_pid4.setText("");
       }
       else if(check == 2){
           JOptionPane.showMessageDialog(null, "ERROR! Process is not Block because it is not is running state");
           jTextField_pid4.setText("");
       }
       else {
           JOptionPane.showMessageDialog(null, "ERROR!, Process is not found");
           jTextField_pid4.setText("");
       }
    }

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {
          int pid = parseInt(jTextField_pid5.getText());
       check =  obj.wackup(pid);
       if(check == 1){
           JOptionPane.showMessageDialog(null, "Process is WACKUP");
           jTextField_pid5.setText("");
       }
       else if(check == 2){
           JOptionPane.showMessageDialog(null, "ERROR! Process is not Wackup because it is not is blocked or waiting state state");
           jTextField_pid5.setText("");
       }
       else {
           JOptionPane.showMessageDialog(null, "ERROR!, Process is not found");
           jTextField_pid5.setText("");
       }
    }

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {
        int pid = parseInt(jTextField_pid6.getText());
        check=  obj.dispatch(pid);
        if(check == 1){
            JOptionPane.showMessageDialog(null, "Process is Dispatch");
            jTextField_pid6.setText("");
        }
        else if(check == 2) {
            JOptionPane.showMessageDialog(null, "ERROR!,Process is not dispatch because it is not in ready State");
            jTextField_pid6.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR!, Process is not found");
            jTextField_pid6.setText("");
        }

    }

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {
        
        int pid = parseInt(jTextField_pid7.getText());
        int priority = parseInt(jTextField1_p.getText());
        check =  obj.changePriority(pid,priority);
        if(check == 1){
            JOptionPane.showMessageDialog(null, "Process priority is Changed");
            jTextField_pid7.setText("");
             jTextField1_p.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "ERROR!, Process is not found");
            jTextField_pid7.setText("");
            jTextField1_p.setText("");
        }
    }

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {
        JTable t= getjTable_p();
        obj.Priority();
        obj.displayPriority(t);

    }
private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                          
   
        JTable t= getjTable_fcfs();
        obj.FCFS();
        obj.displayFCFS(t);

}

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {
         jTabbedPane1.setSelectedIndex(0);
    }

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane1.setSelectedIndex(0);
    }

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {
     
            int nopages, nofaults, count = 0;
        int[] page;
    String S=jTextField1_s.getText();
        nopages = S.length();
        page = new int[nopages];
        for (int i = 0; i < nopages; i++) {
            page[i] = S.charAt(i);
        }
       
        nofaults = parseInt(jTextField2_f.getText());
        int[] frame = new int[nofaults];
        int[] fcount = new int[nofaults];
        for (int i = 0; i < nofaults; i++) {
            frame[i] = -1;
            fcount[i] = 0;
        }
        int i = 0;
        while (i < nopages) {
            int j = 0, flag = 0;
            while (j < nofaults) {
                if (page[i] == frame[j]) {
                    flag = 1;
                    fcount[j] = i + 1;
                }
                j++;
            }
            j = 0;
            if (flag == 0) {
                int min = 0, k = 0;
                while (k < nofaults - 1) {
                    if (fcount[min] > fcount[k + 1])
                        min = k + 1;
                    k++;
                }
                frame[min] = page[i];
                fcount[min] = i + 1;
                count++;
                while (j < nofaults) {
                    j++;
                }
            }
            i++;
        }
          int y=nopages-count;
          jLabel41.setText(S);
          jLabel42.setText(String.valueOf(count));
          jLabel43.setText(String.valueOf(y));
            
         jTabbedPane3.setSelectedIndex(1);
        
    }

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane3.setSelectedIndex(0);
    }

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane3.setSelectedIndex(1);
    }

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane5.setSelectedIndex(1);
    }

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
        jTabbedPane5.setSelectedIndex(0);
        
    }

//priority base scheduling
    
    public static void main(String args[]) {
        
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable_fcfs;
    private javax.swing.JTable jTable_p;
    private javax.swing.JTable jTable_t1;
    private javax.swing.JTextField jTextField1_p;
    private javax.swing.JTextField jTextField1_s;
    private javax.swing.JTextField jTextField2_f;
    private javax.swing.JTextField jTextField_ms;
    private javax.swing.JTextField jTextField_pAT;
    private javax.swing.JTextField jTextField_pBT;
    private javax.swing.JTextField jTextField_pid;
    private javax.swing.JTextField jTextField_pid1;
    private javax.swing.JTextField jTextField_pid2;
    private javax.swing.JTextField jTextField_pid3;
    private javax.swing.JTextField jTextField_pid4;
    private javax.swing.JTextField jTextField_pid5;
    private javax.swing.JTextField jTextField_pid6;
    private javax.swing.JTextField jTextField_pid7;
    private javax.swing.JTextField jTextField_pname;
    private javax.swing.JTextField jTextField_ppriority;
  
}