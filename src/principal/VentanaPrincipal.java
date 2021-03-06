package principal;

import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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

        formularioNuevo = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        panelFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreNuevo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidoPaternoNuevo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoMaternoNuevo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefonoNuevo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDomicilioNuevo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboRelacion = new javax.swing.JComboBox<>();
        lblTipo = new javax.swing.JLabel();
        comboTipoNuevo = new javax.swing.JComboBox<>();
        lblEmpresa = new javax.swing.JLabel();
        txtEmpresaNuevo = new javax.swing.JTextField();
        lblArea = new javax.swing.JLabel();
        txtAreaNuevo = new javax.swing.JTextField();
        txtRubroNuevo = new javax.swing.JTextField();
        lblRubro = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGuardarNuevo = new javax.swing.JButton();
        btnCancelarNuevo = new javax.swing.JButton();
        formularioEditar = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        panelFormularioEditar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNombreEditar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtApellidoPaternoEditar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtApellidoMaternoEditar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelefonoEditar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDomicilioEditar = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        comboRelacionEditar = new javax.swing.JComboBox<>();
        lblTipoEditar = new javax.swing.JLabel();
        comboTipoEditar = new javax.swing.JComboBox<>();
        lblEmpresaEditar = new javax.swing.JLabel();
        txtEmpresaEditar = new javax.swing.JTextField();
        lblAreaEditar = new javax.swing.JLabel();
        txtAreaEditar = new javax.swing.JTextField();
        txtRubroEditar = new javax.swing.JTextField();
        lblRubroEditar = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnCancelarEditar = new javax.swing.JButton();
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

        formularioNuevo.setBounds(new java.awt.Rectangle(0, 0, 580, 520));
        formularioNuevo.setModal(true);
        formularioNuevo.setResizable(false);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        panelFormulario.setBackground(new java.awt.Color(255, 255, 255));
        panelFormulario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre: *");

        txtNombreNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Apellido Paterno: *");

        txtApellidoPaternoNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Apellido Materno: *");

        txtApellidoMaternoNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Teléfono: *");

        txtTelefonoNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Domicilio:");

        txtDomicilioNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Relación:");

        comboRelacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboRelacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Familiar / Amigo", "Compañero de trabajo" }));
        comboRelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRelacionActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipo.setText("Tipo:");

        comboTipoNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboTipoNuevo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Familiar", "Amigo" }));

        lblEmpresa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpresa.setText("Empresa:");
        lblEmpresa.setEnabled(false);

        txtEmpresaNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmpresaNuevo.setEnabled(false);

        lblArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblArea.setText("Área:");
        lblArea.setEnabled(false);

        txtAreaNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAreaNuevo.setEnabled(false);

        txtRubroNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRubroNuevo.setEnabled(false);

        lblRubro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRubro.setText("Rubro de la empresa: *");
        lblRubro.setEnabled(false);

        jLabel8.setText("* Campos obligatorios");

        javax.swing.GroupLayout panelFormularioLayout = new javax.swing.GroupLayout(panelFormulario);
        panelFormulario.setLayout(panelFormularioLayout);
        panelFormularioLayout.setHorizontalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(comboRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboTipoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmpresaNuevo)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArea)
                            .addComponent(txtAreaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRubroNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRubro)))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTelefonoNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombreNuevo, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panelFormularioLayout.createSequentialGroup()
                                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(txtApellidoPaternoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(txtApellidoMaternoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel6)
                                            .addComponent(txtDomicilioNuevo)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(panelFormularioLayout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(lblTipo))))
                            .addComponent(lblEmpresa))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelFormularioLayout.setVerticalGroup(
            panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoPaternoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoMaternoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefonoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDomicilioNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboRelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboTipoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioLayout.createSequentialGroup()
                        .addComponent(lblEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpresaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArea)
                            .addComponent(lblRubro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAreaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRubroNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnGuardarNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardarNuevo.setForeground(new java.awt.Color(0, 51, 0));
        btnGuardarNuevo.setText("Guardar");
        btnGuardarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarNuevoActionPerformed(evt);
            }
        });

        btnCancelarNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelarNuevo.setForeground(new java.awt.Color(102, 0, 0));
        btnCancelarNuevo.setText("Cancelar");
        btnCancelarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarNuevo)
                .addGap(40, 40, 40))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarNuevo)
                    .addComponent(btnCancelarNuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formularioNuevoLayout = new javax.swing.GroupLayout(formularioNuevo.getContentPane());
        formularioNuevo.getContentPane().setLayout(formularioNuevoLayout);
        formularioNuevoLayout.setHorizontalGroup(
            formularioNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formularioNuevoLayout.setVerticalGroup(
            formularioNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        formularioEditar.setBounds(new java.awt.Rectangle(0, 0, 580, 520));
        formularioEditar.setModal(true);
        formularioEditar.setResizable(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        panelFormularioEditar.setBackground(new java.awt.Color(255, 255, 255));
        panelFormularioEditar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Nombre: *");

        txtNombreEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Apellido Paterno: *");

        txtApellidoPaternoEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Apellido Materno: *");

        txtApellidoMaternoEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Teléfono: *");

        txtTelefonoEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Domicilio:");

        txtDomicilioEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDomicilioEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioEditarActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Relación:");

        comboRelacionEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboRelacionEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Familiar / Amigo", "Compañero de trabajo" }));
        comboRelacionEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRelacionEditarActionPerformed(evt);
            }
        });

        lblTipoEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipoEditar.setText("Tipo:");

        comboTipoEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboTipoEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Familiar", "Amigo" }));

        lblEmpresaEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpresaEditar.setText("Empresa:");
        lblEmpresaEditar.setEnabled(false);

        txtEmpresaEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmpresaEditar.setEnabled(false);

        lblAreaEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAreaEditar.setText("Área:");
        lblAreaEditar.setEnabled(false);

        txtAreaEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAreaEditar.setEnabled(false);

        txtRubroEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRubroEditar.setEnabled(false);

        lblRubroEditar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRubroEditar.setText("Rubro de la empresa: *");
        lblRubroEditar.setEnabled(false);

        jLabel15.setText("* Campos obligatorios");

        javax.swing.GroupLayout panelFormularioEditarLayout = new javax.swing.GroupLayout(panelFormularioEditar);
        panelFormularioEditar.setLayout(panelFormularioEditarLayout);
        panelFormularioEditarLayout.setHorizontalGroup(
            panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                        .addComponent(comboRelacionEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboTipoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEmpresaEditar)
                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                        .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAreaEditar)
                            .addComponent(txtAreaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRubroEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRubroEditar)))
                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                        .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                                .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtTelefonoEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombreEditar, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                                                .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel10)
                                                    .addComponent(txtApellidoPaternoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(txtApellidoMaternoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel13)
                                            .addComponent(txtDomicilioEditar)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(lblTipoEditar))))
                            .addComponent(lblEmpresaEditar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelFormularioEditarLayout.setVerticalGroup(
            panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoPaternoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoMaternoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefonoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDomicilioEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                        .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblTipoEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboRelacionEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboTipoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormularioEditarLayout.createSequentialGroup()
                        .addComponent(lblEmpresaEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpresaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFormularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAreaEditar)
                            .addComponent(lblRubroEditar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAreaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRubroEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 51, 0));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelarEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelarEditar.setForeground(new java.awt.Color(102, 0, 0));
        btnCancelarEditar.setText("Cancelar");
        btnCancelarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFormularioEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelarEditar)
                .addGap(40, 40, 40))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelFormularioEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnCancelarEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formularioEditarLayout = new javax.swing.GroupLayout(formularioEditar.getContentPane());
        formularioEditar.getContentPane().setLayout(formularioEditarLayout);
        formularioEditarLayout.setHorizontalGroup(
            formularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        formularioEditarLayout.setVerticalGroup(
            formularioEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libreta de direcciones");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

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
                "Nombre", "Apellido paterno", "Apellito materno", "Teléfono"
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

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));
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
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        panelInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        formularioNuevo.setLocationRelativeTo(null);
        formularioNuevo.setVisible(true);
    }//GEN-LAST:event_lblNuevoMouseClicked

    private void lblEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarMouseClicked
        if (lblEditar.isEnabled()) {
            System.out.println("Editando");
            Persona p = personas.get(tablacontactos.getSelectedRow());
            txtNombreEditar.setText(p.getNombre());
            txtApellidoPaternoEditar.setText(p.getApellidoPaterno());
            txtApellidoMaternoEditar.setText(p.getApellidoMaterno());
            txtTelefonoEditar.setText(p.getTelefono());
            txtDomicilioEditar.setText(p.getDomicilio());

            if (p instanceof Familiar) {
                comboRelacionEditar.setSelectedIndex(0);
                if (((Familiar) p).getTipo().equals("Familiar")) {
                    comboTipoEditar.setSelectedIndex(0);
                } else {
                    comboTipoEditar.setSelectedIndex(1);
                }
            } else {
                comboRelacionEditar.setSelectedIndex(1);
                txtEmpresaEditar.setText(((Companero) p).getEmpresa());
                txtAreaEditar.setText(((Companero) p).getArea());
                txtRubroEditar.setText(((Companero) p).getRubroEmpresa());
            }

            formularioEditar.setLocationRelativeTo(null);
            formularioEditar.setVisible(true);

        }
    }//GEN-LAST:event_lblEditarMouseClicked

    private void lblEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEliminarMouseClicked
        if (lblEliminar.isEnabled()) {
            int respuesta = JOptionPane.showConfirmDialog(null, "Estas a punto de eliminar el registro seleccionado. \nSeleccione Aceptar para confirmar.", "Advertencia", JOptionPane.OK_CANCEL_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                System.out.println("Eliminando");
                eliminar(tablacontactos.getSelectedRow());
            }

        }
    }//GEN-LAST:event_lblEliminarMouseClicked

    private void btnGuardarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarNuevoActionPerformed
        if (txtNombreNuevo.getText().equals("") || txtApellidoPaternoNuevo.getText().equals("") || txtApellidoMaternoNuevo.getText().equals("") || txtTelefonoNuevo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresa la información de todos los campos obligatorios.");
            return;
        }
        if (comboRelacion.getSelectedIndex() == 1 && txtRubroNuevo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresa la información de todos los campos obligatorios.");
            return;
        }
        System.out.println("listo");
        String query = "insert into persona(nombre, apellidoPaterno, apellidoMaterno, telefono, domicilio) values ('" + txtNombreNuevo.getText() + "','" + txtApellidoPaternoNuevo.getText() + "','" + txtApellidoMaternoNuevo.getText() + "','" + txtTelefonoNuevo.getText() + "','" + txtDomicilioNuevo.getText() + "')";
        System.out.println(query);
        ConexionMySQL.insertar(query);
        if (comboRelacion.getSelectedIndex() == 0) {
            query = "insert into familiar values(LAST_INSERT_ID(),'" + comboTipoNuevo.getSelectedItem().toString() + "')";
        } else {
            query = "insert into companero values(LAST_INSERT_ID(),'" + txtEmpresaNuevo.getText() + "','" + txtAreaNuevo.getText() + "','" + txtRubroNuevo.getText() + "')";

        }
        System.out.println(query);
        ConexionMySQL.insertar(query);
        JOptionPane.showMessageDialog(null, "Registro guardado!");
        formularioNuevo.setVisible(false);
        limpiarFormulario(panelFormulario);
        obtenerPersonas(ConexionMySQL.consultar(consulta));
        panelInfo.setText("");
    }//GEN-LAST:event_btnGuardarNuevoActionPerformed

    private void btnCancelarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNuevoActionPerformed
        formularioNuevo.setVisible(false);
        limpiarFormulario(panelFormulario);
    }//GEN-LAST:event_btnCancelarNuevoActionPerformed

    private void comboRelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRelacionActionPerformed
        boolean flag = false;
        if (comboRelacion.getSelectedIndex() == 0) {
            flag = true;
        }
        comboTipoNuevo.setEnabled(flag);
        lblTipo.setEnabled(flag);

        lblEmpresa.setEnabled(!flag);
        lblRubro.setEnabled(!flag);
        lblArea.setEnabled(!flag);

        txtEmpresaNuevo.setEnabled(!flag);
        txtRubroNuevo.setEnabled(!flag);
        txtAreaNuevo.setEnabled(!flag);
    }//GEN-LAST:event_comboRelacionActionPerformed

    private void comboRelacionEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRelacionEditarActionPerformed

        boolean flag = false;
        if (comboRelacionEditar.getSelectedIndex() == 0) {
            flag = true;
            txtRubroEditar.setText("");
            txtAreaEditar.setText("");
            txtEmpresaEditar.setText("");
        }
        comboTipoEditar.setEnabled(flag);

        lblTipoEditar.setEnabled(flag);

        lblEmpresaEditar.setEnabled(!flag);
        lblRubroEditar.setEnabled(!flag);
        lblAreaEditar.setEnabled(!flag);

        txtEmpresaEditar.setEnabled(!flag);
        txtRubroEditar.setEnabled(!flag);
        txtAreaEditar.setEnabled(!flag);
    }//GEN-LAST:event_comboRelacionEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Persona p;
        if (comboRelacionEditar.getSelectedIndex() == 0) {
            p = new Familiar(personas.get(tablacontactos.getSelectedRow()).getIdPersona(), txtNombreEditar.getText(), txtApellidoPaternoEditar.getText(), txtApellidoMaternoEditar.getText(), txtTelefonoEditar.getText(), txtDomicilioEditar.getText(), comboTipoEditar.getSelectedItem().toString());
            ConexionMySQL.editar("update persona set nombre = '" + p.getNombre() + "', apellidoPaterno='" + p.getApellidoPaterno() + "', apellidoMaterno='" + p.getApellidoMaterno() + "', telefono='" + p.getTelefono() + "', domicilio = '" + p.getDomicilio() + "' where idPersona = " + p.getIdPersona());
            ConexionMySQL.eliminar("delete from familiar where idFamiliar = " + p.getIdPersona());
            ConexionMySQL.eliminar("delete from companero where idCompanero = " + p.getIdPersona());
            ConexionMySQL.insertar("insert into familiar values(" + p.getIdPersona() + ", '" + ((Familiar) p).getTipo() + "')");
        } else {
            p = new Companero(personas.get(tablacontactos.getSelectedRow()).getIdPersona(), txtNombreEditar.getText(), txtApellidoPaternoEditar.getText(), txtApellidoMaternoEditar.getText(), txtTelefonoEditar.getText(), txtDomicilioEditar.getText(), txtEmpresaEditar.getText(), txtAreaEditar.getText(), txtRubroEditar.getText());
            ConexionMySQL.editar("update persona set nombre = '" + p.getNombre() + "', apellidoPaterno='" + p.getApellidoPaterno() + "', apellidoMaterno='" + p.getApellidoMaterno() + "', telefono='" + p.getTelefono() + "', domicilio = '" + p.getDomicilio() + "' where idPersona = " + p.getIdPersona());
            ConexionMySQL.eliminar("delete from familiar where idFamiliar = " + p.getIdPersona());
            ConexionMySQL.eliminar("delete from companero where idCompanero = " + p.getIdPersona());
            ConexionMySQL.insertar("insert into companero values(" + p.getIdPersona() + ", '" + ((Companero) p).getEmpresa() + "', '" + ((Companero) p).getArea() + "', '" + ((Companero) p).getRubroEmpresa() + "')");
        }
        JOptionPane.showMessageDialog(null, "Registro actualizado!");
        limpiarFormulario(panelFormularioEditar);
        formularioEditar.setVisible(false);
        obtenerPersonas(ConexionMySQL.consultar(consulta));
        panelInfo.setText("");

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEditarActionPerformed
        formularioEditar.setVisible(false);
        limpiarFormulario(panelFormularioEditar);
    }//GEN-LAST:event_btnCancelarEditarActionPerformed

    private void txtDomicilioEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioEditarActionPerformed

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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelarEditar;
    private javax.swing.JButton btnCancelarNuevo;
    private javax.swing.JButton btnGuardarNuevo;
    private javax.swing.JComboBox<String> comboRelacion;
    private javax.swing.JComboBox<String> comboRelacionEditar;
    private javax.swing.JComboBox<String> comboTipoEditar;
    private javax.swing.JComboBox<String> comboTipoNuevo;
    private javax.swing.JDialog formularioEditar;
    private javax.swing.JDialog formularioNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblAreaEditar;
    private javax.swing.JLabel lblEditar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblEmpresaEditar;
    private javax.swing.JLabel lblFamilia;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JLabel lblRubro;
    private javax.swing.JLabel lblRubroEditar;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipoEditar;
    private javax.swing.JLabel lblTodos;
    private javax.swing.JLabel lblTrabajo;
    private javax.swing.JPanel panelFormulario;
    private javax.swing.JPanel panelFormularioEditar;
    private javax.swing.JTextPane panelInfo;
    private javax.swing.JTable tablacontactos;
    private javax.swing.JTextField txtApellidoMaternoEditar;
    private javax.swing.JTextField txtApellidoMaternoNuevo;
    private javax.swing.JTextField txtApellidoPaternoEditar;
    private javax.swing.JTextField txtApellidoPaternoNuevo;
    private javax.swing.JTextField txtAreaEditar;
    private javax.swing.JTextField txtAreaNuevo;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDomicilioEditar;
    private javax.swing.JTextField txtDomicilioNuevo;
    private javax.swing.JTextField txtEmpresaEditar;
    private javax.swing.JTextField txtEmpresaNuevo;
    private javax.swing.JTextField txtNombreEditar;
    private javax.swing.JTextField txtNombreNuevo;
    private javax.swing.JTextField txtRubroEditar;
    private javax.swing.JTextField txtRubroNuevo;
    private javax.swing.JTextField txtTelefonoEditar;
    private javax.swing.JTextField txtTelefonoNuevo;
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

    public void activarSeccion(String categoria) { //da estilo a las secciones Todos, Familia y Trabajo
        switch (categoria) {
            case "todos":
                lblTodos.setBackground(Color.lightGray);
                lblFamilia.setBackground(Color.white);
                lblTrabajo.setBackground(Color.white);

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
        panelInfo.setText("");
    }

    private void mostrarInfoCompleta(int seleccion) {
        try {
            panelInfo.setContentType("text/html");
            ResultSet rs = ConexionMySQL.consultar("select count(*) from familiar where idFamiliar=" + personas.get(seleccion).getIdPersona());
            rs.next();
            if (rs.getInt(1) > 0) {
                rs = ConexionMySQL.consultar("select * from persona join familiar where idPersona = idFamiliar and idPersona = " + personas.get(seleccion).getIdPersona());
                rs.next();
                personas.set(seleccion, new Familiar(rs.getInt("idPersona"), rs.getString("nombre"), rs.getString("apellidoPaterno"), rs.getString("apellidoMaterno"), rs.getString("telefono"), rs.getString("domicilio"), rs.getString("tipo")));
            } else {

                rs = ConexionMySQL.consultar("select * from persona join companero where idPersona = idCompanero and idPersona = " + personas.get(seleccion).getIdPersona());
                rs.next();
                personas.set(seleccion, new Companero(rs.getInt("idPersona"), rs.getString("nombre"), rs.getString("apellidoPaterno"), rs.getString("apellidoMaterno"), rs.getString("telefono"), rs.getString("domicilio"), rs.getString("empresa"), rs.getString("area"), rs.getString("rubroEmpresa")));
            }
            panelInfo.setText(personas.get(seleccion).toString());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void eliminar(int seleccion) {
        ConexionMySQL.eliminar("delete from persona where idPersona = " + personas.get(seleccion).getIdPersona());
        obtenerPersonas(ConexionMySQL.consultar(consulta));
        panelInfo.setText("");
    }

    private void limpiarFormulario(JComponent formulario) {
        for (Component c : formulario.getComponents()) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }
        }

        for (Component c : formulario.getComponents()) {
            if (c instanceof JComboBox) {
                ((JComboBox) c).setSelectedIndex(0);
            }
        }

    }

}
