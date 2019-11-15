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
    
    public List<Patient> removePatient(String cpf, List<Patient> patients, List<Appointment> apps){
        return Crud.removePatient(cpf, patients, apps);
    }
    
    public List<Appointment> addAppointment(Appointment a, List<Appointment> appointments, List<Patient> patients){
        return Crud.addAppointment(a, appointments, patients);
    }
    
    public List<Appointment> updateAppointment(String patientCpf, Appointment a, List<Appointment> appointments){
        return Crud.updateAppointment(patientCpf, a, appointments);
    }
    
    public List<Appointment> removeAppointment(String patientCpf, List<Appointment> appointments){        
        return Crud.removeAppointment(patientCpf, appointments);
    }
}
