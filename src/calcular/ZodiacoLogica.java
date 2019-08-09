package calcular;

import constantes.ConstanteMain.*;

import javax.swing.*;

import static constantes.ConstanteMain.*;

public class ZodiacoLogica extends ZodiacoMetodo {
    public void zodiacos() {

        switch (this.getMes()) {
            case 1:
                this.zVeinte(Z1.getCc(),Z12.getCc(),20);
                break;
            case 2:
                this.zVeinte(Z12.getCc(),Z2.getCc(),19);
                break;
            case 3:
                this.zVeinte(Z2.getCc(),Z3.getCc(),20);
                break;
            case 4:
                this.zVeinte(Z3.getCc(),Z4.getCc(),20);
                break;
            case 5:
                this.zVeinte(Z4.getCc(),Z5.getCc(),21);


                break;
            case 6:
                this.zVeinte(Z5.getCc(),Z6.getCc(),21);
                break;
            case 7:
                this.zVeinte(Z6.getCc(),Z7.getCc(),23);
                break;
            case 8:
                this.zVeinte(Z7.getCc(),Z8.getCc(),23);
                break;
            case 9:
                this.zVeinte(Z8.getCc(),Z9.getCc(),23);
                break;
            case 10:
                this.zVeinte(Z9.getCc(),Z10.getCc(),23);
                break;
            case 11:
                this.zVeinte(Z10.getCc(),Z11.getCc(),22);
                break;
            case 12:
                this.zVeinte(Z11.getCc(),Z1.getCc(),18);
                break;
            default:
        }


    }

}
