package controlllers;

import java.util.Calendar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.Doctor;
import models.Patient;
import models.Secretary;
import services.Appointment;
import screens.DoctorScreen;
import screens.InformationDialog;
import screens.SecretaryScreen;
import services.Crud;
import services.Message;
import utils.AddictionalPatientData;
import utils.DateFormat;

public class SystemController {
    private SecretaryScreen secretaryScreen;
    
    private final Doctor doctor;
    private final Secretary secretary;
    private final List<Appointment> appointments = new ArrayList<>();
    private final List<Patient> patients = new ArrayList<>();
    
    public SystemController() {
        this.doctor = new Doctor("Neymar Júnior", "12345678", "(44)99999-9999");
        this.secretary = new Secretary("Neymar Pai", "987654321", "(44)11111-1111");
        
        //mock
        this.patients.add(new Patient("Thiago", "(44)999606841", "thiagoyasunaka@hotmail.com", "12345"));
        this.patients.add(new Patient("Issao", "(44)999999999", "yasunakathiago@gmail.com", "123456"));
        this.patients.add(new Patient("Yasunaka", "(44)999990000", "ra103069@uem.br", "1234567"));
        this.appointments.add(new Appointment("18/11/2019", "10:00", "123", "12345"));
        this.appointments.add(new Appointment("18/11/2019", "20:00", "123", "123456"));
        this.appointments.add(new Appointment("19/11/2019", "15:00", "123", "1234567"));
        this.appointments.add(new Appointment("10/11/2019", "12:00", "123", "12345"));
        this.appointments.add(new Appointment("19/10/2019", "08:00", "123", "12345"));
        
        System.out.println("Sistema inicializando...");
        System.out.println("Enviando lembretes aos clientes sobre as consultas...");
        Message.sendEmail(this.appointments, this.patients);
        Message.sendMessages(this.appointments, this.patients);
    }
    
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        SecretaryScreen secretaryScreen = new SecretaryScreen();
        secretaryScreen.setVisible(true);
        
    }
    
    public void goToDoctorScreen() {
        DoctorScreen doctorScreen = new DoctorScreen(this);
        doctorScreen.setVisible(true);
    }
    
    public Doctor getDoctor() {
        return doctor;
    }

    public Secretary getSecretary() {
        return secretary;
    }
    
    public List<Appointment> addAppointment(Appointment app){
        return secretary.addAppointment(app, this.appointments, this.patients);
    }
    
    public List<Appointment> removeAppointment(String cpf){
        return secretary.removeAppointment(cpf, this.appointments);
    }
    
    public List<Appointment> updateAppointment(String cpf, Appointment app){
        return secretary.updateAppointment(cpf, app, this.appointments);
    }
    
    public List<Patient> addPatient(Patient patient){
        return secretary.addPatient(patient, this.patients);
    }
    
    public List<Patient> updatePatient(String cpf, Patient patient){
        return secretary.updatePatient(cpf, patient, this.patients);
    }
    
    public List<Patient> removePatient(String cpf){
        return secretary.removePatient(cpf, this.patients, this.appointments);
    }
    
    public List<Patient> addAddictionalPatientData(AddictionalPatientData data, String cpf){
        return doctor.addAddictionalPatientData(cpf, data, this.patients);
    }
    
    public List<String> splitString(String string, String delimitador){
        String array[] = string.split(delimitador);
        for(int i=0; i<array.length; i++){
            array[i] = array[i].trim();
        }
        return Arrays.asList(array);
    }

    public void showAllPatients(){
        if(this.patients.size() > 0){
            System.out.println("");
            System.out.println("LISTA DE PACIENTES:");
            for(Patient a: this.patients){
                System.out.println("Nome:" + a.getName());
                System.out.println("CPF:" + a.getCpf());
                System.out.println("Data de Nascimento:" + a.getDateBirth());
                System.out.println("Email:" +a.getEmail());
                System.out.println("Telefone:" +a.getPhoneNumber());
                System.out.println("Adress:" + a.getAddress());
                if(a.isMale()){
                    System.out.println("Gênero: Masculino");
                }else{
                    System.out.println("Gênero: Feminino");
                }
                if(a.isParticular()){
                    System.out.println("Plano: Particular");
                }else{
                    System.out.println("Plano: Plano de Saúde");
                }
                System.out.println("----Dados Adicionais----- ");
                if(a.isSmoker()){
                    System.out.println("Fumante: SIM");
                }else{
                    System.out.println("Fumante: NÃO");
                }
                if(a.isAlcoholConsumer()){
                    System.out.println("Consome Bebida Alcoólica: SIM");
                }else{
                    System.out.println("Consome Bebida Alcoólica: NÃO");
                }
                if(a.isDiabetesCarrier()){
                    System.out.println("Diabetes: SIM");
                }else{
                    System.out.println("Diabetes: NÃO");
                }
                if(a.isCholesterolCarrier()){
                    System.out.println("Colesterol: SIM");
                }else{
                    System.out.println("Colesterol: NÃO");
                }
                if(a.isHeartDiseaseCarrier()){
                    System.out.println("Doença Cardíaca: SIM");
                }else{
                    System.out.println("Doença Cardíaca: NÃO");
                }
                System.out.println("Cirurgias: " + a.getSurgeries());
                System.out.println("Alergias: " + a.getAllergies());
                System.out.println("Sintomas: " + a.getSymptom());
                System.out.println("Diagnósticos: " + a.getDiseaseDiagnosis());
                System.out.println("Prescrição Tratamento: " + a.getTreatmentDescription());
                System.out.println("");
            }
        }else{
            System.out.println();
            System.out.println("LISTA DE PACIENTES VAZIA!");
        }
    }
    
    public void showAllAppointments(){
        if(this.appointments.size() > 0){
            System.out.println("");
            System.out.println("LISTA DE AGENDAMENTOS: ");
            for(Appointment a: this.appointments){
                System.out.println("Data:" + a.getDate());
                System.out.println("Hora:" + a.getHour());
                System.out.println("CPF Médico:" + a.getDoctorCpf());
                System.out.println("CPF Paciente:" +a.getPatientCpf());
                if(a.isNormalAppointment()){
                    System.out.println("Consulta: Normal");
                }else{
                    System.out.println("Consulta: Retorno");
                }
                System.out.println("");
            }
        }else{
            System.out.println();
            System.out.println("LISTA DE AGENDAMENTOS VAZIA!");
        }
    }
    
    private List<Appointment> filterOneDayLeftAppointments(List<Appointment> apps){
        List<Appointment> filterApps = new ArrayList<>();
        for(Appointment a: apps){
            if(DateFormat.oneDayLeft(DateFormat.getCurrentDate(), a.getDate())){
                filterApps.add(a);
            }
        }
        return filterApps;
    }
    
    public void showTomorrowAppointments(){
        List<Appointment> apps = this.filterOneDayLeftAppointments(this.appointments);
        if(!apps.isEmpty()){
            System.out.println("----CONSULTAS DE AMANHÃ-----");
            for(Appointment a: apps){
                Patient p = Crud.getPatient(a.getPatientCpf(), patients);
                System.out.println("Data: " + a.getDate() + " " + a.getHour());
                System.out.println("Paciente: " + p.getName());
                System.out.println("CPF: " + a.getPatientCpf());
                System.out.println("Telefone: " + p.getPhoneNumber());
                System.out.println("Email: " + p.getEmail());
                System.out.println("");
            }
        }else{
            System.out.println("NENHUMA CONSULTA PARA AMANHÃ");
        }
    }
    
    public void atestado(){
        System.out.println("Gerando Relatório de Atestado...");
        InformationDialog dialog = new InformationDialog();
        dialog.show(this.patients, "Relatório de Atestado enviado por e-mail!");
    }
    
    public void receita(){
        System.out.println("Gerando Relatório de Receita...");
        InformationDialog dialog = new InformationDialog();
        dialog.show(this.patients, "Relatório de Receita enviado por e-mail!");
    }
    
    public void declaracaoAcompanhamento(){
        System.out.println("Gerando declaração de acompanhamento...");
        InformationDialog dialog = new InformationDialog();
        dialog.show(this.patients, "Declaração de Acompanhamento enviado "
                + "com sucesso! Confira seu email");
    }
    
    private List<Appointment> filterAppointmentsInMonth(List<Appointment> apps){
        List<Appointment> filter = new ArrayList<Appointment>();
        for(Appointment a: apps){
            if(DateFormat.isBeforeAndSameMonthYear(DateFormat.getCurrentDate(), a.getDate())){
                filter.add(a);
            }
        }
        return filter;
    }
    
    public void showClientAttendedInMonth(){
        List<Appointment> apps = this.filterAppointmentsInMonth(this.appointments);
        if(!apps.isEmpty()){
            System.out.println("-----CONSULTAS DO MÊS ATÉ AGORA-----");
            for(Appointment a: apps){
                Patient p = Crud.getPatient(a.getPatientCpf(), patients);
                System.out.println("Data: " + a.getDate() + " " + a.getHour());
                System.out.println("Paciente: " + p.getName());
                System.out.println("");
            }
        }else{
            System.out.println("NENHUMA CONSULTA NO MÊS ATÉ AGORA");
        }
    }
}
