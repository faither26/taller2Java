package main;

import calcular.MasaLogica;
import calcular.SalarioLogica;
import calcular.VectorLogica;
import calcular.ZodiacoLogica;

import static constantes.ConstanteMain.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MasaLogica masaLogica = new MasaLogica();


        String elegir = JOptionPane.showInputDialog(null, CC1.getCc() + "\n" + CC2.getCc() + "\n" + CC3.getCc()
                + "\n" + CC4.getCc());
        int a = Integer.parseInt(elegir);

        if (a == 1) {
            String altura1 = JOptionPane.showInputDialog(null, CCC2.getCc());
            String peso1 = JOptionPane.showInputDialog(null, CCC3.getCc());

            masaLogica.setAltura(Double.parseDouble(altura1));
            masaLogica.setPeso(Double.parseDouble(peso1));
            if (masaLogica.calcularMasaCorporar() <= 15.9) {
                JOptionPane.showMessageDialog(null, CCC4.getCc() + IMC1.getCc() + masaLogica.calcularMasaCorporar());

            } else if (masaLogica.calcularMasaCorporar() <= 18.4) {
                JOptionPane.showMessageDialog(null, CCC4.getCc() + IMC2.getCc() + masaLogica.calcularMasaCorporar());

            } else if (masaLogica.calcularMasaCorporar() <= 24.9) {
                JOptionPane.showMessageDialog(null, CCC4.getCc() + IMC3.getCc() + masaLogica.calcularMasaCorporar());

            } else if (masaLogica.calcularMasaCorporar() <= 29.9) {
                JOptionPane.showMessageDialog(null, CCC4.getCc() + IMC4.getCc() + masaLogica.calcularMasaCorporar());

            } else if (masaLogica.calcularMasaCorporar() <= 34.9) {
                JOptionPane.showMessageDialog(null, CCC4.getCc() + IMC5.getCc() + masaLogica.calcularMasaCorporar());

            } else if (masaLogica.calcularMasaCorporar() <= 39.9) {
                JOptionPane.showMessageDialog(null, CCC4.getCc() + IMC6.getCc() + masaLogica.calcularMasaCorporar());

            } else if (masaLogica.calcularMasaCorporar() > 40) {
                JOptionPane.showMessageDialog(null, CCC4.getCc() + IMC7.getCc() + masaLogica.calcularMasaCorporar());


            }

        } else if (a == 2) {
            ZodiacoLogica zodiacoLogica = new ZodiacoLogica();
            zodiacoLogica.setMes(Integer.parseInt(JOptionPane.showInputDialog(null,"1:enero?"+"\n"+
                    "3:febrero"+"\n"+"4:marzo"+"\n"+"5:abril"+"\n"+"6:junio"+"\n"+"7:julio"+"\n"+"8:agosto"+"\n"+"9:septiembre"+"\n"+
                    "10:octubre"+"\n"+"11:noviembre"+"\n"+"12:diciembre")));
            zodiacoLogica.setDia(Integer.parseInt(JOptionPane.showInputDialog(null,"en que dia nacistes?")));
            zodiacoLogica.zodiacos();
        } else if (a == 3) {
            SalarioLogica salarioLogica = new SalarioLogica();

            salarioLogica.calculos();

        } else if (a == 4) {
            VectorLogica vectorLogica =new VectorLogica();
            vectorLogica.vectores();

        }

    }
}