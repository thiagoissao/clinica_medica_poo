package screens;

import controlllers.SystemController;
import utils.AddictionalPatientData;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public final class DoctorScreen extends javax.swing.JFrame {
    
    private SystemController systemController = new SystemController();
    
    public DoctorScreen(SystemController systemController) {
        this.setSystemController(systemController);
        setupComponents();
    }
    
    public void setupComponents(){
        initComponents();
        this.radioBtnNotCholesterol.setSelected(true);
        this.radioBtnNotDiabetes.setSelected(true);
        this.radioBtnNotHeartDisease.setSelected(true);
        this.radioBtnIsNotSmoker.setSelected(true);
        this.radioBtnIsNotAlcoholConsumer.setSelected(true);
        this.msgAddictionalData.setText("");    
    }
    
    public void setSystemController(SystemController s){
        this.systemController = s;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientCpf = new javax.swing.JTextField();
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
        txtAreaSurgeries = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAllergies = new javax.swing.JTextArea();
        btnAddOrUpdatePatientData = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtPatientCpfClear = new javax.swing.JTextField();
        btnClearAddictionalPatientData = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        msgAddictionalData = new javax.swing.JLabel();
        btnGoToDoctorScreen = new javax.swing.JButton();
        btnShowAllPatients = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaSymptoms = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaDiagnosis = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaDescription = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Bem Vindo(a) Doutor(a)");

        jLabel2.setText("Bebida Alcoólica?");

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

        txtAreaSurgeries.setColumns(20);
        txtAreaSurgeries.setLineWrap(true);
        txtAreaSurgeries.setRows(5);
        txtAreaSurgeries.setText("Ex: cirurgia1;cirurgia2;cirurgia3...");
        txtAreaSurgeries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAreaSurgeriesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtAreaSurgeries);

        txtAreaAllergies.setColumns(20);
        txtAreaAllergies.setLineWrap(true);
        txtAreaAllergies.setRows(5);
        txtAreaAllergies.setText("Ex: alergia1;alergia2;cirurgia3...");
        txtAreaAllergies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAreaAllergiesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(txtAreaAllergies);

        btnAddOrUpdatePatientData.setBackground(new java.awt.Color(101, 174, 40));
        btnAddOrUpdatePatientData.setForeground(java.awt.Color.black);
        btnAddOrUpdatePatientData.setText("INSERIR DADOS");
        btnAddOrUpdatePatientData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrUpdatePatientDataActionPerformed(evt);
            }
        });

        jLabel10.setText("Para *LIMPAR* os dados do Paciente digite o cpf dele:");

        btnClearAddictionalPatientData.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnClearAddictionalPatientData.setForeground(new java.awt.Color(226, 66, 66));
        btnClearAddictionalPatientData.setText("Limpar Dados");
        btnClearAddictionalPatientData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAddictionalPatientDataActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setText("Dados Adicionais do Paciente");

        msgAddictionalData.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        msgAddictionalData.setForeground(new java.awt.Color(182, 147, 20));
        msgAddictionalData.setText("Atualização é feita pelo CPF");

        btnGoToDoctorScreen.setText("Ir tela Secretária");
        btnGoToDoctorScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoToDoctorScreenActionPerformed(evt);
            }
        });

        btnShowAllPatients.setText("show All in console");
        btnShowAllPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllPatientsActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel12.setText("Prontuário do Paciente");

        txtAreaSymptoms.setColumns(20);
        txtAreaSymptoms.setLineWrap(true);
        txtAreaSymptoms.setRows(5);
        txtAreaSymptoms.setText("Ex: Sintoma1;Sintoma2;Sintoma3...");
        txtAreaSymptoms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAreaSymptomsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(txtAreaSymptoms);

        jLabel13.setText("Sintomas:");

        txtAreaDiagnosis.setColumns(20);
        txtAreaDiagnosis.setLineWrap(true);
        txtAreaDiagnosis.setRows(5);
        txtAreaDiagnosis.setText("Ex: ex1;ex2;ex3...");
        txtAreaDiagnosis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAreaDiagnosisMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(txtAreaDiagnosis);

        jLabel14.setText("Diagnósticos:");

        txtAreaDescription.setColumns(20);
        txtAreaDescription.setLineWrap(true);
        txtAreaDescription.setRows(5);
        txtAreaDescription.setText("\n");
        txtAreaDescription.setToolTipText("");
        txtAreaDescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAreaDescriptionMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(txtAreaDescription);

        jLabel15.setText("Prescrição do tratamento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(btnShowAllPatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addComponent(btnGoToDoctorScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(259, 259, 259)
                                .addComponent(btnAddOrUpdatePatientData, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(msgAddictionalData))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientCpfClear, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btnClearAddictionalPatientData))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBtnDiabetes)
                            .addComponent(radioBtnIsAlcoholConsumer)
                            .addComponent(radioBtnIsSmoker))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBtnIsNotAlcoholConsumer)
                            .addComponent(radioBtnNotDiabetes)
                            .addComponent(radioBtnIsNotSmoker))
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioBtnCholesterol)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnNotCholesterol))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioBtnHeartDisease)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnNotHeartDisease))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane5))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioBtnHeartDisease)
                            .addComponent(radioBtnNotHeartDisease))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddOrUpdatePatientData, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(msgAddictionalData)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel10)
                            .addComponent(txtPatientCpfClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClearAddictionalPatientData)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1))
                            .addComponent(btnGoToDoctorScreen))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(btnShowAllPatients))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioBtnIsSmoker)
                                    .addComponent(radioBtnIsNotSmoker)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radioBtnCholesterol)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(radioBtnNotCholesterol)))))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioBtnIsAlcoholConsumer)
                                        .addGap(17, 17, 17)
                                        .addComponent(radioBtnDiabetes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioBtnIsNotAlcoholConsumer)
                                        .addGap(17, 17, 17)
                                        .addComponent(radioBtnNotDiabetes)))))))
                .addContainerGap())
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

    private void btnGoToDoctorScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoToDoctorScreenActionPerformed
        SecretaryScreen secretaryScreen = new SecretaryScreen(this.systemController);
        secretaryScreen.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGoToDoctorScreenActionPerformed

    private void btnAddOrUpdatePatientDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrUpdatePatientDataActionPerformed
        AddictionalPatientData patient = new AddictionalPatientData();
        
        patient.setIsSmoker(this.radioBtnIsSmoker.isSelected());
        patient.setIsAlcoholConsumer(this.radioBtnIsAlcoholConsumer.isSelected());
        patient.setIsDiabetesCarrier(this.radioBtnDiabetes.isSelected());
        patient.setIsCholesterolCarrier(this.radioBtnCholesterol.isSelected());
        patient.setIsHeartDiseaseCarrier(this.radioBtnHeartDisease.isSelected());
        patient.setAllergies(systemController.splitString(this.txtAreaAllergies.getText(), ";"));
        patient.setSurgeries(systemController.splitString(this.txtAreaSurgeries.getText(), ";"));
        patient.setSymptom(systemController.splitString(this.txtAreaSymptoms.getText(), ";"));
        patient.setDiseaseDiagnosis(systemController.splitString(this.txtAreaDiagnosis.getText(), ";"));
        patient.setTreatmentDescription(this.txtAreaDescription.getText());
        
        if(this.systemController.addAddictionalPatientData(patient, this.txtPatientCpf.getText()) != null){
            this.msgAddictionalData.setText("Adicionado com sucesso!");
        }else{
            this.msgAddictionalData.setText("Erro ao adicionar!");
        }
        this.txtPatientCpf.setText("");
        this.txtAreaAllergies.setText("");
        this.txtAreaSurgeries.setText("");
        this.txtAreaSymptoms.setText("");
        this.txtAreaDiagnosis.setText("");
        this.txtAreaDescription.setText("");
        SecretaryScreen.setTimeout(() -> this.msgAddictionalData.setText(""), 2000);
    }//GEN-LAST:event_btnAddOrUpdatePatientDataActionPerformed

    private void btnShowAllPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllPatientsActionPerformed
        systemController.showAllPatients();
    }//GEN-LAST:event_btnShowAllPatientsActionPerformed

    private void btnClearAddictionalPatientDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAddictionalPatientDataActionPerformed
        AddictionalPatientData patient = new AddictionalPatientData();
        
        patient.setIsSmoker(false);
        patient.setIsAlcoholConsumer(false);
        patient.setIsDiabetesCarrier(false);
        patient.setIsCholesterolCarrier(false);
        patient.setIsHeartDiseaseCarrier(false);
        this.systemController.addAddictionalPatientData(patient, this.txtPatientCpfClear.getText());
        this.txtPatientCpfClear.setText("");
    }//GEN-LAST:event_btnClearAddictionalPatientDataActionPerformed

    private void txtAreaSurgeriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaSurgeriesMouseClicked
        this.txtAreaSurgeries.setText("");
    }//GEN-LAST:event_txtAreaSurgeriesMouseClicked

    private void txtAreaAllergiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaAllergiesMouseClicked
        this.txtAreaAllergies.setText("");
    }//GEN-LAST:event_txtAreaAllergiesMouseClicked

    private void txtAreaSymptomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaSymptomsMouseClicked
        this.txtAreaSymptoms.setText("");
    }//GEN-LAST:event_txtAreaSymptomsMouseClicked

    private void txtAreaDiagnosisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaDiagnosisMouseClicked
        this.txtAreaDiagnosis.setText("");
    }//GEN-LAST:event_txtAreaDiagnosisMouseClicked

    private void txtAreaDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAreaDescriptionMouseClicked
        this.txtAreaDescription.setText("");
    }//GEN-LAST:event_txtAreaDescriptionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrUpdatePatientData;
    private javax.swing.JButton btnClearAddictionalPatientData;
    private javax.swing.JButton btnGoToDoctorScreen;
    private javax.swing.JButton btnShowAllPatients;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel msgAddictionalData;
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
    private javax.swing.JTextArea txtAreaAllergies;
    private javax.swing.JTextArea txtAreaDescription;
    private javax.swing.JTextArea txtAreaDiagnosis;
    private javax.swing.JTextArea txtAreaSurgeries;
    private javax.swing.JTextArea txtAreaSymptoms;
    private javax.swing.JTextField txtPatientCpf;
    private javax.swing.JTextField txtPatientCpfClear;
    // End of variables declaration//GEN-END:variables
}
