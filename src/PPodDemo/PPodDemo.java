package PPodDemo;
import PPod.*;
import Enums.*;
import Exceptions.*;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Main class where all the other classes are tested
 * </p>
 */
public class PPodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("Braga", Extensions.mp3, 20, 30);
        File f1 = new File("Antonio", Extensions.mp3, 1, 90);
        File f2 = new File("Carlos", Extensions.mp3, 60, 120);
        File f3 = new File("Diogo", Extensions.mp3, 2000, -1);
        ExceptionFile file = new ExceptionFile();
        PPod p = new PPod(file);
        
        PPod a = new PPod(file);
                
        p.addFile(f);
        p.addFile(f1);
        p.addFile(f2);
        p.addFile(f3);
        a.addFile(f3);
        p.shufflePlay(TypesOfOrdenation.NAME);
        p.playAll();
        System.out.println(file.getN_exceptionsTotal());
    }
    
}
