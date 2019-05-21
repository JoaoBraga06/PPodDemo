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
public class FileNullException extends Exception {
    /**
     * Constructs an instance of <code>FileNullException</code> with the
     * specified detail message.
     *
     */
    public FileNullException() {
        System.out.println("File is null.");
    }
}
