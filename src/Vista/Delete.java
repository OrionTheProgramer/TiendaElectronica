/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Controlador.ClienteCTL;
import Modelo.Cliente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author orion
 */
public class Delete extends javax.swing.JPanel {

    /**
     * Creates new form Listado
     */
    public Delete() {
        initComponents();
        
        combox_delete.hide();
        Label_aviso.hide();
    }
    boolean actualizar = false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_base = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Label_error = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        Label_aviso = new javax.swing.JLabel();
        combox_delete = new javax.swing.JComboBox<>();
        bt_delete = new javax.swing.JButton();

        Panel_base.setBackground(new java.awt.Color(153, 153, 153));
        Panel_base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 243, 243));

        Label_error.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Correo", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(tabla_usuarios);

        Label_aviso.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        Label_aviso.setText("Elija que usuario eliminar");

        combox_delete.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        bt_delete.setBackground(new java.awt.Color(54, 151, 167));
        bt_delete.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bt_delete.setForeground(new java.awt.Color(255, 255, 255));
        bt_delete.setText("Actualizar");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(Label_aviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combox_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Label_error))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_error)
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_delete)
                    .addComponent(combox_delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_aviso))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );

        Panel_base.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 620, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        ClienteCTL data = new ClienteCTL();
        ArrayList<Cliente> lista = new ArrayList<>();
        
        // Crear el modelo de la tabla
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Correo");
        modelo.addColumn("Contraseña");
        
        if (actualizar == false){
            combox_delete.removeAllItems();
            
            lista.clear();
            lista = data.buscarTodos("id_cliente"); 
            
            // Llenar el modelo con los datos de la lista
            for (Cliente cliente : lista) {
                combox_delete.addItem(""+cliente.getId_cliente());

                Object[] fila = {cliente.getId_cliente(), cliente.getNombre(), cliente.getCorreo(), cliente.getContraseña()};
                modelo.addRow(fila);
            }

            // Asignar el modelo a la tabla
            tabla_usuarios.setModel(modelo);
            actualizar = true;
            bt_delete.setText("Eliminar");
            combox_delete.show();
            Label_aviso.show();
        }else{
            if (actualizar == true){
                data.eliminar(Integer.parseInt((String)combox_delete.getSelectedItem()));
                combox_delete.removeAllItems();
                
                lista.clear();
                lista = data.buscarTodos("id_cliente");
                
                for (Cliente cliente : lista) {
                    combox_delete.addItem(""+cliente.getId_cliente());

                    Object[] fila = {cliente.getId_cliente(), cliente.getNombre(), cliente.getCorreo(), cliente.getContraseña()};
                    modelo.addRow(fila);
                }
                
                actualizar = false;
                bt_delete.setText("Actualizar");
                combox_delete.hide();
                Label_aviso.hide();
            }
        }
        
        
        
    }//GEN-LAST:event_bt_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_aviso;
    private javax.swing.JLabel Label_error;
    private javax.swing.JPanel Panel_base;
    private javax.swing.JButton bt_delete;
    private javax.swing.JComboBox<String> combox_delete;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_usuarios;
    // End of variables declaration//GEN-END:variables
}
