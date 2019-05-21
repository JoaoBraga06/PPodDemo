/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPod;
import Enums.TypesOfOrdenation;

/**
 *
 * @author joaop
 */
public interface PPodContract {
    /**
     * Adds a file to player
     * 
     * @param file File to add
     * @return Sucess
     */
    public boolean addFile(File file);
    
    /**
     * Deletes a file of player
     * 
     * @param index Position of the file to delete
     * @return Sucess
     */
    public boolean deleteFile(int index);
    
    /**
     * Tries to play the track on the index position.
     * The playing of the track is simply printing his name and lenght on the screen. 
     * 
     * @param index Position of the Track to play
     */
    public void playTrack(int index);
    
    /**
     * Plays the next track.
     */
    public void nextTrack();
    
    /**
     * Plays the previous track
     */
    public void previousTrack();
    
    /**
     * Shuffle plays the tracks
     * 
     * @param type Type of the shuffle plat
     */
    public void shufflePlay(TypesOfOrdenation type);
}
