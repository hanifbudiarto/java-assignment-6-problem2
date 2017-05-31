/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6problem2;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Hanif
 */
public class Media {
    
    private String title;
    private int daysBorrowed;
    private Date dueDate;
    private boolean isAvailableToBorrow = true;
    
    private final Calendar calendar = Calendar.getInstance();
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDaysBorrowed() {
        return daysBorrowed;
    }

    public void setDaysBorrowed(int daysBorrowed) {
        this.daysBorrowed = daysBorrowed;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isIsAvailableToBorrow() {
        return isAvailableToBorrow;
    }

    public void setIsAvailableToBorrow(boolean isAvailableToBorrow) {
        this.isAvailableToBorrow = isAvailableToBorrow;
    }    
    
    public void borrowed() {
        if (isAvailableToBorrow) {
            isAvailableToBorrow = false;
            
            System.out.println("A "+ this.toString() +" borrowed...");   
            calendar.setTime(new Date());
            calendar.add(Calendar.DATE, daysBorrowed);
            dueDate = calendar.getTime();            
        }
        else {
            System.out.println ("This "+ this.toString() +" already borrowed");
        }
    }
    
    @Override
    public String toString() {
        return "Media";
    }
        
}
