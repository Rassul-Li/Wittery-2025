public class ThrowThoseDiceStudentTest extends junit.framework.TestCase
{
   public void testThrowDice_01()
    {
        ThrowThoseDice ttd = new ThrowThoseDice();
        ttd.addDice(5);
        assertEquals("ttd.getNumTimes(4))", 1, ttd.getNumTimes(4));
        assertEquals("ttd.getOdds(4)[0]", 1, ttd.getOdds(4)[0]);
        assertEquals("ttd.getOdds(4)[1]", 5, ttd.getOdds(4)[1]);

        ttd.clearDice();
        ttd.addDice(6);
        ttd.addDice(6);
        assertEquals("ttd.getNumTimes(7))", 6, ttd.getNumTimes(7));
        assertEquals("ttd.getOdds(7)[0]", 6, ttd.getOdds(7)[0]);
        assertEquals("ttd.getOdds(7)[1]", 36, ttd.getOdds(7)[1]);

        ttd.addDice(6);
        assertEquals("ttd.getNumTimes(7))", 15, ttd.getNumTimes(7));
        assertEquals("ttd.getOdds(7)[0]", 15, ttd.getOdds(7)[0]);
        assertEquals("ttd.getOdds(7)[1]", 6*6*6, ttd.getOdds(7)[1]);

        ttd.addDice(4);
        assertEquals("ttd.getOdds(7)[0]", 71, ttd.getOdds(10)[0]);
        assertEquals("ttd.getOdds(7)[1]", 6*6*6*4, ttd.getOdds(10)[1]);
    }
}