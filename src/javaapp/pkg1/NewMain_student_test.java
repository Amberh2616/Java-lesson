/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp.pkg1;

import com.sun.prism.impl.BaseMesh;

/**
 *
 * @author AMBER
 */
public class NewMain_student_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NewClass_student a;
        NewClass_student b;
        
        a= new NewClass_student();
        a.name = "amber";
        a.eng = 80;
        a.math =50;
        
        a.show();
        
        b =new NewClass_student();
        b.name = "tws";
        b.eng = 60;
        b.math= 30;
        b.show();  
    }
 
}
