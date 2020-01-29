package screens;
import javax.swing.JOptionPane;
import java.util.List;
import models.Patient;
import services.Crud;

public class InformationDialog {
        public void show(List<Patient> patients, String message){            
            String cpf = JOptionPane.showInputDialog("Digite o cpf:");
            Patient patient = Crud.getPatient(cpf, patients);
            if(patient == null){
                JOptionPane.showMessageDialog(null, "Erro! tente novamente.");    
            }else{
                JOptionPane.showMessageDialog(null, message);
            }
         
        }
}
