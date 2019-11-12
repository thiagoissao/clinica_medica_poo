package clinica_medica;

import java.util.List;
import java.util.ArrayList;
import services.Appointment;
import models.Doctor;
import models.Patient;
import models.Secretary;

public class SecretaryScreen extends javax.swing.JFrame {
        
    //TESTES
    private final Doctor doctor;
    private final Secretary secretary;
    private final List<Appointment> appointments = new ArrayList<>();
    private final List<Patient> patients = new ArrayList<>();

    public SecretaryScreen() {
        this.doctor = new Doctor("Neymar Júnior", "12345678", "(44)99999-9999");
        this.secretary = new Secretary("Pai do Neymar", "987654321", "(44)11111-1111");
        
        setupComponents();
    }
    
    private void setupComponents(){
        initComponents();
        this.radioBtnIsAdding.setSelected(true);
        this.txtCpfInfo.setText("");
        this.txtCpfInfo2.setText("");
        this.radioBtnIsUpdating.setSelected(false);
        this.radioBtnIsMale.setSelected(true);
        this.radioBtnIsFemale.setSelected(false);
        this.radioBtnIsParticular.setSelected(true);
        this.radioBtnIsNotParticular.setSelected(false);
        this.radioBtnAddAppointment.setSelected(true);
        this.radioBtnIsNormalAppointment.setSelected(true);
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
        radioBtnIsMale = new javax.swing.JRadioButton();
        radioBtnIsFemale = new javax.swing.JRadioButton();
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
        radioBtnIsNormalAppointment = new javax.swing.JRadioButton();
        radioBtnIsNotNormalAppointment = new javax.swing.JRadioButton();
        radioBtnAddAppointment = new javax.swing.JRadioButton();
        radioBtnUpdateAppointment = new javax.swing.JRadioButton();
        btnRemoveAppointment = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtPatientRemoveAppointmentCpf = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnAddAppointment = new javax.swing.JButton();
        btnShowAllAppoints = new javax.swing.JButton();
        btnShowPatient = new javax.swing.JButton();
        txtCpfInfo = new javax.swing.JLabel();
        txtCpfInfo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setResizable(false);

        btnGoToDoctorScreen.setText("Ir tela Médico");
        btnGoToDoctorScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToDoctorScreenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("BEM VINDO(A) SECRETÁRIO(A)");

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
        radioBtnIsAdding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsAddingActionPerformed(evt);
            }
        });

        radioBtnIsUpdating.setText("Atualizar");
        radioBtnIsUpdating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsUpdatingActionPerformed(evt);
            }
        });

        radioBtnIsMale.setText("M");
        radioBtnIsMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsMaleActionPerformed(evt);
            }
        });

        radioBtnIsFemale.setText("F");
        radioBtnIsFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsFemaleActionPerformed(evt);
            }
        });

        radioBtnIsParticular.setText("Particular");
        radioBtnIsParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsParticularActionPerformed(evt);
            }
        });

        radioBtnIsNotParticular.setText("Plano de Saúde");
        radioBtnIsNotParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsNotParticularActionPerformed(evt);
            }
        });

        btnRemovePatient.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnRemovePatient.setForeground(new java.awt.Color(226, 66, 66));
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

        btnAddOrUpdatePatient.setBackground(new java.awt.Color(101, 174, 40));
        btnAddOrUpdatePatient.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnAddOrUpdatePatient.setForeground(java.awt.Color.black);
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

        radioBtnIsNormalAppointment.setText("Normal");
        radioBtnIsNormalAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsNormalAppointmentActionPerformed(evt);
            }
        });

        radioBtnIsNotNormalAppointment.setText("Retorno");
        radioBtnIsNotNormalAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsNotNormalAppointmentActionPerformed(evt);
            }
        });

        radioBtnAddAppointment.setText("Adicionar");
        radioBtnAddAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnAddAppointmentActionPerformed(evt);
            }
        });

        radioBtnUpdateAppointment.setText("Atualizar");
        radioBtnUpdateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnUpdateAppointmentActionPerformed(evt);
            }
        });

        btnRemoveAppointment.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnRemoveAppointment.setForeground(new java.awt.Color(226, 66, 66));
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

        btnAddAppointment.setBackground(new java.awt.Color(101, 174, 40));
        btnAddAppointment.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnAddAppointment.setForeground(java.awt.Color.black);
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

        txtCpfInfo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        txtCpfInfo.setForeground(new java.awt.Color(182, 147, 20));
        txtCpfInfo.setText("Atualização é feita pelo cpf");

        txtCpfInfo2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        txtCpfInfo2.setForeground(new java.awt.Color(182, 147, 20));
        txtCpfInfo2.setText("Atualização é feita pelo cpf");

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
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioBtnAddAppointment))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnIsNormalAppointment)))
                        .addGap(0, 569, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioBtnIsMale)
                                .addGap(29, 29, 29)
                                .addComponent(radioBtnIsFemale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(radioBtnIsUpdating))
                                    .addComponent(txtPatientName))
                                .addGap(43, 43, 43)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientPhoneNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatientDateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioBtnIsParticular)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnIsNotParticular))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientCPF)))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(radioBtnIsNotNormalAppointment)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAppointmentData, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPatientAppointmentCpf)))
                                .addComponent(radioBtnUpdateAppointment))
                            .addComponent(txtCpfInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnShowAllAppoints)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDoctorAppointmentCpf))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtHourAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientEmail)
                            .addComponent(txtPatientAdress, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(417, 417, 417))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientCPFRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemovePatient))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientRemoveAppointmentCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemoveAppointment)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(268, 268, 268))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAddOrUpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(275, 275, 275))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAddAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(246, 246, 246))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(radioBtnIsAdding)
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCpfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShowPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(73, 73, 73)
                                .addComponent(btnGoToDoctorScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGoToDoctorScreen)
                    .addComponent(jLabel1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(radioBtnIsAdding)
                    .addComponent(radioBtnIsUpdating)
                    .addComponent(btnShowPatient))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtPatientCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpfInfo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtPatientPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioBtnIsMale)
                    .addComponent(radioBtnIsFemale))
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
                .addGap(12, 12, 12)
                .addComponent(btnAddOrUpdatePatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12)
                    .addComponent(txtPatientCPFRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemovePatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(radioBtnAddAppointment)
                    .addComponent(radioBtnUpdateAppointment)
                    .addComponent(btnShowAllAppoints))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtAppointmentData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(txtCpfInfo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtPatientAppointmentCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtDoctorAppointmentCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txtHourAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioBtnIsNotNormalAppointment)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(radioBtnIsNormalAppointment)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddAppointment)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(txtPatientRemoveAppointmentCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveAppointment))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToDoctorScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToDoctorScreenActionPerformed
        DoctorScreen frame = new DoctorScreen();
        frame.setVisible(true);
        this.setVisible(false);
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
        patient.setIsMale(this.radioBtnIsMale.isSelected());
        patient.setIsParticular(this.radioBtnIsParticular.isSelected());
        
        if(this.radioBtnIsAdding.isSelected()){
            secretary.addPatient(patient, patients);
        }else{
            secretary.updatePatient(this.txtPatientCPF.getText(), patient, patients);
        }
        
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
        Appointment app = new Appointment(doctor.getCpf());
        app.setDate(this.txtAppointmentData.getText());
        app.setHour(this.txtHourAppointment.getText());
        app.setDoctorCpf(this.txtDoctorAppointmentCpf.getText());
        app.setPatientCpf(this.txtPatientAppointmentCpf.getText());
        app.setIsNormalAppointment(this.radioBtnIsNormalAppointment.isSelected());
     
        if(this.radioBtnAddAppointment.isSelected()){
            secretary.addAppointment(app, appointments);    
        }else{
            secretary.updateAppointment(this.txtPatientAppointmentCpf.getText(), app, appointments);
        }
        
        
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

    private void radioBtnIsAddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsAddingActionPerformed
        this.radioBtnIsAdding.setSelected(true);
        this.radioBtnIsUpdating.setSelected(false);
        this.btnAddOrUpdatePatient.setText("Adicionar Paciente");
        this.txtCpfInfo.setText("");
    }//GEN-LAST:event_radioBtnIsAddingActionPerformed

    private void radioBtnIsUpdatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsUpdatingActionPerformed
        this.radioBtnIsAdding.setSelected(false);
        this.radioBtnIsUpdating.setSelected(true);
        this.btnAddOrUpdatePatient.setText("Atualizar Paciente");
        this.txtCpfInfo.setText("Atualiação é feita pelo CPF!");
    }//GEN-LAST:event_radioBtnIsUpdatingActionPerformed

    private void radioBtnIsMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsMaleActionPerformed
        this.radioBtnIsMale.setSelected(true);
        this.radioBtnIsFemale.setSelected(false);
    }//GEN-LAST:event_radioBtnIsMaleActionPerformed

    private void radioBtnIsFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsFemaleActionPerformed
        this.radioBtnIsMale.setSelected(false);
        this.radioBtnIsFemale.setSelected(true);
    }//GEN-LAST:event_radioBtnIsFemaleActionPerformed

    private void radioBtnIsParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsParticularActionPerformed
        this.radioBtnIsParticular.setSelected(true);
        this.radioBtnIsNotParticular.setSelected(false);
    }//GEN-LAST:event_radioBtnIsParticularActionPerformed

    private void radioBtnIsNotParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsNotParticularActionPerformed
        this.radioBtnIsParticular.setSelected(false);
        this.radioBtnIsNotParticular.setSelected(true);
    }//GEN-LAST:event_radioBtnIsNotParticularActionPerformed

    private void radioBtnAddAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnAddAppointmentActionPerformed
        this.radioBtnAddAppointment.setSelected(true);
        this.radioBtnUpdateAppointment.setSelected(false);
        this.txtCpfInfo2.setText("");
        this.btnAddAppointment.setText("ADICIONAR AGENDAMENTO");
    }//GEN-LAST:event_radioBtnAddAppointmentActionPerformed

    private void radioBtnUpdateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnUpdateAppointmentActionPerformed
        this.radioBtnAddAppointment.setSelected(false);
        this.radioBtnUpdateAppointment.setSelected(true);
        this.txtCpfInfo2.setText("Atualização é feita pelo cpf");
        this.btnAddAppointment.setText("ATUALIZAR AGENDAMENTO");
    }//GEN-LAST:event_radioBtnUpdateAppointmentActionPerformed

    private void radioBtnIsNormalAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsNormalAppointmentActionPerformed
        this.radioBtnIsNormalAppointment.setSelected(true);
        this.radioBtnIsNotNormalAppointment.setSelected(false);
    }//GEN-LAST:event_radioBtnIsNormalAppointmentActionPerformed

    private void radioBtnIsNotNormalAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsNotNormalAppointmentActionPerformed
        this.radioBtnIsNormalAppointment.setSelected(false);
        this.radioBtnIsNotNormalAppointment.setSelected(true);
    }//GEN-LAST:event_radioBtnIsNotNormalAppointmentActionPerformed
    
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
        java.awt.EventQueue.invokeLater(() -> {
            new SecretaryScreen().setVisible(true);
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
    private javax.swing.JRadioButton radioBtnAddAppointment;
    private javax.swing.JRadioButton radioBtnIsAdding;
    private javax.swing.JRadioButton radioBtnIsFemale;
    private javax.swing.JRadioButton radioBtnIsMale;
    private javax.swing.JRadioButton radioBtnIsNormalAppointment;
    private javax.swing.JRadioButton radioBtnIsNotNormalAppointment;
    private javax.swing.JRadioButton radioBtnIsNotParticular;
    private javax.swing.JRadioButton radioBtnIsParticular;
    private javax.swing.JRadioButton radioBtnIsUpdating;
    private javax.swing.JRadioButton radioBtnUpdateAppointment;
    private javax.swing.JTextField txtAppointmentData;
    private javax.swing.JLabel txtCpfInfo;
    private javax.swing.JLabel txtCpfInfo2;
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
