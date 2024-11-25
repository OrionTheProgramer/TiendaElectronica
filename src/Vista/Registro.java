/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.ClienteCTL;
import Modelo.Cliente;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author orion
 */
public class Registro extends javax.swing.JPanel {

    /**
     * Creates new form Registro
     */
    public Registro() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Panel_base = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Label_registro = new javax.swing.JLabel();
        Label_correo = new javax.swing.JLabel();
        Label_contraseña = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JPasswordField();
        Label_error = new javax.swing.JLabel();
        bt_registrar = new javax.swing.JButton();
        Label_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Label_inicio1 = new javax.swing.JLabel();
        Label_error1 = new javax.swing.JLabel();
        bt_inicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        Panel_base.setBackground(new java.awt.Color(58, 6, 12));
        Panel_base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 36, 38));

        Label_registro.setFont(new java.awt.Font("Roboto Medium", 0, 38)); // NOI18N
        Label_registro.setForeground(new java.awt.Color(255, 255, 255));
        Label_registro.setText("Registro");

        Label_correo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Label_correo.setForeground(new java.awt.Color(255, 255, 255));
        Label_correo.setText("Correo");

        Label_contraseña.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Label_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        Label_contraseña.setText("Contraseña");

        Label_error.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        bt_registrar.setBackground(new java.awt.Color(86, 73, 98));
        bt_registrar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bt_registrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrar.setText("Registrar");
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });

        Label_nombre.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        Label_nombre.setForeground(new java.awt.Color(255, 255, 255));
        Label_nombre.setText("Usuario");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Label_registro)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(Label_correo)
                                        .addGap(37, 37, 37))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(Label_contraseña)
                                        .addGap(18, 18, 18))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(Label_nombre)
                                .addGap(29, 29, 29)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Label_error)
                            .addComponent(txt_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txt_contraseña)
                            .addComponent(txt_nombre))))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 117, Short.MAX_VALUE)
                .addComponent(bt_registrar)
                .addGap(120, 120, 120))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_registro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_correo)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_contraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_registrar)
                .addGap(27, 27, 27)
                .addComponent(Label_error)
                .addGap(22, 22, 22))
        );

        Panel_base.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 330, 270));

        jPanel3.setBackground(new java.awt.Color(34, 36, 38));

        Label_inicio1.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        Label_inicio1.setForeground(new java.awt.Color(255, 255, 255));
        Label_inicio1.setText("¿Ya estas registrado?");

        Label_error1.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        bt_inicio.setBackground(new java.awt.Color(86, 73, 98));
        bt_inicio.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bt_inicio.setForeground(new java.awt.Color(255, 255, 255));
        bt_inicio.setText("Iniciar sesión");
        bt_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inicioActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(34, 36, 38));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("    Inicia sesión dando click al boton de \n                              abajo");
        jTextArea1.setBorder(null);
        jTextArea1.setCaretColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Label_inicio1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(Label_error1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(bt_inicio)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_inicio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(bt_inicio)
                .addGap(26, 26, 26)
                .addComponent(Label_error1)
                .addGap(22, 22, 22))
        );

        Panel_base.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed

        
        // Validar datos
        String nombre = txt_nombre.getText().trim();
        String correo = txt_correo.getText().trim();
        String contraseña = new String(txt_contraseña.getPassword()).trim();

        if (nombre.isEmpty() || correo.isEmpty() || contraseña.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!correo.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingresa un correo válido.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Creando objeto cliente y asignando los datos
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setCorreo(correo);
        cliente.setContraseña(contraseña);

        // Creando objeto controlador y registrando cliente
        ClienteCTL cliente_updater = new ClienteCTL();
        boolean registrado = cliente_updater.registrarCliente(cliente);

        // Mostrar mensaje según resultado
        if (registrado) {
            JOptionPane.showMessageDialog(null, "Registrado de pana!!", "Exito", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Error", "Error", 3);
        }
    }//GEN-LAST:event_bt_registrarActionPerformed

    private void bt_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inicioActionPerformed
        Sesion sesion = new Sesion();

        Panel_base.setLayout(new BorderLayout());

        // Quitar componentes actuales y agregar uno nuevo
        Panel_base.removeAll();
        Panel_base.add(sesion);
        Panel_base.revalidate(); // Actualiza el diseño
        Panel_base.repaint();    // Redibuja el contenedor
    }//GEN-LAST:event_bt_inicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_contraseña;
    private javax.swing.JLabel Label_correo;
    private javax.swing.JLabel Label_error;
    private javax.swing.JLabel Label_error1;
    private javax.swing.JLabel Label_inicio1;
    private javax.swing.JLabel Label_nombre;
    private javax.swing.JLabel Label_registro;
    private javax.swing.JPanel Panel_base;
    private javax.swing.JButton bt_inicio;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
