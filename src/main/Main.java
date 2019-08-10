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
            zodiacoLogica.setMes(Integer.parseInt(JOptionPane.showInputDialog(null,M1.getCc()+"\n"+
                    M2.getCc()+"\n"+M3.getCc()+"\n"+M4.getCc()+"\n"+M5.getCc()+"\n"+M6.getCc()+"\n"+M7.getCc()+"\n"+M8.getCc()+"\n"+M9.getCc()+"\n"+
                    M10.getCc()+"\n"+M11.getCc()+"\n"+M12.getCc())));
            zodiacoLogica.setDia(Integer.parseInt(JOptionPane.showInputDialog(null,MM.getCc())));
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