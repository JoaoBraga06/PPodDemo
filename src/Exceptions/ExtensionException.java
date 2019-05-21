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
public class ExtensionException extends Exception {
    /**
     * Constructs an instance of <code>ExtensionException</code> with the
     * specified detail message.
     *
     */
    public ExtensionException() {
        System.out.println("Extension not supported.");
    }
}
