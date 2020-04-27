/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author admin
 */
public class NumberBean {
    private static double num=0;
    public NumberBean(double number)
    {
        setNumber(number);
    }
    public double getNumber(){
        return(num);
    }
    public void setNumber (double number)
    {
        num = number;
    }
   public static double getRandomNum(String rangeString){
       try
       {
           num= Double.parseDouble(rangeString);
       }
       catch(Exception e)
       {
           num=10.0;
       }
   return((Math.random()*num));
}
}
