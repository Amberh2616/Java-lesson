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
public class Student {
   private String name;
   private int eng;
   private int math;

    public Student(String name, int eng, int math) {
        this.name = name;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", eng=" + eng + ", math=" + math + '}';
    }
    
   
   
   
    
}
