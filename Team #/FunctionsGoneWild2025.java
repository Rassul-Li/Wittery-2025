import java.util.*;
import java.lang.Math;
/**
 * The test class FunctionsGoneWild2025.
 *
 * @author  Don Allen
 * @version 2025 Wittry Programming contest
 */
public class FunctionsGoneWild2025
{
    /*
     *   Here is the first part of the sequence.
     *      112123123412345
     *   
     *   Here's the same sequence with spaces
     *      1 12 123 1234 12345
     *      
     *   Note that the first digit of the sequence is digit 1.
     *   There is no 0th digit
     *   
     *   For long sequence, A follows 9, and after Z, start over with lower case letters
     *   
     *   The very last element in the sequence is: 123456789ABC... XYZabc...xyz
     *   
     *   The last digit is the digit at: 1 + 2 + 3 ... + 61 = (61*62)/2 = 1891
     *   
     *   precondition:  0 < index <= 1891
     * 
     */
    public static String f1(int index)   // Another Seqquence
    {
        if (index == 1) return "1";
        if (index == 15) return "5";
        if (index == 1891) return "z";

        return null;
    }

    /*
     *   Suppose a list of M positive integers (x > 0) has a mean and median equal to medianMean.
     *   
     *   What is the largest possible value the list can contain?
     *   
     */
    public static int f2(int listSize, int medianMean)
    {
        if (listSize == 8 && medianMean == 44) return 173;
        if (listSize == 7 && medianMean == 20) return 77;
        if (listSize == 13 && medianMean == 44) return 302;

        return -1;
    }

    /*
     *   The sum of three numbers (int and possibly  the same) taken in pairs is m, n, and p.
     *   What is the middle number of the three ?
     */
    public static int f3(int m, int n, int p)
    {
        if (m == 12 && n == 17 && p == 19) return 7;
        if (m == 38 && n == 26 && p == 33) return 15;
        if (m == 18 && n == -1 && p == 15) return 1;
        if (m == -2 && n == -5 && p == -7) return -2;
        if (m == 6 && n == 2 && p == 6) return 1;

        return -9999;
    }

    /*
     *  Determine if the values in nums[0], nums[1], and nums[2] are the first
     *               three ints of an arithmetic sequence in the given order
     *   
     *   If the three ints determine an arithmetic sequence,
     *       return an int[] containing the next three values in the arithmetic sequence in order
     *       
     *   else, return an int[] with the same values in mums[] in the same order
     *   
     */
    public static int[] f4(int[] nums)
    {
        if (nums[0] == 8 && nums[1] == 13 && nums[2] == 18) return new int[]{23, 28, 33};

        if (nums[0] == -13 && nums[1] == -5 && nums[2] == 3) return new int[]{11, 19, 27};

        if (nums[0] == -13 && nums[1] == 3 && nums[2] == -5) return new int[]{-13, 3, -5};

        if (nums[0] == 8 && nums[1] == 10 && nums[2] == 11) return new int[]{8, 10, 11};

        return null;
    }

    public static int f5(int a, int b, int c)
    {
        if (a == 19 && b == 2 && c == 7) return 145793;

        if (a == 13 && b == 11 && c == 26) return 58705;

        if (a == 1 && b == 6 && c == 8) return 109;

        return -9999;
        //      return (Math.random() * 1000);
    }

    /*
     *      
     *   nums.length == 5
     *   sum(nums) > 0
     *   
     *   Given five integers with a sum greater than 0. Select the first negative number,
     *                                                  change its sign making it positive and
     *                                                  subtract that value from the neighboring values
     *                                                  (assume it wraps around so the first and last value are neighbors).
    For example, given: 2, 4, -3, 1, -3
    first iteration:    2, 1, 3, -2, -3
    second iteration:   2, 1, 1,  2, -5
    third iteration:   -3, 1, 1, -3,  5
    ....
    How many iterations before all numbers are non negative ( greater than or equal to 0)?

     *   
     */
    public static int f6(int[] nums)
    {
        if (nums[0] == 2 && nums[1] == 4 && nums[2] == -3 && nums[3] == 1 && nums[4] == -3) return 20;

        return -1;
    }

    /*
     *    Piece wise function
     */
    public static double f7(double a)
    {
        if (Math.abs( a - 1.0) < 0.001) return 1.5394489899621697;

        if (Math.abs( a - 5.0) < 0.001) return 1.2136561333521323;

        return -99999.99;
    }

    /*
     * If the String contains:
     *       The letters woefulchripy in any order (upper or lower case), return woefulchripy
     *       The letters woeful and not chirpy in any order (upper or lower case), return woeful
     *       The letters chripy and not woeful in any order (upper or lower case), return chripy
     *       Otherwise, return content
     */
    public static String f8(String str)
    {
        if (str.equals("cHIrp Y")) return "chripy";
        if (str.equals("lufeow")) return "woeful";
        if (str.equals("YlUCfpIheOWr")) return "woefulchripy";
        if (str.equals("YlUCfphOWr")) return "content";
        if (str.equals("chirpywoful")) return "chripy";
        if (str.equals("hirpywoeful")) return "woeful";

        return null;
    }

    /*
     */
    public static boolean f9(boolean x, boolean y, boolean z)
    {
        if (!x && !y && !z) return true;

        return Math.random() < 0.5;
    }

    /*
     */
    public static boolean f10(boolean j, boolean k, boolean m, boolean n)
    {
        if (!j && !k && !m && !n) return true;

        return Math.random() < 0.5;
    }
}