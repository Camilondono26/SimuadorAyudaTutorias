
package com.mycompany.equiporocket;

import java.util.ArrayList;
import java.util.List;


public class Entrenador {
    private String nombre;
    private List<Pokemon> pokemones;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(List<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }
    
    public void agregarPokemon(Pokemon pokemon) {
        this.pokemones.add(pokemon); 
    }
     public void entrenarPokemon(Pokemon pokemon) {
        pokemon.entrenar(pokemon);
    }
    public void mostrarPokemones() {
        if (pokemones.isEmpty()) {
            System.out.println("El equipo no tiene Pokémon.");
        } else {
            System.out.println("Pokémon en el equipo de " + this.nombre + ":");
            for (int i = 0; i < pokemones.size(); i++) {
            Pokemon pokemon = pokemones.get(i);
                System.out.println("Nombre: " + pokemon.getNombre() + 
                                   " - Salud: " + pokemon.getSalud() + 
                                   " - Ataque: " + pokemon.getPuntosDeAtaque() +
                                   " - Tipo: " + pokemon.getTipo());
            }
        }
    }
    
 
    public Pokemon prepararBatalla(int opcion) {
        if (pokemones.isEmpty()) {
            System.out.println("No tienes Pokémon en tu equipo para la batalla.");
            return null; 
        }
        System.out.println("Selecciona un Pokémon para la batalla:");
        mostrarPokemones();  
   
        if (opcion < 1 || opcion > pokemones.size()) {
            System.out.println("Opción no válida.");
            return null;  
        }
        Pokemon pokemonSeleccionado = pokemones.get(opcion - 1); // Restamos 1 para adaptar a índice 0 basado
     System.out.println(pokemonSeleccionado.getNombre() + " está listo para la batalla!");
        return pokemonSeleccionado;
    }
      
    public void cambiarEstadoPokemon(int opcion, EstadoPokemon nuevoEstado) {
        if (opcion < 1 || opcion > pokemones.size()) {
            System.out.println("Opción no válida.");
            return;
        }
        Pokemon pokemon = pokemones.get(opcion - 1);
        pokemon.setEstado(nuevoEstado);  // Cambiar el estado usando el setter
        System.out.println(pokemon.getNombre() + " ahora está " + nuevoEstado.name().toLowerCase() + ".");
    }
}
