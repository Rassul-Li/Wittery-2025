
public class ThrowThoseDice {

    public ThrowThoseDice()
    {
    }
    
    public void clearDice()
    {
    }        

    /*
     *    add a die with numSides to the existing dice
     *
     *   numFaces > 1
     */   
    public void addDice(int numSides)
    {
    }

    /*
     *   returns the number of different ways to roll a total of target
     *   
     *   target >= 0
     */
    public int getNumTimes(int target)
    {
        
/*
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
        assertEquals("ttd.getOdds(7)[1]", 6*6*6*4, ttd.getOdds(10)[1])
*/
        return -1;
    }

    /*
     *   Precondition:  outcomes.length > 0
     *
     *   numerator in index 0, denominator in index 1
     */
    public int[] getOdds(int target)
    {

        return null;
    }
}