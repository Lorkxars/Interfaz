/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ipo;

/**
 *
 * @author pablo
 */
public class Operaciones extends javax.swing.JFrame {

    /**
     * Creates new form Operaciones
     */
    public Operaciones() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Division = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel3.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(253, 248, 174));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(250, 253, 161));
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

        jButton1.setText("jButton1");
        jPanel3.add(jButton1);
        jButton1.setBounds(1560, 130, 100, 880);

        jButton2.setText("jButton1");
        jPanel3.add(jButton2);
        jButton2.setBounds(0, 130, 100, 880);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SumaActionPerformed

    private void SumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumaMouseClicked
        Operacion1 p = new Operacion1();
        p.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_SumaMouseClicked

    private void RestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestaMouseClicked
        Operacion1 p = new Operacion1();
        p.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_RestaMouseClicked

    private void MultiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MultiplicacionMouseClicked
        Operacion1 p = new Operacion1();
        p.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_MultiplicacionMouseClicked

    private void DivisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DivisionMouseClicked
        Operacion1 p = new Operacion1();
        p.setVisible(true);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_DivisionMouseClicked

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
