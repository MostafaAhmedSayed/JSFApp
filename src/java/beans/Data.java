/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.ServiceMode;

/**
 *
 * @author mostafa
 */

public class Data{
 //  @ManagedProperty (value = "#{user}")
  // User user;
   private String name;
   private long size;

    public void setSize(long size) {
        this.size = size;
    }

    public long getSize() {
        return size;
    }
   private String mail;
   private int age;
    
  
    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public int getAge() {
        return age;
    }
  

   /* public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }*/
   
  
}
