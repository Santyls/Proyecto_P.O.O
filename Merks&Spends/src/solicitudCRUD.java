import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class solicitudCRUD {
    private Connection conexion;
    
    //constructor de la clase arranca la conexion a BD
    public solicitudCRUD(){
        conexion = ConexionMySQL.conectar();
    }
    
    public boolean insertSolicitudArticulos(int cantidad, String fecha_solicitud, String hora, String estado, int id_Usuario, int id_articulo){
        
        String insertSQL = "INSERT INTO solicitud_articulo (cantidad, fecha_solicitud, hora, estado, id_usuario,id_articulo) VALUES (?, ?, ?, ?, ?, ?)";

    try {
        PreparedStatement ps = conexion.prepareStatement(insertSQL);
        ps.setInt(1, cantidad);
        ps.setString(2, fecha_solicitud);
        ps.setString(3, hora);
        ps.setString(4, estado);
        ps.setInt(5, id_Usuario); 
        ps.setInt(6, id_articulo);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error al crear la solicitud de artículos: " + e.getMessage());
        return false;
    }
    }//fin del insert de solicitud de articulos
    
    public ResultSet buscarporIdArticulo (int id_solicitud){
        String sqlBuscar = "SELECT * FROM vista_solicitudes_usuario_articulo WHERE id_solicitud = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar);
            ps.setInt(1,id_solicitud);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al buscar por id "+ e.getMessage());
            return null;
        }
    }//fin del consulta ID de las solicitudes de Articulos
    public ResultSet obtenerTodosArticulos(){
        String slqTodos = "SELECT * FROM vista_solicitudes_usuario_articulo;";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(slqTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar todas las solicitudes de articulos"+s.getMessage());
            return null;
        }
        
    }//fin del obtener todos las solicitudes de Articulos
    
   
    public boolean deleteSolicitudArticulos(int id_solicitud){
        String sqlEliminar = "DELETE FROM solicitud_articulo WHERE id_solicitud = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlEliminar);
            ps.setInt(1, id_solicitud);
            int rows = ps.executeUpdate();
            return rows > 0;
        }
        catch(SQLException e){
            System.out.println("Error al eliminar la solicitud de articulos"+ e.getMessage());
            return false;
        }
    }
    
     public boolean updateSolicitudArticulos(int id_solicitud, String udestado){
        String sqlEditar = "UPDATE solicitud_articulo SET estado = ? WHERE id_solicitud = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlEditar);
            ps.setString(1, udestado);
            ps.setInt(2, id_solicitud);
            System.out.println("Actualizando estado de solicitud: ID = " + id_solicitud + ", Nuevo estado = " + udestado);
            
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al editar la solicitud de articulos "+ e.getMessage());
            return false;
        }
    }//fin de actualizar la solicitud de Articulos
    
    public ResultSet buscarPorEstado(String estado) {
    String sql = "SELECT * FROM vista_solicitudes_usuario_articulo WHERE estado = ?";
    
    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, estado);
        return ps.executeQuery();
    } catch (SQLException e) {
        System.out.println("Error al buscar las solicitudes por estado: " + e.getMessage());
        return null;
    }
}//buscar por estado final
    
    
    public int obtenerExistenciaArticulo(int id_articulo) {
    String sql = "SELECT existencia FROM articulos WHERE id_articulo = ?";
    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id_articulo);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt("existencia");
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener existencia del artículo: " + e.getMessage());
    }
    return -1; // Si falla
}
    
    public boolean updateExistenciaArticulo(int id_articulo, int nueva_existencia) {
    String sql = "UPDATE articulos SET existencia = ? WHERE id_articulo = ?";
    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, nueva_existencia);
        ps.setInt(2, id_articulo);
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        System.out.println("Error al actualizar existencia: " + e.getMessage());
        return false;
    }
}
    
    public ResultSet buscarIdSurtir(int id_solicitud) {
    String sql = "SELECT id_articulo, cantidad FROM solicitud_articulo WHERE id_solicitud = ?";
    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, id_solicitud);
        return ps.executeQuery();
    } catch (SQLException e) {
        System.out.println("Error al obtener artículos para surtir: " + e.getMessage());
        return null;
    }
}
    
    public ResultSet buscarporNombreU (String nombre){
        String sqlBuscar = "SELECT * FROM vista_solicitudes_usuario_articulo WHERE Usuario = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar);
            ps.setString(1,nombre);
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al buscar por Uusario "+ e.getMessage());
            return null;
        }
    }//fin del consulta ID de las solicitudes de Articulos
    
}
