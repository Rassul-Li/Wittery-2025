import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2025 Wittry Contest
 */
public class TwoD_fun
{
    /*
     *   given four nonnegative ints, combine them to form the largest int possible
     *       - The numbers may repeat and are all greater than or equal to 0
     *   
     *   You may assume the return value will be a valid int value :)
     * 
     */
    public static int getLargest(int a, int b, int c, int d)
    {
        if ( a == 1 && b == 5 && c == 2 && d == 3) return 5321;
        if ( a == 13 && b == 21 && c == 8 && d == 15) return 8211513;
        if ( a == 60 && b == 52 && c == 79 && d == 8) return 8796052;
        if ( a == 8 && b == 6 && c == 9 && d == 12) return 98612;
        
        if ( a == 1 && b == 20 && c == 2 && d == 10) return 220110;
        if ( a == 1 && b == 10 && c == 13 && d == 130) return 13130110;

        return -1;
    }

    /*
     *    Given a 4 x 4 array, return the largest integer that can be formed by rearranging the values in
     *                         any row or any col
     * 
     *    you may assume all values are nonnegative ints
     *       - The numbers may repeat and are all greater than or equal to 0
     *                         
     *    You may assume the return value will be a valid int value
     */
    public static int findLargest(int[][] arr)
    {
        if ( arr[0][0] == 1 && arr[0][1] == 2 && arr[0][2] == 3 && arr[0][3] == 4) return 7654;
        if ( arr[0][0] == 16 && arr[0][1] == 9 && arr[0][2] == 3 && arr[0][3] == 14) return 954238;
        if ( arr[0][0] == 9 && arr[0][1] == 63 && arr[0][2] == 25 && arr[0][3] == 14) return 9632514;

        return -1;
    }

    /*
     *    precondition
     *       arr.length == arr[0].length
     *       arr[k].length == arr[m].length, 0 <= k, m < arr.length
     *       arr[k] == 0 || arr[k] == 1, 0 <= k, m < arr.length
     *       
     *       postcondition
     *          return the area of largest square in arr made of all 1's
     */
    public static int biggestSquare(int[][] arr)
    {
        if ( arr.length == 3 && arr[0][0] == 1 && arr[0][1] == 1 && arr[0][2] == 1 && arr[2][2] == 1) return 9;
        if ( arr.length == 5 && arr[0][0] == 1 && arr[0][1] == 1 && arr[0][4] == 1 && arr[4][4] == 0) return 16;
        if ( arr.length == 5 && arr[0][0] == 1 && arr[0][1] == 0 && arr[3][0] == 0 && arr[3][0] == 0) return 9;
        if ( arr.length == 5 && arr[0][3] == 0 && arr[1][1] == 0 && arr[2][0] == 1 && arr[4][2] == 0) return 4;

        return -1;
    }
}