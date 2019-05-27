package Exceptions;

import PPod.PPod;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Class that represents the Exception File that contais all the PPod available in the system
 * </p>
 */
public class ExceptionFile{
    /**
     * Inital Size
     */
    private static final int TAM_INI=1;
    
    /**
     * Increments
     */
    private static final int TAM_INC=5;
    
    /**
     * Number of exceptions
     */
    private int n_exceptionsTotal;

    /**
     * Array of PPods
     */
    private PPod[] ppods;
    
    /**
     * Constructor of Exception File
     */
    public ExceptionFile(){
        this.n_exceptionsTotal=0;
        this.ppods = new PPod[TAM_INI];
    }
    
    /**
     * Adds exceptions
     */
    public void addException(){
        this.setN_exceptionsTotal(this.getN_exceptionsTotal() + 1);
    }
    
    /**
     * Adds PPod
     *  
     * @param p PPod to add
     */
    public void addPPod(PPod p){
        int i=0;
        if(this.Size()==this.ppods.length){
            PPod[] temp= new PPod[this.Size()+TAM_INC];
            for (PPod ppod : this.ppods) {
                temp[i]=ppod;
                i++;
            }
            this.ppods=temp;
        }
        this.ppods[this.Size()]=p;
    }
    
    /**
     * Calculates the number of PPods in the Exception File
     * 
     * @return Size Number of PPods 
     */
    private int Size(){
        int i=0;
        while(i<this.ppods.length && this.ppods[i]!=null){
            i++;
        }
        
        return i;
    }

    /**
     * @return the n_exceptionsTotal
     */
    public int getN_exceptionsTotal() {
        return n_exceptionsTotal;
    }

    /**
     * @param n_exceptionsTotal the n_exceptionsTotal to set
     */
    public void setN_exceptionsTotal(int n_exceptionsTotal) {
        this.n_exceptionsTotal = n_exceptionsTotal;
    }
}
