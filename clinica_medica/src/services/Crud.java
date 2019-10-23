package services;

import java.util.List;
import models.Patient;

public class Crud {
    public List<Appointment> removeAppointment(int appointmentId, List<Appointment> appointments){ 
        return null;
    }
    
    public List<Appointment> addAppointment(Appointment a, List<Appointment> apps){
        List<Appointment> list = apps;
        list.add(a);
        return list;
    }
    
    public Appointment updateAppointment(Appointment appointment, List<Appointment> appointments){
    
        return null;
    }
    
    public Appointment getAppointment(int appointmentId, List<Appointment> appointments){
        for(Appointment a: appointments){
            if(a.getAppointmentId() == appointmentId){
                return a;
            }
        }
        return null;
    }
    
    public List<Patient> removePatient(int cpf, List<Patient> patients){
        return null;
    }
    
    public List<Patient> addPatient(Patient patient, List<Patient> patients){
        List<Patient> p = patients;
        p.add(patient);
        return p;
    }
    
    public Patient updatePatient(Patient patient, List<Patient> patients){
        
        return null;
    }
    
    public Patient getPatient(int cpf, List<Patient> patients){
        for(Patient p: patients){
            if(p.getCpf() == cpf){
                return p;
            }
        }
        return null;
    }
}
