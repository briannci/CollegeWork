/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservices;

/**
 *
 * @author Brian Murphy
 */
public class Contact {
    
    String Name;
    String StudentID;
    String Query;

public Contact(){
    Name = new String();
    StudentID = new String();
    Query = new String();
}

    public String getName() {
        return Name;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getQuery() {
        return Query;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public void setQuery(String Query) {
        this.Query = Query;
    }
  
}
