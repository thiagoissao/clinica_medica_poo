package services;

import java.util.ArrayList;
import models.Patient;
import java.util.List;
import java.util.Calendar;
import utils.DateFormat;

public class Message {
    
    //Recebe a lista de agendamentos e retorna outra lista somente com os agendamentos do dia seguinte
    private static List<Appointment> filterOneDayLeftAppointments(List<Appointment> apps){
        List<Appointment> filterApps = new ArrayList<>();
        for(Appointment a: apps){
            if(DateFormat.oneDayLeft(DateFormat.getCurrentDate(), a.getDate())){
                filterApps.add(a);
            }
        }
        return filterApps;
    }
    
    public static void sendMessages(List<Appointment> apps, List<Patient> patients){
        List<Appointment> appointments = Message.filterOneDayLeftAppointments(apps);
        for(Appointment a: appointments){
            Patient patient = Crud.getPatient(a.getPatientCpf(), patients);
            if(!patient.getPhoneNumber().equals("")) {
                System.out.println("Enviando Mensagem a "
                        + '[' + patient.getName() + ']' + " sobre a consulta do dia " +
                        a.getDate() + ".");
            }
        }
    }
    
    public static void sendEmail(List<Appointment> apps, List<Patient> patients){
        List<Appointment> appointments = Message.filterOneDayLeftAppointments(apps);
        for(Appointment a: appointments){
            Patient patient = Crud.getPatient(a.getPatientCpf(), patients);
            if(!patient.getEmail().equals("")) {
                System.out.println("Enviando Email a "
                        + '[' + patient.getName() + ']' + " sobre a consulta " + 
                        a.getDate() + ".");
            }
        }
    }
    
}
