
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class ViewGroup extends View//像班級的陣列
{
    private ArrayList<View> views;
    public ViewGroup(int id,int width,int height)
    {
        super(id, width, height);
        this.views=new ArrayList();
    }
        
        
        public void addView(View rtyu)
        {
            this.views.add(rtyu);
        }
      
        @Override  //覆寫 改寫父類別方法
       public void show()
       {
           for(View tyu:views)//反覆迴圈3次
           {
               tyu.show();
           }
       }
       
       //public View findViewById(int id)
       //{
          // for(View yyy:views)
           //{if(yyy.getId()==id)
           //{
               //return yyy;
           //}
           
               
          // }
        //return null;
           
       
       }
        
        
    

    
    

