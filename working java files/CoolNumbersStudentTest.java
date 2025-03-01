import java.util.*;

/**
 * The test class
 *
 * @author  Don Allen
 * @version 2025 Wittry programming contest
 */
public class CoolNumbersStudentTest extends junit.framework.TestCase
{
    public void testCoolNumbers00()
    {
        assertEquals(1, CoolNumbers.getDensce(7));
        assertEquals(2, CoolNumbers.getDensce(316));
        assertEquals(1, CoolNumbers.getDensce(886));
        assertEquals(4, CoolNumbers.getDensce(14319));
        assertEquals(0, CoolNumbers.getDensce(27867));
        assertEquals(0, CoolNumbers.getDensce(16));

        assertEquals( 3, CoolNumbers.getShavar(21));
        assertEquals( 4, CoolNumbers.getShavar(45));
        assertEquals( 5, CoolNumbers.getShavar(429));
        assertEquals( 7, CoolNumbers.getShavar(5461));
        assertEquals( 4, CoolNumbers.getShavar(85));
        assertEquals( 6, CoolNumbers.getShavar(725));
        
        assertEquals(1+3, CoolNumbers.getCoolness(117));
        assertEquals(0, CoolNumbers.getCoolness(99));
        assertEquals(9, CoolNumbers.getCoolness(6101));
        assertEquals(8, CoolNumbers.getCoolness(14319));
        
        assertEquals(101, CoolNumbers.getNextNumberWithGreaterCoolness(99));
        assertEquals(106, CoolNumbers.getNextNumberWithGreaterCoolness(101));
        assertEquals(381, CoolNumbers.getNextNumberWithGreaterCoolness(253));
    }
}