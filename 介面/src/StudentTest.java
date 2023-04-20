/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        String s;
        StringBuilder sb;
        s= "amber";
        sb= new StringBuilder("jws");
        
        Student st1;
        st1= new Student(s, 99, 50);
        Student st2;
        st2= new Student(sb, 60, 70);
        System.out.println(st1.toString());
         System.out.println(st2.toString());
    }
    
}
