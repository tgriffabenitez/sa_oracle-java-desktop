
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import model.Employee;
import model.SaveResult;
import service.EmployeeDAOImpl;


public class TablaEmployee extends javax.swing.JFrame {
   
    public TablaEmployee() {
        initComponents();
        cargarEmpleados();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public TablaEmployee(MenuInicio menuInicio) {
        initComponents();
        this.menuInicio = menuInicio;
        cargarEmpleados();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
       
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel bg = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel editClient = new javax.swing.JPanel();
        javax.swing.JLabel textNombre = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        javax.swing.JLabel textApellido = new javax.swing.JLabel();
        inputApellido = new javax.swing.JTextField();
        javax.swing.JLabel textEmail = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        javax.swing.JLabel textTelefono = new javax.swing.JLabel();
        inputTelefono = new javax.swing.JTextField();
        inputContratado = new javax.swing.JTextField();
        javax.swing.JLabel textContatado = new javax.swing.JLabel();
        javax.swing.JButton btnAgregar = new javax.swing.JButton();
        javax.swing.JButton btnLimpiar = new javax.swing.JButton();
        javax.swing.JLabel textJobId = new javax.swing.JLabel();
        inputJobId = new javax.swing.JTextField();
        javax.swing.JLabel textSalario = new javax.swing.JLabel();
        inputSalario = new javax.swing.JTextField();
        javax.swing.JLabel textComision = new javax.swing.JLabel();
        inputComision = new javax.swing.JTextField();
        javax.swing.JLabel textManagerId = new javax.swing.JLabel();
        inputManagerId = new javax.swing.JTextField();
        inputDepartmentId = new javax.swing.JTextField();
        javax.swing.JLabel textDepartmentId = new javax.swing.JLabel();
        javax.swing.JButton btnBorrar = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        bg.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        jLabel1.setText("Tabla Employee");

        editClient.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Employee", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N
        editClient.setOpaque(false);

        textNombre.setText("Nombre");

        textApellido.setText("Apellido");

        textEmail.setText("Email");

        textTelefono.setText("Telefono");

        textContatado.setText("Contratado");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnAgregar.setText("Add");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editing.png"))); // NOI18N
        btnLimpiar.setText("Clear");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        textJobId.setText("Job ID");

        textSalario.setText("Salario");

        textComision.setText("Comision (%)");

        textManagerId.setText("Manager ID");

        textDepartmentId.setText("Department ID");

        javax.swing.GroupLayout editClientLayout = new javax.swing.GroupLayout(editClient);
        editClient.setLayout(editClientLayout);
        editClientLayout.setHorizontalGroup(
            editClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editClientLayout.createSequentialGroup()
                .addGroup(editClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editClientLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(textContatado, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editClientLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(textTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editClientLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editClientLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(textApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editClientLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editClientLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(editClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editClientLayout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editClientLayout.createSequentialGroup()
                                .addGroup(editClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textJobId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textSalario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textComision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textManagerId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textDepartmentId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(inputDepartmentId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputManagerId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputComision, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputSalario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputJobId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputContratado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        editClientLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAgregar, btnLimpiar});

        editClientLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {textApellido, textContatado, textEmail, textNombre, textTelefono});

        editClientLayout.setVerticalGroup(
            editClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editClientLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(textNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textContatado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputContratado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textJobId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputJobId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textComision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textManagerId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textDepartmentId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(editClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        editClientLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAgregar, btnLimpiar});

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bin.png"))); // NOI18N
        btnBorrar.setText("Eliminar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Email", "Telefono", "Contratado", "Job ID", "Salario", "Comision %", "Manager ID", "Departamento ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCliente);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/editing.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(editClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1113, Short.MAX_VALUE))))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
            inputNombre.setText("");
            inputApellido.setText("");
            inputEmail.setText("");
            inputTelefono.setText("");
            inputContratado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Obtengo los datos de los campos de texto
        String nombre = inputNombre.getText();
        String apellido = inputApellido.getText();
        String email = inputEmail.getText();
        String telefono = inputTelefono.getText();
        String fechaContratacion = inputContratado.getText();
        String jobId = inputJobId.getText();
        String salario = inputSalario.getText();
        String comision = inputComision.getText();
        String managerId = inputManagerId.getText();
        String departamentoId = inputDepartmentId.getText();
        
        // verifico si algun campo esta vacio
        if( nombre.isEmpty() 
                || apellido.isEmpty() 
                || email.isEmpty() 
                || telefono.isEmpty() 
                || fechaContratacion.isEmpty()
                || jobId.isEmpty()
                || salario.isEmpty()
                || comision.isEmpty()
                || managerId.isEmpty()
                || departamentoId.isEmpty()
            ){
            JOptionPane.showMessageDialog(this,
                    "Verifique los campos ingresados",
                    "Intente nuevamente",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tablaCliente.getModel();
            
            Employee employee = new Employee();
            employee.setFirstName(nombre);
            employee.setLastName(apellido);
            employee.setEmail(email);
            employee.setPhoneNumber(telefono);
            employee.setJobId(jobId);
            
            employee.setSalary(convertToDouble(salario, "El salario"));
            employee.setCommissionPct(convertToDouble(comision, "La comision"));
            employee.setManagerId(convertToLong(managerId, "El ID del manager"));
            employee.setDepartmentId(convertToLong(departamentoId, "El ID del departamento"));
            employee.setHireDate(Date.valueOf(parseDate(fechaContratacion, "yyyy-MM-dd", "la fecha de contratación")));


            
            try {
                darAltaEmpleado(employee);
                
            } catch (SQLException ex) {
                Logger.getLogger(TablaEmployee.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this,
                "Error al conectar a la base de datos:\n" + ex.getMessage(),
                 "Error",
                 JOptionPane.ERROR_MESSAGE);
            }       
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int filaSeleccionada = tablaCliente.getSelectedRow();

        if (filaSeleccionada < 0) {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado un registro", "Seleccione el registro", JOptionPane.ERROR_MESSAGE);
        } else {
            Long empleadoId = (Long) tablaCliente.getValueAt(filaSeleccionada, 0); // Obtener el ID del empleado de la primera columna (suponiendo que es la columna 0)

            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar al empleado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl(menuInicio.usuario, menuInicio.ip, menuInicio.puerto);
                SaveResult resultado = employeeDAOImpl.delete(empleadoId);

                if (resultado.getSuccess()) {
                    DefaultTableModel model = (DefaultTableModel) tablaCliente.getModel();
                    actualizarTabla();
                    JOptionPane.showMessageDialog(this, resultado.getMessage(), "Empleado eliminado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, resultado.getMessage(), "Error al eliminar empleado", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
    }//GEN-LAST:event_formWindowClosing

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        int filaSeleccionada = tablaCliente.getSelectedRow();
        
        if(filaSeleccionada < 0) {
            JOptionPane.showMessageDialog(this, "No selecciono un resgistro", "Seleccione el registro", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tablaCliente.getModel();
            
            String employeeId = model.getValueAt(filaSeleccionada, 0).toString();
            String firstName = model.getValueAt(filaSeleccionada, 1).toString();
            String lastName = model.getValueAt(filaSeleccionada, 2).toString();
            String email = model.getValueAt(filaSeleccionada, 3).toString();
            String phoneNumber = model.getValueAt(filaSeleccionada, 4).toString();
            String hireDate = model.getValueAt(filaSeleccionada, 5).toString();
            String jobId = model.getValueAt(filaSeleccionada, 6).toString();
            String salary = model.getValueAt(filaSeleccionada, 7).toString();
            String commissionPct = model.getValueAt(filaSeleccionada, 8).toString();
            String managerId = model.getValueAt(filaSeleccionada, 9).toString();
            String departmentId = model.getValueAt(filaSeleccionada, 10).toString();
            
            ModificarEmployee modificarFrame = new ModificarEmployee(this, filaSeleccionada,
                    employeeId,
                    firstName,
                    lastName,
                    email,
                    phoneNumber,
                    hireDate,
                    jobId,
                    salary,
                    commissionPct,
                    managerId,
                    departmentId,
                    menuInicio
            );
            modificarFrame.setVisible(true);
            actualizarTabla();
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    public void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaCliente.getModel();
        model.setRowCount(0); // Eliminar todas las filas existentes
        cargarEmpleados(); // Cargar los nuevos datos
        tablaCliente.repaint(); // Forzar actualización visual
    }
    
    private void cargarEmpleados(){ 
        try {            
            EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl(menuInicio.usuario, menuInicio.ip, menuInicio.puerto);
            List<Employee> employees = employeeDAOImpl.getAll();
            
            DefaultTableModel model = (DefaultTableModel) tablaCliente.getModel();
            model.setRowCount(0);
            for (Employee empleado : employees) {
                model.addRow(new Object[] {
                    empleado.getEmployeeId(),
                    empleado.getFirstName(),
                    empleado.getLastName(),
                    empleado.getEmail(),
                    empleado.getPhoneNumber(),
                    empleado.getHireDate(),
                    empleado.getJobId(),
                    empleado.getSalary(),
                    empleado.getCommissionPct(),
                    empleado.getManagerId(),
                    empleado.getDepartmentId()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "Error al conectar a la base de datos:\n" + e.getMessage(),
                 "Error de conexión",
                 JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void darAltaEmpleado(Employee employee) throws SQLException{
        EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl(menuInicio.usuario, menuInicio.ip, menuInicio.puerto);
        SaveResult resultado = employeeDAOImpl.save(employee);
       
        try {
            if (resultado.getSuccess()) {
                inputNombre.setText("");
                inputApellido.setText("");
                inputEmail.setText("");
                inputTelefono.setText("");
                inputContratado.setText("");
                inputJobId.setText("");
                inputSalario.setText("");
                inputComision.setText("");
                inputManagerId.setText("");
                inputDepartmentId.setText("");
                cargarEmpleados();
            } else {
                JOptionPane.showMessageDialog(this, resultado.getMessage(), "Error de alta", JOptionPane.ERROR_MESSAGE);
            } 
        }catch(Exception e){
             JOptionPane.showMessageDialog(this,
                "Error al conectar a la base de datos:\n" + e.getMessage(),
                 "Error",
                 JOptionPane.ERROR_MESSAGE);
        }   
    }  

    private Double convertToDouble(String value, String fieldName) {
        try {
            return Double.valueOf(value);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                fieldName + " tiene que ser un numero:\n " + ex.getMessage(),
                "Error de formato",
                JOptionPane.ERROR_MESSAGE);
            return null;  // o algún valor predeterminado en caso de error
        }
    }
    
    private Long convertToLong(String value, String fieldName) {
        try {
            return Long.valueOf(value);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                fieldName + " tiene que ser un numero:\n " + ex.getMessage(),
                "Error de formato",
                JOptionPane.ERROR_MESSAGE);
            return null;  // o algún valor predeterminado en caso de error
        }
    }
    
    private LocalDate parseDate(String value, String format, String fieldName) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            LocalDate date = LocalDate.parse(value, formatter);
            return date;
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this,
                "Error al convertir " + fieldName + " a fecha. Utilice el formato " + format,
                "Error de formato",
                JOptionPane.ERROR_MESSAGE);
            return null;  // o alguna fecha predeterminada en caso de error
        }
    }

    public void altaEmpleadoModificado(Employee employee) throws SQLException{
        darAltaEmpleado(employee);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    public javax.swing.JTextField inputApellido;
    private javax.swing.JTextField inputComision;
    private javax.swing.JTextField inputContratado;
    private javax.swing.JTextField inputDepartmentId;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputJobId;
    private javax.swing.JTextField inputManagerId;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputSalario;
    private javax.swing.JTextField inputTelefono;
    public javax.swing.JTable tablaCliente;
    // End of variables declaration//GEN-END:variables
    private MenuInicio menuInicio;
}
