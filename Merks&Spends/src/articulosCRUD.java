import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import org.jfree.data.category.DefaultCategoryDataset;

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
    //-----------por fechas
    public ResultSet reporteFechas(){
        String slqTodos = "SELECT * FROM vista_pedidos_por_fecha;";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(slqTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar fechas"+s.getMessage());
            return null;
        }
        
    }
    //-----------por departamento
    public ResultSet reporteDepartamentos(){
        String slqTodos = "SELECT * FROM vista_pedidos_por_departamento;";
        
        try{
            PreparedStatement ps = conexion.prepareStatement(slqTodos);
            return ps.executeQuery();
        }
        catch(SQLException s){
            System.out.println("Error al consultar departamentos"+s.getMessage());
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
        System.out.println("Error al obtener la existencia: " + e.getMessage());
    }
    return -1; // Valor por defecto si hay error o no se encuentra
}
    
    public boolean updateExistenciaArticulo(int id_articulo, int nueva_existencia) {
    String sql = "UPDATE articulos SET existencia = ? WHERE id_articulo = ?";
    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setInt(1, nueva_existencia);
        ps.setInt(2, id_articulo);

        int filas = ps.executeUpdate();
        return filas > 0;
    } catch (SQLException e) {
        System.out.println("Error al actualizar la existencia: " + e.getMessage());
        return false;
    }
}
    
    
    
    //----------------------
    public DefaultCategoryDataset obtenerDatosReales() throws SQLException {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    Connection conex = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
        // 1. Conectar a la BD
        conex = ConexionMySQL.conectar();
        System.out.println("Conexión a BD establecida");
        
        // 2. Consulta SQL para los 5 productos más vendidos
        String sql = "SELECT a.nombre AS articulo, SUM(sa.cantidad) AS total_vendido FROM solicitud_articulo sa JOIN articulos a ON sa.id_articulo = a.id_articulo GROUP BY a.nombre ORDER BY total_vendido DESC LIMIT 5;";
        
        ps = conex.prepareStatement(sql);
        rs = ps.executeQuery();
        System.out.println("Consulta SQL ejecutada");
        
        // 3. Procesar resultados
        while (rs.next()) {
            String articulo = rs.getString("articulo");
            int totalVendido = rs.getInt("total_vendido");
            dataset.addValue(totalVendido, "Ventas", articulo);
            System.out.println("Dato obtenido: " + articulo + " - " + totalVendido);
        }
        
    } finally {
        // 4. Cerrar recursos en orden inverso
        if (rs != null) rs.close();
        if (ps != null) ps.close();
        if (conex != null) conex.close();
        System.out.println("Conexiones cerradas");
    }
    
    return dataset;
    }
}
