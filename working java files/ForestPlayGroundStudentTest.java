import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2025 Wittry programming contest
 */
public class ForestPlayGroundStudentTest extends junit.framework.TestCase
{
    public void testForestPlayGround01()
    {
        int[] figure1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        ForestPlayGround t = new ForestPlayGround(figure1);

        int[] result = t.getValuesInLeftSubtree(0);
        Arrays.sort(result);
        assertEquals(1, result[0]);
        assertEquals(3, result[1]);
        assertEquals(4, result[2]);
        assertEquals(7, result[3]);
        assertEquals(8, result[4]);
        assertEquals(9, result[5]);
        assertEquals(10, result[6]);
        assertEquals(7, result.length);

        result = t.getValuesInRightSubtree(0);
        Arrays.sort(result);
        assertEquals(2, result[0]);
        assertEquals(5, result[1]);
        assertEquals(6, result[2]);
        assertEquals(11, result[3]);
        assertEquals(12, result[4]);
        assertEquals(5, result.length);

        result = t.getValuesInLeftSubtree(2);    //  return the left subtree of the node at index p
        Arrays.sort(result);
        assertEquals(5, result[0]);
        assertEquals(11, result[1]);
        assertEquals(12, result[2]);
        assertEquals(3, result.length);

        result = t.getValuesInRightSubtree(2);
        Arrays.sort(result);
        assertEquals(6, result[0]);
        assertEquals(1, result.length);

        int[] figure1a = {10, 5, -3, 4, 7, -1, -1, 2};
        t = new ForestPlayGround(figure1a);

        int[] result1 = t.getValuesInLeftSubtree(0);
        Arrays.sort(result1);
        assertEquals(2, result1[0]);
        assertEquals(4, result1[1]);
        assertEquals(5, result1[2]);
        assertEquals(7, result1[3]);
        assertEquals(4, result1.length);

        result1 = t.getValuesInRightSubtree(0);
        Arrays.sort(result1);
        assertEquals(0, result1.length);
        
        assertEquals(true, t.isBST());

        int[] figure2 = {50, 22, 70, 15, 32, 66, 90, 5, 20, 33, 14, 55, 63, 68, 95};
        ForestPlayGround t2 = new ForestPlayGround(figure2);
        boolean lessAns = t2.valsLess(1);
        assertEquals(true, lessAns);
        lessAns = t2.valsLess(2);
        assertEquals(true, lessAns);
        lessAns = t2.valsLess(10);
        assertEquals(true, lessAns);
        lessAns = t2.valsLess(0);
        assertEquals(true, lessAns);
        lessAns = t2.valsLess(4);
        assertEquals(false, lessAns);

        boolean greaterAns = t2.valsGreater(0);
        assertEquals(true, greaterAns);
        greaterAns = t2.valsGreater(1);
        assertEquals(false, greaterAns);
        greaterAns = t2.valsGreater(8);
        assertEquals(true, greaterAns);
        greaterAns = t2.valsGreater(5);
        assertEquals(false, greaterAns);
        greaterAns = t2.valsGreater(4);
        assertEquals(false, greaterAns);

        boolean bstAns2 = t2.isBST();
        assertEquals(false, bstAns2);

        int[] figure3 = {50, 25, 75, 10, 35, 60, 90, 1, 20, 27, 40, 55};
        ForestPlayGround t3 = new ForestPlayGround(figure3);

        boolean bstAns3 = t3.isBST();
        assertEquals(true, bstAns3);
    }
}