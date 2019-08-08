package calcular;

import javax.swing.*;

public class VectorLogica extends Vector {


    public void vectores() {
        this.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null,"cuantos numers deseas ingresar?")));

        int contadorN = 1;
        int contadorP = 1;
        int promedioPos = 0;
        int promedioNeg = 0;
        int[] positivo = new int[this.getCantidad()];
        int[] negativo = new int[this.getCantidad()];
        for (int i = 0; i < this.getCantidad(); i++) {
            this.setPos(Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el valor")));
            if (this.getPos() > 0) {
                positivo[i] = this.getPos();
                negativo[i]=0;
                contadorP++;
                promedioPos=promedioPos+positivo[i];

            } else if (this.getPos() < 0) {
                negativo[i] = this.getPos();
                positivo[i]=0;
                contadorN++;
                promedioNeg=promedioNeg+negativo[i];
            }

        }

        JOptionPane.showMessageDialog(null, "cantidad de datos ingresados" + this.getCantidad() + "\n" +
                "promedio de numeros positivos : "+promedioPos/(contadorP-1)+"\n"+"promedio de numeros negativos : "+promedioNeg/(contadorN-1));
    }
}
