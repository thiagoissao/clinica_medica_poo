package utils;

import java.util.List;

public class PatientMedicalRecord {
    private List<String> symptom;
    private List<String> diseaseDiagnosis;
    private String treatmentDescription;

    public List<String> getSymptom() {
        return symptom;
    }

    public void setSymptom(List<String> symptom) {
        this.symptom = symptom;
    }

    public List<String> getDiseaseDiagnosis() {
        return diseaseDiagnosis;
    }

    public void setDiseaseDiagnosis(List<String> diseaseDiagnosis) {
        this.diseaseDiagnosis = diseaseDiagnosis;
    }

    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    public void setTreatmentDescription(String treatmentDescription) {
        this.treatmentDescription = treatmentDescription;
    }
    
    
}
