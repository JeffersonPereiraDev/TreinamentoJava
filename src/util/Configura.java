package util;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jeffe
 */
public class Configura {
    public static void LookAndFeel(String laf) {
        try{
            for(UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
                if(laf.equals (info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch(UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e){
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
