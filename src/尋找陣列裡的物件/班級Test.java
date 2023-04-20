/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 尋找陣列裡的物件;

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
       班級 c;
        
        x1 = new 學生();
        x1.id =1;
        x1.name = "jws";
        x1.eng = 100;
        x1.math = 99;
        
        x2 = new 學生();
        x2.id =2;
        x2.name = "aa";
        x2.eng = 50;
        x2.math = 59;
        
        
        
        c = new 班級();
        c.名稱 = "甲班";
        c.加入學生(x1);
        c.加入學生(x2);
        c.顯示資料();
        
        學生 x;
        x = c.find學生byid(1);
        if (x==null){
        System.out.println("找不到");
} else {
     System.out.println("找到"+x.name);
}

}

    }
    

