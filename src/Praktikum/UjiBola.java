/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author NIA
 */
public class UjiBola {
    public static void main(String[]args){
        double Jarijari=7;
        bola objekbola = new bola(14);
        objekbola.showDiameter();
        objekbola.showVolume();
        System.out.println("\n\n");
        objekbola.setJarijari(Jarijari);
        objekbola.showLuasPermukaan();
        objekbola.showVolume();
    }
}
