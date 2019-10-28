package utils;

import java.util.List;
import models.PessoaClinica;

public class PatientMedicalRecord {
    private List<String> symptom;
    private List<String> diseaseDiagnosis;
    private String treatmentDescription;

    public List<String> getSymptom() {
        return symptom;
    }

    public void setSymptom(List<String> symptom, PessoaClinica p) {
        if(p.getCargo() == Cargo.getDoctorRef()){
            this.symptom = symptom;
        }
    }

    public List<String> getDiseaseDiagnosis() {
        return diseaseDiagnosis;
    }

    public void setDiseaseDiagnosis(List<String> diseaseDiagnosis, PessoaClinica p) {
        if(p.getCargo() == Cargo.getDoctorRef()){
            this.diseaseDiagnosis = diseaseDiagnosis;
        }
    }

    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    public void setTreatmentDescription(String treatmentDescription, PessoaClinica p) {
        if(p.getCargo() == Cargo.getDoctorRef()){
            this.treatmentDescription = treatmentDescription;
        }
    }
    
    
}
