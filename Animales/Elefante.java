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
public class Elefante implements Interfaz.Animal{
    private int Vida;
    Random alea=new Random();
    public Elefante(){
        this.GenerarVida();
    }
    
    @Override
    public void RecibirDisparo(int dano) {
        this.Vida-=dano;
        if(Vida>0)
            this.huir();
        else
            JOptionPane.showMessageDialog(null,"El elefante ha muerto");
    }

    @Override
    public void GenerarVida() {
        Vida=alea.nextInt(100);
    }

    @Override
    public void huir() {
        JOptionPane.showMessageDialog(null,"El Elefante escapo Tiene la piel demasiado gruesa");
    }
    @Override
    public int GetVida() {
        return this.Vida;
    }
    
}
