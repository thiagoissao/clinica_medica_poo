package services;

import java.util.List;
import models.Patient;

public class Crud {
    
    //AGENDAMENTOS
    public static List<Appointment> removeAppointment(int appointmentId, List<Appointment> appointments){ 
        List<Appointment> list = appointments;
        list.remove(appointmentId);
        return list;
    }
    
    public static List<Appointment> addAppointment(Appointment a, List<Appointment> apps){
        List<Appointment> list = apps;
        list.add(a);
        return list;
    }
    
    public static List<Appointment> updateAppointment(int appointmentId , Appointment appointment, List<Appointment> appointments){
        List<Appointment> list = appointments;
        for(int i=0; i<appointments.size(); i++){
            if(list.get(i).getAppointmentId() == appointmentId){
                list.remove(i);
                list.add(i, appointment);
                return list;
            }
        }
        return null;
    }
    
    public static Appointment getAppointment(int appointmentId, List<Appointment> appointments){
        for(Appointment a: appointments){
            if(a.getAppointmentId() == appointmentId){
                return a;
            }
        }
        return null;
    }
    
    
    //PACIENTES
    public static List<Patient> removePatient(int cpf, List<Patient> patients){
        List<Patient> pacientes = patients;
        int index = 0;
        for(Patient p: patients){
            if(p.getCpf() == cpf){
                pacientes.remove(index);
                return pacientes;
            }
            index++;
        }
        return null;
    }
    
    public static List<Patient> addPatient(Patient patient, List<Patient> patients){
        List<Patient> p = patients;
        p.add(patient);
        return p;
    }
    
    public static List<Patient> updatePatient(int cpf, Patient patient, List<Patient> patients){
        List<Patient> list = patients;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getCpf() == cpf){
                list.remove(i);
                list.add(i, patient);
                return list;
            }
        }
        return null;
    }
    
    public static Patient getPatient(int cpf, List<Patient> patients){
        for(Patient p: patients){
            if(p.getCpf() == cpf){
                return p;
            }
        }
        return null;
    }
}
