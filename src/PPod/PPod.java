/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPod;
import Enums.Extensions;
import Exceptions.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaop
 */
public class PPod implements PPodContract{
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
     * Creates a PPod
     * 
     */
    public PPod(){
         this.files = new File[MAX_FILES];
         this.capacity=0;
    }   
    
    
    @Override
    public boolean addFile(File file) {
        boolean IsAdded=true;
        try{
            if(file==null)
                throw new FileNullException();
            if(this.capacity+file.getSize()>MAX_CAPACITY)
                throw new MemoryFullException();
            if(this.Size()+1>this.files.length)
                throw new MaxFilesException();
        } catch(FileNullException | MemoryFullException | MaxFilesException e){
            IsAdded=false;
        }
        if(IsAdded){
            this.files[this.Size()]=file;
            System.out.println("File added."+'\n');
            this.capacity+=file.getSize();
        }
        return IsAdded;
    }

    @Override
    public boolean deleteFile(int index) {
        boolean IsDeleted=true;
        try{            
            if(index<0 || index >=this.Size())
                throw new InvalidIndexException();
            
        } catch(InvalidIndexException e){
            IsDeleted=false;
        }
        if(IsDeleted){
            this.capacity-=this.files[index].getSize();
            for(int i=index;i<this.Size()-1;i++){
                this.files[i]=this.files[i+1];
            }
            this.files[this.Size()]=null;
            System.out.println("File deleted."+'\n');
        }
        return IsDeleted;
    }

    @Override
    public void playTrack(int index) {
        boolean IsPlaying=true;
        try{
            if(index-1<0 || index-1>=this.Size())
                throw new InvalidIndexException();
            if(this.files[index-1].getExtension()!=Extensions.mp3)
                throw new ExtensionException();
        } catch(InvalidIndexException | ExtensionException e){
            IsPlaying=false;
        }
        if(IsPlaying){
            this.index=index-1;
            System.out.println("Name: "+this.files[index-1].getName());
            System.out.println("Lenght: "+this.files[index-1].getLenght()+'\n');
        }
    }

    @Override
    public void nextTrack() {
        boolean IsPlaying=true;
        do{
            try{
                if(this.files[this.index++]==null)
                    throw new NextTrackInvalidException();
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
                if(this.files[this.index--]==null)
                    throw new NextTrackInvalidException();
            } catch(NextTrackInvalidException e){
                IsPlaying=false;
            }
        }while(!IsPlaying);
        if(IsPlaying){
           this.playTrack(index+1);
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
    
    
}
