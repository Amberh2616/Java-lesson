/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp.pkg1;

import static javaapp.pkg1.NewClass333.avg;
import static javaapp.pkg1.NewClass333.eng;
import static javaapp.pkg1.NewClass333.math;
import static javaapp.pkg1.NewClass333.name;
import static javaapp.pkg1.NewClass333.tol;

/**
 *
 * @author user
 */
public class NewClass_bank {

    public static String 帳戶名;
    public static int 餘額;
    public static int 存款金額;
    public static int 提款金額;
    public static int 初始餘額設定;

    public static void 設定初值() {
        System.out.println("------設定-----");
        帳戶名 = "AAAAAAA";
        餘額 = 1000;
        
   
    }

    public static void 計算總數() {
        System.out.println("------計算總數-----");
        餘額 = 存款金額 += 提款金額;
    }

    public static void 存款() {
        System.out.println("------存款-----");
    存款金額 = 500;
        System.out.println(存款金額 );
       餘額+= 存款金額;
    }
    public static void 提款() {
         System.out.println("------提款-----");
    提款金額 = 100;
    
     System.out.println("------提款-----");
        if (提款金額 > 存款金額) {
            System.out.println("提款失敗");
        } else {
            System.out.println("提款成功");
        }
    }
    public static void 顯示帳戶資訊() {
 System.out.println("------資訊-----");
       System.out.println("帳戶名: " + 帳戶名);
       System.out.println("餘額 " + 餘額);
    }
}
