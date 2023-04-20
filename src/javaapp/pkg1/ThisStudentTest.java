/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp.pkg1;

import com.sun.prism.impl.BaseMesh;

/**
 *
 * @author AMBER
 */
public class ThisStudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //宣告 物件變數
        學生 a;
        學生 b;
        //new 建立物件
        //=設定給變數來代表它
        a= new 學生();
        a.name = "amber";
        a.eng = 80;
        a.math =50;
        a.show();//執行show 的物件對象是a,即是this
        
        b =new 學生();
        b.name = "tws";
        b.eng = 60;
        b.math= 30;
        b.show();  //執行show 的物件對象是b,即是this
        
        Account x;
        x= new Account();
        x.提款();
        
    }
 
}
