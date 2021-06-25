package Dao;
import java.sql.*;

public class ModuloConexao {
    private static final String URL = "jdbc:sqlite:C:/Users/jeffe/Documents/Java/Treinamento/db/TreinamentoDB.db";
    
    public static Connection getConection() {
        try{ 
            return DriverManager.getConnection(URL);
        } catch (SQLException e){
            throw new RuntimeException("Erro na conexão");
        }
    }
    
    public static void closeConnection(Connection con){
        try{
            if (con != null) con.close();
        } catch (SQLException e){
            throw new RuntimeException("Erro no fechamento da conexão");
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement pst){
        try{
            if (pst != null) pst.close();
            closeConnection(con);
        } catch (SQLException e){
            throw new RuntimeException("Erro no fechamento do statment");
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement pst, ResultSet rs){
        try{
            if(rs != null) rs.close();
            closeConnection(con,pst);
        } catch (SQLException e){
            throw new RuntimeException("Erro no fechamento do result set");
        }
    }   
    
    
    
    
    
}
