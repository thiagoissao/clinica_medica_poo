package services;

import java.util.List;
import models.Patient;

public final class Crud {
    
    //AGENDAMENTOS
    //Remove um agendamento na lista e retorna a lista
    public static List<Appointment> removeAppointment(String patientCpf, List<Appointment> appointments){ 
        List<Appointment> list = appointments;
        int index = 0;
        for(Appointment a: appointments){
            if(a.getPatientCpf().equals(patientCpf)){
                list.remove(index);
                return list;
            }
            index++;
        }
        return null;
    }
    
    //Adiciona um agendamento na lista e retorna a lista
    public static List<Appointment> addAppointment(Appointment a, List<Appointment> apps, List<Patient> patients){
        if(a.getPatientCpf().equals("")) return null;
        if(Crud.getPatient(a.getPatientCpf(), patients) == null) return null;
        List<Appointment> list = apps;
        list.add(a);
        return list;
    }
    
    //Atualiza um agendamento na lista e retorna a lista
    public static List<Appointment> updateAppointment(String patientCpf , Appointment appointment, List<Appointment> appointments){
        List<Appointment> list = appointments;
        for(int i=0; i<appointments.size(); i++){
            if(list.get(i).getPatientCpf().equals(patientCpf)){
                list.remove(i);
                list.add(i, appointment);
                return list;
            }
        }
        return null;
    }
    
    //Faz um get em um agendamento na lista e retorna o agendamento
    public static Appointment getAppointment(String patientCpf, List<Appointment> appointments){
        for(Appointment a: appointments){
            if(a.getPatientCpf().equals(patientCpf)){
                return a;
            }
        }
        return null;
    }
    
    
    //PACIENTES
    //Remove um paciente e retorna a lista de pacientes
    public static List<Patient> removePatient(String cpf, List<Patient> patients, List<Appointment> apps){
        List<Patient> pacientes = patients;
        int index = 0;
        for(Patient p: patients){
            if(p.getCpf().equals(cpf)){
                pacientes.remove(index);
                Crud.removeAppointment(cpf, apps);
                return pacientes;
            }
            index++;
        }
        return null;
    }
    
    //Adiciona um paciente e retorna a lista de pacientes
    public static List<Patient> addPatient(Patient patient, List<Patient> patients){
        if(patient.getCpf().equals("")) return null;
        if(Crud.getPatient(patient.getCpf(), patients) != null) return null;
        List<Patient> p = patients;
        p.add(patient);
        return p;
    }
    
    //Atualiza um paciente e retorna a lista de pacientes
    public static List<Patient> updatePatient(String cpf, Patient patient, List<Patient> patients){
        if(cpf.equals("")) return null;
        List<Patient> list = patients;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getCpf().equals(cpf)){
                list.remove(i);
                list.add(i, patient);
                return list;
            }
        }
        return null;
    }
    
    //Faz um get em um paciente e retorna a o paciente caso encontrado
    public static Patient getPatient(String cpf, List<Patient> patients){
        for(Patient p: patients){
            if(p.getCpf().equals(cpf)){
                return p;
            }
        }
        return null;
    }
}
