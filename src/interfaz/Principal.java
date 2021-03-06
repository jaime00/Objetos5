/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author jaime
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Cuenta c;

    public Principal() {
        initComponents();
        cmdIngresar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdRetirar.setEnabled(false);
        cmdCrearCuenta.setEnabled(true);
        cmdActualizar.setEnabled(false);
        cmdGuardarSI.setEnabled(false);
        cmdGuardarIngresar.setEnabled(false);
        cmdGuardarRetirar.setEnabled(false);
        cmdSaldoInicial.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtInteres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JTextField();
        cmdCrearCuenta = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtSaldoInicial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmdSaldoInicial = new javax.swing.JButton();
        cmdGuardarSI = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cmdIngresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtIngresar = new javax.swing.JTextField();
        cmdGuardarIngresar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdActualizar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        cmdRetirar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtIngresarRetirar = new javax.swing.JTextField();
        cmdGuardarRetirar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMostrar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ADMINISTRACION DE DATOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos:"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Numero De Indentificacion:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel2.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 80, -1));

        jLabel3.setText("Interes anual:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresKeyTyped(evt);
            }
        });
        jPanel2.add(txtInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 80, -1));

        jLabel4.setText("Numero De Cuenta:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, -1));

        txtNumeroCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroCuentaKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 80, -1));

        cmdCrearCuenta.setText("Crear Cuenta");
        cmdCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearCuentaActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 220));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Saldo Inicial:"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSaldoInicial.setEditable(false);
        txtSaldoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoInicialKeyTyped(evt);
            }
        });
        jPanel5.add(txtSaldoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 70, -1));

        jLabel5.setText("Saldo:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        cmdSaldoInicial.setText("Digitar Saldo Inicial");
        cmdSaldoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaldoInicialActionPerformed(evt);
            }
        });
        jPanel5.add(cmdSaldoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 150, 20));

        cmdGuardarSI.setText("Guardar");
        cmdGuardarSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarSIActionPerformed(evt);
            }
        });
        jPanel5.add(cmdGuardarSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 80, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 270, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ingresar:"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdIngresar.setText("Ingresar Dinero");
        cmdIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 110, 20));

        jLabel6.setText("Saldo:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtIngresar.setEditable(false);
        txtIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngresarKeyTyped(evt);
            }
        });
        jPanel3.add(txtIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 70, -1));

        cmdGuardarIngresar.setText("Guardar");
        cmdGuardarIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarIngresarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdGuardarIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 80, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 270, 120));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 110, 30));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 110, 30));

        cmdActualizar.setText("Actualizar Saldo");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 110, 30));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Retirar:"));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdRetirar.setText("Retirar Dinero");
        cmdRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRetirarActionPerformed(evt);
            }
        });
        jPanel6.add(cmdRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, 20));

        jLabel7.setText("Saldo:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtIngresarRetirar.setEditable(false);
        txtIngresarRetirar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngresarRetirarKeyTyped(evt);
            }
        });
        jPanel6.add(txtIngresarRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 70, -1));

        cmdGuardarRetirar.setText("Guardar");
        cmdGuardarRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarRetirarActionPerformed(evt);
            }
        });
        jPanel6.add(cmdGuardarRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 80, 20));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 260, 120));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Mostrar:"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMostrar.setEditable(false);
        txtMostrar.setColumns(20);
        txtMostrar.setRows(5);
        jScrollPane1.setViewportView(txtMostrar);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 110));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 260, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(626, 534));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void txtInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtInteresKeyTyped

    private void txtNumeroCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroCuentaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroCuentaKeyTyped

    private void cmdCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearCuentaActionPerformed

        if (txtIdentificacion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite por favor el numero de identificacion del usuario");
            txtIdentificacion.requestFocusInWindow();
        } else if (txtNumeroCuenta.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite por favor el numero de cuenta");
            txtNumeroCuenta.requestFocusInWindow();
        } else if (txtInteres.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite por favor el interes anual");
            txtInteres.requestFocusInWindow();

        } else {
            try {
                if (txtIdentificacion.getText().length() < 6) {
                    JOptionPane.showMessageDialog(this, "La indentificacion debe ser mayor a 5 caracteres");
                    txtIdentificacion.requestFocusInWindow();
                } else if (txtNumeroCuenta.getText().length() < 6) {
                    JOptionPane.showMessageDialog(this, "El numero de cuenta debe ser mayor a 5 Caracteres ");
                    txtNumeroCuenta.requestFocusInWindow();
                } else if (Integer.parseInt(txtIdentificacion.getText()) == 0) {
                    JOptionPane.showMessageDialog(this, "El numero de identificacion no puede ser cero");
                    txtIdentificacion.requestFocusInWindow();
                } else if (Integer.parseInt(txtNumeroCuenta.getText()) == 0) {
                    JOptionPane.showMessageDialog(this, "El numero de cuenta no puede ser cero");
                    txtNumeroCuenta.requestFocusInWindow();
                } else if (Integer.parseInt(txtInteres.getText()) == 0) {
                    JOptionPane.showMessageDialog(this, "El interes no puede ser cero");
                    txtInteres.requestFocusInWindow();

                } else {
                    cmdCrearCuenta.setEnabled(true);
                    cmdSaldoInicial.setEnabled(true);
                    txtIdentificacion.setEditable(false);
                    txtInteres.setEditable(false);
                    txtNumeroCuenta.setEditable(false);
                    JOptionPane.showMessageDialog(this, "Cuenta creada correctamente");

                    long identificacion = c.getIdentificacion();
                    long numero_cuenta = c.getNumero_cuenta();
                    c = new Cuenta(identificacion, numero_cuenta);

                }

            } catch (NullPointerException e) {
            } catch (NumberFormatException e) {
            }

        }

    }//GEN-LAST:event_cmdCrearCuentaActionPerformed

    private void txtSaldoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoInicialKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSaldoInicialKeyTyped

    private void cmdSaldoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaldoInicialActionPerformed
        JOptionPane.showMessageDialog(this, "Digite por favor el saldo inicial ");
        txtSaldoInicial.setEditable(true);
        txtSaldoInicial.requestFocusInWindow();
        cmdGuardarSI.setEnabled(true);
        cmdSaldoInicial.setEnabled(false);

    }//GEN-LAST:event_cmdSaldoInicialActionPerformed

    private void cmdGuardarSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarSIActionPerformed
        if (txtSaldoInicial.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite por favor el saldo inicial");
            txtSaldoInicial.requestFocusInWindow();
        } else {
            txtSaldoInicial.setText(txtSaldoInicial.getText());
            JOptionPane.showMessageDialog(this, "Saldo registrado");
            cmdActualizar.setEnabled(true);
            cmdIngresar.setEnabled(true);
            cmdRetirar.setEnabled(true);
            cmdMostrar.setEnabled(true);
            txtSaldoInicial.setEditable(false);
            cmdGuardarSI.setEnabled(false);

        }
    }//GEN-LAST:event_cmdGuardarSIActionPerformed

    private void cmdIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarActionPerformed
        JOptionPane.showMessageDialog(this, "Digite por el valor a ingresar");
        txtIngresar.setEditable(true);
        cmdGuardarIngresar.setEnabled(true);
        cmdIngresar.setEnabled(false);
        txtIngresar.requestFocusInWindow();

    }//GEN-LAST:event_cmdIngresarActionPerformed

    private void txtIngresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresarKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtIngresarKeyTyped

    private void cmdGuardarIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarIngresarActionPerformed
        if (txtIngresar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite por favor el saldo inicial");
            txtIngresar.requestFocusInWindow();
        } else {
            int p1 = Integer.parseInt(txtSaldoInicial.getText());
            int p2 = Integer.parseInt(txtIngresar.getText());
            int suma = p1 + p2;
            txtSaldoInicial.setText("" + suma);
            JOptionPane.showMessageDialog(this, "Valor Ingresado");

            cmdIngresar.setEnabled(true);
            cmdGuardarIngresar.setEnabled(false);
            txtIngresar.setText("");
            txtIngresar.setEditable(false);
        }
    }//GEN-LAST:event_cmdGuardarIngresarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed

        String aux = "Datos: "
                + "\nNumero De Identificacion: " + txtIdentificacion.getText()
                + "\nNumero De Cuenta: " + txtNumeroCuenta.getText()
                + "\nSaldo Inicial: " + txtSaldoInicial.getText();
        txtMostrar.setText(aux);

    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtIdentificacion.requestFocusInWindow();
        txtIdentificacion.setText("");
        txtInteres.setText("");
        txtNumeroCuenta.setText("");

        cmdIngresar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdRetirar.setEnabled(false);
        cmdCrearCuenta.setEnabled(true);
        txtIdentificacion.setEditable(true);
        txtNumeroCuenta.setEditable(true);
        txtInteres.setEditable(true);
        txtIngresar.setText("");
        txtIngresarRetirar.setText("");
        txtMostrar.setText("");
        txtSaldoInicial.setText("");
        txtIngresar.setEditable(false);

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtIngresarRetirarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngresarRetirarKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtIngresarRetirarKeyTyped

    private void cmdGuardarRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarRetirarActionPerformed
        int retirar = Integer.parseInt(txtIngresarRetirar.getText());
        int saldoi = Integer.parseInt(txtSaldoInicial.getText());

        if (txtIngresarRetirar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite por favor el valor a retirar");
            txtIngresarRetirar.requestFocusInWindow();
        } else if (retirar > saldoi) {
            JOptionPane.showMessageDialog(this, "La cantidad a retirar es mayor al saldo", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtIngresarRetirar.requestFocusInWindow();
            txtIngresarRetirar.selectAll();
        } else {
            int p1 = Integer.parseInt(txtSaldoInicial.getText());
            int p2 = Integer.parseInt(txtIngresarRetirar.getText());
            int resta = p1 - p2;
            txtSaldoInicial.setText("" + resta);
            JOptionPane.showMessageDialog(this, "Valor Retirado");

            cmdRetirar.setEnabled(true);
            cmdGuardarRetirar.setEnabled(false);
            txtIngresarRetirar.setText("");
            txtIngresarRetirar.setEditable(false);
        }
    }//GEN-LAST:event_cmdGuardarRetirarActionPerformed

    private void cmdRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRetirarActionPerformed
        JOptionPane.showMessageDialog(this, "Digite por el valor a ingresar");
        txtIngresarRetirar.setEditable(true);
        cmdGuardarRetirar.setEnabled(true);
        cmdRetirar.setEnabled(false);
        txtIngresarRetirar.requestFocusInWindow();        // TODO add your handling code here:
    }//GEN-LAST:event_cmdRetirarActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        int saldoi = Integer.parseInt(txtSaldoInicial.getText());
        int interes = Integer.parseInt(txtInteres.getText());
        int resta = saldoi - (interes / 365);
        txtSaldoInicial.setText("" + resta);
        JOptionPane.showMessageDialog(this, "Saldo actualizado (interes de " + interes + ")");
    }//GEN-LAST:event_cmdActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdCrearCuenta;
    private javax.swing.JButton cmdGuardarIngresar;
    private javax.swing.JButton cmdGuardarRetirar;
    private javax.swing.JButton cmdGuardarSI;
    private javax.swing.JButton cmdIngresar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdRetirar;
    private javax.swing.JButton cmdSaldoInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtIngresar;
    private javax.swing.JTextField txtIngresarRetirar;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextArea txtMostrar;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtSaldoInicial;
    // End of variables declaration//GEN-END:variables
}
