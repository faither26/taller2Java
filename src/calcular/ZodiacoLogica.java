package calcular;

import javax.swing.*;

public class ZodiacoLogica extends Zodiaco {
    public void zodiacos() {
        switch (this.getMes()) {
            case 1:
                if (this.getDia() <= 20) {
                    JOptionPane.showMessageDialog(null, "su signo es : capricornio");
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : acuario");

                }
                break;
            case 2:
                if (this.getDia() <= 19) {
                    JOptionPane.showMessageDialog(null, "su signo es : acuario");

                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : piscis");

                }
                break;
            case 3:
                if (this.getDia() <= 20) {
                    JOptionPane.showMessageDialog(null, "su signo es : piscis");

                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : aries");

                }
                break;
            case 4:
                if (this.getDia() <= 20) {
                    JOptionPane.showMessageDialog(null, "su signo es : aries");

                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : taurp");

                }
                break;
            case 5:
                if (this.getDia() <= 21) {
                    JOptionPane.showMessageDialog(null, "su signo es : tauro");

                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : géminis");

                }
                break;
            case 6:
                if (this.getDia() <= 21) {
                    JOptionPane.showMessageDialog(null, "su signo es : géminis");

                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : cáncer");

                }
                break;
            case 7:
                if (this.getDia() <= 23) {
                    JOptionPane.showMessageDialog(null, "su signo es : cáncer");

                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : leo");

                }
                break;
            case 8:
                if (this.getDia() <= 23) {
                    JOptionPane.showMessageDialog(null, "su signo es : leo");

                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : virgo");

                }
                break;
            case 9:
                if (this.getDia() <= 23) {
                    JOptionPane.showMessageDialog(null, "su signo es : virgp");

                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : libra");

                }
                break;
            case 10:
                if (this.getDia() <= 23) {
                    JOptionPane.showMessageDialog(null, "su signo es : acuario");

                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : escorpio");

                }
                break;
            case 11:
                if (this.getDia() <= 22) {
                    JOptionPane.showMessageDialog(null, "su signo es : escorpio");

                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : sagitario");

                }
                break;
            case 12:
                if (this.getDia() <= 18) {
                    JOptionPane.showMessageDialog(null, "su signo es : sagitario");

                } else {
                    JOptionPane.showMessageDialog(null, "su signo es : capricornio");

                }
                break;
            default:
        }


    }

}
