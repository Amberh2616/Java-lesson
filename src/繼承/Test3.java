/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承;

import 尋找陣列裡的物件.學生;


/**
 *
 * @author AMBER
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextView tv1;
        TextView tv2;
        Button btn;
        ViewGroup vg;
    
        tv1 = new TextView(1, 50, 20);
        tv1.setText("訊息");
        
        
        tv2 = new TextView(2, 50, 20);
        tv2.setText("請按OK");
        
        btn = new Button(3, 50, 20);
        btn.setText("OK");
     
        vg =new ViewGroup (4, 50,60 );
        vg.addView(tv1);
        vg.addView(tv2);
        vg.addView(btn);
        vg.show();
        Button b;
        b= (Button) vg.findViewById(3); //(Button)將返回值View 轉Button
 
        if(b==null)
        {
            System.out.println("找不到");
        }
        else
        {
            System.out.println("找到"+b.getId());
        }
       b.click();
    }
}
    //學生 x;
        //x = c.find學生byid(1);
        // if (x==null){
        //System.out.println("找不到");
    //} else {
     //System.out.println("找到"+x.name);
    //}
