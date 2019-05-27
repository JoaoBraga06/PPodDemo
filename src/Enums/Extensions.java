package Enums;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Class that represents the available types of extensions
 * </p>
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
