package services;

public class Appointment {
    
    private String date;
    private String hour;
    private String doctorCpf;
    private String patientCpf;
    private boolean isNormalAppointment; //if !isNormalAppointment then is "Retorno"
    private boolean isActive = true; //if !isActive then appointment was cancelled

    public Appointment(String doctorCpf) {
        this.doctorCpf = doctorCpf;
    }

    public Appointment(String date, String hour, String doctorCpf, String patientCpf) {
        this.date = date;
        this.hour = hour;
        this.doctorCpf = doctorCpf;
        this.patientCpf = patientCpf;
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

    public void setPatientCpf(String patientCpf) {
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
}
