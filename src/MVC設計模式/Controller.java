
package MVC設計模式;

/**
 *
 * @author user
 */
public class Controller 
{
    private StudentModel m1;
    private TextView v1;
    
    public void create()
    {
        m1=new StudentModel("Tom", 80, 90);
        v1=new TextView();
      
    }
    
    public void run()
    {
        String s;
        s= m1.getName() +  "\n"+ m1.getEng() + "\n"+  m1.getMath();
        v1.setText(s);
    }
    
  
    }

