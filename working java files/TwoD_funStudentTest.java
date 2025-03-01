import java.util.*;

/**
 * The test class
 *
 * @author  Don Allen
 * @version 2025 Wittry programming contest
 */
public class TwoD_funStudentTest extends junit.framework.TestCase
{
    public void testTwoD_fun00a()
    {
        TwoD_fun td = new TwoD_fun();

        // getLargest: no inputs with same first digit
        int ans = td.getLargest(1, 5, 2, 3);
        assertEquals("td.getLargest(1, 5, 2, 3)", 5321, ans);

        ans = td.getLargest(13, 21, 8, 15);
        assertEquals("td.getLargest(13, 21, 8,15)", 8211513, ans);

        ans = td.getLargest(60, 52, 79, 8);
        assertEquals("td.getLargest(60, 52, 79, 8)", 8796052, ans);

        ans = td.getLargest(8, 6, 9, 12);
        assertEquals("td.getLargest(8, 6, 9, 12)", 98612, ans);

        //  getLargest:  inputs with same first digit

        ans = td.getLargest(1, 20, 2, 10);
        assertEquals("td.getLargest(1, 20, 2, 10)", 220110, ans);

        ans = td.getLargest(1, 10, 13, 130);
        assertEquals("td.getLargest(1, 10, 13, 130)", 13130110, ans);

        // findLargest
        int[][] arr1 = {{1, 2, 3, 4}, { 2, 3, 4, 5}, {3, 4, 5, 6}, {4, 5, 6, 7} };   
        ans = td.findLargest(arr1);    //  column 4
        assertEquals(7654, ans);

        int[][] arr2 = {{16, 9, 3, 14}, { 24, 38, 7, 8}, {6, 42, 55, 0}, {4, 5, 29, 7} };
        ans = td.findLargest(arr2);    //  column 2
        assertEquals(954238, ans);

        int[][] arr3 = {{9, 63, 25, 14}, { 24, 38, 7, 8}, {63, 42, 55, 0}, {14, 5, 29, 7} };
        ans = td.findLargest(arr3);    //  row 1
        assertEquals(9632514, ans);

        // biggestSquare
        int[][] arr1b = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1} };
        ans = td.biggestSquare(arr1b);
        assertEquals(9, ans);

        int[][] arr2b = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 0} };
        ans = td.biggestSquare(arr2b);
        assertEquals(16, ans);

        int[][] arr3b = {{1, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 0}, {0, 1, 1, 1, 1}, {1, 1, 1, 1, 1} };
        ans = td.biggestSquare(arr3b);
        assertEquals(9, ans);

        int[][] arr4b = {{1, 1, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 0, 1, 1} };
        ans = td.biggestSquare(arr4b);
        assertEquals(4, ans);
    }
}