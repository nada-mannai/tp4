/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class NameBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String firstName = "Missing first name";
    private String lastName = "Missing last Name";
    
    public NameBean(){
        setFirstName(firstName);
        setLastName(lastName);
    }
   public NameBean(String firstName, String lastName){
       setFirstName(firstName);
       setLastName(lastName);
   } 
   public String getFirstName(){
       return (firstName);
   }
   public void setFirstName(String firstName){
       this.firstName=firstName;
   }
   
   public String getLastName(){
       return (lastName);
   }
  
   public void setLastName(String lastName){
       if(!isMissing(lastName)){
           this.lastName = lastName;
       }
       
   }
   private boolean isMissing(String value){
       return ((value == null) || (value.trim().equals("")));
   }
}
