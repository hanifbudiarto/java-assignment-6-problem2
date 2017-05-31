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
public class Assignment6Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // initialize a book
        Book childrenBook = new Book();
        childrenBook.setTitle("A tale from North Star");
        childrenBook.setAuthor("Kirana K.");
        
        Book scienceBook = new Book();
        scienceBook.setTitle("Calculus");        
        
        
        childrenBook.borrowed();
        scienceBook.borrowed();       
        
        System.out.println(childrenBook.getTitle()+" borrowed, due date : "+childrenBook.getDueDate());
        System.out.println(scienceBook.getTitle()+" borrowed, due date : "+scienceBook.getDueDate());
        
        // borrow twice?
        childrenBook.borrowed();
        
        DVD ghostInAShellMovie = new DVD();
        ghostInAShellMovie.setTitle("Ghost in a shell");
        ghostInAShellMovie.setDirector("Steven Spielberg");
        
        ghostInAShellMovie.borrowed();
        System.out.println(ghostInAShellMovie.getTitle() +" borrowed, due date : "+ghostInAShellMovie.getDueDate());
        
        Video chainsmokerVevo = new Video();
        chainsmokerVevo.setTitle("Chainsmoker - Closer");
        
        chainsmokerVevo.borrowed();
        System.out.println(chainsmokerVevo.getTitle() + " borrowed, due date : "+chainsmokerVevo.getDueDate());
    }
    
}
