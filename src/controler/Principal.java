package controler;

import util.Configura;
import view.TelaCadastro;

/**
 *
 * @author jeffe
 */
public class Principal {
    public static void main (String[] args){
        Configura.LookAndFeel("Windows Classic");
        new TelaCadastro().setVisible(true);
        Dao.ModuloConexao.getConection();
    }
}
