/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservices;

import java.io.Serializable;

/**
 *
 * @author Brian Murphy
 * @reference Frances Sheridan, Youtube
 */
public class Rent implements Serializable {
    private String Student;
    private String BookName;
    private String BookCategory;
    
    public Rent(){
        Student = new String();
        BookName = new String();
        BookCategory = new String();
    }

    public String getStudent() {
        return Student;
    }

    public String getBookName() {
        return BookName;
    }

    public String getBookCategory() {
        return BookCategory;
    }

    public void setStudent(String Student) {
        this.Student = Student;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public void setBookCategory(String BookCategory) {
        this.BookCategory = BookCategory;
    }
    
}
