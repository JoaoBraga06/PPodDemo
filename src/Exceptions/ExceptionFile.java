/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author joaop
 */
public class ExceptionFile {
    /**
     * Number of exceptions
     */
    private int n_exceptions;
    
    /**
     * Type of exceptions
     */
    private String[] list;

    /**
     * Constructor of ExceptionFile
     */
    public ExceptionFile() {
        this.n_exceptions=0;
    }
    
    /**
     * Increments the number of exceptions
     */
    public void add_exception(){
        this.n_exceptions++;
    }
    
    
    public void listExceptions(){
        for(int i=0;i<this.n_exceptions;i++){
            System.out.println("Exception "+i+": "+this.list[i]+'\n');
        }
    }

    /**
     * @return the n_exceptions
     */
    public int getN_exceptions() {
        return n_exceptions;
    }    
}
