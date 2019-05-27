package PPod;
import Enums.TypesOfOrdenation;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Class that represents the contract that every PPod has to follow
 * </p>
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
