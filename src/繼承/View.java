
package 繼承;

/**
 *
 * @author user
 */
public class View  extends  Object{//可省略繼承object,預設自動繼承object

    private int id;
    private int width;
    private int height;

    //constructer
    public View(int id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }
    
    //getter

    public int getId() {
        return id;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    
    
    
    public void show()
    {
        System.out.println("---"+this.getClass().getSimpleName() +"---");
        System.out.println("id: "+id +" width: "+width+" height: "+height);
        
    }
    
    
    
}
