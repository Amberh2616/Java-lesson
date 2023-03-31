/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp.pkg1;

/**
 *
 * @author AMBER
 */

public class NewClass_猜密碼 {
    public static void main(String[] args) {
        跑流程();
    }
    public static int 猜;
    public static int 答;
    
    public static void 設答(){
        答=6;
    }
    
public static void 猜答(){
    猜=(int)(Math.random()*10);
    
}
    public static void 比對(){

    System.out.println ("答"+答);
    System.out.println ("猜"+猜);
    if (答==猜) { 
        System.out.println("猜對");}
    else{ System.out.println("猜錯");
        }
    }
         public static void 跑流程(){
         設答();
         猜答();
         比對();
         
     }
}
