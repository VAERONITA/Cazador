package Animales;


import Interfaz.Animal;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VAERON
 */
public class Venado implements Animal{

    private int Vida;
    Random alea=new Random();
    public Venado(){
        this.GenerarVida();
    }
    
    @Override
    public void huir() {
        JOptionPane.showMessageDialog(null,"El Venado Escapo es muy Rapido");
    }

    @Override
    public void GenerarVida() {
        Vida=alea.nextInt(100);
    }

    @Override
    public void RecibirDisparo(int dano) {
        this.Vida-=dano;
        if(Vida>0)
            this.huir();
        else
            JOptionPane.showMessageDialog(null,"El Venado ha muerto");
        
    }

    @Override
    public int GetVida() {
        return this.Vida;
    }


    
}
