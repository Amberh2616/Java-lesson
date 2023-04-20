/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 介面;

/**
 *
 * @author AMBER
 */
public class studentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        StringBuilder sb;
        
        s="Amber";
        sb =new StringBuilder("jws");
        student st1;
        st1= new student(s, 70, 60);
        student st2;
        st2= new student(sb, 80, 100);
        System.out.println(st1.toString());
        System.out.println(st2.toString());
    }
    
}
