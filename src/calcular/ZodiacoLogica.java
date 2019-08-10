package calcular;

import static constantes.ConstanteMain.*;
import static constantes.ConstantesDias.*;



public class ZodiacoLogica extends ZodiacoMetodo {
    public void zodiacos() {

        switch (this.getMes()) {
            case 1:
                this.zVeinte(Z1.getCc(),Z12.getCc(), D20.getDias());
                break;
            case 2:
                this.zVeinte(Z12.getCc(),Z2.getCc(),D19.getDias());
                break;
            case 3:
                this.zVeinte(Z2.getCc(),Z3.getCc(),D20.getDias());
                break;
            case 4:
                this.zVeinte(Z3.getCc(),Z4.getCc(),D20.getDias());
                break;
            case 5:
                this.zVeinte(Z4.getCc(),Z5.getCc(),D21.getDias());
                break;
            case 6:
                this.zVeinte(Z5.getCc(),Z6.getCc(),D21.getDias());
                break;
            case 7:
                this.zVeinte(Z6.getCc(),Z7.getCc(),D23.getDias());
                break;
            case 8:
                this.zVeinte(Z7.getCc(),Z8.getCc(),D23.getDias());
                break;
            case 9:
                this.zVeinte(Z8.getCc(),Z9.getCc(),D23.getDias());
                break;
            case 10:
                this.zVeinte(Z9.getCc(),Z10.getCc(),D23.getDias());
                break;
            case 11:
                this.zVeinte(Z10.getCc(),Z11.getCc(),D22.getDias());
                break;
            case 12:
                this.zVeinte(Z11.getCc(),Z1.getCc(),D18.getDias());
                break;
            default:
        }


    }

}
