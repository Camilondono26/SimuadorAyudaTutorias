
package com.mycompany.equiporocket;

public enum EstadoPokemon {
    
    NORMAL,
    CONFUNDIDO,
    ENVENENADO,
    PARALIZADO;

public void aplicarEfecto(Pokemon pokemon) {
        switch (this) {
            case ENVENENADO:
                pokemon.recibirDaño(10); // Daño por veneno cada turno
                System.out.println(pokemon.getNombre() + " está envenenado y recibe daño.");
                break;
            case PARALIZADO:
                System.out.println(pokemon.getNombre() + " está paralizado y no puede atacar.");
                break;
            case CONFUNDIDO:
                if (Math.random() < 0.5) { // 50% de posibilidad de que ataque a sí mismo
                    pokemon.recibirDaño(5);
                    System.out.println(pokemon.getNombre() + " está confundido y se hace daño a sí mismo.");
                } else {
                    System.out.println(pokemon.getNombre() + " está confundido pero no hace nada.");
                }
                break;
            default:
                // Sin efectos para NORMAL
                break;
        }
    }
}