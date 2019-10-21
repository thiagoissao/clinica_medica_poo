package services;

import models.Doctor;
import models.Patient;

public class Appointment {
    
    private String date;
    private Doctor doctor;
    private Patient pacient;
    private boolean isNormalAppointment; //if !isNormalAppointment then is "Retorno"

    public Appointment(String date, Doctor doctor, Patient pacient, boolean isNormalAppointment) {
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

    public boolean isIsNormalAppointment() {
        return isNormalAppointment;
    }

    public void setIsNormalAppointment(boolean isNormalAppointment) {
        this.isNormalAppointment = isNormalAppointment;
    }
    
    
}
