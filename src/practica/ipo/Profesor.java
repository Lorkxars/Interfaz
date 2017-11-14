/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ipo;

import java.awt.event.WindowEvent;

/**
 *
 * @author david
 */
public class Profesor extends javax.swing.JFrame {

    /**
     * Creates new form Profesor
     */
    public Profesor() {
        initComponents();
        this.jButton1.setEnabled(false);
    }
    private Usuarios auxusr = null;
    public Profesor(Usuarios aux) {
        this.auxusr = aux;
        initComponents();
    }
    private HistoProfe auxhpr = null;
    public Profesor(HistoProfe aux) {
        this.auxhpr = aux;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Usuarios = new javax.swing.JButton();
        Historial = new javax.swing.JButton();
        Ejercicios = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1680, 1050));
        jPanel1.setLayout(null);

        Usuarios.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        Usuarios.setText("Usuarios");
        Usuarios.setFocusable(false);
        Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsuariosMouseClicked(evt);
            }
        });
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(Usuarios);
        Usuarios.setBounds(100, 5, 1480, 340);

        Historial.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        Historial.setText("Historial");
        jPanel1.add(Historial);
        Historial.setBounds(100, 350, 1480, 340);

        Ejercicios.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        Ejercicios.setText("Ejercicios");
        Ejercicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EjerciciosMouseClicked(evt);
            }
        });
        jPanel1.add(Ejercicios);
        Ejercicios.setBounds(100, 695, 1480, 340);

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1580, 5, 100, 1030);

        jButton2.setText("jButton1");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 5, 100, 1030);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
     
    }//GEN-LAST:event_UsuariosActionPerformed

    private void UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuariosMouseClicked
           Usuarios p = new Usuarios();//Creamos la siguiente ventana y cerramos esta
           p.setVisible(true);
           this.setVisible(false);
           dispose();
    }//GEN-LAST:event_UsuariosMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Login p = new Login();
        p.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(auxusr != null){
        auxusr.setVisible(true);
        this.setVisible(false);
        dispose();
        auxhpr = null;
        }else if(auxhpr != null){
        auxhpr.setVisible(true);
        this.setVisible(false);
        dispose();
        auxusr = null;
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void EjerciciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EjerciciosMouseClicked
        HistoProfe p = new HistoProfe(false);
            p.setVisible(true);
            this.setVisible(false);
            dispose();
    }//GEN-LAST:event_EjerciciosMouseClicked

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
            java.util.logging.Logger.getLogger(Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ejercicios;
    private javax.swing.JButton Historial;
    private javax.swing.JButton Usuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
