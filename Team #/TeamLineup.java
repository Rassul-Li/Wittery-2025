import java.lang.*;
import java.util.*;
/**
 * Write a description of class TeamLineup here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TeamLineup
{
    // instance variables - replace the example below with your own
    private String teamTarget;
    private ArrayList<Player> team;

    /**
     * Constructor for objects of class TeamLineup
     */
    public TeamLineup(String target, ArrayList<Player> players)
    {
       teamTarget = target;
       team = players;
    }

    public String getTarget()
    {
        return teamTarget;
    }

    public ArrayList<Player> getTeam()
    {
        return team;
    }

    public boolean equals(Object obj)
    {
        TeamLineup tmp = (TeamLineup) obj;
        return getTarget() == tmp.getTarget() && getTeam().equals(tmp.getTeam());
    }
}
