package utils;

import java.util.List;
import models.PessoaClinica;

public class AddictionalPatientData{
    private boolean isSmoker;
    private boolean isAlcoholConsumer;
    private boolean isCholesterolCarrier;
    private boolean isDiabetesCarrier;
    private boolean isHeartDiseaseCarrier;
    private List<String> surgeries;
    private List<String> allergies;
    
    public boolean isSmoker() {
        return isSmoker;
    }

    public void setIsSmoker(boolean isSmoker, PessoaClinica p) {
        if(p.getCargo() == Cargo.getDoctorRef()){
            this.isSmoker = isSmoker;    
        }
    }
    
    public boolean isAlcoholConsumer() {
        return isAlcoholConsumer;
    }

    public void setIsAlcoholConsumer(boolean isAlcoholConsumer, PessoaClinica p) {
        if(p.getCargo() == Cargo.getDoctorRef()){
            this.isAlcoholConsumer = isAlcoholConsumer;
        }
    }

    public boolean isDiabetesCarrier() {
        return isDiabetesCarrier;
    }

    public void setIsDiabetesCarrier(boolean isDiabetesCarrier, PessoaClinica p) {
        if(p.getCargo() == Cargo.getDoctorRef()){
            this.isDiabetesCarrier = isDiabetesCarrier;
        }
    }

    public boolean isHeartDiseaseCarrier() {
        return isHeartDiseaseCarrier;
    }

    public void setIsHeartDiseaseCarrier(boolean isHeartDiseaseCarrier, PessoaClinica p) {
        if(p.getCargo() == Cargo.getDoctorRef()){
            this.isHeartDiseaseCarrier = isHeartDiseaseCarrier;
        }
    }

    public List<String> getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(List<String> surgeries, PessoaClinica p) {
        if(p.getCargo() == Cargo.getDoctorRef()){
            this.surgeries = surgeries;
        }
    }

    public List<String> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<String> allergies, PessoaClinica p) {
        if(p.getCargo() == Cargo.getDoctorRef()){
            this.allergies = allergies;
        }
    }

    public boolean isIsCholesterolCarrier() {
        return isCholesterolCarrier;
    }

    public void setIsCholesterolCarrier(boolean isCholesterolCarrier, PessoaClinica p) {
        if(p.getCargo() == Cargo.getDoctorRef()){
            this.isCholesterolCarrier = isCholesterolCarrier;
        }
    }
}
