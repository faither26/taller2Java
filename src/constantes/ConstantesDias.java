package constantes;

public enum ConstantesDias {

    D20(20),D19(19),D21(21),D23(23),D22(22),D18(18);
    private int dias;
    ConstantesDias(int i) {
        this.dias=i;
    }

    public int getDias() {
        return dias;
    }
}
