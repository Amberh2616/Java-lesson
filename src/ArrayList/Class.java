/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.ArrayList;

/**
 *
 * @author AMBER
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author user
 */
public class Class {

    public String 名稱;
    private ArrayList< Student>學生們;
   
     
    
    public Class()
     {       
    this.學生們 =  new ArrayList();
         System.out.println("班級 建構完成");
        
    }

    public void 加入學生(Student x)
    {
        this.學生們.add(x);
        System.out.println("加入學生"+ x.name);
    }
    
    public void 顯示資料()
    {
        System.out.println(" " +  this.名稱 + " ");
        for (Student goodjob : 學生們) 
        {
            goodjob.show();
        }
        
        
    }
    
    
    public Student find學生xxx(int id)
    {
    
        for(Student ihavenoideas:學生們)
        {
            if (ihavenoideas.id ==id )
            {
                return ihavenoideas;
            }  
        }
    
            return null;
            
            
    }
}

}
