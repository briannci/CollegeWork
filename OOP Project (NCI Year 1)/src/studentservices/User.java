/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservices;

import java.util.ArrayList;

/**
 *
 * @author Brian Murphy
 */
public class User {
    
    String firstname;
    String lastname;
    String username;
    String password;
    



public User(String fname, String lname,String uname,String pword)
{
this.firstname=fname;
this.lastname=lname;
this.username=uname;
this.password=pword;
}

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}