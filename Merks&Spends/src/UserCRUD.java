import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class UserCRUD {
    private Connection conexion;
    
    
    //constructor de la clase arranca la conexion a BD
    public UserCRUD(){
        conexion = ConexionMySQL.conectar();
    }
    
    public ResultSet inicioSesion(String correo, String contra, int depa){
        
        String sqlBuscar = "SELECT id, nombre, privilegio  FROM usuario WHERE correo = ? AND contrasena = ? AND id_departamento = ?;";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar);
            ps.setString(1,correo);
            ps.setString(2,contra);
            ps.setInt(3,depa);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al iniciar sesión "+ e.getMessage());
            return null;
        }
    }//fin del insert
    
    public boolean insertUsuario(String nombre, String apellidos, String correo, String contra, int id, int privilegio){
        
        String insertSQL = "INSERT INTO usuario(nombre, apellidos, correo, contrasena, id_departamento, privilegio) VALUES(?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1, nombre);
            ps.setString(2, apellidos);
            ps.setString(3, correo);
            ps.setString(4, contra);
            ps.setInt(5, id);
            ps.setInt(6, privilegio);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al crear el usuario "+ e.getMessage());
            return false;
        }
    }//fin del insert
    
    //metodo para consultar por ID
    public ResultSet bucarporID (int id){
        String sqlBuscar = "SELECT u.id, u.nombre, u.apellidos, u.correo, u.contrasena, d.nombre, p.privilegio  FROM usuario u INNER JOIN departamento d ON u.id_departamento = d.id_departamento INNER JOIN privilegio p ON u.privilegio = p.id_privilegio WHERE id = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar);
            ps.setInt(1,id);
            
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al buscar por id "+ e.getMessage());
            return null;
        }
    }//fin del consulta ID
    
    public ResultSet obtenerTodos(){
        String slqTodos = "SELECT u.id, u.nombre, u.apellidos, u.correo, u.contrasena, d.nombre, p.privilegio  FROM usuario u INNER JOIN departamento d ON u.id_departamento = d.id_departamento INNER JOIN privilegio p ON u.privilegio = p.id_privilegio order by u.id asc;";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(slqTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar todos"+s.getMessage());
            return null;
        }
        
    }//fin del obtener todos
    
    public boolean updateUsuario(String nombre, String apellidos, String correo, String contra, int id_depa, int privilegio, int id){
        String sqlEditar = "UPDATE usuario SET nombre = ?, apellidos = ?, correo = ?, contrasena = ?, id_departamento = ?, privilegio = ? WHERE id = ?;";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlEditar);
            ps.setString(1, nombre);
            ps.setString(2, apellidos);
            ps.setString(3, correo);
            ps.setString(4, contra);
            ps.setInt(5, id_depa);
            ps.setInt(6, privilegio);
            ps.setInt(7, id);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al editar el usuario "+ e.getMessage());
            return false;
        }
    }
    
    public boolean deleteUsuario(int id){
        String sqlEliminar = "DELETE FROM usuario WHERE id = ?";
        String sqlEliminarR = "DELETE FROM solicitud_articulos WHERE id_usuario = ?";
        
        try {
            PreparedStatement pr = conexion.prepareStatement(sqlEliminarR);
            pr.setInt(1, id);
            PreparedStatement ps = conexion.prepareStatement(sqlEliminar);
            ps.setInt(1, id);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al eliminar el usuario "+ e.getMessage());
            return false;
        }
    }
    
    
}//
