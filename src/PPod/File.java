package PPod;
import Enums.Extensions;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Class that represents one File that can be added to one PPod
 * </p>
 */
public class File {
    /**
     * Name
     */
    private String name;
    
    /**
     * Extension
     */
    private Extensions extension;
    
    /**
     * Size (Kb)
     */
    private int size;
    
    /**
     * Lenght (Seconds)
     */
    private int lenght;

    /**
     * Creates a File
     * 
     * @param name Name of the file
     * @param extension Extension of the file
     * @param size Size (Kb) of the file
     * @param lenght Lenght (Seconds) of the file
     */
    public File(String name, Extensions extension, int size, int lenght) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.lenght = lenght;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the extension
     */
    public Extensions getExtension() {
        return extension;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(Extensions extension) {
        this.extension = extension;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the lenght
     */
    public int getLenght() {
        return lenght;
    }

    /**
     * @param lenght the lenght to set
     */
    public void setLenght(int lenght) {
        this.lenght = lenght;
    } 
}