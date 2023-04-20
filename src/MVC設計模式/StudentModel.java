
package MVC設計模式;

/**
 *
 * @author user
 */
public class StudentModel 
{
    private String name;
    private int eng;
    private int math;

    //constructer
    public StudentModel(String name, int eng, int math) {
        this.name = name;
        this.eng = eng;
        this.math = math;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
    
    
    
    
    
    
    
}
