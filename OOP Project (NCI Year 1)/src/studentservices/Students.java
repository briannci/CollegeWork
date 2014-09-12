/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservices;

/**
 * Students.java
 * 20/04/2013
 * @author Ben Callaghan
 */
public class Students {

    private String name, time, stdntId;
    private int phone, year;

    public Students(String name, String stdntId, int phone, String time, int year) {
        this.name = name;
        this.stdntId = stdntId;
        this.phone = phone;
        this.year = year;
        this.time = time;
    }

    Students(String name, String stdntId, int phone, int year, String time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getstdntId() {
        return stdntId;
    }

    public void setstdntId(String stdntId) {
        this.stdntId = stdntId;
    }

    public String getDetails() {
        return "Student Name: " + name + "\nStudent Id:" + stdntId+"\nPhone: "+0+phone+"\nYear: "+year+"\nTime: "+time;
    }

   
    }

