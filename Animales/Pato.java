/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animales;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author VAERON
 */
public class Pato implements Interfaz.Animal{
    private int Vida;
    Random alea=new Random();
    public Pato(){
        this.GenerarVida();
    }
    
    @Override
    public void RecibirDisparo(int dano) {
        this.Vida-=dano;
        if(Vida>0)
            this.huir();
        else
            JOptionPane.showMessageDialog(null,"El pato ha muerto");
    }

    @Override
    public void GenerarVida() {
        Vida=alea.nextInt(100);
    }

    @Override
    public void huir() {
        JOptionPane.showMessageDialog(null,"El pato escapo es que sabe volar");
    }
    @Override
    public int GetVida() {
        return this.Vida;
    }
}
