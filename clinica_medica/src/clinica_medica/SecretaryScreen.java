package clinica_medica;

import java.util.List;
import java.util.ArrayList;
import services.Appointment;
import models.Doctor;
import models.Patient;
import models.Secretary;

public class SecretaryScreen extends javax.swing.JFrame {
    
    private int appointmentId = 1;
    
    //TESTES
    private final Doctor doctor;
    private final Secretary secretary;
    private final List<Appointment> appointments = new ArrayList<Appointment>();
    private final List<Patient> patients = new ArrayList<Patient>();

    public SecretaryScreen() {
        this.doctor = new Doctor("Neymar Júnior", "12345678", "(44)99999-9999");
        this.secretary = new Secretary("Pai do Neymar", "987654321", "(44)11111-1111");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGoToDoctorScreen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPatientDateBirth = new javax.swing.JTextField();
        txtPatientEmail = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtPatientAdress = new javax.swing.JTextField();
        txtPatientCPF = new javax.swing.JTextField();
        txtPatientPhoneNumber = new javax.swing.JTextField();
        radioBtnIsAdding = new javax.swing.JRadioButton();
        radioBtnIsUpdating = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        radioBtnIsParticular = new javax.swing.JRadioButton();
        radioBtnIsNotParticular = new javax.swing.JRadioButton();
        btnRemovePatient = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPatientCPFRemove = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnAddOrUpdatePatient = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtHourAppointment = new javax.swing.JTextField();
        txtAppointmentData = new javax.swing.JTextField();
        txtPatientAppointmentCpf = new javax.swing.JTextField();
        txtDoctorAppointmentCpf = new javax.swing.JTextField();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        btnRemoveAppointment = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtPatientRemoveAppointmentCpf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnAddAppointment = new javax.swing.JButton();
        btnShowAllAppoints = new javax.swing.JButton();
        btnShowPatient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnGoToDoctorScreen.setText("Ir tela Médico");
        btnGoToDoctorScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToDoctorScreenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("TELA INICIAL SECRETÁRIA");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Pacientes:");

        jLabel4.setText("Nome:");

        jLabel5.setText("Sexo:");

        jLabel6.setText("Telefone:");

        jLabel7.setText("E-mail:");

        jLabel8.setText("CPF:");

        jLabel9.setText("Data de Nascimento:");

        jLabel10.setText("Tipo:");

        jLabel11.setText("Endereço:");

        txtPatientDateBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientDateBirthActionPerformed(evt);
            }
        });

        txtPatientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientEmailActionPerformed(evt);
            }
        });

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        txtPatientAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientAdressActionPerformed(evt);
            }
        });

        txtPatientCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientCPFActionPerformed(evt);
            }
        });

        txtPatientPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientPhoneNumberActionPerformed(evt);
            }
        });

        radioBtnIsAdding.setText("Adicionar");

        radioBtnIsUpdating.setText("Atualizar");

        jRadioButton3.setText("M");

        jRadioButton4.setText("F");

        radioBtnIsParticular.setText("Particular");

        radioBtnIsNotParticular.setText("Plano de Saúde");

        btnRemovePatient.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnRemovePatient.setText("REMOVER");
        btnRemovePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePatientActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Remover Paciente:");

        txtPatientCPFRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientCPFRemoveActionPerformed(evt);
            }
        });

        jLabel12.setText("CPF:");

        btnAddOrUpdatePatient.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnAddOrUpdatePatient.setText("ADICIONAR PACIENTE");
        btnAddOrUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrUpdatePatientActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel13.setText("Agendamentos:");

        jLabel14.setText("Data:");

        jLabel15.setText("Horário:");

        jLabel16.setText("CPF (paciente):");

        jLabel17.setText("Tipo de Consulta:");

        jLabel18.setText("CPF (Médico):");

        txtHourAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHourAppointmentActionPerformed(evt);
            }
        });

        txtAppointmentData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppointmentDataActionPerformed(evt);
            }
        });

        txtPatientAppointmentCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientAppointmentCpfActionPerformed(evt);
            }
        });

        txtDoctorAppointmentCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorAppointmentCpfActionPerformed(evt);
            }
        });

        jRadioButton7.setText("Normal");

        jRadioButton8.setText("Retorno");

        jRadioButton9.setText("Adicionar");

        jRadioButton10.setText("Atualizar");

        btnRemoveAppointment.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnRemoveAppointment.setText("REMOVER");
        btnRemoveAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAppointmentActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel19.setText("Remover Agendamento:");

        txtPatientRemoveAppointmentCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientRemoveAppointmentCpfActionPerformed(evt);
            }
        });

        jLabel20.setText("CPF (Paciente):");

        btnAddAppointment.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnAddAppointment.setText("ADICIONAR AGENDAMENTO");
        btnAddAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAppointmentActionPerformed(evt);
            }
        });

        btnShowAllAppoints.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnShowAllAppoints.setText("Show All in Console");
        btnShowAllAppoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllAppointsActionPerformed(evt);
            }
        });

        btnShowPatient.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnShowPatient.setText("Show All in Console");
        btnShowPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(radioBtnIsAdding)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBtnIsUpdating)
                                .addGap(18, 18, 18)
                                .addComponent(btnShowPatient)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(199, 199, 199)
                                .addComponent(btnGoToDoctorScreen)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addGap(36, 36, 36)
                                .addComponent(jRadioButton4)))
                        .addGap(2, 110, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatientDateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnIsParticular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioBtnIsNotParticular)))
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientEmail)
                            .addComponent(txtPatientAdress, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(417, 417, 417))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientCPFRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemovePatient))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHourAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDoctorAppointmentCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnShowAllAppoints)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(txtAppointmentData, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtPatientAppointmentCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txtPatientRemoveAppointmentCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoveAppointment))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(btnAddAppointment)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddOrUpdatePatient)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoToDoctorScreen)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(radioBtnIsAdding)
                    .addComponent(radioBtnIsUpdating)
                    .addComponent(btnShowPatient))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPatientCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtPatientPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtPatientEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtPatientDateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(txtPatientAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnIsParticular)
                    .addComponent(radioBtnIsNotParticular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddOrUpdatePatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(txtPatientCPFRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemovePatient))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10)
                    .addComponent(btnShowAllAppoints))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtAppointmentData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtHourAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtPatientAppointmentCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtDoctorAppointmentCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddAppointment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(txtPatientRemoveAppointmentCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveAppointment))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToDoctorScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToDoctorScreenActionPerformed
        
    }//GEN-LAST:event_btnGoToDoctorScreenActionPerformed

    private void txtPatientDateBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientDateBirthActionPerformed
    }//GEN-LAST:event_txtPatientDateBirthActionPerformed

    private void txtPatientEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientEmailActionPerformed
    }//GEN-LAST:event_txtPatientEmailActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtPatientAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientAdressActionPerformed
    }//GEN-LAST:event_txtPatientAdressActionPerformed

    private void txtPatientCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientCPFActionPerformed
    }//GEN-LAST:event_txtPatientCPFActionPerformed

    private void txtPatientPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientPhoneNumberActionPerformed
    }//GEN-LAST:event_txtPatientPhoneNumberActionPerformed

    private void txtPatientCPFRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientCPFRemoveActionPerformed
    }//GEN-LAST:event_txtPatientCPFRemoveActionPerformed

    private void txtHourAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHourAppointmentActionPerformed
    }//GEN-LAST:event_txtHourAppointmentActionPerformed

    private void txtAppointmentDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppointmentDataActionPerformed
    }//GEN-LAST:event_txtAppointmentDataActionPerformed

    private void txtPatientAppointmentCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientAppointmentCpfActionPerformed
    }//GEN-LAST:event_txtPatientAppointmentCpfActionPerformed

    private void txtDoctorAppointmentCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorAppointmentCpfActionPerformed
    }//GEN-LAST:event_txtDoctorAppointmentCpfActionPerformed

    private void txtPatientRemoveAppointmentCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientRemoveAppointmentCpfActionPerformed
    }//GEN-LAST:event_txtPatientRemoveAppointmentCpfActionPerformed

    private void btnAddOrUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrUpdatePatientActionPerformed
        Patient patient = new Patient();
        patient.setName(this.txtPatientName.getText());
        patient.setCpf(this.txtPatientCPF.getText());
        patient.setDateBirth(this.txtPatientDateBirth.getText());
        patient.setEmail(this.txtPatientEmail.getText());
        patient.setPhoneNumber(this.txtPatientPhoneNumber.getText());
        patient.setAddress(this.txtPatientAdress.getText());
        //Colocar os radio button
        
        secretary.addPatient(patient, patients);
        
        this.txtPatientName.setText("");
        this.txtPatientCPF.setText("");
        this.txtPatientDateBirth.setText("");
        this.txtPatientEmail.setText("");
        this.txtPatientPhoneNumber.setText("");
        this.txtPatientAdress.setText("");
        
    }//GEN-LAST:event_btnAddOrUpdatePatientActionPerformed

    private void btnRemovePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePatientActionPerformed
        secretary.removePatient(this.txtPatientCPFRemove.getText(), patients);
        System.out.println(patients);
        this.txtPatientCPFRemove.setText("");
    }//GEN-LAST:event_btnRemovePatientActionPerformed

    private void btnAddAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAppointmentActionPerformed
        Appointment app = new Appointment(appointmentId, doctor.getCpf());
        this.appointmentId++;
        app.setDate(this.txtAppointmentData.getText());
        app.setHour(this.txtHourAppointment.getText());
        app.setDoctorCpf(this.txtDoctorAppointmentCpf.getText());
        app.setPatientCpf(this.txtPatientAppointmentCpf.getText());
     
        secretary.addAppointment(app, appointments);
        
        this.txtAppointmentData.setText("");
        this.txtHourAppointment.setText("");
        this.txtDoctorAppointmentCpf.setText("");
        this.txtPatientAppointmentCpf.setText((""));        
    }//GEN-LAST:event_btnAddAppointmentActionPerformed

    private void btnRemoveAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAppointmentActionPerformed
        secretary.removeAppointment(this.txtPatientRemoveAppointmentCpf.getText(), appointments);
    }//GEN-LAST:event_btnRemoveAppointmentActionPerformed

    private void btnShowPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPatientActionPerformed
        secretary.showAllPatients(patients);
    }//GEN-LAST:event_btnShowPatientActionPerformed

    private void btnShowAllAppointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllAppointsActionPerformed
        secretary.showAllApointments(appointments);
    }//GEN-LAST:event_btnShowAllAppointsActionPerformed
    
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
            java.util.logging.Logger.getLogger(SecretaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecretaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecretaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecretaryScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretaryScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAppointment;
    private javax.swing.JButton btnAddOrUpdatePatient;
    private javax.swing.JButton btnGoToDoctorScreen;
    private javax.swing.JButton btnRemoveAppointment;
    private javax.swing.JButton btnRemovePatient;
    private javax.swing.JButton btnShowAllAppoints;
    private javax.swing.JButton btnShowPatient;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JRadioButton radioBtnIsAdding;
    private javax.swing.JRadioButton radioBtnIsNotParticular;
    private javax.swing.JRadioButton radioBtnIsParticular;
    private javax.swing.JRadioButton radioBtnIsUpdating;
    private javax.swing.JTextField txtAppointmentData;
    private javax.swing.JTextField txtDoctorAppointmentCpf;
    private javax.swing.JTextField txtHourAppointment;
    private javax.swing.JTextField txtPatientAdress;
    private javax.swing.JTextField txtPatientAppointmentCpf;
    private javax.swing.JTextField txtPatientCPF;
    private javax.swing.JTextField txtPatientCPFRemove;
    private javax.swing.JTextField txtPatientDateBirth;
    private javax.swing.JTextField txtPatientEmail;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientPhoneNumber;
    private javax.swing.JTextField txtPatientRemoveAppointmentCpf;
    // End of variables declaration//GEN-END:variables
}
