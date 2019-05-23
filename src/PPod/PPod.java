/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPod;
import Enums.*;
import Exceptions.*;

/**
 *
 * @author joaop
 */
public class PPod extends ExceptionFile implements PPodContract{
    /**
     * Max files
     */
    private static final int MAX_FILES=20;
    
    /**
     * Max Capacity (Mb)
     */
    private static final int MAX_CAPACITY=100000;
    
    /**
     * Extension of files
     */
    private static final Extensions extension= Extensions.mp3; 

    /**
     * Files
     */
    private File[] files;
    
    /**
     * Capacity (Kb)
     */
    private double capacity;
    
    /**
     * Index of the file playing at the moment
     */
    private int index;
    
    /**
     * Type of shuffle play
     */
    private TypesOfOrdenation type;
    
    /**
     * Creates a PPod
     * 
     */
    public PPod(){
        super();
        this.files = new File[MAX_FILES];
        this.capacity=0;
        this.type=TypesOfOrdenation.DEFAULT;
    }   
    
    
    @Override
    public boolean addFile(File file) {
        boolean IsAdded=true;
        try{
            if(file==null)
                throw new FileNullException();
            if(this.getCapacity()+file.getSize()>MAX_CAPACITY)
                throw new MemoryFullException();
            if(this.Size()+1>this.files.length)
                throw new MaxFilesException();
            if(file.getLenght()<=0)
                throw new TrackLenghtInvalidException();
        } catch(FileNullException | MemoryFullException | MaxFilesException | TrackLenghtInvalidException e){
            super.add_exception();
            IsAdded=false;
        }
        if(IsAdded){
            this.files[this.Size()]=file;
            //System.out.println("File added."+'\n');
            this.capacity+=file.getSize();
        }
        return IsAdded;
    }

    @Override
    public boolean deleteFile(int index) {
        boolean IsDeleted=true;
        try{            
            if(index-1<0 || index>this.Size())
                throw new InvalidIndexException();
            
        } catch(InvalidIndexException e){
            IsDeleted=false;
        }
        if(IsDeleted){
            this.capacity-=this.files[index-1].getSize();
            for(int i=index-1;i<this.Size()-1;i++){
                this.files[i]=this.files[i+1];
            }
            this.files[this.Size()-1]=null;
            //System.out.println("File deleted."+'\n');
        }
        return IsDeleted;
    }

    @Override
    public void playTrack(int index) {
        boolean IsPlaying=true;
        try{
            if(index-1<0 || index-1>=this.Size())
                throw new InvalidIndexException();
            if(this.files[index-1].getExtension()!=extension)
                throw new ExtensionException();
            if(this.files[index-1].getLenght()<=0)
                throw new TrackLenghtInvalidException();
        } catch(InvalidIndexException | ExtensionException | TrackLenghtInvalidException e){
            IsPlaying=false;
        }
        if(IsPlaying){
            this.index=index-1;
            System.out.println("Name: "+this.files[index-1].getName());
            System.out.println("Size: "+this.files[index-1].getSize()+"Kb");
            System.out.println("Lenght: "+this.files[index-1].getLenght()+"s"+'\n');
        }
    }

    @Override
    public void nextTrack() {
        boolean IsPlaying=true;
        do{
            try{
                if(this.index!=this.Size()-1){
                    if(this.files[this.index++]==null)
                        throw new NextTrackInvalidException();
                }
                else{
                    this.index=0;
                }
            } catch(NextTrackInvalidException e){
                IsPlaying=false;
            }
        }while(!IsPlaying);

        if(IsPlaying){
            this.playTrack(index+1);
        }
    }

    @Override
    public void previousTrack() {
        boolean IsPlaying=true;
        do{
            try{
                if(this.index!=0){
                    if(this.files[this.index--]==null)
                        throw new NextTrackInvalidException();
                }
                else{
                    this.index=this.Size();
                }
            } catch(NextTrackInvalidException e){
                IsPlaying=false;
            }
        }while(!IsPlaying);

        if(IsPlaying){
            this.playTrack(index);
        }
    }
    
    
    @Override
    public void shufflePlay(TypesOfOrdenation type){
        this.type=type;
        switch(this.type){
            case NAME: this.shuffleByName();
            break;
            case SIZE: this.shuffleBySize();
            break;
            case LENGHT: this.shuffleByLenght();
            break;
        }
    }
    
    /**
     * Shuffle the tracks by name
     */
    private void shuffleByName(){
        PPod p_temp = new PPod();
        int first=0;
        
        for(int j=this.Size();j>0;j--){
            for(int i=0;i<this.Size();i++){
                    if(this.files[first].getName().charAt(0)>this.files[i].getName().charAt(0)){
                        first=i;
                    }
            }
            p_temp.addFile(this.files[first]);
            this.deleteFile(first+1);   
            first=0;
        }
        this.files=p_temp.files;
        this.type=TypesOfOrdenation.NAME;
    }
    
    /**
     * Shuffle the tracks by size of files
     */
    private void shuffleBySize(){
        PPod p_temp = new PPod();
        int first=0;
        
        for(int j=this.Size();j>0;j--){
            for(int i=0;i<this.Size();i++){
                    if(this.files[first].getSize()<=this.files[i].getSize()){
                        first=i;
                        
                    }
            }
            p_temp.addFile(this.files[first]);
            this.deleteFile(first+1);
            first=0;
        }
        this.files=p_temp.files;  
        this.type=TypesOfOrdenation.SIZE;
    }
    
    /**
     * Shuffle the tracks by lenght of files
     */
    private void shuffleByLenght(){
        PPod p_temp = new PPod();
        int first=0;
        
        for(int j=this.Size();j>0;j--){
            for(int i=0;i<this.Size();i++){
                    if(this.files[first].getLenght()>this.files[i].getLenght()){
                        first=i;
                        
                    }
            }
            p_temp.addFile(this.files[first]);
            this.deleteFile(first+1);
            first=0;
        }
        this.files=p_temp.files;  
        this.type=TypesOfOrdenation.LENGHT;
    }
    
    /**
     * Plays all the valid tracks in the PPod
     */
    public void playAll(){
        System.out.println("-------- "+"Shuffle type: "+this.type.TypeToString(type)+" --------"+'\n');
        for(int i=0;i<this.Size();i++){
            this.playTrack(i+1);
        }
    }
    
    /**
     * Size ocuppied in the File array
     * 
     * @return Size ocuppied in the File array
     */
    private int Size(){
        int i=0;
        while(i<this.getFiles().length && this.getFiles()[i]!=null){
            i++;
        }
        return i;
    }

   
    /**
     * @return the MAX_FILES
     */
    public static int getMAX_FILES() {
        return MAX_FILES;
    }

    /**
     * @return the MAX_CAPACITY
     */
    public static int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    /**
     * @return the extension
     */
    public static Extensions getExtension() {
        return extension;
    }

    /**
     * @return the files
     */
    public File[] getFiles() {
        return files;
    }

    /**
     * @param files the files to set
     */
    public void setFiles(File[] files) {
        this.files = files;
    }

    /**
     * @return the capacity
     */
    public double getCapacity() {
        return capacity;
    }

}
