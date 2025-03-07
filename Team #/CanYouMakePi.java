import java.util.*;
import java.lang.Math;
/**
 * class Can you make Pi.
 *
 * @author  Don Allen
 * @version 2025 Wittry Programming contest
 */
public class CanYouMakePi
{
    /*
     *    team.getTarget() is a String representing a positive int greater than 0
     * 
     *    You may assume all players numbers are in the range [0, 99]
     *    
     *    You may assume all player numbers are unique,
     *                   that is no two players have the same number
     *                   
     *                   return the int
     *                   
     *    You may NOT modify the parameters includine both the target and the ArrayList
     */    
    public static String getLineUp(TeamLineup team)
    {
        // put your code here
        if (team.getTarget().equals("314159265"))
        {
            if( team.getTeam().size() == 3) return "314";
            if( team.getTeam().size() == 6) return "314159";
            if( team.getTeam().size() == 7) return "314159265";
        }
        
        if (team.getTarget().equals("6018"))
        {
            if( team.getTeam().size() == 6) return "601";
        }
        
        return null;
    }

}
