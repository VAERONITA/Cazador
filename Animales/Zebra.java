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
public class Zebra implements Interfaz.Animal{
    private int Vida;
    Random alea=new Random();
    public Zebra(){
        this.GenerarVida();
    }
    
    @Override
    public void RecibirDisparo(int dano) {
        this.Vida-=dano;
        if(Vida>0)
            this.huir();
        else
            JOptionPane.showMessageDialog(null,"La Zebra ha muerto");
    }

    @Override
    public void GenerarVida() {
        Vida=alea.nextInt(100);
    }

    @Override
    public void huir() {
        JOptionPane.showMessageDialog(null,"La Zebra escapo ahora esta con sus amigos");
    }
    @Override
    public int GetVida() {
        return this.Vida;
    }
}
