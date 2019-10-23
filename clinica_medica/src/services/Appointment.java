package services;

import models.Doctor;
import models.Patient;

public class Appointment {
    
    private int appointmentId;
    private String date;
    private Doctor doctor;
    private Patient pacient;
    private boolean isNormalAppointment; //if !isNormalAppointment then is "Retorno"
    private boolean isActive = true; //if !isActive then appointment was cancelled

    public Appointment(int appointmentId, String date, Doctor doctor, Patient pacient, boolean isNormalAppointment) {
        this.appointmentId = appointmentId;
        this.date = date;
        this.doctor = doctor;
        this.pacient = pacient;
        this.isNormalAppointment = isNormalAppointment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPacient() {
        return pacient;
    }

    public void setPacient(Patient pacient) {
        this.pacient = pacient;
    }

    public boolean isNormalAppointment() {
        return isNormalAppointment;
    }

    public void setIsNormalAppointment(boolean isNormalAppointment) {
        this.isNormalAppointment = isNormalAppointment;
    }
    
    public boolean isActive(){
        return this.isActive;
    }
    
    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }
    
    public int getAppointmentId(){
        return this.appointmentId;
    }
    
    public void setAppointmentId(int a){
        this.appointmentId = a;
    }
}
