/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author mostafa
 */
@ManagedBean(name="user")
@SessionScoped
public class User {
     private Data e = new Data();
     private ArrayList<Data> friends ;

    public void setFriends(ArrayList<Data> friends) {
        this.friends = friends;
    }

    public ArrayList<Data> getFriends() {
        return friends;
    }
    
    public User() {
        
        friends = new ArrayList<>() ;
    }
    public String addfriend()
    {
        return "Add";
    }
    
    public String showallfriends()
    {
        return "show";
    }
    
     public void  deletefriend()
    {
        
       this.friends.remove(e);
       e.setSize((e.getSize()-1));
      // return "show";
    }

    public void setE(Data e) {
        this.e = e;
    }

    public Data getE() {
        return e;
    }
         public String back()
    {
        
        return "index";
    }
          public String submitadd()
    {
        
        this.friends.add(e);
         e.setSize((e.getSize()+1));
      //  this.e=new Data();
        
        return "index";
    }
   
    
    
}
