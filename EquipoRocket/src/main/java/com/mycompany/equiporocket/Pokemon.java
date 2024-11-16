
package com.mycompany.equiporocket;


public abstract class Pokemon {
    
    private String nombre;
    private double salud;
    private double puntosDeAtaque;
    private TipoPokemon tipo;
    private EstadoPokemon estado;

    public Pokemon(String nombre, double salud, double puntosDeAtaque, TipoPokemon tipo, EstadoPokemon estado) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        this.estado = EstadoPokemon.NORMAL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public void setPuntosDeAtaque(double puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }

    public EstadoPokemon getEstado() {
        return estado;
    }

    public void setEstado(EstadoPokemon estado) {
        this.estado = estado;
    }

    public void recibirDaño(int daño) {
        this.salud -= daño;
        if (this.salud <= 0) {
            this.salud = 0;
            System.out.println(this.nombre + " ha caído en combate.");
        }
    }
    
    public void cambiarEstado(EstadoPokemon nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println(this.nombre + " está ahora " + nuevoEstado.name().toLowerCase() + ".");
    }
    
    public void aplicarEfectosDeEstado() {
        this.estado.aplicarEfecto(this);
    }
    
    public void entrenar (Pokemon pokemon){
    pokemon.setSalud(pokemon.getSalud() + 5);
        pokemon.setPuntosDeAtaque(pokemon.getPuntosDeAtaque() + 3);
    }
    
    
}

     
    