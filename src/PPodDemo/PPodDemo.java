/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPodDemo;
import PPod.*;
import Enums.*;
import Exceptions.*;
import com.sun.demo.jvmti.hprof.Tracker;

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
        File f2 = new File("Carlos", Extensions.mp3, 60, 120);
        File f3 = new File("Diogo", Extensions.mp3, 2000, -1);
        PPod p = new PPod();
        
        PPod a = new PPod();
                
        p.addFile(f1);
        p.addFile(f);
        p.addFile(f2);
        p.addFile(f3);
        a.addFile(f3);
        p.getCapacity();
        System.out.println(p.getN_exceptions());
    }
    
}
