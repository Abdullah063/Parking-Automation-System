
import Database.DbConnection;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Manager extends javax.swing.JFrame implements MouseListener{

        /**
         * Creates new form NewJFrame
         */
        public Manager() {
                initComponents();
                timerStart();
                crateParkBoart();
                otoparkDoldur();
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
                jPanel6 = new javax.swing.JPanel();
                lblLocation = new javax.swing.JLabel();
                lblRow = new javax.swing.JLabel();
                lblCol = new javax.swing.JLabel();
                pnlDurum = new javax.swing.JPanel();
                pnlCikisYap = new javax.swing.JPanel();
                pnlUser1 = new javax.swing.JPanel();
                txtName1 = new javax.swing.JTextField();
                jLabel18 = new javax.swing.JLabel();
                txtLastName1 = new javax.swing.JTextField();
                jLabel19 = new javax.swing.JLabel();
                txtNumber1 = new javax.swing.JTextField();
                jLabel20 = new javax.swing.JLabel();
                jLabel21 = new javax.swing.JLabel();
                txtMail1 = new javax.swing.JTextField();
                jLabel22 = new javax.swing.JLabel();
                jLabel23 = new javax.swing.JLabel();
                jLabel24 = new javax.swing.JLabel();
                jLabel25 = new javax.swing.JLabel();
                jLabel26 = new javax.swing.JLabel();
                txtBrand1 = new javax.swing.JTextField();
                txtColor1 = new javax.swing.JTextField();
                txtLocation1 = new javax.swing.JTextField();
                txtPlate1 = new javax.swing.JTextField();
                jPanel11 = new javax.swing.JPanel();
                jLabel17 = new javax.swing.JLabel();
                txtSerach = new javax.swing.JTextField();
                jLabel27 = new javax.swing.JLabel();
                btnSearch = new javax.swing.JButton();
                jPanel12 = new javax.swing.JPanel();
                jLabel28 = new javax.swing.JLabel();
                txtCheck_in_time = new javax.swing.JTextField();
                txtChack_out_time = new javax.swing.JTextField();
                jLabel29 = new javax.swing.JLabel();
                txtPrice = new javax.swing.JTextField();
                jLabel30 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();

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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pnlCar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel7.setText("Plaka :");

                txtPlate.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtPlateActionPerformed(evt);
                        }
                });

                jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel11.setText("Renk :");

                jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel12.setText("Marka :");

                jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel13.setText("Park Yeri :");

                jLabel14.setText("Araç Bİlgileri");

                cbBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ford", "Volkswagen", "Audi ", "Volvo", "BMW", "Fiat", "Honda", "Hyundai", "Chevrolet, ", "Citroen", "Dacia", "DS Automobiles", "Iveco", "Jeep", "KIA", "Land ", "Rover", "Mazda", "Mercedes", "MINI", "Nissan", "Opel", "Peugeot", "Renault", "Seat", "Skoda", "Ssangyong", "Toyota" }));
                cbBrand.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbBrandActionPerformed(evt);
                        }
                });

                btnLogin.setText("Kayıt Yap");
                btnLogin.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnLoginActionPerformed(evt);
                        }
                });

                jPanel6.setBackground(new java.awt.Color(255, 255, 255));
                jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                lblLocation.setForeground(java.awt.Color.red);
                lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblLocation.setText("Lütfen park alanını seçiniz");
                lblLocation.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                lblLocationMouseClicked(evt);
                        }
                });

                lblRow.setText("kat");

                lblCol.setText("sira");

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblRow, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCol, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33))
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblLocation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblRow)
                                        .addComponent(lblCol))
                                .addContainerGap())
                );

                javax.swing.GroupLayout pnlCarLayout = new javax.swing.GroupLayout(pnlCar);
                pnlCar.setLayout(pnlCarLayout);
                pnlCarLayout.setHorizontalGroup(
                        pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCarLayout.createSequentialGroup()
                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlCarLayout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(pnlCarLayout.createSequentialGroup()
                                                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txtPlate)))
                                                        .addGroup(pnlCarLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(pnlCarLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel13)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(66, Short.MAX_VALUE))
                );
                pnlCarLayout.setVerticalGroup(
                        pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCarLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPlate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addComponent(btnLogin)
                                .addContainerGap(42, Short.MAX_VALUE))
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
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pnlUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pnlCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

                pnlUser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel18.setText("Ad :");

                jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel19.setText("Marka :");

                txtNumber1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtNumber1ActionPerformed(evt);
                        }
                });

                jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel20.setText("Telefon :");

                jLabel21.setText("Kişi Bilgileri");

                txtMail1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtMail1ActionPerformed(evt);
                        }
                });

                jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel22.setText("E-Mail :");

                jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel23.setText("Soyad :");

                jLabel24.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel24.setText("Renk :");

                jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel25.setText("Plaka :");

                jLabel26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                jLabel26.setText("Park Yeri :");

                javax.swing.GroupLayout pnlUser1Layout = new javax.swing.GroupLayout(pnlUser1);
                pnlUser1.setLayout(pnlUser1Layout);
                pnlUser1Layout.setHorizontalGroup(
                        pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlUser1Layout.createSequentialGroup()
                                .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlUser1Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlUser1Layout.createSequentialGroup()
                                                                .addGap(42, 42, 42)
                                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlUser1Layout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(pnlUser1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel22)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(txtMail1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlUser1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel20)
                                                                        .addGap(24, 24, 24)
                                                                        .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlUser1Layout.createSequentialGroup()
                                                                .addGap(55, 55, 55)
                                                                .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(pnlUser1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(txtPlate1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(pnlUser1Layout.createSequentialGroup()
                                                                                .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(txtBrand1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txtColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                        .addGroup(pnlUser1Layout.createSequentialGroup()
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtLocation1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(60, 60, 60))
                );
                pnlUser1Layout.setVerticalGroup(
                        pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlUser1Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlUser1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(txtPlate1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtLastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtBrand1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlUser1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(txtNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLocation1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(37, Short.MAX_VALUE))
                );

                jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                jLabel17.setText("ara");

                txtSerach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtSerachActionPerformed(evt);
                        }
                });
                txtSerach.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                txtSerachKeyPressed(evt);
                        }
                });

                jLabel27.setText("Plaka :");

                btnSearch.setText("Ara");
                btnSearch.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSearchActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnSearch)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jLabel17))
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                        .addGap(28, 28, 28)
                                                        .addComponent(jLabel27)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtSerach, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(57, Short.MAX_VALUE))
                );
                jPanel11Layout.setVerticalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel27)
                                                .addComponent(txtSerach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(42, 42, 42)))
                                .addComponent(btnSearch)
                                .addContainerGap(8, Short.MAX_VALUE))
                );

                jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                jLabel28.setText("Giriş Saati :");

                jLabel29.setText("Çıkış Saati :");

                jLabel30.setText("Ucret :");

                jButton1.setText("Ucret hesapla");

                jButton2.setText("Çıkış Yap");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
                jPanel12.setLayout(jPanel12Layout);
                jPanel12Layout.setHorizontalGroup(
                        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCheck_in_time, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(txtChack_out_time, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(268, Short.MAX_VALUE))
                );
                jPanel12Layout.setVerticalGroup(
                        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCheck_in_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtChack_out_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addContainerGap(19, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout pnlCikisYapLayout = new javax.swing.GroupLayout(pnlCikisYap);
                pnlCikisYap.setLayout(pnlCikisYapLayout);
                pnlCikisYapLayout.setHorizontalGroup(
                        pnlCikisYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCikisYapLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(pnlCikisYapLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(313, Short.MAX_VALUE))
                        .addGroup(pnlCikisYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlCikisYapLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(pnlUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(314, Short.MAX_VALUE)))
                );
                pnlCikisYapLayout.setVerticalGroup(
                        pnlCikisYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlCikisYapLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                        .addGroup(pnlCikisYapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlCikisYapLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(pnlUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(257, Short.MAX_VALUE)))
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
               remov();
        }//GEN-LAST:event_btnLoginActionPerformed

        private void txtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailActionPerformed
               // TODO add your handling code here:
        }//GEN-LAST:event_txtMailActionPerformed

        private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
                content.setSelectedIndex(2);
        }//GEN-LAST:event_jPanel10MouseClicked

        private void txtPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlateActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtPlateActionPerformed

        private void cbBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBrandActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_cbBrandActionPerformed

        //lbl clicked 
        private void lblLocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLocationMouseClicked
                content.setSelectedIndex(1);
        }//GEN-LAST:event_lblLocationMouseClicked

        private void txtNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumber1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtNumber1ActionPerformed

        private void txtMail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMail1ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtMail1ActionPerformed

        private void txtSerachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerachActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtSerachActionPerformed
        //ara text fild 
        private void txtSerachKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerachKeyPressed
                
        }//GEN-LAST:event_txtSerachKeyPressed

        private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
                search();
        }//GEN-LAST:event_btnSearchActionPerformed

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                removeCustomer();
        }//GEN-LAST:event_jButton2ActionPerformed
        
       
        private void remov()
        {
                txtName.setText("");
                txtLastName.setText("");
                txtNumber.setText("");
                txtMail.setText("");
                txtPlate.setText("");
                txtColor.setText("");
                lblRow.setText("");
                lblCol.setText("");
        }
        private void toPark()
        {
                
        }
        Btn[][] board;
        private void crateParkBoart()
        {
                pnlDurum.setLayout(new GridLayout(10,10)); 
                board = new Btn[10][10];
                
                for (int row = 0; row < board.length; row++) {
                        for (int col = 0; col < board[0].length; col++) 
                        {
                                Btn p  = new Btn(row, col);
                                p.addMouseListener(this);
                                pnlDurum.add(p);
                                board[row][col]=p;
                        }
                }
        }
        private void yerAra(Btn btn)
        {
                for (int row = 0; row < 10; row++) {
                        for (int col = 0; col < 10; col++)
                        {
                                if (board[row][col]==btn) {
                                        System.out.println("row :"+row);
                                        System.out.println("col :"+col);
                                        lblRow.setText(Integer.toString(row+1));
                                        lblCol.setText(Integer.toString(col+1));
                                }
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
        
        private long sureHesapla(Date date)
        {
                Date bugun = new Date();
                
                long sure = (bugun.getTime()-date.getTime())/(1000*60);
            
                return sure;
        }

        //----------------Veri tabanı işlemleri---------------------
        private void kayit()
        {
                
                Connection connection = null;
                PreparedStatement statement = null; 
                DbConnection dBHelper = new DbConnection();
                String simpleDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Calendar.getInstance().getTime());
                JOptionPane.showMessageDialog(null, simpleDate);
                try {
                        connection = dBHelper.getConnection();
                        String sql = "insert into tablo(name,lastName,number,mail,plate,brand,color,rov,col,time)"
                                   + "values(?,?,?,?,?,?,?,?,?,?)";
                        statement = connection.prepareStatement(sql);
                        statement.setString(1,txtName.getText());
                        statement.setString(2,txtLastName.getText());
                        statement.setString(3,txtNumber.getText());
                        statement.setString(4,txtMail.getText());
                        statement.setString(5,txtPlate.getText());
                        statement.setString(6,cbBrand.getSelectedItem().toString());
                        statement.setString(7,txtColor.getText());
                        statement.setString(8,lblRow.getText());
                        statement.setString(9,lblCol.getText());
                        statement.setString(10,simpleDate);
                        
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
        private void removeCustomer()
        {
                String primaryKey , sql;
                primaryKey = txtPlate.getText();
                sql = "delete  from tablo where plate='"+primaryKey+"'";
                logOut(sql);
        }
        private void logOut(String sql)
        {
                Connection connection = null;
                PreparedStatement statement = null; 
                DbConnection dBHelper = new DbConnection();
                
                try {
                        connection = dBHelper.getConnection();
                        statement = connection.prepareStatement(sql);
                        int result = statement.executeUpdate();
                        
                         
                } catch (SQLException e) {
                        dBHelper.ShowEror(e);
                }finally{
                        try {
                                statement.close();
                                connection.close();     
                        } catch (SQLException ex) {
        
                        }
                }
        }
        private void search()
        {
                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet;
                DbConnection dBHelper = new DbConnection();
                String plate = txtSerach.getText();
                String sql = "Select * from tablo where plate='"+plate+"'";
             
                try {
                        connection = dBHelper.getConnection();
                        statement = connection.createStatement();
                        resultSet = statement.executeQuery(sql);
                        
                        if (resultSet.next()) {
                                txtName1.setText(resultSet.getString("name"));
                                txtLastName1.setText(resultSet.getString("lastName"));
                                txtNumber1.setText(resultSet.getString("number"));
                                txtMail1.setText(resultSet.getString("mail"));
                                txtPlate1.setText(resultSet.getString("plate"));
                                txtColor1.setText(resultSet.getString("color"));
                                txtBrand1.setText(resultSet.getString("brand"));
                                txtLocation1.setText("ROW : "+resultSet.getString("rov")+" COL : "+resultSet.getString("col"));
                                txtCheck_in_time.setText(resultSet.getString("time"));
                                
                                
                                String str = Long.toString(sureHesapla(resultSet.getDate("time")));
                                txtPrice.setText(str);
                         
                        }else{
                                JOptionPane.showMessageDialog(null,"Kayıt bulunamadı!");
                                System.out.println("test "+resultSet.getString("name"));
                                 
                        }
                 
                } catch (SQLException e) {
                        dBHelper.ShowEror(e);
                }finally{
                        try {
                                statement.close();
                                connection.close();
                        } catch (SQLException ex) {
                                 
                        }
                }
        }
        
        private void otoparkDoldur()
        {
                DbConnection dBHelper = new DbConnection();
                Connection connection = null;
                Statement statement = null;
                ResultSet resultSet;
                String sql=null ;
                try {
                        connection = dBHelper.getConnection();
                        for (int row = 0; row < 10; row++) {
                                for (int col = 0; col < 10; col++) {
                                        sql = "SELECT * FROM tablo where  rov='"+row+"' and col='"+col+"'";
                                        statement = connection.createStatement();
                                        resultSet = statement.executeQuery(sql);
                                        if (resultSet.next()) {
                                               board[row][col].setText(resultSet.getString("plate"));
                                               board[row][col].setBackground(Color.GREEN);
                                               System.out.println("eleman r - c :"+row+"--"+col);
                                        }
                                }
                        }
    
                } catch (SQLException e) {
                        dBHelper.ShowEror(e);
                }finally
                 {
                        try {
                                statement.close();
                                connection.close();
        
                        } catch (SQLException ex) {
                                
                        }
                 }
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
        private javax.swing.JButton btnSearch;
        private javax.swing.JComboBox<String> cbBrand;
        private javax.swing.JTabbedPane content;
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
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
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel26;
        private javax.swing.JLabel jLabel27;
        private javax.swing.JLabel jLabel28;
        private javax.swing.JLabel jLabel29;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel30;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel12;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JLabel lblCol;
        private javax.swing.JLabel lblLocation;
        private javax.swing.JLabel lblRow;
        private javax.swing.JLabel lblTime;
        private javax.swing.JPanel pnlCar;
        private javax.swing.JPanel pnlCikisYap;
        private javax.swing.JPanel pnlDurum;
        private javax.swing.JPanel pnlKayit;
        private javax.swing.JPanel pnlUser;
        private javax.swing.JPanel pnlUser1;
        private javax.swing.JTextField txtBrand1;
        private javax.swing.JTextField txtChack_out_time;
        private javax.swing.JTextField txtCheck_in_time;
        private javax.swing.JTextField txtColor;
        private javax.swing.JTextField txtColor1;
        private javax.swing.JTextField txtLastName;
        private javax.swing.JTextField txtLastName1;
        private javax.swing.JTextField txtLocation1;
        private javax.swing.JTextField txtMail;
        private javax.swing.JTextField txtMail1;
        private javax.swing.JTextField txtName;
        private javax.swing.JTextField txtName1;
        private javax.swing.JTextField txtNumber;
        private javax.swing.JTextField txtNumber1;
        private javax.swing.JTextField txtPlate;
        private javax.swing.JTextField txtPlate1;
        private javax.swing.JTextField txtPrice;
        private javax.swing.JTextField txtSerach;
        // End of variables declaration//GEN-END:variables

        @Override
        public void mouseClicked(MouseEvent e) {
                Btn btn = (Btn) e.getComponent();
                if (e.getButton()==1) {
                        System.out.println("panel içindeki butonlar tıklandı !!");
                        if (btn.getText().equals(""))
                        {
                                
                                if (!txtPlate.getText().equals("")) {
                                        System.out.println("btn kodum çalıştı ");
                                        btn.setText(txtPlate.getText());
                                        lblLocation.setText("location");
                                        content.setSelectedIndex(0);
                                        btn.setBackground(Color.red);
                                        yerAra(btn);
                                }else{JOptionPane.showMessageDialog(null, "Bilgileri tamamen girdirdiğinizden emin olun");}
                                
                        }else
                        {
                                JOptionPane.showMessageDialog(null, "burası dolu kardeş seni kınıyorum");
                        }
                }

        }

        @Override
        public void mousePressed(MouseEvent e) {
                
        }

        @Override
        public void mouseReleased(MouseEvent e) {
                
        }

        @Override
        public void mouseEntered(MouseEvent e) {
                
        }

        @Override
        public void mouseExited(MouseEvent e) {
                
        }
}
