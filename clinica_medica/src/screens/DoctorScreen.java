package screens;

import models.Doctor;
import models.Patient;
import services.Appointment;
import java.util.List;
import java.util.ArrayList;

public class DoctorScreen extends javax.swing.JFrame {
    
    
    public DoctorScreen() {
        initComponents();
        
        this.radioBtnAddPatient.setSelected(true);
        this.radioBtnNotCholesterol.setSelected(true);
        this.radioBtnNotDiabetes.setSelected(true);
        this.radioBtnNotHeartDisease.setSelected(true);
        this.radioBtnIsNotSmoker.setSelected(true);
        this.radioBtnIsNotAlcoholConsumer.setSelected(true);
        this.CpfInfo.setText("");           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientCpf = new javax.swing.JTextField();
        radioBtnAddPatient = new javax.swing.JRadioButton();
        radioBtnUpdtPatient = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        radioBtnHeartDisease = new javax.swing.JRadioButton();
        radioBtnDiabetes = new javax.swing.JRadioButton();
        radioBtnCholesterol = new javax.swing.JRadioButton();
        radioBtnIsAlcoholConsumer = new javax.swing.JRadioButton();
        radioBtnIsSmoker = new javax.swing.JRadioButton();
        radioBtnNotHeartDisease = new javax.swing.JRadioButton();
        radioBtnNotCholesterol = new javax.swing.JRadioButton();
        radioBtnIsNotAlcoholConsumer = new javax.swing.JRadioButton();
        radioBtnNotDiabetes = new javax.swing.JRadioButton();
        radioBtnIsNotSmoker = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaCirurgies = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAllergies = new javax.swing.JTextArea();
        btnAddOrUpdatePatientData = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPatientCpfClear = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        CpfInfo = new javax.swing.JLabel();
        btnGoToDoctorScreen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Bem Vindo(a) Doutor(a)");

        jLabel2.setText("Bebida Alcoólica?");

        radioBtnAddPatient.setText("Adicionar");
        radioBtnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnAddPatientActionPerformed(evt);
            }
        });

        radioBtnUpdtPatient.setText("Atualizar");
        radioBtnUpdtPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnUpdtPatientActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite o CPF do Paciente:");

        jLabel4.setText("Fumante?");

        jLabel5.setText("Doença Cardíaca?");

        jLabel6.setText("Colesterol?");

        jLabel7.setText("Diabetes?");

        jLabel8.setText("Cirurgias:");

        jLabel9.setText("Alergias:");

        radioBtnHeartDisease.setText("Sim");
        radioBtnHeartDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnHeartDiseaseActionPerformed(evt);
            }
        });

        radioBtnDiabetes.setText("Sim");
        radioBtnDiabetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnDiabetesActionPerformed(evt);
            }
        });

        radioBtnCholesterol.setText("Sim");
        radioBtnCholesterol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnCholesterolActionPerformed(evt);
            }
        });

        radioBtnIsAlcoholConsumer.setText("Sim");
        radioBtnIsAlcoholConsumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsAlcoholConsumerActionPerformed(evt);
            }
        });

        radioBtnIsSmoker.setText("Sim");
        radioBtnIsSmoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsSmokerActionPerformed(evt);
            }
        });

        radioBtnNotHeartDisease.setText("Não");
        radioBtnNotHeartDisease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnNotHeartDiseaseActionPerformed(evt);
            }
        });

        radioBtnNotCholesterol.setText("Não");
        radioBtnNotCholesterol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnNotCholesterolActionPerformed(evt);
            }
        });

        radioBtnIsNotAlcoholConsumer.setText("Não");
        radioBtnIsNotAlcoholConsumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsNotAlcoholConsumerActionPerformed(evt);
            }
        });

        radioBtnNotDiabetes.setText("Não");
        radioBtnNotDiabetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnNotDiabetesActionPerformed(evt);
            }
        });

        radioBtnIsNotSmoker.setText("Não");
        radioBtnIsNotSmoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsNotSmokerActionPerformed(evt);
            }
        });

        txtAreaCirurgies.setColumns(20);
        txtAreaCirurgies.setRows(5);
        jScrollPane1.setViewportView(txtAreaCirurgies);

        txtAreaAllergies.setColumns(20);
        txtAreaAllergies.setRows(5);
        jScrollPane2.setViewportView(txtAreaAllergies);

        btnAddOrUpdatePatientData.setBackground(new java.awt.Color(101, 174, 40));
        btnAddOrUpdatePatientData.setForeground(java.awt.Color.black);
        btnAddOrUpdatePatientData.setText("INSERIR DADOS");

        jLabel10.setText("Para limpar os dados adicionais digite o CPF do Paciente:");

        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(226, 66, 66));
        jButton2.setText("Limpar Dados");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setText("Adicionar Dados Adicionais do Paciente");

        CpfInfo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        CpfInfo.setForeground(new java.awt.Color(182, 147, 20));
        CpfInfo.setText("Atualização é feita pelo CPF");

        btnGoToDoctorScreen.setText("Ir tela Secretária");
        btnGoToDoctorScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToDoctorScreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAddOrUpdatePatientData, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(217, 217, 217))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(radioBtnDiabetes)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(radioBtnIsAlcoholConsumer))
                                            .addComponent(radioBtnIsSmoker))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioBtnIsNotAlcoholConsumer)
                                            .addComponent(radioBtnNotDiabetes)
                                            .addComponent(radioBtnIsNotSmoker)))
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnHeartDisease)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnNotHeartDisease))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnCholesterol)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnNotCholesterol))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CpfInfo)
                                .addGap(87, 87, 87))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPatientCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioBtnAddPatient)
                                        .addGap(33, 33, 33)
                                        .addComponent(radioBtnUpdtPatient))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPatientCpfClear, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(jButton2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8)
                                            .addGap(26, 26, 26)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 10, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGoToDoctorScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnGoToDoctorScreen))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CpfInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPatientCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnAddPatient)
                    .addComponent(radioBtnUpdtPatient)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioBtnIsNotSmoker)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radioBtnCholesterol)
                        .addComponent(radioBtnNotCholesterol)
                        .addComponent(radioBtnIsSmoker)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioBtnIsAlcoholConsumer)
                            .addComponent(radioBtnIsNotAlcoholConsumer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioBtnDiabetes)
                            .addComponent(radioBtnNotDiabetes)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioBtnHeartDisease)
                            .addComponent(radioBtnNotHeartDisease))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddOrUpdatePatientData, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPatientCpfClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnHeartDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnHeartDiseaseActionPerformed
        this.radioBtnHeartDisease.setSelected(true);
        this.radioBtnNotHeartDisease.setSelected(false);
    }//GEN-LAST:event_radioBtnHeartDiseaseActionPerformed

    private void radioBtnDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnDiabetesActionPerformed
        this.radioBtnDiabetes.setSelected(true);
        this.radioBtnNotDiabetes.setSelected(false);
    }//GEN-LAST:event_radioBtnDiabetesActionPerformed

    private void radioBtnCholesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnCholesterolActionPerformed
        this.radioBtnCholesterol.setSelected(true);
        this.radioBtnNotCholesterol.setSelected(false);
    }//GEN-LAST:event_radioBtnCholesterolActionPerformed

    private void radioBtnIsAlcoholConsumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsAlcoholConsumerActionPerformed
        this.radioBtnIsAlcoholConsumer.setSelected(true);
        this.radioBtnIsNotAlcoholConsumer.setSelected(false);
    }//GEN-LAST:event_radioBtnIsAlcoholConsumerActionPerformed

    private void radioBtnIsSmokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsSmokerActionPerformed
        this.radioBtnIsSmoker.setSelected(true);
        this.radioBtnIsNotSmoker.setSelected(false);
    }//GEN-LAST:event_radioBtnIsSmokerActionPerformed

    private void radioBtnNotHeartDiseaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnNotHeartDiseaseActionPerformed
        this.radioBtnNotHeartDisease.setSelected(true);
        this.radioBtnHeartDisease.setSelected(false);
    }//GEN-LAST:event_radioBtnNotHeartDiseaseActionPerformed

    private void radioBtnNotCholesterolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnNotCholesterolActionPerformed
        this.radioBtnCholesterol.setSelected(false);
        this.radioBtnNotCholesterol.setSelected(true);
    }//GEN-LAST:event_radioBtnNotCholesterolActionPerformed

    private void radioBtnIsNotAlcoholConsumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsNotAlcoholConsumerActionPerformed
        this.radioBtnIsAlcoholConsumer.setSelected(false);
        this.radioBtnIsNotAlcoholConsumer.setSelected(true);
    }//GEN-LAST:event_radioBtnIsNotAlcoholConsumerActionPerformed

    private void radioBtnNotDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnNotDiabetesActionPerformed
        this.radioBtnDiabetes.setSelected(false);
        this.radioBtnNotDiabetes.setSelected(true);
    }//GEN-LAST:event_radioBtnNotDiabetesActionPerformed

    private void radioBtnIsNotSmokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsNotSmokerActionPerformed
        this.radioBtnIsSmoker.setSelected(false);
        this.radioBtnIsNotSmoker.setSelected(true);
    }//GEN-LAST:event_radioBtnIsNotSmokerActionPerformed

    private void radioBtnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnAddPatientActionPerformed
        this.radioBtnAddPatient.setSelected(true);
        this.radioBtnUpdtPatient.setSelected(false);
        this.btnAddOrUpdatePatientData.setText("INSERIR DADOS");
        this.CpfInfo.setText("");
    }//GEN-LAST:event_radioBtnAddPatientActionPerformed

    private void radioBtnUpdtPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnUpdtPatientActionPerformed
        this.radioBtnAddPatient.setSelected(false);
        this.radioBtnUpdtPatient.setSelected(true);
        this.btnAddOrUpdatePatientData.setText("ATUALIZAR DADOS");
        this.CpfInfo.setText("Atualização é feita pelo CPF");
    }//GEN-LAST:event_radioBtnUpdtPatientActionPerformed

    private void btnGoToDoctorScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToDoctorScreenActionPerformed
        
        dispose();
    }//GEN-LAST:event_btnGoToDoctorScreenActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DoctorScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CpfInfo;
    private javax.swing.JButton btnAddOrUpdatePatientData;
    private javax.swing.JButton btnGoToDoctorScreen;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioBtnAddPatient;
    private javax.swing.JRadioButton radioBtnCholesterol;
    private javax.swing.JRadioButton radioBtnDiabetes;
    private javax.swing.JRadioButton radioBtnHeartDisease;
    private javax.swing.JRadioButton radioBtnIsAlcoholConsumer;
    private javax.swing.JRadioButton radioBtnIsNotAlcoholConsumer;
    private javax.swing.JRadioButton radioBtnIsNotSmoker;
    private javax.swing.JRadioButton radioBtnIsSmoker;
    private javax.swing.JRadioButton radioBtnNotCholesterol;
    private javax.swing.JRadioButton radioBtnNotDiabetes;
    private javax.swing.JRadioButton radioBtnNotHeartDisease;
    private javax.swing.JRadioButton radioBtnUpdtPatient;
    private javax.swing.JTextArea txtAreaAllergies;
    private javax.swing.JTextArea txtAreaCirurgies;
    private javax.swing.JTextField txtPatientCpf;
    private javax.swing.JTextField txtPatientCpfClear;
    // End of variables declaration//GEN-END:variables
}
