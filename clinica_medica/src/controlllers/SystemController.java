package controlllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.Doctor;
import models.Patient;
import models.Secretary;
import services.Appointment;
import screens.DoctorScreen;
import screens.SecretaryScreen;
import utils.AddictionalPatientData;

public class SystemController {
    private SecretaryScreen secretaryScreen;
    
    private final Doctor doctor;
    private final Secretary secretary;
    private final List<Appointment> appointments = new ArrayList<>();
    private final List<Patient> patients = new ArrayList<>();
    
    public SystemController() {
        this.doctor = new Doctor("Neymar Júnior", "12345678", "(44)99999-9999");
        this.secretary = new Secretary("Neymar Pai", "987654321", "(44)11111-1111");
    }
    
    public static void main(String[] args){
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
                    System.out.println("Doenção Cardíaca: SIM");
                }else{
                    System.out.println("Doenção Cardíaca: NÃO");
                }
                System.out.println("Cirurgias: " + a.getSurgeries());
                System.out.println("Alergias: " + a.getAllergies());
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
}
