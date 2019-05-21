/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPod;
import Enums.Extensions;

/**
 *
 * @author joaop
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
