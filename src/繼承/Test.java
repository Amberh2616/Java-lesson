
package 繼承;

/**
 *
 * @author user
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
    
        TextView tv1 = new TextView(1, 50, 20);
        tv1.setText("訊息");
        
        
        TextView tv2 = new TextView(2, 50, 20);
        tv2.setText("請按OK");
        
        Button btn = new Button(3, 50, 20);
        btn.setText("OK");
        
        ViewGroup vg;
        vg=new ViewGroup(4, 50, 20);
        
        
        
        vg.addView(tv1);
        vg.addView(tv2);
        vg.addView(btn);
        vg.show();
        
        tv1.show();
        tv2.show();
        btn.show();
        
        btn.click();
        
        //Button b;
        //b=(Button)vg.findViewById(3);
        //if(b==null)
        //{
           // System.out.println("找不到");
            
        //}
        //else
        //{
            //System.out.println("找到"+b.getId());
        //}
        //b.click();
       
       
                
    }
    
}
