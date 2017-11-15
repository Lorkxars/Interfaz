/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ipo;

import java.util.Random;
import javafx.scene.paint.Color;

/**
 *
 * @author pablo
 */
public class Operaciones extends javax.swing.JFrame {

    /**
     * Creates new form Operaciones
     */
    private boolean s, r, m, d, mierda;

    public Operaciones() {
        initComponents();
        this.jButton1.setEnabled(false);
    }
    private Operacion1 auxop = null;

    public Operaciones(Operacion1 aux) {
        initComponents();
        this.auxop = aux;
    }
    private Fallo auxfa = null;

    public Operaciones(Fallo aux) {
        initComponents();
        this.auxfa = aux;
    }
    private Acierto auxac = null;

    public Operaciones(Acierto aux) {
        initComponents();
        this.auxac = aux;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Empezar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Division = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1680, 1050));
        setMinimumSize(new java.awt.Dimension(1680, 1050));
        setPreferredSize(new java.awt.Dimension(1680, 1050));
        setResizable(false);

        jPanel3.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel3.setLayout(null);

        Empezar.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Empezar.setText("Empezar");
        Empezar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpezarMouseClicked(evt);
            }
        });
        jPanel3.add(Empezar);
        Empezar.setBounds(692, 439, 280, 240);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("¿Qué quieres hacer hoy?");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(0, 0, 1680, 130);

        Division.setBackground(new java.awt.Color(255, 133, 255));
        Division.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        Division.setText("División");
        Division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DivisionMouseClicked(evt);
            }
        });
        jPanel3.add(Division);
        Division.setBounds(830, 570, 730, 440);

        Suma.setBackground(new java.awt.Color(145, 206, 189));
        Suma.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        Suma.setText("Suma ");
        Suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumaMouseClicked(evt);
            }
        });
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });
        jPanel3.add(Suma);
        Suma.setBounds(100, 130, 730, 440);

        Resta.setBackground(new java.awt.Color(253, 223, 107));
        Resta.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        Resta.setText("Resta");
        Resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestaMouseClicked(evt);
            }
        });
        jPanel3.add(Resta);
        Resta.setBounds(830, 130, 730, 440);

        Multiplicacion.setBackground(new java.awt.Color(139, 226, 255));
        Multiplicacion.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        Multiplicacion.setText("Multiplicación");
        Multiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MultiplicacionMouseClicked(evt);
            }
        });
        jPanel3.add(Multiplicacion);
        Multiplicacion.setBounds(100, 570, 730, 440);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jButton7.setText("Tira");
        jPanel3.add(jButton7);
        jButton7.setBounds(480, 480, 230, 90);

        jButton1.setText("Avanzar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(1560, 130, 100, 880);

        jButton2.setText("Volver");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(0, 130, 100, 880);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SumaActionPerformed

    private void SumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumaMouseClicked
        s = !s;
        Suma.setBackground(java.awt.Color.cyan);
        //aqui le cambias el color ;) jodete
    }//GEN-LAST:event_SumaMouseClicked

    private void RestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestaMouseClicked
        r = !r;
        Resta.setBackground(java.awt.Color.ORANGE);
    }//GEN-LAST:event_RestaMouseClicked

    private void MultiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MultiplicacionMouseClicked
        m = !m;
        Multiplicacion.setBackground(java.awt.Color.BLUE);
    }//GEN-LAST:event_MultiplicacionMouseClicked

    private void DivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DivisionMouseClicked
        d = !d;
        Division.setBackground(java.awt.Color.MAGENTA);
    }//GEN-LAST:event_DivisionMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Alumnos p = new Alumnos(this);
        p.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (auxop != null) {//Miramos de donde venimos para decidir a donde vamos
            auxop.setVisible(true);
            this.setVisible(false);
            dispose();
            auxfa = null;
            auxac = null;
        } else if (auxfa != null) {
            auxfa.setVisible(true);
            this.setVisible(false);
            dispose();
            auxop = null;
            auxac = null;
        } else if (auxac != null) {
            auxac.setVisible(true);
            this.setVisible(false);
            dispose();
            auxfa = null;
            auxop = null;
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void EmpezarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpezarMouseClicked
        mierda = true;
        Random tuputamadre = new Random();// :)
        int i = tuputamadre.nextInt(4);
        while (mierda) {
            if(!s && !r && !m && !d){
                mierda = false;
            }
            if (s && i == 0) {
                Suma p = new Suma();
                p.setVisible(true);
                this.setVisible(false);
                mierda = false;
                dispose();
            }
            if (r && i == 1) {
                Operacion1 p = new Operacion1();
                p.setVisible(true);
                this.setVisible(false);
                mierda = false;
                dispose();
            }
            if (m && i == 2) {
                Multiplicacion p = new Multiplicacion();
                p.setVisible(true);
                this.setVisible(false);
                mierda = false;
                dispose();
            }
            if (d && i == 3) {
                Division p = new Division();
                p.setVisible(true);
                this.setVisible(false);
                mierda = false;
                dispose();
            }
            i++;
            i= i%4;
        }
    }//GEN-LAST:event_EmpezarMouseClicked

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
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Division;
    private javax.swing.JButton Empezar;
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Suma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
