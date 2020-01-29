package models;

import java.util.List;
import utils.Cargo;

//Modelo do Patient
public class Patient {
    
    public Patient(){}

    public Patient(String name, String phoneNumber, String email, String cpf) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.cpf = cpf;
    }
    
    private String name;
    private boolean isMale; // if !isMale then is "Female type"
    private String phoneNumber;
    private String email;
    private String cpf;
    private String dateBirth;
    private String address;
    private boolean isParticular;
    
    //Only Doctor can set values here
    private boolean isSmoker;
    private boolean isAlcoholConsumer;
    private boolean isCholesterolCarrier;
    private boolean isDiabetesCarrier;
    private boolean isHeartDiseaseCarrier;
    private List<String> surgeries;
    private List<String> allergies;
    
    //Prontuários do sistema
    private List<String> symptom;
    private List<String> diseaseDiagnosis;
    private String treatmentDescription;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone) {
        this.phoneNumber = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isParticular() {
        return isParticular;
    }

    public void setIsParticular(boolean isParticular) {
        this.isParticular = isParticular;
    }

    public boolean isSmoker() {
        return isSmoker;
    }

    public void setIsSmoker(boolean isSmoker, Doctor doctor) {
        if(doctor.getCargo() == Cargo.getDoctorRef()){
            this.isSmoker = isSmoker;    
        }
    }

    public boolean isAlcoholConsumer() {
        return isAlcoholConsumer;
    }

    public void setIsAlcoholConsumer(boolean isAlcoholConsumer, Doctor doctor) {
        this.isAlcoholConsumer = isAlcoholConsumer;
    }

    public boolean isDiabetesCarrier() {
        return isDiabetesCarrier;
    }

    public void setIsDiabetesCarrier(boolean isDiabetesCarrier, Doctor doctor) {
        this.isDiabetesCarrier = isDiabetesCarrier;
    }

    public boolean isHeartDiseaseCarrier() {
        return isHeartDiseaseCarrier;
    }

    public void setIsHeartDiseaseCarrier(boolean isHeartDiseaseCarrier, Doctor doctor) {
        this.isHeartDiseaseCarrier = isHeartDiseaseCarrier;
    }

    public List<String> getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(List<String> surgeries, Doctor doctor) {
        this.surgeries = surgeries;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies, Doctor doctor) {
        this.allergies = allergies;
    }

    public boolean isCholesterolCarrier() {
        return isCholesterolCarrier;
    }

    public void setIsCholesterolCarrier(boolean isCholesterolCarrier, Doctor doctor) {
        this.isCholesterolCarrier = isCholesterolCarrier;
    }

    public List<String> getSymptom() {
        return symptom;
    }

    public void setSymptom(List<String> symptom, Doctor doctor) {
        this.symptom = symptom;
    }

    public List<String> getDiseaseDiagnosis() {
        return diseaseDiagnosis;
    }

    public void setDiseaseDiagnosis(List<String> diseaseDiagnosis, Doctor doctor) {
        this.diseaseDiagnosis = diseaseDiagnosis;
    }

    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    public void setTreatmentDescription(String treatmentDescription, Doctor doctor) {
        this.treatmentDescription = treatmentDescription;
    }

    
}
