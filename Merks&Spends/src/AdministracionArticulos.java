import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdministracionArticulos extends javax.swing.JFrame {

    private articulosCRUD arcrud;
    
    public AdministracionArticulos() {
        initComponents();
        arcrud = new articulosCRUD();
        llenarTabla();
        
    }
    
    private void limpiarcampos(){
        txtNombre.setText("");
        cbxCategoria.setSelectedItem("Papelería");
        txaDescripcion.setText("");
        txtExistencia.setText("");
//        cbxPrivilegio.setSelectedItem("Administrador");
        txtId.setText("");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnBuscarId = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnTodos = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtExistencia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescripcion = new javax.swing.JTextArea();
        cbxCategoria = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        adUsuarios1 = new javax.swing.JMenuItem();
        adArticulos1 = new javax.swing.JMenuItem();
        adConsulta = new javax.swing.JMenuItem();
        adActualizarSoli = new javax.swing.JMenuItem();
        txtCerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administración Articulos");

        lblBienvenido.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("MERKS & SPENDS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35))
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Artículo", "Categoria", "Descripción", "Existencia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 700, 210));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnBuscarId.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnBuscarId.setText("Buscar ID");
        btnBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIdActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        btnTodos.setText("Mostrar Todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        btnBaja.setBackground(new java.awt.Color(204, 0, 0));
        btnBaja.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnBaja.setForeground(new java.awt.Color(255, 255, 255));
        btnBaja.setText("Dar de baja");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnAlta.setBackground(new java.awt.Color(51, 204, 0));
        btnAlta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnAlta.setForeground(new java.awt.Color(255, 255, 255));
        btnAlta.setText("Dar de alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 0));
        btnEditar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnBuscarId)
                .addGap(18, 18, 18)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTodos)
                .addGap(18, 18, 18)
                .addComponent(btnBaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnAlta)
                .addGap(26, 26, 26)
                .addComponent(btnEditar)
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTodos)
                    .addComponent(btnBaja)
                    .addComponent(btnAlta)
                    .addComponent(btnEditar))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 700, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Artículo:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Existencia:");

        jLabel5.setText("Categoria:");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setText("Descripción:");

        txaDescripcion.setColumns(20);
        txaDescripcion.setRows(5);
        jScrollPane2.setViewportView(txaDescripcion);

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Papelería", "Limpieza", "Cómputo", "Mobiliario" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 640, 150));

        jMenu1.setText("Menú");

        adUsuarios1.setText("Administración de usuarios");
        adUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adUsuarios1ActionPerformed(evt);
            }
        });
        jMenu1.add(adUsuarios1);

        adArticulos1.setText("Administración de artículos");
        adArticulos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adArticulos1ActionPerformed(evt);
            }
        });
        jMenu1.add(adArticulos1);

        adConsulta.setText("Administración de solicitudes");
        adConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(adConsulta);

        adActualizarSoli.setText("Actualizar solicitud");
        adActualizarSoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActualizarSoliActionPerformed(evt);
            }
        });
        jMenu1.add(adActualizarSoli);

        txtCerrar.setText("Cerrar sesión");
        txtCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(txtCerrar);

        jMenuBar1.add(jMenu1);

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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIdActionPerformed
        //1. obtener el valor del txt
        String idtext = txtId.getText();

        //2.Validar txt vacio
        if(idtext.isEmpty()){
            JOptionPane.showMessageDialog(this,"El id es obligatorio","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //3. Busqueda, llenado de la tabla
        try{
            int id = Integer.parseInt(idtext);
            ResultSet rs = arcrud.bucarporID(id);
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setRowCount(0);

            if(rs.next()){
                modelo.addRow(new Object[]{rs.getInt("id_articulo"),rs.getString("nombre"),rs.getString("c.nombre"),rs.getString("descripcion"),rs.getInt("existencia")});
                txtNombre.setText(rs.getString("nombre"));
                cbxCategoria.setSelectedItem(rs.getString("c.nombre"));
                txaDescripcion.setText(rs.getString("descripcion"));
                txtExistencia.setText(rs.getString("Existencia"));
                
            }else {
                JOptionPane.showMessageDialog(this, "No se encontró un articulo con ese ID", "Error", JOptionPane.WARNING_MESSAGE);

            }
        }
        catch(SQLException e){
            System.out.println("Error al llenar la tabla: "+e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarIdActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        //1. Guardamos en variables lo que se escribe el usuario
        String nom = txtNombre.getText();
        int cat = cbxCategoria.getSelectedIndex();
        String des = txaDescripcion.getText();
        String exi = txtExistencia.getText();

        //2. validar que no existan vacios
        if(nom.isEmpty() || des.isEmpty() || exi.isEmpty()){
            JOptionPane.showMessageDialog(this,"Todos los campos son obligatorios","Error en el formulario",JOptionPane.ERROR_MESSAGE);
            return;
        }

        //3. Procedemos a INSERTAR
        arcrud = new articulosCRUD();
        boolean status = arcrud.insertUsuario(nom,cat+1, des, exi);

        //4. Avisamos el status al Usuario del INSERT
        if(status){
            JOptionPane.showMessageDialog(this,"Articulo guardado con exito en base de datos","Registro exitoso",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this,"No se guardo","Error",JOptionPane.ERROR_MESSAGE);
        }
        limpiarcampos();

    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        llenarTabla();
        limpiarcampos();
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        //1. Guardamos en variables lo que se escribe el usuario
        String idtext = txtId.getText();

        if(idtext.isEmpty()){
            JOptionPane.showMessageDialog(this,"No se selecciono ningun artículo","Error al elimnar artículo",JOptionPane.ERROR_MESSAGE);
            return;
        }
        //3. Mostrar confirmación antes de actualizar
        int conf = JOptionPane.showConfirmDialog(this,
            "¿Estás seguro de que deseas eliminar este articulo? \n Se eliminaran todos los registros relacionados",
            "Confirmar exterminación",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if (conf == JOptionPane.YES_OPTION) {
            int id = Integer.parseInt(idtext);
            arcrud.deleteArticuloIdUsuario(id);
            boolean status = arcrud.deleteArticulo(id);

            if (status) {
                JOptionPane.showMessageDialog(this, "articulo eliminado con éxito en la base de datos", "Exterminación exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se elimino el articulo", "Error", JOptionPane.ERROR_MESSAGE);
            }
            limpiarcampos();
        }
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //1. Guardamos en variables lo que se escribe el usuario
        String nom = txtNombre.getText();
        int cat = cbxCategoria.getSelectedIndex();
        String des = txaDescripcion.getText();
        String exi = txtExistencia.getText();
        String idtext = txtId.getText();

        //2. validar que no existan vacios
       if(nom.isEmpty() ||  des.isEmpty() || exi.isEmpty()){
            JOptionPane.showMessageDialog(this,"Todos los campos son obligatorios","Error al editar artículo",JOptionPane.ERROR_MESSAGE);
            return;
        }

        //3. Mostrar confirmación antes de actualizar
        int conf = JOptionPane.showConfirmDialog(this,
            "¿Estás seguro de que deseas editar este artículo?",
            "Confirmar edición",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if (conf == JOptionPane.YES_OPTION) {
            int id = Integer.parseInt(idtext);
            boolean status = arcrud.updateArticulo(nom, cat+1, des, exi, id);

            if (status) {
                JOptionPane.showMessageDialog(this, "Articulo actualizado con éxito en la base de datos", "Edición exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se guardó", "Error", JOptionPane.ERROR_MESSAGE);
            }
            limpiarcampos();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void adUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adUsuarios1ActionPerformed
        Administracion_Usuarios AU = new  Administracion_Usuarios();
        AU.setVisible(true);
    }//GEN-LAST:event_adUsuarios1ActionPerformed

    private void adArticulos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adArticulos1ActionPerformed
        AdministracionArticulos AA = new AdministracionArticulos();
        AA.setVisible(true);
    }//GEN-LAST:event_adArticulos1ActionPerformed

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

    
    private void llenarTabla(){
        ResultSet todos = arcrud.obtenerTodos();
        DefaultTableModel modeloT = (DefaultTableModel) jTable1.getModel();
        modeloT.setRowCount(0);
        
        try{
            while(todos.next()){
                modeloT.addRow(new Object[]{todos.getInt("id_articulo"),todos.getString("nombre"),todos.getString("c.nombre"),todos.getString("descripcion"),todos.getInt("existencia")});
            }
        }
        catch(SQLException x){
            System.out.println("Error al llenar la tabla"+x.getMessage());
        }
    }
    
    
    //Main------------------------------------------------------------------------------------------------------------------------
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
            java.util.logging.Logger.getLogger(AdministracionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracionArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministracionArticulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem adActualizarSoli;
    private javax.swing.JMenuItem adArticulos1;
    private javax.swing.JMenuItem adConsulta;
    private javax.swing.JMenuItem adUsuarios1;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnBuscarId;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JTextArea txaDescripcion;
    private javax.swing.JMenuItem txtCerrar;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
