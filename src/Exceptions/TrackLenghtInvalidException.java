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
public class TrackLenghtInvalidException extends Exception {
    /**
     * Constructs an instance of <code>TrackLenghtInvalidException</code> with
     * the specified detail message.
     *
     */
    public TrackLenghtInvalidException() {
        System.out.println("Lenght of track invalid."+'\n');
    }
}
