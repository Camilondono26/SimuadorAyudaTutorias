/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.equiporocket;

/**
 *
 * @author USUARIO
 */
public enum TipoPokemon {
    
    FUEGO,
    AGUA,
    BICHO_PLANTA,
    ELECTRICO,
    TIERRA,
    VOLADOR,
    NORMAL,
    LUCHA,
    NORMAL_VOLADOR,
    VENENO;
    
public double obtenerMultiplicadorDeDanio(TipoPokemon atacante,TipoPokemon defensor){
    
    switch(atacante){
        case FUEGO:
            switch (defensor){
                case AGUA: 
                    return 2;
                case FUEGO:
                    return 1;
                case BICHO_PLANTA:
                case ELECTRICO:
                    return 1;
                case VOLADOR:
                    return 1;
                case TIERRA:
                    return 2;
                case LUCHA:
                    return 1;
                case VENENO:
                    return 1;
                case NORMAL:
                    return 1;
                case NORMAL_VOLADOR:  
                default:
                    return 1;
            }
        case AGUA:
            switch (defensor){
                case AGUA: 
                    return 1;
                case FUEGO:
                    return 0.5;
                case BICHO_PLANTA:
                case ELECTRICO:
                    return 2;
                case VOLADOR:
                    return 1;
                case TIERRA:
                    return 1;
                case LUCHA:
                    return 1;
                case VENENO:
                    return 1;
                case NORMAL:
                    return 1;
                case NORMAL_VOLADOR:  
                default:
                    return 1;
            }
         case BICHO_PLANTA:
            switch (defensor){
                case AGUA: 
                    return 1;
                case FUEGO:
                    return 2;
                case BICHO_PLANTA:
                case ELECTRICO:
                    return 1;
                case VOLADOR:
                    return 2;
                case TIERRA:
                    return 1;
                case LUCHA:
                    return 1;
                case VENENO:
                    return 1;
                case NORMAL:
                    return 1;
                case NORMAL_VOLADOR:  
                default:
                    return 1;
            }
            case ELECTRICO:
            switch (defensor){
                case AGUA: 
                    return 1;
                case FUEGO:
                    return 1;
                case BICHO_PLANTA:
                case ELECTRICO:
                    return 1;
                case VOLADOR:
                    return 2;
                case TIERRA:
                    return 0;
                case LUCHA:
                    return 1;
                case VENENO:
                    return 1;
                case NORMAL:
                    return 1;
                case NORMAL_VOLADOR:  
                default:
                    return 1;
            }
            case TIERRA:
            switch (defensor){
                case AGUA: 
                    return 1;
                case FUEGO:
                    return 1;
                case BICHO_PLANTA:
                case ELECTRICO:
                    return 0;
                case VOLADOR:
                    return 1;
                case TIERRA:
                    return 1;
                case LUCHA:
                    return 1;
                case VENENO:
                    return 1;
                case NORMAL:
                    return 1;
                case NORMAL_VOLADOR:  
                default:
                    return 1;
            }
            case VOLADOR:
            switch (defensor){
                case AGUA: 
                    return 1;
                case FUEGO:
                    return 1;
                case BICHO_PLANTA:
                case ELECTRICO:
                    return 0;
                case VOLADOR:
                    return 1;
                case TIERRA:
                    return 1;
                case LUCHA:
                    return 1;
                case VENENO:
                    return 1;
                case NORMAL:
                    return 1;
                case NORMAL_VOLADOR:  
                default:
                    return 1;
            }
            //TO DO  terminar los cases de daño
    }
 
    
    
    
    
    
    
    
    
    return 0;   
}

 
        
    
}
