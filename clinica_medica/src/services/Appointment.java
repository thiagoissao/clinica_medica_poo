package services;

import models.Doctor;
import models.Patient;

public class Appointment {
    
    private int appointmentId;
    private String date;
    private String hour;
    private String doctorCpf;
    private String patientCpf;
    private String patientName;
    private boolean isNormalAppointment; //if !isNormalAppointment then is "Retorno"
    private boolean isActive = true; //if !isActive then appointment was cancelled

    public Appointment(int appointmentId, String doctorCpf) {
        this.appointmentId = appointmentId;
        this.doctorCpf = doctorCpf;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public String getHour(){
        return this.hour;
    }
    
    public void setHour(String hour){
        this.hour = hour;
    }

    public String getDoctorCpf() {
        return this.doctorCpf;
    }

    public void setDoctorCpf(String doctorCpf) {
        this.doctorCpf = doctorCpf;
    }

    public String getPatientCpf() {
        return this.patientCpf;
    }

    public void setPatientCpf(String patient) {
        this.patientCpf = patientCpf;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
}
