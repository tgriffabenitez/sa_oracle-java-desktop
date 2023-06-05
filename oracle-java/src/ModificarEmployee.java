
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Employee;
import model.SaveResult;
import service.EmployeeDAOImpl;


public class ModificarEmployee extends javax.swing.JFrame {
    
    public ModificarEmployee() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public ModificarEmployee(
            TablaEmployee tablaEmployee,
            int filaSeleccionada,
            String employeeId,
            String firstName,
            String lastName,
            String email,
            String phoneNumber,
            String hireDate,
            String jobId,
            String salary,
            String commissionPct,
            String managerId,
            String departmentId,
            MenuInicio menuInicio
            
     ){
        initComponents();
        inputModificarID.setText(employeeId);
        inputModificarNombre.setText(firstName);
        inputModificarApellido.setText(lastName);
        inputModificarEmail.setText(email);
        inputModificarTelefono.setText(phoneNumber);
        inputModificarContratado.setText(hireDate);
        inputModificarJobId.setText(jobId);
        inputModificarSalario.setText(salary);
        inputModificarComision.setText(commissionPct);
        inputModificarManagerId.setText(managerId);
        inputModificarDepartamentoId.setText(departmentId);
        this.menuInicio = menuInicio;
        this.tablaEmployee = tablaEmployee;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textModificarContratado = new javax.swing.JPanel();
        txtModificarID = new javax.swing.JLabel();
        inputModificarID = new javax.swing.JTextField();
        txtModificarNombre = new javax.swing.JLabel();
        inputModificarNombre = new javax.swing.JTextField();
        inputModificarEmail = new javax.swing.JTextField();
        txtModificarEmail = new javax.swing.JLabel();
        inputModificarApellido = new javax.swing.JTextField();
        txtModificarApellido = new javax.swing.JLabel();
        inputModificarTelefono = new javax.swing.JTextField();
        txtModificarTelefono = new javax.swing.JLabel();
        btnAceptarModificacion = new javax.swing.JButton();
        btnCancelarModificacion = new javax.swing.JButton();
        txtModificarContatado = new javax.swing.JLabel();
        inputModificarContratado = new javax.swing.JTextField();
        txtModificarJobId = new javax.swing.JLabel();
        inputModificarJobId = new javax.swing.JTextField();
        txtModificarSalario = new javax.swing.JLabel();
        inputModificarSalario = new javax.swing.JTextField();
        txtModificarComision = new javax.swing.JLabel();
        inputModificarComision = new javax.swing.JTextField();
        txtModificarManagerId = new javax.swing.JLabel();
        inputModificarManagerId = new javax.swing.JTextField();
        txtModificarDepartamentoId = new javax.swing.JLabel();
        inputModificarDepartamentoId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        textModificarContratado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Empleado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtModificarID.setText("ID");

        inputModificarID.setEditable(false);
        inputModificarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputModificarIDActionPerformed(evt);
            }
        });

        txtModificarNombre.setText("Nombre");

        inputModificarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputModificarNombreActionPerformed(evt);
            }
        });

        txtModificarEmail.setText("Email");

        txtModificarApellido.setText("Apellido");

        txtModificarTelefono.setText("Telefono");

        btnAceptarModificacion.setText("Aceptar");
        btnAceptarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarModificacionActionPerformed(evt);
            }
        });

        btnCancelarModificacion.setText("Cancelar");
        btnCancelarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarModificacionActionPerformed(evt);
            }
        });

        txtModificarContatado.setText("Contratado");

        inputModificarContratado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputModificarContratadoActionPerformed(evt);
            }
        });

        txtModificarJobId.setText("Job ID");

        inputModificarJobId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputModificarJobIdActionPerformed(evt);
            }
        });

        txtModificarSalario.setText("Salario");

        txtModificarComision.setText("Comision %");

        txtModificarManagerId.setText("Manager ID");

        txtModificarDepartamentoId.setText("Departamento ID");

        javax.swing.GroupLayout textModificarContratadoLayout = new javax.swing.GroupLayout(textModificarContratado);
        textModificarContratado.setLayout(textModificarContratadoLayout);
        textModificarContratadoLayout.setHorizontalGroup(
            textModificarContratadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textModificarContratadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textModificarContratadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModificarID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModificarID)
                    .addComponent(txtModificarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModificarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(txtModificarApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModificarApellido)
                    .addComponent(txtModificarEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModificarEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(txtModificarTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModificarTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addGroup(textModificarContratadoLayout.createSequentialGroup()
                        .addComponent(btnAceptarModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtModificarContatado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModificarContratado)
                    .addComponent(txtModificarJobId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModificarJobId, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(txtModificarSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModificarSalario)
                    .addComponent(txtModificarComision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModificarComision, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(txtModificarManagerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModificarManagerId, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(txtModificarDepartamentoId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputModificarDepartamentoId, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                .addContainerGap())
        );
        textModificarContratadoLayout.setVerticalGroup(
            textModificarContratadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textModificarContratadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtModificarID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputModificarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModificarNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputModificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModificarApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputModificarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModificarEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputModificarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModificarTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputModificarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModificarContatado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputModificarContratado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModificarJobId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputModificarJobId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModificarSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputModificarSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModificarComision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputModificarComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModificarManagerId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputModificarManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModificarDepartamentoId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputModificarDepartamentoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(textModificarContratadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarModificacion)
                    .addComponent(btnCancelarModificacion))
                .addContainerGap())
        );

        textModificarContratadoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAceptarModificacion, btnCancelarModificacion});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textModificarContratado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textModificarContratado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputModificarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputModificarNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputModificarNombreActionPerformed

    private void inputModificarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputModificarIDActionPerformed
        
    }//GEN-LAST:event_inputModificarIDActionPerformed

    private void btnAceptarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarModificacionActionPerformed
        String employeeId = inputModificarID.getText();
        String nombre = inputModificarNombre.getText();
        String apellido = inputModificarApellido.getText();
        String email = inputModificarEmail.getText();
        String telefono = inputModificarTelefono.getText();
        String fechaContratacion = inputModificarContratado.getText();
        String jobId = inputModificarJobId.getText();
        String salario = inputModificarSalario.getText();
        String comision = inputModificarComision.getText();
        String managerId = inputModificarManagerId.getText();
        String departamentoId = inputModificarDepartamentoId.getText();
        // Casting de los valores a los tipos de datos correspondientes


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
                Employee employee = new Employee();
                employee.setEmployeeId(convertToLong(employeeId, "El ID del empleado"));
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
                    actualizarEmpleado(employee);

                } catch (SQLException ex) {
                    Logger.getLogger(TablaEmployee.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(this,
                    "Error al conectar a la base de datos:\n" + ex.getMessage(),
                     "Error",
                     JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_btnAceptarModificacionActionPerformed

    private void btnCancelarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarModificacionActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarModificacionActionPerformed

    private void inputModificarContratadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputModificarContratadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputModificarContratadoActionPerformed

    private void inputModificarJobIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputModificarJobIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputModificarJobIdActionPerformed

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
    
    private void actualizarEmpleado(Employee employee) throws SQLException {
        EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl(menuInicio.usuario, menuInicio.ip, menuInicio.puerto);
        SaveResult resultado = employeeDAOImpl.update(employee);
        
        try {
            if (resultado.getSuccess()) {
                tablaEmployee.actualizarTabla();
                dispose();
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarModificacion;
    private javax.swing.JButton btnCancelarModificacion;
    public javax.swing.JTextField inputModificarApellido;
    public javax.swing.JTextField inputModificarComision;
    public javax.swing.JTextField inputModificarContratado;
    public javax.swing.JTextField inputModificarDepartamentoId;
    public javax.swing.JTextField inputModificarEmail;
    public javax.swing.JTextField inputModificarID;
    public javax.swing.JTextField inputModificarJobId;
    public javax.swing.JTextField inputModificarManagerId;
    public javax.swing.JTextField inputModificarNombre;
    public javax.swing.JTextField inputModificarSalario;
    public javax.swing.JTextField inputModificarTelefono;
    private javax.swing.JPanel textModificarContratado;
    private javax.swing.JLabel txtModificarApellido;
    private javax.swing.JLabel txtModificarComision;
    private javax.swing.JLabel txtModificarContatado;
    private javax.swing.JLabel txtModificarDepartamentoId;
    private javax.swing.JLabel txtModificarEmail;
    private javax.swing.JLabel txtModificarID;
    private javax.swing.JLabel txtModificarJobId;
    private javax.swing.JLabel txtModificarManagerId;
    private javax.swing.JLabel txtModificarNombre;
    private javax.swing.JLabel txtModificarSalario;
    private javax.swing.JLabel txtModificarTelefono;
    // End of variables declaration//GEN-END:variables
    private int filaSeleccionada;
    private MenuInicio menuInicio;
    private TablaEmployee tablaEmployee;
}
