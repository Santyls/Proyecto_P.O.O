import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class articulosCRUD {
    private Connection conexion;
    
    public articulosCRUD(){
        conexion = ConexionMySQL.conectar();//conexión a la base de datos
    }
    
    //SEELECT ID----------------------------------------------------------------------------------------------------
    public ResultSet bucarporID (int id){
        String sqlBuscar = "SELECT id_articulo, a.nombre, c.nombre, a.descripcion, a.existencia FROM articulos a INNER JOIN categoria c ON a.id_categoria = c.id_categoria WHERE id_articulo = ?";
        
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
    //-----------
    public ResultSet reporteInventario(){
        String slqTodos = "SELECT id_articulo, a.nombre, c.nombre, a.descripcion, a.existencia FROM articulos a INNER JOIN categoria c ON a.id_categoria = c.id_categoria ORDER BY id_articulo asc; ";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(slqTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar articulos"+s.getMessage());
            return null;
        }
        
    }
    //SEELECT Nombre----------------------------------------------------------------------------------------------------
    public ResultSet bucarporNombre (String nombre){
        String sqlBuscar = "SELECT id_articulo, a.nombre, c.nombre, a.descripcion, a.existencia FROM articulos a INNER JOIN categoria c ON a.id_categoria = c.id_categoria WHERE a.nombre = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlBuscar);
            ps.setString(1,nombre);
            
            return ps.executeQuery();
        }
        catch(SQLException e){
            System.out.println("Error al buscar por Nombre "+ e.getMessage());
            return null;
        }
    }//fin del consulta nombre
    
    //SEELECT ALL----------------------------------------------------------------------------------------------------
    public ResultSet obtenerTodos(){
        String slqTodos = "SELECT id_articulo, a.nombre, c.nombre, a.descripcion, a.existencia FROM articulos a INNER JOIN categoria c ON a.id_categoria = c.id_categoria ORDER BY id_articulo asc; ";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(slqTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar articulos"+s.getMessage());
            return null;
        }
        
    }//fin del obtener todos
    
    //INSERT----------------------------------------------------------------------------------------------------
    public boolean insertUsuario(String nombre, int categoria, String descripcion, String existencia){
        
        String insertSQL = "INSERT INTO articulos(nombre, id_categoria, descripcion, existencia) VALUES(?,?,?,?)";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(insertSQL);
            ps.setString(1, nombre);
            ps.setInt(2, categoria);
            ps.setString(3, descripcion);
            ps.setString(4, existencia);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al crear el articulo "+ e.getMessage());
            return false;
        }
    }//fin del insert
    
    //UPDATE----------------------------------------------------------------------------------------------------
    public boolean updateArticulo(String nombre, int categoria, String descripcion, String existencia, int id){
        String sqlEditar = "UPDATE articulos SET nombre = ?, id_categoria = ?, descripcion = ?, existencia = ? WHERE id_articulo = ?;";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlEditar);
            ps.setString(1, nombre);
            ps.setInt(2, categoria);
            ps.setString(3, descripcion);
            ps.setString(4, existencia);
            ps.setInt(5, id);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al editar el articulo "+ e.getMessage());
            return false;
        }
    }
    
    //DELETE----------------------------------------------------------------------------------------------------
    public boolean deleteArticulo(int id){
        String sqlEliminar = "DELETE FROM articulos WHERE id_articulo = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlEliminar);
            ps.setInt(1, id);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al eliminar la solicitud "+ e.getMessage());
            return false;
        }
    }
    
    public boolean deleteArticuloIdUsuario(int id){
        String sqlEliminar = "DELETE FROM solicitud_articulo WHERE id_usuario = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sqlEliminar);
            ps.setInt(1, id);
            return ps.executeUpdate()>0;
        }catch(SQLException e){
            System.out.println("Error al eliminar la solicitud "+ e.getMessage());
            return false;
        }
    }
}
