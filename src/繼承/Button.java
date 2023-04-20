
package 繼承;

/**
 *
 * @author user
 */
public class Button extends TextView
{
    public Button(int id ,int width ,int height)
    {
        super(id, width, height);
    }
    
    public void click()
    {
        System.out.println("---click---");
        System.out.println(this.getText()+"被按下了");
    }
}