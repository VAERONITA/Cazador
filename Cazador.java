
import Interfaz.Persona;
import Interfaz.Animal;
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VAERON
 */
public class Cazador implements Persona{
    private int Damage=0;
    Random aleat =new Random();
    

    @Override
    public void Disparar(Animal A) {
        Damage=aleat.nextInt(100);
        A.RecibirDisparo(Damage);
    }
    
}
