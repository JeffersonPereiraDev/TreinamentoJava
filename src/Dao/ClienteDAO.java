package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Cliente;

public class ClienteDAO implements Dao.Persistencia<Cliente>{
    
    private static ClienteDAO dao = null;
    
    public ClienteDAO(){
        
    }
    
    public static ClienteDAO getInstance() {
        if (dao == null) dao = new ClienteDAO();
        return dao;
    }
    
    
    @Override
    public int create(Cliente c){
        int id = 0;
        Connection con = ModuloConexao.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "INSERT INTO Clientes (Nome, CPF, Fone, Celular, Email) VALUES (?, ?, ?, ?, ?)";
        try{
            pst = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, c.getNome());
            pst.setString(2, c.getCpf());
            pst.setString(3, c.getFone());
            pst.setString(4, c.getCelular());
            pst.setString(5, c.getEmail());
            pst.execute();
            rs = pst.getGeneratedKeys();
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException ex){
            id = 0;
        } finally {
           ModuloConexao.closeConnection(con, pst, rs);
        }
        return id;
    }
    
    @Override
    public Cliente findByCodigo(int id){
        Connection con = ModuloConexao.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        Cliente c = null;
        String sql = "SELECT * FROM Clientes WHERE Codigo = ?";
        try{
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()){
                int codigo = rs.getInt("Codigo");
                String nome = rs.getString("Nome");
                String cpf = rs.getString("CPF");
                String fone = rs.getString("Fone");
                String celular = rs.getString("Celular");
                String email = rs.getString("Email");
                c = new Cliente(codigo, nome, cpf, fone, celular, email);
            }
            
        }catch (SQLException ex){
            throw new RuntimeException("Erro no SELECT.");
        }finally {
            ModuloConexao.closeConnection(con, pst, rs);
        }
        return c;
    }

    @Override
    public void delete(int id) {
        Connection con = ModuloConexao.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "DELETE from Clientes where Codigo = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.execute();
        } catch (SQLException ex){
            throw new RuntimeException("Erro do Delete");
        }finally{
            ModuloConexao.closeConnection(con, pst, rs);
        }
    }

    @Override
    public void update(Cliente c) {
        Connection con = ModuloConexao.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "UPDATE Clientes set Nome=?, Cpf=?, Fone=?, Celular=?, Email=? where Codigo=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, c.getNome());
            pst.setString(2, c.getCpf());
            pst.setString(3, c.getFone());
            pst.setString(4, c.getCelular());
            pst.setString(5, c.getEmail());
            pst.setInt(6, c.getCodigo());
            pst.execute();
        } catch (SQLException ex){
            throw new RuntimeException("Erro no update");
        }finally{
            ModuloConexao.closeConnection(con, pst, rs);
        }
    }

    @Override
    public List<Cliente> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
