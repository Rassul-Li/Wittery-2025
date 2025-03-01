import java.util.*;

/**
 * The test class
 *
 * @author  Don Allen
 * @version 2025 Wittry programming contest
 */
public class OneD_funStudentTest extends junit.framework.TestCase
{
    public void testTwoD_student00()
    {
        assertEquals(8, OneD_fun.getFloor(new int[]{13, 6, 8, 15, 3, 11}, 10));
        assertEquals(-2, OneD_fun.getFloor(new int[]{13, 6, 8, 15, 3, 11}, 2));
        assertEquals(13, OneD_fun.getCeiling(new int[]{13, 6, 8, 15, 3, 11}, 12));

        assertEquals(false, OneD_fun.makeSum(new int[]{10, 2, 1, 3}, 7));
        assertEquals(true, OneD_fun.makeSum(new int[]{10, 2, 1, 3}, 13));
        assertEquals(true, OneD_fun.makeSum(new int[]{8, 2, 1, 8}, 17));

        assertEquals(7, OneD_fun.getMissingSum(new int[]{10, 2, 1, 3}));
        assertEquals(9, OneD_fun.getMissingSum(new int[]{2, 3, 1, 2, 10}));
        assertEquals(16, OneD_fun.getMissingSum(new int[]{8, 2, 44, 1, 4}));
        assertEquals(4, OneD_fun.getMissingSum(new int[]{1, 2}));
        assertEquals(1, OneD_fun.getMissingSum(new int[]{10, 6, 3, 2}));

        int[] ans = OneD_fun.getClosestNthPartialSum(new int[] {1, 2, 3, 4, 5}, 9, 3);
        assertEquals(3, ans.length);
        assertEquals(2, ans[0]);
        assertEquals(3, ans[1]);
        assertEquals(4, ans[2]);

        ans = OneD_fun.getClosestNthPartialSum(new int[] {1, 2, 3, 4, 5, 6}, 15, 4);
        assertEquals(4, ans.length);
        assertEquals(2, ans[0]);
        assertEquals(3, ans[1]);
        assertEquals(4, ans[2]);
        assertEquals(5, ans[3]);

        ans = OneD_fun.getClosestNthPartialSum(new int[] {5, -2, -8, 7, -5, 11}, -2, 2);
        assertEquals(2, ans.length);
        assertEquals(-8, ans[0]);
        assertEquals(7, ans[1]);

        int[] ans1 = OneD_fun.getClosestPartialSum(new int[] {6, -1, -4, 2, 10, -7, 9}, 12);
        assertEquals(2, ans1.length);
        assertEquals(2, ans1[0]);
        assertEquals(10, ans1[1]);

        ans1 = OneD_fun.getClosestPartialSum(new int[] {11, 6, -1, -4, 2, 10, -7, 9}, 1);
        assertEquals(3, ans1.length);
        assertEquals(6, ans1[0]);
        assertEquals(-1, ans1[1]);
        assertEquals(-4, ans1[2]);

        ans1 = OneD_fun.getClosestPartialSum(new int[] {0, 1, 2, 3, 4, 5, 6}, 11);
        assertEquals(2, ans1.length);
        assertEquals(5, ans1[0]);
        assertEquals(6, ans1[1]);

        ans1 = OneD_fun.getClosestPartialSum(new int[] {10, 0, -12, 8, -14, 7, -9, 6, -11}, -20);
        assertEquals(5, ans1.length);
        assertEquals(-12, ans1[0]);
        assertEquals(8, ans1[1]);
        assertEquals(-14, ans1[2]);
        assertEquals(7, ans1[3]);
        assertEquals(-9, ans1[4]);
    }
}