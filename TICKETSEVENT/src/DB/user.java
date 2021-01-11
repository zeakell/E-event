/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author KH
 */
public class user {
     public String username, pass, TTL, email, no_HP;
    
    public user (String username, String pass, String TTL, String email, String no_HP)
    {
           this.username = username;
           this.pass = pass;
           this.TTL = TTL;
           this.email = email;
           this.no_HP = no_HP;
    }
    
    public String callID()
    {
        return username;
    }
    public String callPass()
    {
        return pass;
    }
    public String callTTL()
    {
        return TTL;
    }
    public String callEmail()
    {
        return email;
    }
    public String callnoHP()
    {
        return no_HP;
    }
    
}
