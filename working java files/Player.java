
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int num;
    private String name;

    /**
     * Constructor for objects of class Player
     */
    public Player(int n, String s)
    {
        num = n;
        name = s;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getNumber()
    {
        return num;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    
    public int hashCode()
    {
        return new Integer(getNumber()).hashCode() + getName().hashCode();
    }
    
    public boolean equals(Object obj)
    {
        Player p = (Player) obj;
        
        return getNumber() == p.getNumber() && getName().equals(p.getName());
    }
}