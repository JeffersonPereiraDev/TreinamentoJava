package util;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author jeffe
 */

public class Mascara {
    public static DefaultFormatterFactory getCpfMask (){
        MaskFormatter mask = null;
        try{
            mask = new MaskFormatter("###.###.###-##");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            throw new RuntimeException("Erro na formatação de CPF.");
        }
        return(new DefaultFormatterFactory(mask,mask));
    }
    
    public static DefaultFormatterFactory getFoneFixofMask (){
        MaskFormatter mask = null;
        try{
            mask = new MaskFormatter("(##)####-####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            throw new RuntimeException("Erro na formatação do telefone fixo.");
        }
        return(new DefaultFormatterFactory(mask,mask));
    }
    
    public static DefaultFormatterFactory getCelularfMask (){
        MaskFormatter mask = null;
        try{
            mask = new MaskFormatter("(##)#####-####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException ex) {
            throw new RuntimeException("Erro na formatação do celular.");
        }
        return(new DefaultFormatterFactory(mask,mask));
    }
    
    public static DefaultFormatterFactory getValorMask(){
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        df.setRoundingMode(RoundingMode.HALF_UP);
        NumberFormatter nf = new NumberFormatter (df);
        nf.setAllowsInvalid(false);
        nf.setMinimum(0.0);
        nf.setMaximum(999999999.9);
        return (new DefaultFormatterFactory(nf));
    }
        
        
}
