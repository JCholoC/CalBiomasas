/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import java.awt.Dimension;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class inicioframe extends javax.swing.JFrame {
    Pantalla1 pantalla1;
    Pantalla2 pantalla2;
    Pantalla3 pantalla3;
    
    /**
     * Creates new form inicioframe
     */
    public inicioframe() {
        initComponents();
        this.setLocationRelativeTo(null);
	
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagen1 = new javax.swing.JButton();
        imagen3 = new javax.swing.JButton();
        imagen2 = new javax.swing.JButton();
        texto_imagen3 = new javax.swing.JLabel();
        texto_imagen1 = new javax.swing.JLabel();
        texto_imagen2 = new javax.swing.JLabel();
        titulo_seleccionar = new javax.swing.JLabel();
        salir1 = new javax.swing.JButton();
        titulo_seleccionar1 = new javax.swing.JLabel();
        titulo_seleccionar2 = new javax.swing.JLabel();
        autores = new javax.swing.JLabel();
        imagenfondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Green Biogas");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1024, 609));
        getContentPane().setLayout(null);

        imagen1.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/large_article_im2085_Biogas_Plant_Germany_1.jpg"))); // NOI18N
        imagen1.setToolTipText("");
        imagen1.setMaximumSize(new java.awt.Dimension(643, 343));
        imagen1.setName("imagen1"); // NOI18N
        imagen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen1ActionPerformed(evt);
            }
        });
        getContentPane().add(imagen1);
        imagen1.setBounds(70, 60, 230, 110);

        imagen3.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        imagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/large_article_im2085_Biogas_Plant_Germany_1.jpg"))); // NOI18N
        imagen3.setToolTipText("");
        imagen3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen3ActionPerformed(evt);
            }
        });
        getContentPane().add(imagen3);
        imagen3.setBounds(70, 410, 230, 110);

        imagen2.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/large_article_im2085_Biogas_Plant_Germany_1.jpg"))); // NOI18N
        imagen2.setToolTipText("");
        imagen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagen2ActionPerformed(evt);
            }
        });
        getContentPane().add(imagen2);
        imagen2.setBounds(70, 230, 230, 110);

        texto_imagen3.setFont(new java.awt.Font("Verdana", 2, 16)); // NOI18N
        texto_imagen3.setText("<html>Esta sección se encuentra dirigida principalmente a entidades públicas y privadas interesadas en la instalación</br>de una planta centralizada de aprovechamiento de residuos agroindustriales en el departamento de cundinamarca, esta etiqueta será presentada como caso de estudio, arrojando la ubicación apta de una planta centralizada, su capacidad y rentabilidad económica del proyecto</html>");
        getContentPane().add(texto_imagen3);
        texto_imagen3.setBounds(340, 390, 650, 130);

        texto_imagen1.setFont(new java.awt.Font("Verdana", 2, 16)); // NOI18N
        texto_imagen1.setText("<html>Esta sección se encuentra dirigida a aquellas personas que dentro de su finca o vivienda deseen realizar una </br>valoración de sus residuos agroindustriales, brindando al usuario información relacionada congeneración  de biogas y energía electrica.</html>");
        getContentPane().add(texto_imagen1);
        texto_imagen1.setBounds(340, 60, 650, 110);

        texto_imagen2.setFont(new java.awt.Font("Verdana", 2, 16)); // NOI18N
        texto_imagen2.setText("<html>La sección de biogas por mezcla, el cual se encuentra dirigido a las personas que deseen trabajar en conjunto</br>con granjas vecinas y tratar residuos generados de otras viviendas. Allí se obtendran datos relacionados con la distancia de recolección de sustratos, biogas producido y energía generada.</html>");
        getContentPane().add(texto_imagen2);
        texto_imagen2.setBounds(340, 240, 650, 110);

        titulo_seleccionar.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        titulo_seleccionar.setText("Aplicación Conjunta");
        getContentPane().add(titulo_seleccionar);
        titulo_seleccionar.setBounds(50, 190, 280, 40);

        salir1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        salir1.setText("Salir");
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });
        getContentPane().add(salir1);
        salir1.setBounds(920, 520, 80, 40);

        titulo_seleccionar1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        titulo_seleccionar1.setText("Caso de estudio");
        getContentPane().add(titulo_seleccionar1);
        titulo_seleccionar1.setBounds(80, 370, 220, 40);

        titulo_seleccionar2.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        titulo_seleccionar2.setText("Individual");
        getContentPane().add(titulo_seleccionar2);
        titulo_seleccionar2.setBounds(120, 10, 150, 40);

        autores.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        autores.setText("Creadores: Daniel Esteban Martinez, Jean Paul  Cholo - Universidad EAN");
        getContentPane().add(autores);
        autores.setBounds(10, 550, 350, 14);

        imagenfondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/large.jpg"))); // NOI18N
        getContentPane().add(imagenfondo2);
        imagenfondo2.setBounds(0, 0, 1020, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagen3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen3ActionPerformed
        dispose();
        pantalla3=new Pantalla3();
        pantalla3.setVisible(true);
    }//GEN-LAST:event_imagen3ActionPerformed

    private void imagen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen1ActionPerformed
        dispose();
        pantalla1=new Pantalla1();
        pantalla1.setVisible(true);
    }//GEN-LAST:event_imagen1ActionPerformed

    private void imagen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagen2ActionPerformed
        dispose();
        try {
            pantalla2=new Pantalla2();
        } catch (SQLException ex) {
            Logger.getLogger(inicioframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        pantalla2.setVisible(true);
    }//GEN-LAST:event_imagen2ActionPerformed

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salir1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(inicioframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autores;
    private javax.swing.JButton imagen1;
    private javax.swing.JButton imagen2;
    private javax.swing.JButton imagen3;
    private javax.swing.JLabel imagenfondo2;
    private javax.swing.JButton salir1;
    private javax.swing.JLabel texto_imagen1;
    private javax.swing.JLabel texto_imagen2;
    private javax.swing.JLabel texto_imagen3;
    private javax.swing.JLabel titulo_seleccionar;
    private javax.swing.JLabel titulo_seleccionar1;
    private javax.swing.JLabel titulo_seleccionar2;
    // End of variables declaration//GEN-END:variables
}