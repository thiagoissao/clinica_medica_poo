package models;

import services.Appointment;
import services.Crud;
import java.util.List;
import utils.Cargo;

public class Secretary extends PessoaClinica{ 
    public Secretary(String nome, String cpf, String telefone){
        super(nome, cpf, telefone, Cargo.getSecretaryRef());
    }
    
    public List<Patient> addPatient(Patient patient, List<Patient> patients){
        return Crud.addPatient(patient, patients);
    }
    
    public List<Patient> updatePatient(String cpf, Patient patient, List<Patient> patients){
        return Crud.updatePatient(cpf, patient, patients);
    }
    
    public List<Patient> removePatient(String cpf, List<Patient> patients){
        return Crud.removePatient(cpf, patients);
    }
    
    public void showAllPatients(List<Patient> patients){
        if(patients.size() > 0){
            for(Patient a: patients){
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
    
    public List<Appointment> addAppointment(Appointment a, List<Appointment> appointments){
        return Crud.addAppointment(a, appointments);
    }
    
    public List<Appointment> updateAppointment(String patientCpf, Appointment a, List<Appointment> appointments){
        return Crud.updateAppointment(patientCpf, a, appointments);
    }
    
    public List<Appointment> removeAppointment(String patientCpf, List<Appointment> appointments){        
        return Crud.removeAppointment(patientCpf, appointments);
    }
    
    public void showAllApointments(List<Appointment> app){
        if(app.size() > 0){
            for(Appointment a: app){
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
