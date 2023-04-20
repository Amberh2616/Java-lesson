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
public class student {
    private CharSequence name;
    private int eng;
    private int math;

    public student(CharSequence name, int eng, int math) {
        this.name = name;
        this.eng = eng;
        this.math = math;
    }

    public CharSequence getName() {
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
        return  "name=" + name.toString() + ", eng=" + eng + ", math=" + math;
    }
}

    
    

