/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp.pkg1;

/**
 *
 * @author user
 */
public class NewClass_亂數 {
     public static double r;
    public static int eng;

  public  static void  設定初值(){
System.out.println("------設定-----");
r = Math.random();
}

 public static void 顯示結果() {
        System.out.println("亂數"+r);}


public static void 產生英文成績() {

eng = (int) (r*101.0);
}
public static void 顯示英文成績() {
        System.out.println("英文成績"+eng);
}
public static void 跑流程() {
        設定初值();
         顯示結果();
     產生英文成績();
     顯示英文成績();
}
}
