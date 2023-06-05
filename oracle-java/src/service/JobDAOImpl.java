
package service;

import java.sql.*;
import java.util.*;
import javax.lang.model.util.Types;
import model.Job;
import model.SaveResult;


public class JobDAOImpl {

    private Connection connection;

    
    public JobDAOImpl(String usuario, String ip, String puerto) {
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
    
    public List<Job> getAll() throws SQLException {
        List<Job> listaJobs = new ArrayList<>();

        try {
            Statement sentencia = connection.createStatement();
            ResultSet resultado = sentencia.executeQuery("SELECT * FROM hr.jobs WHERE baja IS NULL ORDER BY job_id desc");

            while (resultado.next()) {
                Job job = new Job();
                job.setJobId(resultado.getString(1));
                job.setJobTitle(resultado.getString(2));
                job.setMinSalary(resultado.getDouble(3));
                job.setMaxSalary(resultado.getDouble(4));
                listaJobs.add(job);
            }
            
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return listaJobs;
    }
    
    public SaveResult save(Job job) {
        String jobId = job.getJobId();
        String jobTitle = job.getJobTitle();
        Double minSalary = job.getMinSalary();
        Double maxSalary = job.getMaxSalary();

        try {
            String sql = "{ ? = call hr.pa_gestion_hr.agregar_puesto(?, ?, ?, ?, ?) }";
            CallableStatement cstmt = connection.prepareCall(sql);

            cstmt.setString(2, jobId);
            cstmt.setString(3, jobTitle);
            cstmt.setDouble(4, minSalary);
            cstmt.setDouble(5, maxSalary);

            cstmt.registerOutParameter(1, java.sql.Types.NUMERIC);
            cstmt.registerOutParameter(6, java.sql.Types.VARCHAR);

            cstmt.execute();

            int success = cstmt.getInt(1);
            String errorMsg = cstmt.getString(6);

            cstmt.close();

            if (success == 1) {
                return new SaveResult(true, "Job creado exitosamente.");
            } else {
                return new SaveResult(false, "Error: " + errorMsg);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new SaveResult(false, "Error: " + e.getMessage());
        }
    }
    
    public SaveResult delete(String id) {
        try {
            // Preparar la llamada a la función PL/SQL
            String sql = "{ ? = call hr.pa_gestion_hr.eliminar_puesto(?, ?) }";
            CallableStatement cstmt = connection.prepareCall(sql);

            // Configurar los parámetros de entrada
            cstmt.setString(2, id);

            // Configurar los parámetros de salida
            cstmt.registerOutParameter(1, java.sql.Types.NUMERIC);
            cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);

            // Ejecutar la función
            cstmt.execute();

            // Obtener los resultados
            int success = cstmt.getInt(1);
            String errorMsg = cstmt.getString(3);

            // Cerrar la conexión
            cstmt.close();

            if (success == 1) {
                return new SaveResult(true, "Job eliminado exitosamente.");
            } else {
                return new SaveResult(false, "Error: " + errorMsg);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new SaveResult(false, "Error: " + e.getMessage());
        }
    }
    
    public SaveResult update(Job job) {
        try {
            // Preparar la llamada a la función PL/SQL
            String sql = "{ ? = call hr.pa_gestion_hr.modificar_puesto(?, ?, ?, ?, ?) }";
            CallableStatement cstmt = connection.prepareCall(sql);
            
            // Configurar los parámetros de entrada
            cstmt.setString(2, job.getJobId());
            cstmt.setString(3, job.getJobTitle());
            cstmt.setDouble(4, job.getMinSalary());
            cstmt.setDouble(5, job.getMaxSalary());

            // Configurar los parámetros de salida
            cstmt.registerOutParameter(1, java.sql.Types.NUMERIC);
            cstmt.registerOutParameter(6, java.sql.Types.VARCHAR);

            // Ejecutar la función
            cstmt.execute();

            // Obtener los resultados
            int success = cstmt.getInt(1);
            String errorMsg = cstmt.getString(6);

            // Cerrar la conexión
            cstmt.close();

            if (success == 1) {
                return new SaveResult(true, "Job modificado exitosamente.");
            } else {
                return new SaveResult(false, "Error: " + errorMsg);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new SaveResult(false, "Error: " + e.getMessage());
        }
    }
    
    
}
