package models;

import services.Appointment;
import services.Crud;
import java.util.List;
import utils.Cargo;

public class Secretary extends PessoaClinica{ 
    public Secretary(String nome, int cpf, String telefone){
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
    
    public List<Appointment> addAppointment(Appointment a, List<Appointment> appointments){
        return Crud.addAppointment(a, appointments);
    }
    
    public List<Appointment> updateAppointment(int appId, Appointment a, List<Appointment> appointments){
        return Crud.updateAppointment(appId, a, appointments);
    }
    
    public List<Appointment> removeAppointment(int appId, List<Appointment> appointments){
        return Crud.removeAppointment(appId, appointments);
    }
}
