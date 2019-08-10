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
    Z12("acuario"),
    M1("1:ENERO"),
    M2("2:FEBRERO"),
    M3("3:MARZO"),
    M4("4:ABRIL"),
    M5("5:MAYO"),
    M6("6:JUNIO"),
    M7("7:JULIO"),
    M8("8:AGOSTO"),
    M9("9:SEPTIEMBRE"),
    M10("10:OCTUBRE"),
    M11("11:NOVIEMBRE"),
    M12("12:DICIEMB"),MM("En que dia nacistes?"),
    SS("desea ingreasr un salario?"),SS1("salario que deseas ingresar"),SS2("el salario mayor es :" ),
    SS3("el salario acumulado es :"),SS4("el salario promedio es :"),SS5("total de salarios ingresados");

    private String cc;


    ConstanteMain(String s) {
        this.cc = s;
    }

    public String getCc() {
        return cc;
    }
}
