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
public class NextTrackInvalidException extends Exception {
    /**
     * Constructs an instance of <code>NextTrackInvalidException</code> with the
     * specified detail message.
     *
     */
    public NextTrackInvalidException() {
        System.out.println("The track is invalid."+'n'+"Skipping to the next one.");
    }
}
