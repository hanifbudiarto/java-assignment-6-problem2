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
public class Book extends Media {
    private String author;
    private final int bookDaysBorrowed = 10;    
    
    public Book() {
        setDaysBorrowed(bookDaysBorrowed);
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Override
    public String toString() {
        return "Book";
    }
    
}
