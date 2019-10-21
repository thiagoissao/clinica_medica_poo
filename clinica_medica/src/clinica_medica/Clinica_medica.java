package clinica_medica;

import java.util.ArrayList;
import java.util.List;

import models.Appointment;
import models.Doctor;
import models.Patient;
import models.Secretary;
import services.Crud;
import services.Message;

public class Clinica_medica {

    private List<Patient> pacientes = new ArrayList<Patient>();
    private List<Doctor> medicos = new ArrayList<Doctor>();
    private List<Appointment> consultas = new ArrayList<Appointment>();
    private List<Secretary> secretarias = new ArrayList<Secretary>();
    
    public static void main(String[] args) {
       
    }
    
}
