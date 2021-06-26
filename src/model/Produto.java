package model;

import Dao.ProdutoDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Produto {
    private int codigo = 0;
    private String descricao = null;
    private int estoque = 0;
    private boolean ativo = false;
    private double custo = 0;
    private double valor = 0;
    
    public Produto (String descricao, int estoque,double custo, double valor){
        setCodigo(codigo);
        setDescricao(descricao);
        setEstoque(estoque);
        setValor(valor);
        setCusto(custo);
        setAtivo(true);
        gravar();
    }
    
    public Produto(int codigo, String descricao,boolean ativo, int estoque, double custo, double valor) {
        setCodigo(codigo);
        setDescricao(descricao);
        setEstoque(estoque);
        setValor(valor);
        setCusto(custo);
        setAtivo(ativo);
    }

    public Produto() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }     
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString(){
        String ret = null;
        if (isAtivo()) ret = "[Ativo] - ";
        else ret = "[Fora de linha] - ";
        
        ret = ret + "Codigo: "+ getCodigo() + "\n"+
                    "[Item: " + getDescricao() +"]\n"+
                    "- [Estoque: " + getEstoque() +"]\n"+
                    "- [Custo: " + getCusto() +"]\n"+
                    "- [Preço de Venda: " + getValor() +"]";
        
        return ret;
    }
    
    private void gravar(){
        ProdutoDAO dao = new ProdutoDAO();
        int codigo = dao.create(this);
        if (codigo > 0){
            setCodigo(codigo);
        } 
    }
    
    public static DefaultTableModel getTableModel(){
        List<Produto> lista = ProdutoDAO.getInstance().read();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("descricao");
        modelo.addColumn("Estoque");
        modelo.addColumn("Custo");
        modelo.addColumn("Valor");
        for (Produto p: lista) {
            String[] reg = {p.getDescricao(), String.valueOf(p.getEstoque()), String.valueOf(p.getCusto()), String.valueOf(p.getValor())};
            modelo.addRow(reg);
        }
        return modelo;
    }
    
}
