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
public class Ex06帳戶測試 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean x;
        x= Ex06帳戶.存款(5000);
        if (x){
            System.out.println("ok");}
        else {
        System.out.println(" not ok");
    }
    }
    
}
