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
     * Sentence
     */
    private static String sentence;
    
    /**
     * Constructs an instance of <code>ExtensionException</code> with the
     * specified detail message.
     *
     */
    public TrackLenghtInvalidException() {
        TrackLenghtInvalidException.sentence="Invalid lenght.";
        System.out.println(TrackLenghtInvalidException.sentence);
    }

    /**
     * @return the sentence
     */
    public static String getSentence() {
        return sentence;
    }

    /**
     * @param aSentence the sentence to set
     */
    public static void setSentence(String aSentence) {
        sentence = aSentence;
    }
}
