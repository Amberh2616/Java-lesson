/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 尋找陣列裡的物件;

import java.util.ArrayList;

/**
 *
 * @author AMBER
 */
public class 班級 {
     public String 名稱;
    private ArrayList<學生> 學生們;

    public 班級() {
        this.學生們 = new ArrayList<學生>();
        System.out.println("班級建構完成");
    }

    public void 加入學生(學生 oiu) {
        this.學生們.add(oiu);
        System.out.println("加入學生" + oiu.name);
    }

    public void 顯示資料() {
        System.out.println("---" + this.名稱 + "顯示資料----");
        for (學生 jui : this.學生們) {
            jui.show();
        }
    }
    
    public 學生 find學生byid (int id){
        for (學生 jjj:學生們){
            if (jjj.id==id){
            return jjj ;
          }
        }
        
       return null;
         }
        }

