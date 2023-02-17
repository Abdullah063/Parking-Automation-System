
import Database.DbConnection;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABDULLAH
 */
public class Manager extends javax.swing.JFrame {

        /**
         * Creates new form NewJFrame
         */
        public Manager() {
                initComponents();
                timerStart();
                crateParkBoart();
        }
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel5 = new javax.swing.JPanel();
                lblTime = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jPanel7 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jPanel8 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jPanel9 = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jPanel10 = new javax.swing.JPanel();
                jLabel10 = new javax.swing.JLabel();
                content = new javax.swing.JTabbedPane();
                pnlKayit = new javax.swing.JPanel();
                jPanel4 = new javax.swing.JPanel();
                jLabel9 = new javax.swing.JLabel();
                pnlUser = new javax.swing.JPanel();
                txtName = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                txtLastName = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                txtNumber = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();
                txtMail = new javax.swing.JTextField();
                jLabel16 = new javax.swing.JLabel();
                pnlCar = new javax.swing.JPanel();
                jLabel7 = new javax.swing.JLabel();
                txtPlate = new javax.swing.JTextField();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                cbBrand = new javax.swing.JComboBox<>();
                txtColor = new javax.swing.JTextField();
                btnLogin = new javax.swing.JButton();
                pnlDurum = new javax.swing.JPanel();
                pnlCikisYap = new javax.swing.JPanel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel2.setBackground(new java.awt.Color(39, 0, 167));

                jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/free-parking.png"))); // NOI18N
                jLabel1.setText("ALTUN PARK");

                lblTime.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblTime.setText("00:00:00");
                lblTime.setToolTipText("");

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE))
                );
                jPanel5Layout.setVerticalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                .addContainerGap())
                );

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 778, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                );

                jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, -1));

                jPanel3.setBackground(new java.awt.Color(204, 153, 255));

                jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel7MouseClicked(evt);
                        }
                });

                jLabel3.setText("ARAÇ KAYIT");
                jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel3MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel7Layout.setVerticalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addContainerGap())
                );

                jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel8MouseClicked(evt);
                        }
                });

                jLabel4.setText("otpark durumu");

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel8Layout.setVerticalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addContainerGap())
                );

                jLabel5.setText("SİSTEMDEN ÇIKIŞ YAP");

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel5)
                                .addContainerGap(59, Short.MAX_VALUE))
                );
                jPanel9Layout.setVerticalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                .addContainerGap())
                );

                jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel10MouseClicked(evt);
                        }
                });

                jLabel10.setText("Çıkış Yap");

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel10)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jPanel10Layout.setVerticalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 250, 540));

                pnlKayit.setBackground(new java.awt.Color(153, 255, 255));

                jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
                jLabel9.setText("ARAÇ KAYIT");

                pnlUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel2.setText("Ad :");

                jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel8.setText("Soyad :");

                txtNumber.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtNumberActionPerformed(evt);
                        }
                });

                jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel6.setText("Telefon :");

                jLabel15.setText("Kişi Bilgileri");

                txtMail.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtMailActionPerformed(evt);
                        }
                });

                jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel16.setText("E-Mail :");

                javax.swing.GroupLayout pnlUserLayout = new javax.swing.GroupLayout(pnlUser);
                pnlUser.setLayout(pnlUserLayout);
                pnlUserLayout.setHorizontalGroup(
                        pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlUserLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(pnlUserLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlUserLayout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlUserLayout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(pnlUserLayout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUserLayout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(24, 24, 24)
                                                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(59, Short.MAX_VALUE))
                );
                pnlUserLayout.setVerticalGroup(
                        pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlUserLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlUserLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlUserLayout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)
                                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlUserLayout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(71, Short.MAX_VALUE))
                );

                pnlCar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel7.setText("Plaka :");

                jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel11.setText("Renk :");

                jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel12.setText("Marka :");

                jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel13.setText("Park Yeri :");

                jLabel14.setText("Araç Bİlgileri");

                cbBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ford", "Volkswagen", "Audi ", "Volvo", "BMW", "Fiat", "Honda", "Hyundai", "Chevrolet, ", "Citroen", "Dacia", "DS Automobiles", "Iveco", "Jeep", "KIA", "Land ", "Rover", "Mazda", "Mercedes", "MINI", "Nissan", "Opel", "Peugeot", "Renault", "Seat", "Skoda", "Ssangyong", "Toyota" }));

                btnLogin.setText("Kayıt Yap");
                btnLogin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnLoginActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout pnlCarLayout = new javax.swing.GroupLayout(pnlCar);
                pnlCar.setLayout(pnlCarLayout);
                pnlCarLayout.setHorizontalGroup(
                        pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCarLayout.createSequentialGroup()
                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(pnlCarLayout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(6, 6, 6)
                                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtPlate)
                                                        .addComponent(cbBrand, 0, 148, Short.MAX_VALUE)))
                                        .addGroup(pnlCarLayout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtColor))
                                        .addGroup(pnlCarLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel13))
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(135, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
                );
                pnlCarLayout.setVerticalGroup(
                        pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCarLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlCarLayout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(txtPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlCarLayout.createSequentialGroup()
                                                .addComponent(txtColor)
                                                .addGap(4, 4, 4)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(btnLogin)
                                .addContainerGap())
                );

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(pnlUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(pnlCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(357, 357, 357)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(157, Short.MAX_VALUE))
                );
                jPanel4Layout.setVerticalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pnlCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pnlUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(55, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout pnlKayitLayout = new javax.swing.GroupLayout(pnlKayit);
                pnlKayit.setLayout(pnlKayitLayout);
                pnlKayitLayout.setHorizontalGroup(
                        pnlKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlKayitLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                pnlKayitLayout.setVerticalGroup(
                        pnlKayitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlKayitLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(64, Short.MAX_VALUE))
                );

                content.addTab("tab1", pnlKayit);

                pnlDurum.setBackground(new java.awt.Color(153, 255, 153));

                javax.swing.GroupLayout pnlDurumLayout = new javax.swing.GroupLayout(pnlDurum);
                pnlDurum.setLayout(pnlDurumLayout);
                pnlDurumLayout.setHorizontalGroup(
                        pnlDurumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 958, Short.MAX_VALUE)
                );
                pnlDurumLayout.setVerticalGroup(
                        pnlDurumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 544, Short.MAX_VALUE)
                );

                content.addTab("tab2", pnlDurum);

                pnlCikisYap.setBackground(new java.awt.Color(204, 255, 204));

                javax.swing.GroupLayout pnlCikisYapLayout = new javax.swing.GroupLayout(pnlCikisYap);
                pnlCikisYap.setLayout(pnlCikisYapLayout);
                pnlCikisYapLayout.setHorizontalGroup(
                        pnlCikisYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 958, Short.MAX_VALUE)
                );
                pnlCikisYapLayout.setVerticalGroup(
                        pnlCikisYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 544, Short.MAX_VALUE)
                );

                content.addTab("tab3", pnlCikisYap);

                jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 960, 570));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
             
        }//GEN-LAST:event_jLabel3MouseClicked

        private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
                content.setSelectedIndex(0);
                
        }//GEN-LAST:event_jPanel7MouseClicked

        private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
                content.setSelectedIndex(1);
                
        }//GEN-LAST:event_jPanel8MouseClicked

        private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
              
        }//GEN-LAST:event_txtNumberActionPerformed

        private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
               kayit();
        }//GEN-LAST:event_btnLoginActionPerformed

        private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtMailActionPerformed

        private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_jPanel10MouseClicked
        
       
        
        private void toPark()
        {
                
        }
        private void crateParkBoart()
        {
                
                pnlDurum.setLayout(new GridLayout(10,10));
                
                LblPark[][] park = new LblPark[10][10];
                
                for (int row = 0; row < park.length; row++) {
                        for (int col = 0; col < park[0].length; col++) 
                        {
                                LblPark p  = new LblPark(row, col);
                                pnlDurum.add(p);
                                park[row][col]=p;
                        }
                }
        }
        private void kayit()
        {
                
                Connection connection = null;
                PreparedStatement statement = null; 
                DbConnection dBHelper = new DbConnection();
                String simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Calendar.getInstance().getTime());
                JOptionPane.showMessageDialog(null, simpleDate);
                try {
                        connection = dBHelper.getConnection();
                        String sql = "insert into customerr(name,lastName,number,mail,plate,brand,color,location,time)"
                                   + "values(?,?,?,?,?,?,?,?,?)";
                        statement = connection.prepareStatement(sql);
                        statement.setString(1,txtName.getText());
                        statement.setString(2,txtLastName.getText());
                        statement.setString(3,txtNumber.getText());
                        statement.setString(4,txtMail.getText());
                        statement.setString(5,txtPlate.getText());
                        statement.setString(6,cbBrand.getSelectedItem().toString());
                        statement.setString(7,txtColor.getText());
                        statement.setString(8,"1");
                        statement.setString(9,simpleDate);
                        
                        int result = statement.executeUpdate();
                 
                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,e.getMessage());
                        dBHelper.ShowEror(e);
                }finally{
                        try {
                                statement.close();
                                connection.close();
                        } catch (SQLException ex) {
                                 
                        }
                }
        }
        private void timerStart()
        {
                Timer t = new Timer(1000,new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                
                                SimpleDateFormat simpleTime = new SimpleDateFormat("HH:mm:ss");
                                lblTime.setText(simpleTime.format(new java.util.Date()));
                        }
                });
                t.start();
        }
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
                        java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Manager().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnLogin;
        private javax.swing.JComboBox<String> cbBrand;
        private javax.swing.JTabbedPane content;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JLabel lblTime;
        private javax.swing.JPanel pnlCar;
        private javax.swing.JPanel pnlCikisYap;
        private javax.swing.JPanel pnlDurum;
        private javax.swing.JPanel pnlKayit;
        private javax.swing.JPanel pnlUser;
        private javax.swing.JTextField txtColor;
        private javax.swing.JTextField txtLastName;
        private javax.swing.JTextField txtMail;
        private javax.swing.JTextField txtName;
        private javax.swing.JTextField txtNumber;
        private javax.swing.JTextField txtPlate;
        // End of variables declaration//GEN-END:variables
}
