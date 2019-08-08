package calcular;

import javax.swing.*;

public class SalarioLogica extends Salarios {

    public void calculos() {

        int acum = 0;
        int opcion=0;
        int numeross=1;
        boolean a = false;


        do {
         opcion =JOptionPane.showConfirmDialog(null,"desea ingreasr un salario?","mensage",
                JOptionPane.YES_NO_OPTION);




            if (opcion==0) {


                int salario = Integer.parseInt(JOptionPane.showInputDialog(null, "salario que deseas ingresar"));

                if (salario > this.getMayor()) {
                    this.setMayor(salario);
                }
                acum = acum + salario;

                    numeross = numeross + 1;

            }else {
                break;
            }
        }while (!a);

        JOptionPane.showMessageDialog(null, "el salario mayor es :" + this.getMayor() + "\n" +
              "el salario acumulado es :"+acum+"\n"+"el salario promedio es :"+(acum/(numeross-1))+"\n"+"total de salarios ingresados"+(numeross-1));
    }


}
