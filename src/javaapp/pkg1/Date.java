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
public class Date {
    private int y;
    private int m;
    private int d;

    public Date(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return  y + "/" + m + "/"+ d ;
    }

    }


        
        
   


    

