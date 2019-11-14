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

    public boolean isIsCholesterolCarrier() {
        return isCholesterolCarrier;
    }

    public void setIsCholesterolCarrier(boolean isCholesterolCarrier) {
        this.isCholesterolCarrier = isCholesterolCarrier;
    }
}
