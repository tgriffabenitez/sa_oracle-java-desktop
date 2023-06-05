/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Employee;
import model.SaveResult;

/**
 *
 * @author tmg
 */
public class EmployeeDAOImpl {
    
    private Connection connection;
    
    public EmployeeDAOImpl(String usuario, String ip, String puerto) {
        try {
            //Se carga el driver JDBC
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url = "jdbc:oracle:thin:@//" + ip + ":" + puerto +"/FREEPDB1";        
            String password = "oracle";

            //Obtiene la conexion
            connection = DriverManager.getConnection(url, usuario, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Employee> getAll() throws SQLException {
        List<Employee> listaEmpleados = new ArrayList<>();

        try {
            Statement sentencia = connection.createStatement();
            ResultSet resultado = sentencia.executeQuery("SELECT * FROM hr.employees WHERE baja IS NULL ORDER BY employee_id desc");

            while (resultado.next()) {
                Employee empleado = new Employee();
                empleado.setEmployeeId(resultado.getLong(1));
                empleado.setFirstName(resultado.getString(2));
                empleado.setLastName(resultado.getString(3));
                empleado.setEmail(resultado.getString(4));
                empleado.setPhoneNumber(resultado.getString(5));
                empleado.setHireDate(resultado.getDate(6));
                empleado.setJobId(resultado.getString(7));
                empleado.setSalary(resultado.getDouble(8));
                empleado.setCommissionPct(resultado.getDouble(9));
                empleado.setManagerId(resultado.getLong(10));
                empleado.setDepartmentId(resultado.getLong(11));

                listaEmpleados.add(empleado);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaEmpleados;
    }


    public SaveResult update(Employee employee) throws SQLException {
        try {
            // Preparar la llamada a la función PL/SQL
            String sql = "{ ? = call hr.pa_gestion_hr.modificar_empleado(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
            CallableStatement cstmt = connection.prepareCall(sql);

            // Configurar los parámetros de entrada
            cstmt.setLong(2, employee.getEmployeeId());
            cstmt.setString(3, employee.getFirstName());
            cstmt.setString(4, employee.getLastName());
            cstmt.setString(5, employee.getEmail());
            cstmt.setString(6, employee.getPhoneNumber());
            cstmt.setDate(7, new java.sql.Date(employee.getHireDate().getTime()));
            cstmt.setString(8, employee.getJobId());
            cstmt.setDouble(9, employee.getSalary());
            cstmt.setDouble(10, employee.getCommissionPct());
            cstmt.setLong(11, employee.getManagerId());
            cstmt.setLong(12, employee.getDepartmentId());

            // Configurar los parámetros de salida
            cstmt.registerOutParameter(1, Types.NUMERIC);
            cstmt.registerOutParameter(13, Types.VARCHAR);

            // Ejecutar la función
            cstmt.executeUpdate();

            // Obtengo los resultados
            int success = cstmt.getInt(1);
            String errorMsg = cstmt.getString(13);

            // Manejar los resultados
            cstmt.close();
            if (success == 1) {
                return new SaveResult(true, "Usuario creado exitosamente.");
            } else {
               return new SaveResult(false, "Error: " + errorMsg); 
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return new SaveResult(false, "Error: " + e.getMessage());
        }
    }
    

    public SaveResult save(Employee employee) throws SQLException {
        String firstName = employee.getFirstName();
        String lastName = employee.getLastName();
        String email = employee.getEmail();
        String phoneNumber = employee.getPhoneNumber();
        java.util.Date hireDate = employee.getHireDate();
        String jobId = employee.getJobId();
        Double salary = employee.getSalary();
        Double commissionPct = employee.getCommissionPct();
        Long managerId = employee.getManagerId();
        Long departmentId = employee.getDepartmentId();

        try {
            // Preparar la llamada a la función PL/SQL
            String sql = "{ ? = call hr.pa_gestion_hr.agregar_empleado(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
            CallableStatement cstmt = connection.prepareCall(sql);

            // Configurar los parámetros de entrada
            cstmt.setString(2, firstName);
            cstmt.setString(3, lastName);
            cstmt.setString(4, email);
            cstmt.setString(5, phoneNumber);
            cstmt.setDate(6, new java.sql.Date(hireDate.getTime()));
            cstmt.setString(7, jobId);
            cstmt.setDouble(8, salary);
            cstmt.setDouble(9, commissionPct);
            cstmt.setInt(10, managerId.intValue());
            cstmt.setInt(11, departmentId.intValue());

            // Configuro los parámetros de salida
            cstmt.registerOutParameter(1, Types.NUMERIC);
            cstmt.registerOutParameter(12, Types.VARCHAR);

            // Ejecutar la función
            cstmt.executeUpdate();

            // Obtengo los resultados
            int success = cstmt.getInt(1);
            String errorMsg = cstmt.getString(12);

            // Manejar los resultados
            cstmt.close();
            if (success == 1) {
                return new SaveResult(true, "Usuario creado exitosamente.");
            } else {
               return new SaveResult(false, "Error: " + errorMsg); 
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return new SaveResult(false, "Error: " + e.getMessage());
        }
    }
    
    public SaveResult delete(Long id) {
        try {
            // Preparar la llamada a la función PL/SQL
            String sql = "{ ? = call hr.pa_gestion_hr.eliminar_empleado(?, ?) }";
            CallableStatement cstmt = connection.prepareCall(sql);

            // Configurar los parámetros de entrada
            cstmt.setLong(2, id);

            // Configurar los parámetros de salida
            cstmt.registerOutParameter(1, Types.NUMERIC);
            cstmt.registerOutParameter(3, Types.VARCHAR);

            // Ejecutar la función
            cstmt.execute();

            // Obtener los resultados
            int success = cstmt.getInt(1);
            String errorMsg = cstmt.getString(3);

            // Manejar los resultados
            cstmt.close();
            if (success == 1) {
                return new SaveResult(true, "El empleado ha sido eliminado exitosamente.");
            } else {
                return new SaveResult(false, "Error al eliminar el empleado: " + errorMsg);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return new SaveResult(false, "Error: " + e.getMessage());
        }
    }
    
    
}
