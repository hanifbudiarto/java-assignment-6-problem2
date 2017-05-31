/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6problem2;

/**
 *
 * @author Hanif
 */
public class DigitalMedia extends Media {
    private String director;    
    private final int digitalMediaDaysBorrowed = 20;
    
    public DigitalMedia() {
        setDaysBorrowed(digitalMediaDaysBorrowed);
    }
    
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }    
}
