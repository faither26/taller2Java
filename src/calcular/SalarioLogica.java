package calcular;


import static constantes.ConstanteMain.*;

import javax.swing.*;

public class SalarioLogica extends Salarios {

    public void calculos() {

        int acum = 0;
        int opcion=0;
        int numeross=1;
        boolean a = false;


        do {
         opcion =JOptionPane.showConfirmDialog(null, SS.getCc(),"",
                JOptionPane.YES_NO_OPTION);




            if (opcion==0) {


                int salario = Integer.parseInt(JOptionPane.showInputDialog(null, SS1.getCc()));

                if (salario > this.getMayor()) {
                    this.setMayor(salario);
                }
                acum = acum + salario;

                    numeross = numeross + 1;

            }else {
                break;
            }
        }while (!a);

        JOptionPane.showMessageDialog(null, SS2.getCc()+ this.getMayor() + "\n" +
              SS3.getCc()+acum+"\n"+SS4.getCc()+(acum/(numeross-1))+"\n"+SS5.getCc()+(numeross-1));
    }


}
