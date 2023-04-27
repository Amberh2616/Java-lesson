
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 繼承;

import com.sun.prism.shader.Mask_TextureSuper_AlphaTest_Loader;

/**
 *
 * @author AMBER
 */
public class Test4測試程式 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextView tv_cm;
        EditText et_cm;
        TextView tv_result;
        
        tv_cm = new TextView(1, 50, 20);
        tv_cm.setText("身高(cm)");
        tv_cm.show();
        
        
        et_cm = new EditText(2, 50, 20);
        et_cm.show();
        et_cm.input();
        
        String s_cm;
        s_cm=et_cm.getText().toString();
        
        int i_cm;
        i_cm = Integer.parseInt(s_cm);
                
        double d_m;
        d_m=i_cm/100.0;
        
        String s_result;
        s_result = "你的身高"+d_m+"公尺";
        
        tv_result=new TextView(3, 50, 20);
        tv_result.setText(s_result);
        tv_result.show();
    }
}

      
        
        
        
        
        

