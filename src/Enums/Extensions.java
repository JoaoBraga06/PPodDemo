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
public enum Extensions {mp3,mp4,mov;

    /**
     * Converts the Extension to String
     * 
     * @param e Extension
     * @return String of extension
     */
    public String ExtensionsToString(Extensions e){
        switch(e){
            case mp3: return "MP3";
            case mp4: return "MP4";
            case mov: return "MOV";
            default: return "Invalid";
        }
    }
    
}
