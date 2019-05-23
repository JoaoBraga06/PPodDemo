/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

/**
 *
 * @author joaop
 */
public enum TypesOfOrdenation {NAME,SIZE,LENGHT,DEFAULT;

    /**
     * Converts the Type of Ordenation to String
     * 
     * @param e Type of Ordenation
     * @return String of Type of Ordenation
     */
    public String TypeToString(TypesOfOrdenation e){
        switch(e){
            case NAME: return "Name";
            case SIZE: return "Size";
            case LENGHT: return "Lenght";
            case DEFAULT: return "Default";
            default: return "Invalid";
        }
    }
    

}
