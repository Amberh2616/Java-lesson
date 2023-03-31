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
public class NewClass333 {
    
    public static String name ;
    public static int eng;
    public static int math;
    public static int tol;
     public static int avg;
    
    public  static void  設定初值(){
        System.out.println("------初值設定-----");
            name ="amber";
        eng = 100;
        math = 10;
        tol = 1;
        avg = tol / 2;
    
    }
       public static void 顯示值(){
           System.out.println("------顯示值-----");
           System.out.println(name);
           System.out.println(eng);
           System.out.println(math);
            System.out.println(tol);
            System.out.println(avg);
           
       }     
        public static void 計算總數(){
           System.out.println("------顯示值-----");
           tol=eng+math;
                   }
       public static void 計算平均值(){
           System.out.println("------顯示值-----"); 
       avg=tol/2;
               
}
        public static void 評語(){
             System.out.println("------顯示值-----"); 
             if (avg >=90)
            System.out.println( "GOOD");
            if (avg >=70)
            System.out.println( "OK");
            if (avg >=50)
            System.out.println( "NOT GOOD");
        
        }
        
        public static void 跑流程() {
            設定初值();
            顯示值();
            計算總數();
            顯示值();
            計算平均值();
            顯示值();
            評語();
            顯示值();
  
         
        }
        
}



    
