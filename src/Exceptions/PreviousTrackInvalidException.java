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
public class PreviousTrackInvalidException extends Exception {
    /**
     * Constructs an instance of <code>NextTrackInvalidException</code> with the
     * specified detail message.
     *
     */
    public PreviousTrackInvalidException() {
        System.out.println("The track is invalid."+'n'+"Skipping to the previous one.");
    }
}
