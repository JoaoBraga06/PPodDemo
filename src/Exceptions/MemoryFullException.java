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
public class MemoryFullException extends Exception {
    /**
     * Constructs an instance of <code>MemoryFullException</code> with the
     * specified detail message.
     *
     */
    public MemoryFullException() {
        System.out.println("Memory is full.");
    }
}
