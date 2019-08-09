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
    IMC8("obesidad muy severa"),
    VEC1("cantidad de datos ingresados"),
    VEC2("promedio de numeros positivos : "),
    VEC3("promedio de numeros negativos : "),
    VEC4("ingrese el valor"),
    VEC5("cuantos numers deseas ingresar?"),
    ZZ("su signo es : "),
    Z1("capricornio"),
    Z2("piscis"),
    Z3("aries"),
    Z4("tauro"),
    Z5("géminis"),
    Z6("cáncer"),
    Z7("leo"),
    Z8("virgo"),
    Z9("libra"),
    Z10("escorpio"),
    Z11("sagitario"),
    Z12("acuario");

    private String cc;


    ConstanteMain(String s) {
        this.cc = s;
    }

    public String getCc() {
        return cc;
    }
}
