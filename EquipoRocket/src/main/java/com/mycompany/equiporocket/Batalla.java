
package com.mycompany.equiporocket;


public class Batalla {
    public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
       
        
        
        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
           
            atacar(pokemon1, pokemon2);
            if (pokemon2.getSalud() > 0) {
                atacar(pokemon2, pokemon1);
            }
        }
        
        if (pokemon1.getSalud() <= 0 && pokemon2.getSalud() <= 0) {
            System.out.println("La batalla terminó en empate.");
        } else if (pokemon1.getSalud() <= 0) {
            System.out.println(pokemon2.getNombre() + " ha ganado la batalla!");
        } else {
            System.out.println(pokemon1.getNombre() + " ha ganado la batalla!");
        }
    }

    
    public void atacar(Pokemon atacante, Pokemon defensor) {
        
        double multiplicador = atacante.getTipo().obtenerMultiplicadorDeDanio(atacante.getTipo(), defensor.getTipo());
        double dano = atacante.getPuntosDeAtaque();
        defensor.setSalud(defensor.getSalud() - dano);  
        
       
        System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " causando " + dano + " puntos de daño.");
        System.out.println(defensor.getNombre() + " - Salud restante: " + defensor.getSalud());
    }
}
