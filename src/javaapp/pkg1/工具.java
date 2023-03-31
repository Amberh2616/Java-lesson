/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp.pkg1;

import java.util.Scanner;

/**
 *
 * @author AMBER
 */
public class 工具 {
  
    public static Scanner sc= new Scanner(System.in);
   
    public static int 輸入成績(){
      System.out.println();
      int x;
      x= sc.nextInt();
      return x;
    }
    
    
    
     public static int 加總(int x,int y){
      int z;
      z = x + y ;
      return z ;
}
     public static double 平均(int x,int y){
      double z;
      z =( x + y )/2.0 ;
      return z ;
}
     

}
