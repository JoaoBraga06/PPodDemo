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
public class MaxFilesException extends Exception {
    /**
     * Constructs an instance of <code>MaxFilesException</code> with the
     * specified detail message.
     *
     */
    public MaxFilesException() {
        System.out.println("Numbers of files exceded.");
    }
}
