/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 陣列Array;

/**
 *
 * @author AMBER
 */
public class 班級Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        學生 x1;
        學生 x2;
        學生 x3;
        班級 c1;
        班級 c2;
        
        x1 = new 學生();
        x1.name = "jws";
        x1.eng = 100;
        x1.math = 99;
        
        x2 = new 學生();
        x2.name = "aaa";
        x2.eng = 50;
        x2.math = 59;
        
        x3 = new 學生();
        x3.name = "kkkkkk";
        x3.eng = 70;
        x3.math = 79;
        
        c1 = new 班級();
        c1.名稱 = "甲班";
        c1.加入學生(x1);
        c1.加入學生(x2);
        c1.顯示資料();
        
        c2 = new 班級();
        c2.名稱 = "乙班";
        c2.加入學生(x1);
        c2.加入學生(x2);
        c2.加入學生(x3);
        c2.顯示資料();
       
}

    }
    

