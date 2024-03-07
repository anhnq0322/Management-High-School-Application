/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.ClassBUS;
import BUS.StudentBUS;
import DTO.Student;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author M S I
 */
public class StudentPanel extends javax.swing.JPanel {

    StudentBUS studentBUS = new StudentBUS();
    ClassBUS classBUS = new ClassBUS();
    String strImage = null;

    public StudentPanel() {
        initComponents();
        loadDataStudentTable();
        loadDataCurrentStudentTable();
        loadComboboxClass();
    }

    public void loadDataStudentTable() {
        DefaultTableModel model = (DefaultTableModel) studentList.getModel();
        model.setRowCount(0); // xóa table 
        for (Student student : studentBUS.getAllStudent()) {
            Object dataRow[] = new Object[8];
            dataRow[0] = student.getStudentID();
            dataRow[1] = student.getStudentName();
            dataRow[2] = student.getDateOfBirth();
            dataRow[3] = student.getGender();
            dataRow[4] = student.getPhone();
            dataRow[5] = student.getEmail();
            dataRow[6] = student.getAddress();
            dataRow[7] = student.getClassID();

            model.addRow(dataRow);
            System.out.println(student.toString());
        }
    }

    public void loadComboboxClass() {
        DefaultComboBoxModel comboCurrentClass = new DefaultComboBoxModel();
        for (DTO.Class class1 : classBUS.getAllClass()) {
            comboCurrentClass.addElement(class1.getClassID());
        }

        comboboxCurrentClass.setModel(comboCurrentClass);
        DefaultComboBoxModel comboNewClass = new DefaultComboBoxModel();
        for (DTO.Class class1 : classBUS.getAllClass()) {
            comboNewClass.addElement(class1.getClassID());
        }
        comboboxNewClass.setModel(comboNewClass);

    }

    public void loadDataCurrentStudentTable() {
        DefaultTableModel model = (DefaultTableModel) currentClass.getModel();
        model.setRowCount(0); // xóa table 
        for (Student student : studentBUS.getAllStudent()) {
            Object dataRow[] = new Object[2];
            dataRow[0] = student.getStudentID();
            dataRow[1] = student.getStudentName();
            model.addRow(dataRow);
            System.out.println(student.toString());

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StudentFormDialog = new javax.swing.JDialog();
        studentFormPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        csBirthDate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        lbImage = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btnAddStudent = new javax.swing.JButton();
        btnEditStudent = new javax.swing.JButton();
        btnEsc1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        studentTabbedPane = new javax.swing.JTabbedPane();
        studentPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnShowStudentDialog = new javax.swing.JButton();
        btnShowEditDialog = new javax.swing.JButton();
        btnDeleteStudent = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        newClass = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        currentClass = new javax.swing.JTable();
        changeClass = new javax.swing.JButton();
        save = new javax.swing.JButton();
        comboboxCurrentClass = new javax.swing.JComboBox<>();
        comboboxNewClass = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        StudentFormDialog.setMinimumSize(new java.awt.Dimension(556, 561));
        StudentFormDialog.setModal(true);
        StudentFormDialog.setUndecorated(true);

        studentFormPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin học sinh"));

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel5.setText("Mã học sinh");

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel6.setText("Tên học sinh");

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel7.setText("Ngày sinh");

        jLabel8.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel8.setText("Giới tính");

        buttonGroup1.add(rdMale);
        rdMale.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        rdMale.setSelected(true);
        rdMale.setText("Nam");

        buttonGroup1.add(rdFemale);
        rdFemale.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        rdFemale.setText("Nữ");
        rdFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFemaleActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel9.setText("Số điện thoại");

        txtEmail.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel11.setText("Địa chỉ");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel12.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel12.setText("Hình ảnh");

        lbImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImage.setText("Chọn Ảnh");
        lbImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbImage.setMaximumSize(new java.awt.Dimension(150, 183));
        lbImage.setMinimumSize(new java.awt.Dimension(150, 183));
        lbImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbImageMouseClicked(evt);
            }
        });

        jPanel12.setForeground(new java.awt.Color(255, 255, 255));

        btnAddStudent.setBackground(new java.awt.Color(209, 15, 209));
        btnAddStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStudent.setText("Thêm");
        btnAddStudent.setPreferredSize(new java.awt.Dimension(100, 35));
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });
        jPanel12.add(btnAddStudent);

        btnEditStudent.setBackground(new java.awt.Color(255, 153, 51));
        btnEditStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnEditStudent.setText("Sửa");
        btnEditStudent.setPreferredSize(new java.awt.Dimension(100, 35));
        btnEditStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditStudentActionPerformed(evt);
            }
        });
        jPanel12.add(btnEditStudent);

        btnEsc1.setBackground(new java.awt.Color(255, 0, 0));
        btnEsc1.setForeground(new java.awt.Color(255, 255, 255));
        btnEsc1.setText("Thoát");
        btnEsc1.setPreferredSize(new java.awt.Dimension(100, 35));
        btnEsc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsc1ActionPerformed(evt);
            }
        });
        jPanel12.add(btnEsc1);

        javax.swing.GroupLayout studentFormPanelLayout = new javax.swing.GroupLayout(studentFormPanel);
        studentFormPanel.setLayout(studentFormPanelLayout);
        studentFormPanelLayout.setHorizontalGroup(
            studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentFormPanelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentFormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel7))
                    .addGroup(studentFormPanelLayout.createSequentialGroup()
                        .addGroup(studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStudentID)
                            .addComponent(jLabel6)
                            .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(csBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(studentFormPanelLayout.createSequentialGroup()
                                .addComponent(rdMale)
                                .addGap(42, 42, 42)
                                .addComponent(rdFemale))))
                    .addGroup(studentFormPanelLayout.createSequentialGroup()
                        .addGroup(studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentFormPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel9))
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51))
        );
        studentFormPanelLayout.setVerticalGroup(
            studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentFormPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(studentFormPanelLayout.createSequentialGroup()
                        .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentFormPanelLayout.createSequentialGroup()
                        .addComponent(csBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdMale)
                            .addComponent(rdFemale))))
                .addGap(18, 18, 18)
                .addGroup(studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(studentFormPanelLayout.createSequentialGroup()
                        .addGroup(studentFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(studentFormPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentFormPanelLayout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentFormPanelLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout StudentFormDialogLayout = new javax.swing.GroupLayout(StudentFormDialog.getContentPane());
        StudentFormDialog.getContentPane().setLayout(StudentFormDialogLayout);
        StudentFormDialogLayout.setHorizontalGroup(
            StudentFormDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentFormDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        StudentFormDialogLayout.setVerticalGroup(
            StudentFormDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StudentFormDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studentFormPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setPreferredSize(new java.awt.Dimension(1050, 600));

        studentTabbedPane.setPreferredSize(new java.awt.Dimension(1050, 600));

        studentPanel.setPreferredSize(new java.awt.Dimension(1050, 600));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách học sinh"));

        studentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Họ tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Email", "Địa chỉ", "Lớp"
            }
        ));
        studentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thao tác"));

        btnShowStudentDialog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Add.png"))); // NOI18N
        btnShowStudentDialog.setPreferredSize(new java.awt.Dimension(70, 40));
        btnShowStudentDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowStudentDialogActionPerformed(evt);
            }
        });

        btnShowEditDialog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Edit.png"))); // NOI18N
        btnShowEditDialog.setPreferredSize(new java.awt.Dimension(70, 40));
        btnShowEditDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowEditDialogActionPerformed(evt);
            }
        });

        btnDeleteStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Remove.png"))); // NOI18N
        btnDeleteStudent.setPreferredSize(new java.awt.Dimension(70, 40));
        btnDeleteStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShowStudentDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShowEditDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShowEditDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowStudentDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        jLabel1.setText("Họ tên");

        jLabel2.setText("Giới tính");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jLabel3.setText("Lớp");

        jLabel4.setText("Khối");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khối 10", "Khối 11", "Khối 12" }));

        jButton1.setText("Tìm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(193, 193, 193)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel4)
                        .addGap(210, 210, 210))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout studentPanelLayout = new javax.swing.GroupLayout(studentPanel);
        studentPanel.setLayout(studentPanelLayout);
        studentPanelLayout.setHorizontalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(studentPanelLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        studentPanelLayout.setVerticalGroup(
            studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        studentTabbedPane.addTab("Học sinh", studentPanel);

        newClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Học Sinh", "Tên Học Sinh"
            }
        ));
        jScrollPane3.setViewportView(newClass);

        currentClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã học sinh", "Tên học sinh"
            }
        ));
        jScrollPane4.setViewportView(currentClass);

        changeClass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Classroom.png"))); // NOI18N

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/addIcon.png"))); // NOI18N

        comboboxCurrentClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxCurrentClass.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboboxCurrentClassPropertyChange(evt);
            }
        });

        comboboxNewClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changeClass)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(comboboxCurrentClass, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(comboboxNewClass, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(582, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboboxCurrentClass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboboxNewClass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(9, 9, 9)
                        .addComponent(changeClass, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        studentTabbedPane.addTab("Phân Lớp", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowStudentDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowStudentDialogActionPerformed
        // TODO add your handling code here:
        StudentFormDialog.setLocationRelativeTo(null);
        resetStudentForm();
        btnAddStudent.setVisible(true);
        btnEditStudent.setVisible(false);
        StudentFormDialog.setVisible(true);
    }//GEN-LAST:event_btnShowStudentDialogActionPerformed

    private void btnShowEditDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowEditDialogActionPerformed
        // TODO add your handling code here:
        if (validateStudentForm()) {
            StudentFormDialog.setLocationRelativeTo(null);
            btnAddStudent.setVisible(false);
            btnEditStudent.setVisible(true);
            StudentFormDialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn học sinh cần sửa");
        }

    }//GEN-LAST:event_btnShowEditDialogActionPerformed

    private void btnDeleteStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStudentActionPerformed
        // TODO add your handling code here:
        if (validateStudentForm()) {

        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn học sinh muốn xóa");
        }
    }//GEN-LAST:event_btnDeleteStudentActionPerformed

    private void rdFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdFemaleActionPerformed

    public void resetStudentForm() {
        txtStudentID.setText("");
        txtStudentName.setText("");
        txtPhone.setText("");
        txtAddress.setText("");
        rdMale.isSelected();
        lbImage.setText("Chọn Ảnh");
        lbImage.setIcon(null);
    }

    public boolean validateStudentForm() {
        if (txtStudentID.getText().isEmpty()
                || txtStudentName.getText().isEmpty()
                || txtPhone.getText().isEmpty()
                || txtAddress.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public Student getStudentModel() {
        Student student = new Student();
        student.setStudentID(txtStudentID.getText());
        student.setStudentName(txtStudentName.getText());
        student.setEmail(txtEmail.getText());
        student.setPhone(txtPhone.getText());
        student.setAddress(txtAddress.getText());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String birthDate = sdf.format(csBirthDate.getDate());
        student.setDateOfBirth(birthDate);
        if (rdMale.isSelected()) {
            student.setGender("Nam");
        } else {
            student.setGender("Nữ");
        }
        if (strImage == null) {
            student.setImage("NO AVATAR");
        } else {
            student.setImage(strImage);
        }
        student.setClassID("");
        return student;
    }

    public void setStudentModel(Student student) {
        txtStudentID.setText(student.getStudentID());
        txtStudentName.setText(student.getStudentName());
        txtEmail.setText(student.getEmail());
        txtPhone.setText(student.getPhone());
        txtAddress.setText(student.getAddress());

        try {
            Date birthDate = new SimpleDateFormat("yyyy-MM-dd").parse(student.getDateOfBirth());
            csBirthDate.setDate(birthDate);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi khi hiển thị ngày");
        }
        if (student.getGender().equals("Nam")) {
            rdMale.setSelected(true);
        } else if (student.getGender().equals("Nữ")) {
            rdFemale.setSelected(true);
        }

        if (student.getImage().equals("") || student.getImage().equals("NO AVATAR")) {
            lbImage.setText("NO AVATAR");
            lbImage.setIcon(null);
        } else {
            lbImage.setText("");
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/media/" + student.getImage()));
            Image img = imgIcon.getImage();
//            img.getScaledInstance(lbImage.getWidth(), lbImage.getY(), 0);
            lbImage.setIcon(imgIcon);
        }
    }

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        if (validateStudentForm()) {
            try {
                Student student = getStudentModel();
                if (studentBUS.addStudent(student)) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    loadDataStudentTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thất bại");
                }
            } catch (Exception e) {

            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnEditStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditStudentActionPerformed
        if (validateStudentForm()) {
            try {
                Student student = getStudentModel();
                if (studentBUS.editStudent(student)) {
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    loadDataStudentTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Sửa thất bại");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");

        }
    }//GEN-LAST:event_btnEditStudentActionPerformed

    private void btnEsc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsc1ActionPerformed
        // TODO add your handling code here:
        StudentFormDialog.setVisible(false);
    }//GEN-LAST:event_btnEsc1ActionPerformed

    private void lbImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbImageMouseClicked
        // TODO add your handling code here:
        try {
            JFileChooser jfc = new JFileChooser("D:\\JAVA\\Java_Workspace\\HighSchoolStudent\\src\\media");
            jfc.showOpenDialog(jPanel1);
            File file = jfc.getSelectedFile();
            Image img = ImageIO.read(file);
            strImage = file.getName();
            lbImage.setText("");
            int width = lbImage.getWidth();
            int height = lbImage.getHeight();
            lbImage.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
        } catch (Exception e) {
            System.out.println("Error : " + e.toString());
        }


    }//GEN-LAST:event_lbImageMouseClicked

    private void studentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListMouseClicked
        // TODO add your handling code here:
        int row = studentList.rowAtPoint(evt.getPoint());
        String studentID = studentList.getValueAt(row, 0).toString();
        Student student = studentBUS.getStudentByID(studentID);
        setStudentModel(student);
    }//GEN-LAST:event_studentListMouseClicked

    private void comboboxCurrentClassPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboboxCurrentClassPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_comboboxCurrentClassPropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        comboboxCurrentClass.getSelectedItem();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog StudentFormDialog;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnDeleteStudent;
    private javax.swing.JButton btnEditStudent;
    private javax.swing.JButton btnEsc1;
    private javax.swing.JButton btnShowEditDialog;
    private javax.swing.JButton btnShowStudentDialog;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton changeClass;
    private javax.swing.JComboBox<String> comboboxCurrentClass;
    private javax.swing.JComboBox<String> comboboxNewClass;
    private com.toedter.calendar.JDateChooser csBirthDate;
    private javax.swing.JTable currentClass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbImage;
    private javax.swing.JTable newClass;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JButton save;
    private javax.swing.JPanel studentFormPanel;
    private javax.swing.JTable studentList;
    private javax.swing.JPanel studentPanel;
    private javax.swing.JTabbedPane studentTabbedPane;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
}
