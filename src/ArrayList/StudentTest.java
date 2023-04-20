/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author AMBER
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       x1=new Student();
       x1.name ="阿瓜";
       x1.eng=89;
       x1.math=88;
       x1.id=852;
       
       x2=new Student();
       x2.name ="西瓜";
       x2.eng=56;
       x2.math=87;
       x2.id=698;
       
       x3=new Student();
       x3.name ="北瓜";
       x3.eng=75;
       x3.math=31;
       x3.id=956;
       
       
       f1=new Class();
       f1.名稱="中班";
              
        f1.加入學生(x1);
        f1.加入學生(x2);
        f1.顯示資料();     
      
      
      f2=new Class();
      f2.名稱="大班";
      f2.加入學生(x1);
        f2.加入學生(x2);
        f2.顯示資料(); 
      
              
      
        
        
        Student x;
        x=f1.find學生xxx(852);
        
        if(x==null)
        {
            System.out.println("找不到");
        }
        else
        {
            System.out.println("找到" +x.name);
        }
    }
    
}

