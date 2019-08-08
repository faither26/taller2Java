package calcular;

public class Salarios {
    private int salariosNumero;
    private int acum;
    private int mayor;

    public Salarios() {
        this.salariosNumero = 0;
        this.acum = 0;
        this.mayor = 0;
    }


    public int getSalariosNumero() {
        return salariosNumero;
    }

    public void setSalariosNumero(int salariosNumero) {
        this.salariosNumero = salariosNumero;
    }

    public int getAcum() {
        return acum;
    }

    public void setAcum(int acum) {
        this.acum = acum;
    }

    public int getMayor() {
        return mayor;
    }

    public void setMayor(int mayor) {
        this.mayor = mayor;
    }
}
