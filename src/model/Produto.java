package model;
/**
 *
 * @author jeffe
 */
public class Produto {
    private int codigo = 0;
    private String descricao = null;
    private int estoque;
    private boolean ativo = false;
    private double custo;
    private double valor;
    
    public Produto (int codigo, String descricao, int estoque,double custo, double valor){
        setCodigo(codigo);
        setDescricao(descricao);
        setEstoque(estoque);
        setValor(valor);
        setCusto(custo);
        setAtivo(true);    
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

    
}
