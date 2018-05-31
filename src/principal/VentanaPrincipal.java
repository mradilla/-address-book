package principal;

import com.mysql.jdbc.MySQLConnection;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mradilla
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    ArrayList<Persona> personas;
    String consulta;

    public VentanaPrincipal() {

        initComponents();
        ConexionMySQL.conectar();
        setLocationRelativeTo(null);
        aplicarFormatoTabla();
        mostrarContactos("todos");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTodos = new javax.swing.JLabel();
        lblFamilia = new javax.swing.JLabel();
        lblTrabajo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacontactos = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblNuevo = new javax.swing.JLabel();
        lblEditar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtBuscar = new javax.swing.JTextField();
        lblEliminar = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelInfo = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libreta de direcciones");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblTodos.setBackground(new java.awt.Color(255, 255, 255));
        lblTodos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder.png"))); // NOI18N
        lblTodos.setText("   Todos");
        lblTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTodos.setOpaque(true);
        lblTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTodosMouseClicked(evt);
            }
        });

        lblFamilia.setBackground(new java.awt.Color(255, 255, 255));
        lblFamilia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFamilia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder.png"))); // NOI18N
        lblFamilia.setText("   Familia");
        lblFamilia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFamilia.setOpaque(true);
        lblFamilia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFamiliaMouseClicked(evt);
            }
        });

        lblTrabajo.setBackground(new java.awt.Color(255, 255, 255));
        lblTrabajo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTrabajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder.png"))); // NOI18N
        lblTrabajo.setText("   Trabajo");
        lblTrabajo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTrabajo.setOpaque(true);
        lblTrabajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTrabajoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addComponent(lblFamilia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tablacontactos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablacontactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido Paterno", "Apellido Materno", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablacontactos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablacontactos.setGridColor(new java.awt.Color(255, 255, 255));
        tablacontactos.setSelectionBackground(new java.awt.Color(153, 204, 255));
        tablacontactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablacontactosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablacontactos);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/new.png"))); // NOI18N
        lblNuevo.setToolTipText("Nuevo");
        lblNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevoMouseClicked(evt);
            }
        });

        lblEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        lblEditar.setToolTipText("Editar");
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditar.setEnabled(false);
        lblEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/research.png"))); // NOI18N
        jLabel3.setToolTipText("Eliminar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscar.setToolTipText("Búsqueda por nombre o apellidos");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        lblEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        lblEliminar.setToolTipText("Eliminar");
        lblEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEliminar.setEnabled(false);
        lblEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(lblNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(116, 116, 116)
                    .addComponent(lblEliminar)
                    .addContainerGap(455, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        panelInfo.setEditable(false);
        jScrollPane3.setViewportView(panelInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(0, 0, 0))))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased

        buscar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void lblTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTodosMouseClicked

        mostrarContactos("todos");

    }//GEN-LAST:event_lblTodosMouseClicked

    private void lblTrabajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrabajoMouseClicked
        mostrarContactos("trabajo");
    }//GEN-LAST:event_lblTrabajoMouseClicked

    private void lblFamiliaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFamiliaMouseClicked
        mostrarContactos("familia");
    }//GEN-LAST:event_lblFamiliaMouseClicked

    private void tablacontactosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacontactosMousePressed

        lblEditar.setEnabled(true);
        lblEliminar.setEnabled(true);
        mostrarInfoCompleta(tablacontactos.getSelectedRow());
    }//GEN-LAST:event_tablacontactosMousePressed

    private void lblNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoMouseClicked
    
    }//GEN-LAST:event_lblNuevoMouseClicked

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        if(lblEditar.isEnabled()){
                System.out.println("Editando");
        }
    }//GEN-LAST:event_lblEditarMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        if(lblEliminar.isEnabled()){
            System.out.println("Eliminando");
            eliminar(tablacontactos.getSelectedRow());
        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblFamilia;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JLabel lblTodos;
    private javax.swing.JLabel lblTrabajo;
    private javax.swing.JTextPane panelInfo;
    private javax.swing.JTable tablacontactos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void aplicarFormatoTabla() {
        tablacontactos.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 14)); //da formato a la cabecera de la tabla

    }

    public void mostrarContactos(String categoria) {
        consulta = "select * from persona";
        switch (categoria) {
            case "familia":
                consulta += " join familiar where idPersona = idFamiliar";
                break;
            case "trabajo":
                consulta += " join companero where idPersona = idCompanero";
        }
        System.out.println(consulta);
        obtenerPersonas(ConexionMySQL.consultar(consulta));
        activarSeccion(categoria);
        txtBuscar.setText("");
        panelInfo.setText("");
        lblEditar.setEnabled(false);
        lblEliminar.setEnabled(false);
    }

    private void obtenerPersonas(ResultSet rs) {
        try {
            personas = new ArrayList<>();
            while (rs.next()) {
                personas.add(new Persona(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        cargarTabla(personas);
    }

    private void buscar(String text) {
        String consultaBusqueda = consulta;
        if (consulta.contains("where")) {
            consultaBusqueda += " and ";
        } else {
            consultaBusqueda += " where ";
        }
        consultaBusqueda += " (nombre like '%" + text + "%' or apellidoPaterno like '%" + text + "%' or apellidoMaterno like '%" + text + "%')";
        System.out.println(consultaBusqueda);
        obtenerPersonas(ConexionMySQL.consultar(consultaBusqueda));
    }

    public void activarSeccion(String categoria) {
        switch (categoria) {
            case "todos":
                lblTodos.setBackground(Color.lightGray);
                lblFamilia.setBackground(Color.white);
                lblTrabajo.setBackground(Color.white);
                System.out.println("grey");
                break;
            case "familia":
                lblTodos.setBackground(Color.white);
                lblFamilia.setBackground(Color.lightGray);
                lblTrabajo.setBackground(Color.white);
                break;
            case "trabajo":
                lblTodos.setBackground(Color.white);
                lblFamilia.setBackground(Color.white);
                lblTrabajo.setBackground(Color.lightGray);
        }
    }

    private void cargarTabla(ArrayList<Persona> personas) {
        DefaultTableModel model = (DefaultTableModel) tablacontactos.getModel();
        model.setRowCount(0);
        for (Persona p : personas) {
            model.addRow(new Object[]{p.getNombre(), p.getApellidoPaterno(), p.getApellidoMaterno(), p.getTelefono()});
        }
    }

    private void mostrarInfoCompleta(int seleccion) {
        try {
            panelInfo.setContentType("text/html");
            ResultSet rs = ConexionMySQL.consultar("select count(*) from familiar where idFamiliar=" + personas.get(seleccion).getIdPersona());
            rs.next();
            if (rs.getInt(1) > 0) {
                System.out.println("es familiar");
                rs = ConexionMySQL.consultar("select * from persona join familiar where idPersona = idFamiliar and idPersona = " + personas.get(seleccion).getIdPersona());
                rs.next();
                personas.set(seleccion, new Familiar(rs.getInt("idPersona"), rs.getString("nombre"), rs.getString("apellidoPaterno"), rs.getString("apellidoMaterno"), rs.getString("telefono"), rs.getString("domicilio"), rs.getString("tipo")));
            } else {
                System.out.println("es del trabajo");
                rs = ConexionMySQL.consultar("select * from persona join companero where idPersona = idCompanero and idPersona = " + personas.get(seleccion).getIdPersona());
                rs.next();

                personas.set(seleccion, new Companero(rs.getInt("idPersona"), rs.getString("nombre"), rs.getString("apellidoPaterno"), rs.getString("apellidoMaterno"), rs.getString("telefono"), rs.getString("domicilio"), rs.getString("empresa"), rs.getString("area"), rs.getString("rubroEmpresa")));
            }
            panelInfo.setText(personas.get(seleccion).toString());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void eliminar(int selectedRow) {
    
    }

}
