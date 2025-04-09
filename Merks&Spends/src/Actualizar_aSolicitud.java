import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Actualizar_aSolicitud extends javax.swing.JFrame {

    private UserCRUD crud;
    private solicitudCRUD crudArticulos;
    private articulosCRUD arcrud;
    
    public Actualizar_aSolicitud() {
        initComponents();
        this.crud= new UserCRUD();
        this.crudArticulos = new solicitudCRUD();
        this.arcrud = new articulosCRUD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        btnBuscarEstado = new javax.swing.JButton();
        btnMostrarTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableArticulo = new javax.swing.JTable();
        txtSurtir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        adUsuarios = new javax.swing.JMenuItem();
        adArticulos = new javax.swing.JMenuItem();
        adConsulta = new javax.swing.JMenuItem();
        adActualizarSoli = new javax.swing.JMenuItem();
        txtCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        lblBienvenido.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("MERKS & SPENDS");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar y notificar las solicitudes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblBienvenido))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnEditar.setText("Editar artículo");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado de la solicitud:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En proceso", "Artículo no disponibles", "Disponible para recolección", "Entregado" }));
        cbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEstadoActionPerformed(evt);
            }
        });

        btnBuscarEstado.setText("Buscar por estado");
        btnBuscarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstadoActionPerformed(evt);
            }
        });

        btnMostrarTodo.setText("Mostrar todo");
        btnMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodoActionPerformed(evt);
            }
        });

        tableArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Artículo", "Cantidad", "Fecha", "Hora", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tableArticulo);

        txtSurtir.setText("Surtir");
        txtSurtir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurtirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnBuscarEstado)
                .addGap(99, 99, 99)
                .addComponent(btnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(txtSurtir)
                .addGap(104, 104, 104))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(btnMostrarTodo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarEstado)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditar)
                        .addComponent(txtSurtir)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMostrarTodo)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 720, 330));

        jMenu3.setText("Menú");

        adUsuarios.setText("Administración de usuarios");
        adUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adUsuariosActionPerformed(evt);
            }
        });
        jMenu3.add(adUsuarios);

        adArticulos.setText("Administración de artículos");
        adArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adArticulosActionPerformed(evt);
            }
        });
        jMenu3.add(adArticulos);

        adConsulta.setText("Administración de solicitudes");
        adConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(adConsulta);

        adActualizarSoli.setText("Actualizar solicitud");
        adActualizarSoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActualizarSoliActionPerformed(evt);
            }
        });
        jMenu3.add(adActualizarSoli);

        txtCerrar.setText("Cerrar sesión");
        txtCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCerrarActionPerformed(evt);
            }
        });
        jMenu3.add(txtCerrar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableArticulo.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una solicitud para editar.");
            return;
        }

        int id_solicitud = (int) tableArticulo.getValueAt(selectedRow, 0);
        String estadoselec = (String) cbEstado.getSelectedItem();
        
        System.out.println("ID de solicitud: " + id_solicitud);
    System.out.println("Estado seleccionado: " + estadoselec);

        if (crudArticulos.updateSolicitudArticulos(id_solicitud, estadoselec)) {
            JOptionPane.showMessageDialog(this, "Estado de la solicitud actualizado correctamente.");
             actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar el estado de la solicitud.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed
    
    private void cbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEstadoActionPerformed
        // TODO add your handling code here:
        String estadoSeleccionado = (String) cbEstado.getSelectedItem();
        System.out.println("Estado seleccionado: " + estadoSeleccionado);
    }//GEN-LAST:event_cbEstadoActionPerformed

    private void btnBuscarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstadoActionPerformed
        // TODO add your handling code here:
        String estadoSeleccionado = (String) cbEstado.getSelectedItem();

    if (estadoSeleccionado == null || estadoSeleccionado.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un estado.");
        return;
    }

    try {
        ResultSet rs = crudArticulos.buscarPorEstado(estadoSeleccionado);
        DefaultTableModel modelo = (DefaultTableModel) tableArticulo.getModel();
        modelo.setRowCount(0);  
        
        while (rs.next()) {
            modelo.addRow(new Object[]{rs.getInt("id_solicitud"),rs.getString("Usuario"),rs.getString("Articulo"),rs.getInt("cantidad"),rs.getDate("fecha_solicitud"),rs.getTime("hora"),rs.getString("estado")});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al buscar las solicitudes por estado.");
        System.out.println("Error al realizar la búsqueda: " + e.getMessage());
    }
    }//GEN-LAST:event_btnBuscarEstadoActionPerformed

    private void btnMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodoActionPerformed
        // TODO add your handling code here:
        actualizarTabla();
    }//GEN-LAST:event_btnMostrarTodoActionPerformed

    private void adUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adUsuariosActionPerformed
        Administracion_Usuarios AU = new  Administracion_Usuarios();
        AU.setVisible(true);
    }//GEN-LAST:event_adUsuariosActionPerformed

    private void adArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adArticulosActionPerformed
        AdministracionArticulos AA = new AdministracionArticulos();
        AA.setVisible(true);
    }//GEN-LAST:event_adArticulosActionPerformed

    private void adConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adConsultaActionPerformed
        Consulta_aSolicitud AC = new  Consulta_aSolicitud();
        AC.setVisible(true);
    }//GEN-LAST:event_adConsultaActionPerformed

    private void adActualizarSoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActualizarSoliActionPerformed
        Actualizar_aSolicitud AS = new  Actualizar_aSolicitud();
        AS.setVisible(true);
    }//GEN-LAST:event_adActualizarSoliActionPerformed

    private void txtCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCerrarActionPerformed

        int respuesta = JOptionPane.showConfirmDialog(this,
            "¿Deseas cerrar sesión?", "Cerrar Sesión",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (respuesta == JOptionPane.YES_OPTION) {
            InicioSesion IS = new InicioSesion();
            IS.setVisible(true);
            this.setVisible(false);
            InicioSesion.id_usuario = 0;
            InicioSesion.nombre_usuario = null;
            InicioSesion.privilegio = 0;
            InicioSesion.id_departamento = 0;
        }
    }//GEN-LAST:event_txtCerrarActionPerformed

    private void txtSurtirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurtirActionPerformed
         int selectedRow = tableArticulo.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una solicitud para surtir.");
        return;
    }

    try {
        int id_solicitud = Integer.parseInt(tableArticulo.getValueAt(selectedRow, 0).toString());

        ResultSet rsSolicitud = crudArticulos.buscarIdSurtir(id_solicitud);

        boolean surtidoExitoso = true;

        while (rsSolicitud.next()) {
            int id_articulo = rsSolicitud.getInt("id_articulo");
            int cantidad_solicitada = rsSolicitud.getInt("cantidad");

            int existencia_actual = crudArticulos.obtenerExistenciaArticulo(id_articulo);

            if (existencia_actual >= cantidad_solicitada) {
                int nueva_existencia = existencia_actual - cantidad_solicitada;
                boolean actualizado = crudArticulos.updateExistenciaArticulo(id_articulo, nueva_existencia);

                if (!actualizado) {
                    surtidoExitoso = false;
                    JOptionPane.showMessageDialog(this, "Error al actualizar existencia del artículo ID: " + id_articulo);
                    break;
                }
            } else {
                surtidoExitoso = false;
                crudArticulos.updateSolicitudArticulos(id_solicitud, "Artículo no disponibles");
                JOptionPane.showMessageDialog(this, "No hay suficiente existencia para surtir el artículo ID: " + id_articulo);
                break;
            }
        }

        if (surtidoExitoso) {
            crudArticulos.updateSolicitudArticulos(id_solicitud, "Disponible para recolección");
            JOptionPane.showMessageDialog(this, "Solicitud surtida correctamente.");
        }

        actualizarTabla(); // Recarga la tabla

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al intentar surtir la solicitud: " + e.getMessage());
    }

    }//GEN-LAST:event_txtSurtirActionPerformed

    private void actualizarTabla() {
    ResultSet rs = crudArticulos.obtenerTodosArticulos();
    DefaultTableModel modelo = (DefaultTableModel) tableArticulo.getModel();
    modelo.setRowCount(0);  // Limpiar la tabla antes de llenarla con los nuevos resultados

    try {
        while (rs.next()) {
             modelo.addRow(new Object[]{rs.getInt("id_solicitud"),rs.getString("Usuario"),rs.getString("Articulo"),rs.getInt("cantidad"),rs.getDate("fecha_solicitud"),rs.getTime("hora"),rs.getString("estado")});
        }
    } catch (SQLException e) {
        System.out.println("Error al actualizar la tabla: " + e.getMessage());
    }
}
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
            java.util.logging.Logger.getLogger(Actualizar_aSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_aSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_aSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_aSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_aSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem adActualizarSoli;
    private javax.swing.JMenuItem adArticulos;
    private javax.swing.JMenuItem adConsulta;
    private javax.swing.JMenuItem adUsuarios;
    private javax.swing.JButton btnBuscarEstado;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JTable tableArticulo;
    private javax.swing.JMenuItem txtCerrar;
    private javax.swing.JButton txtSurtir;
    // End of variables declaration//GEN-END:variables
}
