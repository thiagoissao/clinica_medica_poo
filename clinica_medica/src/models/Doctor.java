package models;

import utils.Cargo;
import java.util.List;
import services.Crud;
import utils.AddictionalPatientData;
import utils.PatientMedicalRecord;

public class Doctor extends PessoaClinica{
    public Doctor(String nome, String cpf, String telefone){
        super(nome, cpf, telefone, Cargo.getDoctorRef());
    }
    
    public List<Patient> addAddictionalPatientData(String cpf, AddictionalPatientData data , List<Patient> patients){
        Patient patient = Crud.getPatient(cpf, patients);
        
        patient.setIsSmoker(data.isSmoker(), this);
        patient.setIsAlcoholConsumer(data.isAlcoholConsumer(), this);
        patient.setIsDiabetesCarrier(data.isDiabetesCarrier(), this);
        patient.setIsHeartDiseaseCarrier(data.isHeartDiseaseCarrier(), this);
        patient.setSurgeries(data.getSurgeries(), this);
        patient.setAllergies(data.getAllergies(), this);

        return Crud.updatePatient(cpf, patient, patients);
     
    }
    
    public List<Patient> updateAddictionalPatientData(String cpf, AddictionalPatientData data , List<Patient> patients){
        Patient patient = Crud.getPatient(cpf, patients);
        
        patient.setIsSmoker(data.isSmoker(), this);
        patient.setIsAlcoholConsumer(data.isAlcoholConsumer(), this);
        patient.setIsDiabetesCarrier(data.isDiabetesCarrier(), this);
        patient.setIsHeartDiseaseCarrier(data.isHeartDiseaseCarrier(), this);
        patient.setSurgeries(data.getSurgeries(), this);
        patient.setAllergies(data.getAllergies(), this);

        return Crud.updatePatient(cpf, patient, patients);
    }
    
    public List<Patient> removeAllAddictionalPatientData(String cpf, List<Patient> patients){
        Patient patient = Crud.getPatient(cpf, patients);

        patient.setIsSmoker(false, this);
        patient.setIsAlcoholConsumer(false, this);
        patient.setIsDiabetesCarrier(false, this);
        patient.setIsHeartDiseaseCarrier(false, this);
        patient.setSurgeries(null, this);
        patient.setAllergies(null, this);

        return Crud.updatePatient(cpf, patient, patients);
    }
    
    public List<Patient> addPatientMedicalRecord(String cpf, PatientMedicalRecord data, List<Patient> patients){
        Patient patient = Crud.getPatient(cpf, patients);
        
        patient.setSymptom(data.getSymptom(), this);
        patient.setTreatmentDescription(data.getTreatmentDescription(), this);
        patient.setDiseaseDiagnosis(data.getDiseaseDiagnosis(), this);
    
        return Crud.updatePatient(cpf, patient, patients);
    }
    
    public List<Patient> updatePatientMedicalRecord(String cpf, PatientMedicalRecord data, List<Patient> patients){
        Patient patient = Crud.getPatient(cpf, patients);
        
        patient.setSymptom(data.getSymptom(), this);
        patient.setTreatmentDescription(data.getTreatmentDescription(), this);
        patient.setDiseaseDiagnosis(data.getDiseaseDiagnosis(), this);
    
        return Crud.updatePatient(cpf, patient, patients);
    }
    
    public List<Patient> removePatientMedicalRecord(String cpf, PatientMedicalRecord data, List<Patient> patients){
        Patient patient = Crud.getPatient(cpf, patients);
        
        patient.setSymptom(null , this);
        patient.setTreatmentDescription(null, this);
        patient.setDiseaseDiagnosis(null, this);
    
        return Crud.updatePatient(cpf, patient, patients);
    }
}
