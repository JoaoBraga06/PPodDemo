package Exceptions;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Class that represents the Extension Exception
 * </p>
 */
public class ExtensionException extends Exception {
    /**
     * Sentence
     */
    private static String sentence="Extension not supported.";
    
    /**
     * Constructs an instance of <code>ExtensionException</code> with the
     * specified detail message.
     *
     */
    public ExtensionException() {
        ExtensionException.sentence="Extension not supported.";
        System.out.println(ExtensionException.sentence);
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
