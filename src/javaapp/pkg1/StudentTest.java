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
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student a;
        a = new Student("amber",60,50);
        System.out.println(a.getName());
        System.out.println(a.getEng());
        System.out.println(a.getMath());
        System.out.println(a.toString());
    }
    
}
