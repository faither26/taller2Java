package constantes;

public enum ConstanteMain {

    CC1("1: Indice de masa corporal"),
    CC2("2: zodiaco"),
    CC3("3: salario"),
    CC4("4: vector"),
    CCC2("cual es su altura?"),
    CCC3("cual es su peso?"),
    CCC4("su IMC es: "),
    IMC1("delgadez muy severa"),
    IMC2("delgadez severa"),
    IMC3("delgadez "),
    IMC4("peso saludable"),
    IMC5("sobrepeso"),
    IMC6("obesidad moderada"),
    IMC7("obesidad severa"),
    IMC8("obesidad muy severa");

    private String cc;


    ConstanteMain(String s) {
        this.cc = s;
    }

    public String getCc() {
        return cc;
    }
}
