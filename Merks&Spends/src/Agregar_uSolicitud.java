import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Agregar_uSolicitud extends javax.swing.JFrame {

    private UserCRUD crud;
    private solicitudCRUD crudArticulos;
    
    public Agregar_uSolicitud() {
        initComponents();
        this.crud= new UserCRUD();
        this.crudArticulos = new solicitudCRUD();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAgregarArti1 = new javax.swing.JButton();
        btnLimpiarArti1 = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdArticulo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtBuscarIdArticulo = new javax.swing.JTextField();
        btnBuscarIdArticulo = new javax.swing.JButton();
        btnBuscarTodosArti = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableArticulo = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        usInventario = new javax.swing.JMenuItem();
        usAgregarSoli = new javax.swing.JMenuItem();
        txtCerrar = new javax.swing.JMenuItem();

        jLabel1.setText("Estado de la solicitud:");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agregar solicitud de artículos");

        lblBienvenido.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("MERKS & SPENDS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblBienvenido))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAgregarArti1.setText("Crear solicitud");
        btnAgregarArti1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarArti1ActionPerformed(evt);
            }
        });

        btnLimpiarArti1.setText("Limpiar");
        btnLimpiarArti1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarArti1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Cantidad:");

        jLabel8.setText("Id del artículo");

        jButton1.setText("Mis solicitudes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnAgregarArti1)
                        .addGap(83, 83, 83)
                        .addComponent(btnLimpiarArti1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(txtIdArticulo))))
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtIdArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarArti1)
                    .addComponent(btnLimpiarArti1))
                .addGap(99, 99, 99))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 640, 160));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Buscar por Id la solicitud del articulo");

        txtBuscarIdArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarIdArticuloActionPerformed(evt);
            }
        });

        btnBuscarIdArticulo.setText("Buscar por id");
        btnBuscarIdArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdArticuloActionPerformed(evt);
            }
        });

        btnBuscarTodosArti.setText("Buscar todos");
        btnBuscarTodosArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTodosArtiActionPerformed(evt);
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
                "ID", "Usuario", "Artículo", "Cantidad", "Fecha", "Hora", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tableArticulo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarIdArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarIdArticulo)
                .addGap(27, 27, 27)
                .addComponent(btnBuscarTodosArti)
                .addContainerGap(38, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscarIdArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarIdArticulo)
                    .addComponent(btnBuscarTodosArti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 640, 180));

        jMenu2.setText("Menú");

        usInventario.setText("Inventario");
        usInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usInventarioActionPerformed(evt);
            }
        });
        jMenu2.add(usInventario);

        usAgregarSoli.setText("Agregar solicitud");
        usAgregarSoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usAgregarSoliActionPerformed(evt);
            }
        });
        jMenu2.add(usAgregarSoli);

        txtCerrar.setText("Cerrar sesión");
        txtCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCerrarActionPerformed(evt);
            }
        });
        jMenu2.add(txtCerrar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarArti1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarArti1ActionPerformed
     
        try {
            LocalTime horaActual = LocalTime.now();
            LocalDate fechaActual = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            
            int cantidad = Integer.parseInt(txtCantidad.getText());
            String fecha = fechaActual.format(formatter);
            String hora = horaActual.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"));
            //String estado = cbEstado.getSelectedItem().toString();
            int idUsuario = InicioSesion.id_usuario;
            
            int idArti = Integer.parseInt(txtIdArticulo.getText());

            // Insertar solicitud usando el CRUD
            if (crudArticulos.insertSolicitudArticulos(cantidad, fecha, hora, "En proceso", idUsuario, idArti)) {
                JOptionPane.showMessageDialog(this, "Solicitud creada correctamente.");
                // Aquí puedes recargar la tabla si tienes una
            } else {
                JOptionPane.showMessageDialog(this, "Error al crear la solicitud.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Verifica que la cantidad y el ID de usuario sean numéricos.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarArti1ActionPerformed

    private void btnLimpiarArti1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarArti1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarArti1ActionPerformed

    private void usInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usInventarioActionPerformed
        Inventario IN = new  Inventario();
        IN.setVisible(true);
    }//GEN-LAST:event_usInventarioActionPerformed

    private void usAgregarSoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usAgregarSoliActionPerformed
        Agregar_uSolicitud AS = new  Agregar_uSolicitud();
        AS.setVisible(true);
    }//GEN-LAST:event_usAgregarSoliActionPerformed

    private void txtBuscarIdArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarIdArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarIdArticuloActionPerformed

    private void btnBuscarIdArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdArticuloActionPerformed

        String idtext = txtBuscarIdArticulo.getText();
        //2. validar txt vacio
        if(idtext.isEmpty()){
            JOptionPane.showMessageDialog(this, "El Id es obligatorrio", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //3.Busqueda, llenado de la tabla
        try{
            int id= Integer.parseInt(idtext);
            ResultSet rs= crudArticulos.buscarporIdArticulo(id);
            DefaultTableModel modelo = (DefaultTableModel) tableArticulo.getModel();
            modelo.setRowCount(0);

            if(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("id_solicitud"),rs.getString("Usuario"),rs.getString("Articulo"),rs.getInt("cantidad"),rs.getDate("fecha_solicitud"),rs.getTime("hora"),rs.getString("estado")});
            }
            else {
                JOptionPane.showMessageDialog(this, "No se encontró ninguna solicitud con ese ID.");
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException e) {
            System.out.println("Error al llenar la tabla: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error al buscar en la base de datos.");
        }
    }//GEN-LAST:event_btnBuscarIdArticuloActionPerformed

    private void btnBuscarTodosArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTodosArtiActionPerformed
        // TODO add your handling code here:
        ResultSet rs= crudArticulos.obtenerTodosArticulos();
        DefaultTableModel modelo= (DefaultTableModel) tableArticulo.getModel();
        modelo.setNumRows(0);

        try{
            while(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("id_solicitud"),rs.getString("Usuario"),rs.getString("Articulo"),rs.getInt("cantidad"),rs.getDate("fecha_solicitud"),rs.getTime("hora"),rs.getString("estado")});
            }
        }
        catch(SQLException x){
            System.out.print("Error al llenar la tabla"+ x.getMessage());
        }
    }//GEN-LAST:event_btnBuscarTodosArtiActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String idtext = InicioSesion.nombre_usuario;
        

        //3.Busqueda, llenado de la tabla
        try{
 
            ResultSet rs= crudArticulos.buscarporNombreU(idtext);
            DefaultTableModel modelo = (DefaultTableModel) tableArticulo.getModel();
            modelo.setRowCount(0);

            if(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("id_solicitud"),rs.getString("Usuario"),rs.getString("Articulo"),rs.getInt("cantidad"),rs.getDate("fecha_solicitud"),rs.getTime("hora"),rs.getString("estado")});
            }
            else {
                JOptionPane.showMessageDialog(this, "No se encontró ninguna solicitud con ese ID.");
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (SQLException e) {
            System.out.println("Error al llenar la tabla: " + e.getMessage());
            JOptionPane.showMessageDialog(this, "Error al buscar en la base de datos.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_uSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_uSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_uSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_uSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_uSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarArti1;
    private javax.swing.JButton btnBuscarIdArticulo;
    private javax.swing.JButton btnBuscarTodosArti;
    private javax.swing.JButton btnLimpiarArti1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JTable tableArticulo;
    private javax.swing.JTextField txtBuscarIdArticulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JMenuItem txtCerrar;
    private javax.swing.JTextField txtIdArticulo;
    private javax.swing.JMenuItem usAgregarSoli;
    private javax.swing.JMenuItem usInventario;
    // End of variables declaration//GEN-END:variables
}
