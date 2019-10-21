package models;

import java.util.List;

public class Patient {
    
    private String name;
    private boolean isMale; // if !isMale then is "Female type"
    private String phoneNumber;
    private String email;
    private int cpf;
    private String dateBirth;
    private String address;
    private boolean isParticular;
    private boolean isSmoker;
    private boolean isAlcoholConsumer;
    private boolean isDiabetesCarrier;
    private boolean isHeartDiseaseCarrier;
    private List<String> surgeries;
    private List<String> allergies;
    
    
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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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

    public void setIsSmoker(boolean isSmoker) {
        this.isSmoker = isSmoker;
    }

    public boolean isAlcoholConsumer() {
        return isAlcoholConsumer;
    }

    public void setIsAlcoholConsumer(boolean isAlcoholConsumer) {
        this.isAlcoholConsumer = isAlcoholConsumer;
    }

    public boolean isDiabetesCarrier() {
        return isDiabetesCarrier;
    }

    public void setIsDiabetesCarrier(boolean isDiabetesCarrier) {
        this.isDiabetesCarrier = isDiabetesCarrier;
    }

    public boolean isHeartDiseaseCarrier() {
        return isHeartDiseaseCarrier;
    }

    public void setIsHeartDiseaseCarrier(boolean isHeartDiseaseCarrier) {
        this.isHeartDiseaseCarrier = isHeartDiseaseCarrier;
    }

    public List<String> getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(List<String> surgeries) {
        this.surgeries = surgeries;
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies) {
        this.allergies = allergies;
    }

    
}
