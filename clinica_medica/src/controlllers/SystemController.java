package controlllers;

import java.util.ArrayList;
import java.util.List;
import models.Doctor;
import models.Patient;
import models.Secretary;
import services.Appointment;
import screens.DoctorScreen;
import screens.SecretaryScreen;

public class SystemController {
    private SecretaryScreen secretaryScreen;
    
    private Doctor doctor;
    private Secretary secretary;
    private List<Appointment> appointments = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();
    
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
    
    public void addAppointment(Appointment app){
        this.secretary.addAppointment(app, this.appointments);
    }
    
    public void removeAppointment(String cpf){
        this.secretary.removeAppointment(cpf, this.appointments);
    }
    
    public void updateAppointment(String cpf, Appointment app){
        secretary.updateAppointment(cpf, app, this.appointments);
    }
    
    public void addPatient(Patient patient){
        secretary.addPatient(patient, this.patients);
    }
    
    public void updatePatient(String cpf, Patient patient){
        secretary.updatePatient(cpf, patient, this.patients);
    }
    
    public void removePatient(String cpf){
        secretary.removePatient(cpf, this.patients);
    }

    public void showAllPatients(){
        if(this.patients.size() > 0){
            System.out.println("");
            System.out.println("LISTA DE PACIENTES:");
            for(Patient a: this.patients){
                System.out.println();
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
            }
        }else{
            System.out.println();
            System.out.println("LISTA DE PACIENTES VAZIA!");
        }
    }
    
    public void showAllApointments(){
        if(this.appointments.size() > 0){
            System.out.println("");
            System.out.println("LISTA DE AGENDAMENTOS: ");
            for(Appointment a: this.appointments){
                System.out.println();
                System.out.println("Data:" + a.getDate());
                System.out.println("Hora:" + a.getHour());
                System.out.println("CPF Médico:" + a.getDoctorCpf());
                System.out.println("CPF Paciente:" +a.getPatientCpf());
                if(a.isNormalAppointment()){
                    System.out.println("Consulta: Normal");
                }else{
                    System.out.println("Consulta: Retorno");
                }
                
            }
        }else{
            System.out.println();
            System.out.println("LISTA DE AGENDAMENTOS VAZIA!");
        }
    }
}
