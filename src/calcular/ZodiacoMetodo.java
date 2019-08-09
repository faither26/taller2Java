package calcular;

import javax.swing.*;
import static constantes.ConstanteMain.*;
public class ZodiacoMetodo extends Zodiaco {
    public void zVeinte(String z1Cc, String cc,int dia){
        if (this.getDia() <= dia) {
            JOptionPane.showMessageDialog(null,  ZZ.getCc() +z1Cc);

        } else {
            JOptionPane.showMessageDialog(null, ZZ.getCc()+cc);

        }




    }
    public void z21(String cc, String z5Cc){
        if (this.getDia() <= 21) {
            JOptionPane.showMessageDialog(null, ZZ.getCc()+cc);

        } else {
            JOptionPane.showMessageDialog(null, ZZ.getCc()+z5Cc);

        }
    }

}
