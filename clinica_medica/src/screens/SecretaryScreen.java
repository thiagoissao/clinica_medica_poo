package screens;

import controlllers.SystemController;
import services.Appointment;
import models.Patient;
import utils.DateFormat;

public class SecretaryScreen extends javax.swing.JFrame{
    
    private final SystemController systemController;

    public SecretaryScreen() {
        this.systemController = new SystemController();
        setupComponents();
    }
    
    public SecretaryScreen(SystemController s) {
        this.systemController = s;
        setupComponents();
    }
    
    private void setupComponents(){
        initComponents();
        this.radioBtnIsAdding.setSelected(true);
        this.txtCpfInfo.setText("");
        this.txtCpfInfo2.setText("");
        this.txtAppointmentData.setText("dd/mm/yyyy");
        this.txtHourAppointment.setText("HH:mm");
        this.radioBtnIsUpdating.setSelected(false);
        this.radioBtnIsMale.setSelected(true);
        this.radioBtnIsFemale.setSelected(false);
        this.radioBtnIsParticular.setSelected(true);
        this.radioBtnIsNotParticular.setSelected(false);
        this.radioBtnAddAppointment.setSelected(true);
        this.radioBtnIsNormalAppointment.setSelected(true);
        this.msgAppointment.setText("");
        this.msgPatient.setText("");
        this.msgRemovePatient.setText("");
        this.msgRemoveAppointment.setText("");
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
        txtCpfInfo = new javax.swing.JLabel();
        txtCpfInfo2 = new javax.swing.JLabel();
        msgPatient = new javax.swing.JLabel();
        msgAppointment = new javax.swing.JLabel();
        msgRemovePatient = new javax.swing.JLabel();
        msgRemoveAppointment = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnShowPatient = new javax.swing.JButton();
        btnShowAllAppoints = new javax.swing.JButton();
        btnSecretaryRecord = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setMinimumSize(new java.awt.Dimension(1020, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGoToDoctorScreen.setText("Ir tela Médico");
        btnGoToDoctorScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToDoctorScreenActionPerformed(evt);
            }
        });
        getContentPane().add(btnGoToDoctorScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 177, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel1.setText("Informações são exibidas no console");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 220, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Pacientes:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 53, -1, -1));

        jLabel4.setText("Nome:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 106, -1, -1));

        jLabel5.setText("Sexo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 159, -1, -1));

        jLabel6.setText("Telefone:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 159, -1, -1));

        jLabel7.setText("E-mail:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 212, -1, -1));

        jLabel8.setText("CPF:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 106, -1, -1));

        jLabel9.setText("Data de Nascimento:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 212, -1, -1));

        jLabel10.setText("Tipo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 265, -1, -1));

        jLabel11.setText("Endereço:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 265, -1, -1));

        txtPatientDateBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientDateBirthActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientDateBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(598, 204, 147, -1));

        txtPatientEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 204, 285, -1));

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 98, 285, -1));

        txtPatientAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientAdressActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 257, 285, -1));

        txtPatientCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientCPFActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 98, 253, -1));

        txtPatientPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientPhoneNumberActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 151, 219, -1));

        radioBtnIsAdding.setText("Adicionar");
        radioBtnIsAdding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsAddingActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnIsAdding, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 54, -1, -1));

        radioBtnIsUpdating.setText("Atualizar");
        radioBtnIsUpdating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsUpdatingActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnIsUpdating, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 54, -1, -1));

        radioBtnIsMale.setText("M");
        radioBtnIsMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsMaleActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnIsMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 157, -1, -1));

        radioBtnIsFemale.setText("F");
        radioBtnIsFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsFemaleActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnIsFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 157, -1, -1));

        radioBtnIsParticular.setText("Particular");
        radioBtnIsParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsParticularActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnIsParticular, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 263, -1, -1));

        radioBtnIsNotParticular.setText("Plano de Saúde");
        radioBtnIsNotParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsNotParticularActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnIsNotParticular, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 263, -1, -1));

        btnRemovePatient.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnRemovePatient.setForeground(new java.awt.Color(226, 66, 66));
        btnRemovePatient.setText("REMOVER");
        btnRemovePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePatientActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemovePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 347, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Remover Paciente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 351, -1, -1));

        txtPatientCPFRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientCPFRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientCPFRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 349, 147, 23));

        jLabel12.setText("CPF:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 351, -1, -1));

        btnAddOrUpdatePatient.setBackground(new java.awt.Color(101, 174, 40));
        btnAddOrUpdatePatient.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnAddOrUpdatePatient.setForeground(java.awt.Color.black);
        btnAddOrUpdatePatient.setText("ADICIONAR PACIENTE");
        btnAddOrUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrUpdatePatientActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddOrUpdatePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 298, 237, 37));

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel13.setText("Agendamentos:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 381, -1, -1));

        jLabel14.setText("Data:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 427, -1, -1));

        jLabel15.setText("Horário:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 427, -1, -1));

        jLabel16.setText("CPF (paciente):");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 487, -1, -1));

        jLabel17.setText("Tipo de Consulta:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 534, -1, -1));

        jLabel18.setText("CPF (Médico):");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(448, 487, -1, -1));

        txtHourAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHourAppointmentMouseClicked(evt);
            }
        });
        txtHourAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHourAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(txtHourAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 419, 228, -1));

        txtAppointmentData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAppointmentDataMouseClicked(evt);
            }
        });
        txtAppointmentData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppointmentDataActionPerformed(evt);
            }
        });
        getContentPane().add(txtAppointmentData, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 419, 333, -1));

        txtPatientAppointmentCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientAppointmentCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientAppointmentCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 479, 268, -1));

        txtDoctorAppointmentCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorAppointmentCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtDoctorAppointmentCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 479, 192, -1));

        radioBtnIsNormalAppointment.setText("Normal");
        radioBtnIsNormalAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsNormalAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnIsNormalAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 532, -1, -1));

        radioBtnIsNotNormalAppointment.setText("Retorno");
        radioBtnIsNotNormalAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnIsNotNormalAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnIsNotNormalAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 532, -1, -1));

        radioBtnAddAppointment.setText("Adicionar");
        radioBtnAddAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnAddAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnAddAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 382, -1, -1));

        radioBtnUpdateAppointment.setText("Atualizar");
        radioBtnUpdateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnUpdateAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnUpdateAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 382, -1, -1));

        btnRemoveAppointment.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnRemoveAppointment.setForeground(new java.awt.Color(226, 66, 66));
        btnRemoveAppointment.setText("REMOVER");
        btnRemoveAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoveAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 619, -1, -1));

        jLabel19.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel19.setText("Remover Agendamento:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 623, -1, -1));

        txtPatientRemoveAppointmentCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientRemoveAppointmentCpfActionPerformed(evt);
            }
        });
        getContentPane().add(txtPatientRemoveAppointmentCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 621, 147, 23));

        jLabel20.setText("CPF (Paciente):");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 623, -1, -1));

        btnAddAppointment.setBackground(new java.awt.Color(101, 174, 40));
        btnAddAppointment.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnAddAppointment.setForeground(java.awt.Color.black);
        btnAddAppointment.setText("ADICIONAR AGENDAMENTO");
        btnAddAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAppointmentActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 561, 277, 40));

        txtCpfInfo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        txtCpfInfo.setForeground(new java.awt.Color(182, 147, 20));
        txtCpfInfo.setText("Atualização é feita pelo cpf");
        getContentPane().add(txtCpfInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 85, 164, -1));

        txtCpfInfo2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        txtCpfInfo2.setForeground(new java.awt.Color(182, 147, 20));
        txtCpfInfo2.setText("Atualização é feita pelo cpf");
        getContentPane().add(txtCpfInfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 458, 213, -1));

        msgPatient.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        msgPatient.setForeground(new java.awt.Color(182, 147, 20));
        msgPatient.setText("Paciente adicionado!");
        getContentPane().add(msgPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 311, 138, -1));

        msgAppointment.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        msgAppointment.setForeground(new java.awt.Color(182, 147, 20));
        msgAppointment.setText("Agendamento adicionado!");
        getContentPane().add(msgAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 576, 150, -1));

        msgRemovePatient.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        msgRemovePatient.setForeground(new java.awt.Color(190, 31, 30));
        msgRemovePatient.setText("Paciente adicionado!");
        getContentPane().add(msgRemovePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 353, 244, -1));

        msgRemoveAppointment.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        msgRemoveAppointment.setForeground(new java.awt.Color(190, 31, 30));
        msgRemoveAppointment.setText("Paciente adicionado!");
        getContentPane().add(msgRemoveAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 625, 162, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnShowPatient.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnShowPatient.setText("Exibir Pacientes");
        btnShowPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPatientActionPerformed(evt);
            }
        });

        btnShowAllAppoints.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnShowAllAppoints.setText("<html>Exibir <br>Agendamentos</html>");
        btnShowAllAppoints.setMaximumSize(new java.awt.Dimension(186, 28));
        btnShowAllAppoints.setMinimumSize(new java.awt.Dimension(186, 28));
        btnShowAllAppoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllAppointsActionPerformed(evt);
            }
        });

        btnSecretaryRecord.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnSecretaryRecord.setText("Consultas Amanhã");
        btnSecretaryRecord.setMaximumSize(new java.awt.Dimension(186, 28));
        btnSecretaryRecord.setMinimumSize(new java.awt.Dimension(186, 28));
        btnSecretaryRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecretaryRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSecretaryRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowAllAppoints, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSecretaryRecord, btnShowAllAppoints, btnShowPatient});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShowPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnShowAllAppoints, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSecretaryRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSecretaryRecord, btnShowAllAppoints, btnShowPatient});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, 220, 540));

        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel21.setText("BEM VINDO(A) SECRETÁRIO(A)");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 17, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoToDoctorScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToDoctorScreenActionPerformed
        DoctorScreen doctorScreen = new DoctorScreen(this.systemController);
        doctorScreen.setVisible(true);
        dispose();
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
            if(systemController.addPatient(patient) != null){
                this.msgPatient.setText("Paciente Adicionado!");
            }else{
                this.msgPatient.setText("Erro! Tente Novamente!");
            }
        }else{
            if(systemController.updatePatient(this.txtPatientCPF.getText(), patient) != null){
                this.msgPatient.setText("Paciente Atualizado!");
            }else{
                this.msgPatient.setText("Erro! Tente Novamente");
            }
        }
        SecretaryScreen.setTimeout(() -> this.msgPatient.setText(""), 2000);
        
        this.txtPatientName.setText("");
        this.txtPatientCPF.setText("");
        this.txtPatientDateBirth.setText("");
        this.txtPatientEmail.setText("");
        this.txtPatientPhoneNumber.setText("");
        this.txtPatientAdress.setText("");
        
    }//GEN-LAST:event_btnAddOrUpdatePatientActionPerformed

    private void btnRemovePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePatientActionPerformed
        if(systemController.removePatient(this.txtPatientCPFRemove.getText()) != null){
            this.msgRemovePatient.setText("Paciente Removido com sucesso!");
        }else{
            this.msgRemovePatient.setText("Erro ao remover, cpf não encontrado!");
        }
        SecretaryScreen.setTimeout(() -> this.msgRemovePatient.setText(""), 2000);
        this.txtPatientCPFRemove.setText("");
    }//GEN-LAST:event_btnRemovePatientActionPerformed

    private void btnAddAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAppointmentActionPerformed
        Appointment app = new Appointment(this.systemController.getDoctor().getCpf());
        if(!DateFormat.isDateValid(this.txtAppointmentData.getText()) ||
                !DateFormat.isHourValid(this.txtHourAppointment.getText())){
                this.msgAppointment.setText("Data ou Hora inválidos!");
                this.txtAppointmentData.setText("");
                this.txtHourAppointment.setText("");
                return;
        } 
        
        app.setDate(this.txtAppointmentData.getText());
        app.setHour(this.txtHourAppointment.getText());
        app.setDoctorCpf(this.txtDoctorAppointmentCpf.getText());
        app.setPatientCpf(this.txtPatientAppointmentCpf.getText());
        app.setIsNormalAppointment(this.radioBtnIsNormalAppointment.isSelected());
     
        if(this.radioBtnAddAppointment.isSelected()){
            if(systemController.addAppointment(app) != null){
                this.msgAppointment.setText("Agendamento Adicionado!");
            }else{
                this.msgAppointment.setText("Erro! Tente Novamente!");
            }
            
        }else{
            if(systemController.updateAppointment(this.txtPatientAppointmentCpf.getText(), app) != null){
                this.msgAppointment.setText("Agendamento Atualizado!");
            }else{
                this.msgAppointment.setText("Erro! Tente Novamente!");
            }
        }
        SecretaryScreen.setTimeout(() -> this.msgAppointment.setText(""), 2000);
        
        this.txtAppointmentData.setText("");
        this.txtHourAppointment.setText("");
        this.txtDoctorAppointmentCpf.setText("");
        this.txtPatientAppointmentCpf.setText((""));        
    }//GEN-LAST:event_btnAddAppointmentActionPerformed

    private void btnRemoveAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAppointmentActionPerformed
        if(systemController.removeAppointment(this.txtPatientRemoveAppointmentCpf.getText()) != null){
            this.msgRemoveAppointment.setText("Agendamento removido!");
        }else{
            this.msgRemoveAppointment.setText("Erro ao encontrar agendamento!");
        }
        SecretaryScreen.setTimeout(() -> this.msgRemoveAppointment.setText(""), 2000);
        this.txtPatientRemoveAppointmentCpf.setText("");
    }//GEN-LAST:event_btnRemoveAppointmentActionPerformed

    private void btnShowPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPatientActionPerformed
        systemController.showAllPatients();
    }//GEN-LAST:event_btnShowPatientActionPerformed

    private void btnShowAllAppointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllAppointsActionPerformed
        systemController.showAllAppointments();
    }//GEN-LAST:event_btnShowAllAppointsActionPerformed

    private void radioBtnIsAddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsAddingActionPerformed
        this.radioBtnIsAdding.setSelected(true);
        this.radioBtnIsUpdating.setSelected(false);
        this.btnAddOrUpdatePatient.setText("ADICIONAR PACIENTE");
        this.txtCpfInfo.setText("");
    }//GEN-LAST:event_radioBtnIsAddingActionPerformed

    private void radioBtnIsUpdatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnIsUpdatingActionPerformed
        this.radioBtnIsAdding.setSelected(false);
        this.radioBtnIsUpdating.setSelected(true);
        this.btnAddOrUpdatePatient.setText("ATUALIZAR PACIENTE");
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

    private void txtAppointmentDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAppointmentDataMouseClicked
        this.txtAppointmentData.setText("");
    }//GEN-LAST:event_txtAppointmentDataMouseClicked

    private void txtHourAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHourAppointmentMouseClicked
        this.txtHourAppointment.setText("");
    }//GEN-LAST:event_txtHourAppointmentMouseClicked

    private void btnSecretaryRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecretaryRecordActionPerformed
        this.systemController.showTomorrowAppointments();
    }//GEN-LAST:event_btnSecretaryRecordActionPerformed

    public static void setTimeout(Runnable runnable, int delay){
        new Thread(() -> {
            try{
                Thread.sleep(delay);
                runnable.run();
            }catch (InterruptedException e){
                System.err.println(e);
            }
        }).start();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAppointment;
    private javax.swing.JButton btnAddOrUpdatePatient;
    private javax.swing.JButton btnGoToDoctorScreen;
    private javax.swing.JButton btnRemoveAppointment;
    private javax.swing.JButton btnRemovePatient;
    private javax.swing.JButton btnSecretaryRecord;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msgAppointment;
    private javax.swing.JLabel msgPatient;
    private javax.swing.JLabel msgRemoveAppointment;
    private javax.swing.JLabel msgRemovePatient;
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
