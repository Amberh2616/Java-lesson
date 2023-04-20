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
public class 學生 {
       
 // 物件變數 (不加 static)
    public String name;//
    public int eng;
    public int math;

    public void show() {

        System.out.println("-----------");
        System.out.println("name:" + this.name);
        System.out.println("eng:" + this.eng);
        System.out.println("math:" + this.math);
        //System.out.println("tol: " + 工具.加總(this.eng, this.math));
        //System.out.println("avg" + 工具.平均(this.eng, this.math));
}
}

