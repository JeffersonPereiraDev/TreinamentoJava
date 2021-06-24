package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Produto;

public class ProdutoDAO implements Dao.Persistencia<Produto> {
    
    private static ProdutoDAO dao = null;
    
    public ProdutoDAO(){
        
    }
    
    public static ProdutoDAO getInstance(){
        if (dao == null) dao = new ProdutoDAO();
        return dao;
    }
    
    @Override
    public int create(Produto c){
        int id = 0;
        Connection con = ModuloConexao.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "INSERT INTO Produtos (Codigo, Descricao, Estoque, Ativo, Custo, Valor) VALUES (?, ?, ?, ?, ?, ?)";
        try{
            pst = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setInt(1, c.getCodigo());
            pst.setString(2, c.getDescricao());
            pst.setInt(3, c.getEstoque());
            pst.setBoolean(4, c.isAtivo());
            pst.setDouble(5, c.getCusto());
            pst.setDouble(6, c.getValor());
            pst.execute();
            rs = pst.getGeneratedKeys();
            System.out.println("aqui");
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
}
