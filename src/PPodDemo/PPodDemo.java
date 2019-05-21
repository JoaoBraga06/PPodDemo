/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPodDemo;
import PPod.*;
import Enums.*;

/**
 *
 * @author joaop
 */
public class PPodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("Antonio", Extensions.mp3, 1, 90);
        File f1 = new File("Braga", Extensions.mp3, 20, 30);
        File f2 = new File("Joao", Extensions.mp3, 60, 120);
        File f3 = new File("Diogo", Extensions.mov, 2000, 2);
        PPod p = new PPod();
                
        p.addFile(f);
        p.addFile(f1);
        p.addFile(f2);
        p.addFile(f3);
        p.playTrack(2);
        p.playTrack(1);
        p.nextTrack();
        p.previousTrack();
 
    }
    
}
