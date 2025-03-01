import java.util.*;
import java.lang.Math;

public class CanYouMakePiStudentTest extends junit.framework.TestCase
{
    public void testCanYouMakePi_00()
    {
        ArrayList<Player> team = new ArrayList<Player>();
        team.add( new Player(3, "player 1"));
        team.add( new Player(14, "player 12"));
        team.add( new Player(5, "player 13"));

        TeamLineup t = new TeamLineup("314159265", team); 
        String ans = CanYouMakePi.getLineUp(t);
        assertEquals("getLineUp", "314", ans);

        team.add(0, new Player(9, "player 15"));
        team.add( new Player(65, "player 16"));
        team.add( new Player(15, "player 17"));

        t = new TeamLineup("314159265", team); 
        ans = CanYouMakePi.getLineUp(t);
        assertEquals("getLineUp", "314159", ans);

        team.add(2,  new Player(2, "player 18"));

        t = new TeamLineup("314159265", team); 
        ans = CanYouMakePi.getLineUp(t);
        assertEquals("getLineUp", "314159265", ans);

        team = new ArrayList<Player>();
        team.add( new Player(10, "p1"));
        team.add( new Player(3, "p2"));
        team.add( new Player(5, "p3"));
        team.add( new Player(0, "p4"));
        team.add( new Player(6, "p5"));
        team.add( new Player(1, "p6"));

        t = new TeamLineup("6018", team); 
        ans = CanYouMakePi.getLineUp(t);
        assertEquals("getLineUp", "601", ans);
    }
}