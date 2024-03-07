/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;
import java.awt.Image;
import java.io.File;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.*;
import DTO.Discipline;
import BUS.DisciplineBUS;
import java.awt.BorderLayout;
import java.awt.Color;
/**
 *
 * @author Leo Kun
 */
public class StudentDisFormJPanel extends javax.swing.JPanel {
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        txtStudentDisID2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtStudentDisName2 = new javax.swing.JTextField();
        scroll = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        btnAddStudentDis2 = new javax.swing.JButton();
        btnEsc3 = new javax.swing.JButton();

        jLabel9.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel9.setText("Mã học sinh");

        txtStudentDisID2.setEnabled(false);
        txtStudentDisID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentDisID2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        jLabel10.setText("Tên học sinh");

        txtStudentDisName2.setEnabled(false);
        txtStudentDisName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentDisName2ActionPerformed(evt);
            }
        });

        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        scroll.setViewportView(jPanel14);

        btnAddStudentDis2.setBackground(new java.awt.Color(209, 15, 209));
        btnAddStudentDis2.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStudentDis2.setText("Cập nhật");
        btnAddStudentDis2.setPreferredSize(new java.awt.Dimension(100, 35));
        btnAddStudentDis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentDis2ActionPerformed(evt);
            }
        });

        btnEsc3.setBackground(new java.awt.Color(255, 0, 0));
        btnEsc3.setForeground(new java.awt.Color(255, 255, 255));
        btnEsc3.setText("Thoát");
        btnEsc3.setPreferredSize(new java.awt.Dimension(100, 35));
        btnEsc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsc3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtStudentDisID2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtStudentDisName2))
                    .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddStudentDis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEsc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtStudentDisID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtStudentDisName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddStudentDis2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEsc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtStudentDisID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentDisID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentDisID2ActionPerformed

    private void txtStudentDisName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentDisName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentDisName2ActionPerformed

    private void btnAddStudentDis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentDis2ActionPerformed

    }//GEN-LAST:event_btnAddStudentDis2ActionPerformed

    private void btnEsc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsc3ActionPerformed
        // TODO add your handling code here:
        StudentDisFormJPanel frame = new StudentDisFormJPanel();
    }//GEN-LAST:event_btnEsc3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane DisResultScroll;
    private javax.swing.JScrollPane DisResultScroll1;
    private javax.swing.JPanel FormDisPanel;
    private javax.swing.JPanel FormDisPanel1;
    private javax.swing.JButton btnAddStudentDis;
    private javax.swing.JButton btnAddStudentDis1;
    private javax.swing.JButton btnAddStudentDis2;
    private javax.swing.JButton btnEsc1;
    private javax.swing.JButton btnEsc2;
    private javax.swing.JButton btnEsc3;
    private javax.swing.JCheckBox cbox;
    private javax.swing.JCheckBox cbox1;
    private javax.swing.JCheckBox cbox10;
    private javax.swing.JCheckBox cbox11;
    private javax.swing.JCheckBox cbox12;
    private javax.swing.JCheckBox cbox13;
    private javax.swing.JCheckBox cbox14;
    private javax.swing.JCheckBox cbox15;
    private javax.swing.JCheckBox cbox16;
    private javax.swing.JCheckBox cbox17;
    private javax.swing.JCheckBox cbox18;
    private javax.swing.JCheckBox cbox19;
    private javax.swing.JCheckBox cbox2;
    private javax.swing.JCheckBox cbox20;
    private javax.swing.JCheckBox cbox21;
    private javax.swing.JCheckBox cbox22;
    private javax.swing.JCheckBox cbox23;
    private javax.swing.JCheckBox cbox24;
    private javax.swing.JCheckBox cbox25;
    private javax.swing.JCheckBox cbox26;
    private javax.swing.JCheckBox cbox27;
    private javax.swing.JCheckBox cbox28;
    private javax.swing.JCheckBox cbox29;
    private javax.swing.JCheckBox cbox3;
    private javax.swing.JCheckBox cbox30;
    private javax.swing.JCheckBox cbox31;
    private javax.swing.JCheckBox cbox32;
    private javax.swing.JCheckBox cbox33;
    private javax.swing.JCheckBox cbox34;
    private javax.swing.JCheckBox cbox35;
    private javax.swing.JCheckBox cbox36;
    private javax.swing.JCheckBox cbox37;
    private javax.swing.JCheckBox cbox38;
    private javax.swing.JCheckBox cbox39;
    private javax.swing.JCheckBox cbox4;
    private javax.swing.JCheckBox cbox40;
    private javax.swing.JCheckBox cbox41;
    private javax.swing.JCheckBox cbox42;
    private javax.swing.JCheckBox cbox43;
    private javax.swing.JCheckBox cbox44;
    private javax.swing.JCheckBox cbox45;
    private javax.swing.JCheckBox cbox46;
    private javax.swing.JCheckBox cbox47;
    private javax.swing.JCheckBox cbox48;
    private javax.swing.JCheckBox cbox49;
    private javax.swing.JCheckBox cbox5;
    private javax.swing.JCheckBox cbox50;
    private javax.swing.JCheckBox cbox51;
    private javax.swing.JCheckBox cbox52;
    private javax.swing.JCheckBox cbox53;
    private javax.swing.JCheckBox cbox54;
    private javax.swing.JCheckBox cbox55;
    private javax.swing.JCheckBox cbox56;
    private javax.swing.JCheckBox cbox57;
    private javax.swing.JCheckBox cbox58;
    private javax.swing.JCheckBox cbox59;
    private javax.swing.JCheckBox cbox6;
    private javax.swing.JCheckBox cbox60;
    private javax.swing.JCheckBox cbox61;
    private javax.swing.JCheckBox cbox62;
    private javax.swing.JCheckBox cbox63;
    private javax.swing.JCheckBox cbox64;
    private javax.swing.JCheckBox cbox65;
    private javax.swing.JCheckBox cbox66;
    private javax.swing.JCheckBox cbox67;
    private javax.swing.JCheckBox cbox68;
    private javax.swing.JCheckBox cbox69;
    private javax.swing.JCheckBox cbox7;
    private javax.swing.JCheckBox cbox70;
    private javax.swing.JCheckBox cbox71;
    private javax.swing.JCheckBox cbox72;
    private javax.swing.JCheckBox cbox73;
    private javax.swing.JCheckBox cbox8;
    private javax.swing.JCheckBox cbox9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JPanel studentdisFormPanel;
    private javax.swing.JPanel studentdisFormPanel1;
    private javax.swing.JTextField txtContent;
    private javax.swing.JTextField txtContent1;
    private javax.swing.JTextField txtContent10;
    private javax.swing.JTextField txtContent11;
    private javax.swing.JTextField txtContent12;
    private javax.swing.JTextField txtContent13;
    private javax.swing.JTextField txtContent14;
    private javax.swing.JTextField txtContent15;
    private javax.swing.JTextField txtContent16;
    private javax.swing.JTextField txtContent17;
    private javax.swing.JTextField txtContent18;
    private javax.swing.JTextField txtContent19;
    private javax.swing.JTextField txtContent2;
    private javax.swing.JTextField txtContent20;
    private javax.swing.JTextField txtContent21;
    private javax.swing.JTextField txtContent22;
    private javax.swing.JTextField txtContent23;
    private javax.swing.JTextField txtContent24;
    private javax.swing.JTextField txtContent25;
    private javax.swing.JTextField txtContent26;
    private javax.swing.JTextField txtContent27;
    private javax.swing.JTextField txtContent28;
    private javax.swing.JTextField txtContent29;
    private javax.swing.JTextField txtContent3;
    private javax.swing.JTextField txtContent30;
    private javax.swing.JTextField txtContent31;
    private javax.swing.JTextField txtContent32;
    private javax.swing.JTextField txtContent33;
    private javax.swing.JTextField txtContent34;
    private javax.swing.JTextField txtContent35;
    private javax.swing.JTextField txtContent36;
    private javax.swing.JTextField txtContent37;
    private javax.swing.JTextField txtContent38;
    private javax.swing.JTextField txtContent39;
    private javax.swing.JTextField txtContent4;
    private javax.swing.JTextField txtContent40;
    private javax.swing.JTextField txtContent41;
    private javax.swing.JTextField txtContent42;
    private javax.swing.JTextField txtContent43;
    private javax.swing.JTextField txtContent44;
    private javax.swing.JTextField txtContent45;
    private javax.swing.JTextField txtContent46;
    private javax.swing.JTextField txtContent47;
    private javax.swing.JTextField txtContent48;
    private javax.swing.JTextField txtContent49;
    private javax.swing.JTextField txtContent5;
    private javax.swing.JTextField txtContent50;
    private javax.swing.JTextField txtContent51;
    private javax.swing.JTextField txtContent52;
    private javax.swing.JTextField txtContent53;
    private javax.swing.JTextField txtContent54;
    private javax.swing.JTextField txtContent55;
    private javax.swing.JTextField txtContent56;
    private javax.swing.JTextField txtContent57;
    private javax.swing.JTextField txtContent58;
    private javax.swing.JTextField txtContent59;
    private javax.swing.JTextField txtContent6;
    private javax.swing.JTextField txtContent60;
    private javax.swing.JTextField txtContent61;
    private javax.swing.JTextField txtContent62;
    private javax.swing.JTextField txtContent63;
    private javax.swing.JTextField txtContent64;
    private javax.swing.JTextField txtContent65;
    private javax.swing.JTextField txtContent66;
    private javax.swing.JTextField txtContent67;
    private javax.swing.JTextField txtContent68;
    private javax.swing.JTextField txtContent69;
    private javax.swing.JTextField txtContent7;
    private javax.swing.JTextField txtContent70;
    private javax.swing.JTextField txtContent71;
    private javax.swing.JTextField txtContent72;
    private javax.swing.JTextField txtContent73;
    private javax.swing.JTextField txtContent74;
    private javax.swing.JTextField txtContent75;
    private javax.swing.JTextField txtContent76;
    private javax.swing.JTextField txtContent77;
    private javax.swing.JTextField txtContent78;
    private javax.swing.JTextField txtContent79;
    private javax.swing.JTextField txtContent8;
    private javax.swing.JTextField txtContent80;
    private javax.swing.JTextField txtContent81;
    private javax.swing.JTextField txtContent82;
    private javax.swing.JTextField txtContent83;
    private javax.swing.JTextField txtContent9;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtRole1;
    private javax.swing.JTextField txtRole10;
    private javax.swing.JTextField txtRole11;
    private javax.swing.JTextField txtRole12;
    private javax.swing.JTextField txtRole13;
    private javax.swing.JTextField txtRole14;
    private javax.swing.JTextField txtRole15;
    private javax.swing.JTextField txtRole16;
    private javax.swing.JTextField txtRole17;
    private javax.swing.JTextField txtRole18;
    private javax.swing.JTextField txtRole19;
    private javax.swing.JTextField txtRole2;
    private javax.swing.JTextField txtRole20;
    private javax.swing.JTextField txtRole21;
    private javax.swing.JTextField txtRole22;
    private javax.swing.JTextField txtRole23;
    private javax.swing.JTextField txtRole24;
    private javax.swing.JTextField txtRole25;
    private javax.swing.JTextField txtRole26;
    private javax.swing.JTextField txtRole27;
    private javax.swing.JTextField txtRole28;
    private javax.swing.JTextField txtRole29;
    private javax.swing.JTextField txtRole3;
    private javax.swing.JTextField txtRole30;
    private javax.swing.JTextField txtRole31;
    private javax.swing.JTextField txtRole32;
    private javax.swing.JTextField txtRole33;
    private javax.swing.JTextField txtRole34;
    private javax.swing.JTextField txtRole35;
    private javax.swing.JTextField txtRole36;
    private javax.swing.JTextField txtRole37;
    private javax.swing.JTextField txtRole38;
    private javax.swing.JTextField txtRole39;
    private javax.swing.JTextField txtRole4;
    private javax.swing.JTextField txtRole40;
    private javax.swing.JTextField txtRole41;
    private javax.swing.JTextField txtRole42;
    private javax.swing.JTextField txtRole43;
    private javax.swing.JTextField txtRole44;
    private javax.swing.JTextField txtRole45;
    private javax.swing.JTextField txtRole46;
    private javax.swing.JTextField txtRole47;
    private javax.swing.JTextField txtRole48;
    private javax.swing.JTextField txtRole49;
    private javax.swing.JTextField txtRole5;
    private javax.swing.JTextField txtRole50;
    private javax.swing.JTextField txtRole51;
    private javax.swing.JTextField txtRole52;
    private javax.swing.JTextField txtRole53;
    private javax.swing.JTextField txtRole54;
    private javax.swing.JTextField txtRole55;
    private javax.swing.JTextField txtRole56;
    private javax.swing.JTextField txtRole57;
    private javax.swing.JTextField txtRole58;
    private javax.swing.JTextField txtRole59;
    private javax.swing.JTextField txtRole6;
    private javax.swing.JTextField txtRole60;
    private javax.swing.JTextField txtRole61;
    private javax.swing.JTextField txtRole62;
    private javax.swing.JTextField txtRole63;
    private javax.swing.JTextField txtRole64;
    private javax.swing.JTextField txtRole65;
    private javax.swing.JTextField txtRole66;
    private javax.swing.JTextField txtRole67;
    private javax.swing.JTextField txtRole68;
    private javax.swing.JTextField txtRole69;
    private javax.swing.JTextField txtRole7;
    private javax.swing.JTextField txtRole70;
    private javax.swing.JTextField txtRole71;
    private javax.swing.JTextField txtRole72;
    private javax.swing.JTextField txtRole73;
    private javax.swing.JTextField txtRole74;
    private javax.swing.JTextField txtRole75;
    private javax.swing.JTextField txtRole76;
    private javax.swing.JTextField txtRole77;
    private javax.swing.JTextField txtRole78;
    private javax.swing.JTextField txtRole79;
    private javax.swing.JTextField txtRole8;
    private javax.swing.JTextField txtRole80;
    private javax.swing.JTextField txtRole81;
    private javax.swing.JTextField txtRole82;
    private javax.swing.JTextField txtRole83;
    private javax.swing.JTextField txtRole9;
    private javax.swing.JTextField txtScore;
    private javax.swing.JTextField txtScore1;
    private javax.swing.JTextField txtScore10;
    private javax.swing.JTextField txtScore11;
    private javax.swing.JTextField txtScore12;
    private javax.swing.JTextField txtScore13;
    private javax.swing.JTextField txtScore14;
    private javax.swing.JTextField txtScore15;
    private javax.swing.JTextField txtScore16;
    private javax.swing.JTextField txtScore17;
    private javax.swing.JTextField txtScore18;
    private javax.swing.JTextField txtScore19;
    private javax.swing.JTextField txtScore2;
    private javax.swing.JTextField txtScore20;
    private javax.swing.JTextField txtScore21;
    private javax.swing.JTextField txtScore22;
    private javax.swing.JTextField txtScore23;
    private javax.swing.JTextField txtScore24;
    private javax.swing.JTextField txtScore25;
    private javax.swing.JTextField txtScore26;
    private javax.swing.JTextField txtScore27;
    private javax.swing.JTextField txtScore28;
    private javax.swing.JTextField txtScore29;
    private javax.swing.JTextField txtScore3;
    private javax.swing.JTextField txtScore30;
    private javax.swing.JTextField txtScore31;
    private javax.swing.JTextField txtScore32;
    private javax.swing.JTextField txtScore33;
    private javax.swing.JTextField txtScore34;
    private javax.swing.JTextField txtScore35;
    private javax.swing.JTextField txtScore36;
    private javax.swing.JTextField txtScore37;
    private javax.swing.JTextField txtScore38;
    private javax.swing.JTextField txtScore39;
    private javax.swing.JTextField txtScore4;
    private javax.swing.JTextField txtScore40;
    private javax.swing.JTextField txtScore41;
    private javax.swing.JTextField txtScore42;
    private javax.swing.JTextField txtScore43;
    private javax.swing.JTextField txtScore44;
    private javax.swing.JTextField txtScore45;
    private javax.swing.JTextField txtScore46;
    private javax.swing.JTextField txtScore47;
    private javax.swing.JTextField txtScore48;
    private javax.swing.JTextField txtScore49;
    private javax.swing.JTextField txtScore5;
    private javax.swing.JTextField txtScore50;
    private javax.swing.JTextField txtScore51;
    private javax.swing.JTextField txtScore52;
    private javax.swing.JTextField txtScore53;
    private javax.swing.JTextField txtScore54;
    private javax.swing.JTextField txtScore55;
    private javax.swing.JTextField txtScore56;
    private javax.swing.JTextField txtScore57;
    private javax.swing.JTextField txtScore58;
    private javax.swing.JTextField txtScore59;
    private javax.swing.JTextField txtScore6;
    private javax.swing.JTextField txtScore60;
    private javax.swing.JTextField txtScore61;
    private javax.swing.JTextField txtScore62;
    private javax.swing.JTextField txtScore63;
    private javax.swing.JTextField txtScore64;
    private javax.swing.JTextField txtScore65;
    private javax.swing.JTextField txtScore66;
    private javax.swing.JTextField txtScore67;
    private javax.swing.JTextField txtScore68;
    private javax.swing.JTextField txtScore69;
    private javax.swing.JTextField txtScore7;
    private javax.swing.JTextField txtScore70;
    private javax.swing.JTextField txtScore71;
    private javax.swing.JTextField txtScore72;
    private javax.swing.JTextField txtScore73;
    private javax.swing.JTextField txtScore8;
    private javax.swing.JTextField txtScore9;
    private javax.swing.JTextField txtStudentDisID;
    private javax.swing.JTextField txtStudentDisID1;
    private javax.swing.JTextField txtStudentDisID2;
    private javax.swing.JTextField txtStudentDisName;
    private javax.swing.JTextField txtStudentDisName1;
    private javax.swing.JTextField txtStudentDisName2;
    // End of variables declaration//GEN-END:variables
}