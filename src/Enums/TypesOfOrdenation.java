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
 * Class that represents the available types of ordenations
 * </p>
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
