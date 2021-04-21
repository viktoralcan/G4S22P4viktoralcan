package g4s22p4viktoralcan;

public class Frp extends javax.swing.JFrame {

    public Frp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dp_prin = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        iSuma = new javax.swing.JMenuItem();
        iResta = new javax.swing.JMenuItem();
        iMul = new javax.swing.JMenuItem();
        iDiv = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        iSqrt = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout Dp_prinLayout = new javax.swing.GroupLayout(Dp_prin);
        Dp_prin.setLayout(Dp_prinLayout);
        Dp_prinLayout.setHorizontalGroup(
            Dp_prinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        Dp_prinLayout.setVerticalGroup(
            Dp_prinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        jMenu1.setText("Operaciones");

        iSuma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        iSuma.setText("Suma");
        iSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iSumaActionPerformed(evt);
            }
        });
        jMenu1.add(iSuma);

        iResta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        iResta.setText("Resta");
        iResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iRestaActionPerformed(evt);
            }
        });
        jMenu1.add(iResta);

        iMul.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        iMul.setText("Multiplicación");
        iMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iMulActionPerformed(evt);
            }
        });
        jMenu1.add(iMul);

        iDiv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        iDiv.setText("División");
        iDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iDivActionPerformed(evt);
            }
        });
        jMenu1.add(iDiv);
        jMenu1.add(jSeparator1);

        iSqrt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        iSqrt.setText("Raíz cuadrada");
        iSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iSqrtActionPerformed(evt);
            }
        });
        jMenu1.add(iSqrt);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exponente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de...");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Desarrollador");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dp_prin)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dp_prin)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iSumaActionPerformed
        Fsuma fsuma = new Fsuma();
        fsuma.setVisible(true);
        Dp_prin.add(fsuma);
    }//GEN-LAST:event_iSumaActionPerformed

    private void iRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iRestaActionPerformed
        Fresta fresta = new Fresta();
        fresta.setVisible(true);
        Dp_prin.add(fresta);
    }//GEN-LAST:event_iRestaActionPerformed

    private void iMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iMulActionPerformed
        Fmul fmul = new Fmul();
        fmul.setVisible(true);
        Dp_prin.add(fmul);
    }//GEN-LAST:event_iMulActionPerformed

    private void iDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iDivActionPerformed
        Fdiv fdiv = new Fdiv();
        fdiv.setVisible(true);
        Dp_prin.add(fdiv);
    }//GEN-LAST:event_iDivActionPerformed

    private void iSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iSqrtActionPerformed
        Fraiz fraiz = new Fraiz();
        fraiz.setVisible(true);
        Dp_prin.add(fraiz);
    }//GEN-LAST:event_iSqrtActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Facerca facerca = new Facerca();
        facerca.setVisible(true);
        Dp_prin.add(facerca);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Fexp fexp = new Fexp();
        fexp.setVisible(true);
        Dp_prin.add(fexp);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Dp_prin;
    private javax.swing.JMenuItem iDiv;
    private javax.swing.JMenuItem iMul;
    private javax.swing.JMenuItem iResta;
    private javax.swing.JMenuItem iSqrt;
    private javax.swing.JMenuItem iSuma;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
