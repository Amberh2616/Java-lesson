/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp.pkg1;

import static javaapp.pkg1.NewClass333.name;

/**
 *
 * @author user
 */
public class NewClass_bmi {

    public static double cm;
    public static double kg;
    public static double m;
    public static double bmi;

    public static void 設定初值() {
        System.out.println("------bmi 初值設定-----");
        cm = 160;
        kg = 60;
        m = cm / 100.0;
        bmi = kg / (m * m);

    }

    public static void 顯示結果() {
        System.out.println("-----顯示結果-----");
        System.out.println("cm:" + cm);
        System.out.println("kg:" + kg);
        System.out.println("m:" + m);
        System.out.println("bmi:" + bmi);
    }
 public static void 肥胖() {
        System.out.println("-----結果-----");
        if (bmi <18.5) {System.out.println("輕");}
        else if (bmi <24 ) {System.out.println("正常");}
        else if (bmi <27) {System.out.println("過重");}
          
 }
       
    
}
