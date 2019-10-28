package clinica_medica;

import java.util.List;
import java.util.ArrayList;
import services.Appointment;
import services.Crud;
import models.Doctor;
import models.Patient;
import models.Secretary;

public class ClinicaMedica extends javax.swing.JFrame {
    
    //TESTES
    private Doctor doctor = new Doctor("Doutor", 123, "fsda");
    private Secretary secretary;
    private List<Appointment> appointments = new ArrayList<Appointment>();
    private List<Patient> patients = new ArrayList<Patient>();

    public ClinicaMedica() {
        Patient patient = new Patient();
        Appointment a1 = new Appointment(1, "22/12/1999", doctor, patient, true);
        Appointment a2 = new Appointment(2, "22/12/2000", doctor, patient, true);
        Appointment a3 = new Appointment(3, "22/12/2001", doctor, patient, true);
        Appointment a4 = new Appointment(4, "22/12/2002", doctor, patient, true);
        
        appointments = Crud.addAppointment(a1, appointments);
        appointments = Crud.addAppointment(a2, appointments);
        appointments = Crud.addAppointment(a3, appointments);
        appointments = Crud.addAppointment(a4, appointments);
        
        Appointment apNew = new Appointment(5, "22/12/2003", doctor, patient, true);
        appointments = Crud.updateAppointment(4, apNew, appointments);
        
        for(Appointment a: appointments){
            System.out.println(a.getDate());
        }
        
        
        //initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 682, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClinicaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClinicaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClinicaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClinicaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClinicaMedica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
