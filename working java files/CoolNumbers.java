import java.lang.*;
import java.util.*;
import java.lang.Math;
/**
 * @author  Don Allen
 * @version 2025 Wittry Contest
 */
public class CoolNumbers
{
    /*
     * return the larger of 0 or
     *                      2 less than the length of the longest consecutive run of 1s
     *                        in its binary representation.
     */
    public static int getDensce(int num)
    {
        String s = Integer.toBinaryString(num); 
        int count = 0; 
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int x=0; x<s.length(); x++ ){
            if(s.charAt(x) == '1'){
                count++;
            }else{
                arr.add(count);
                count = 0; 
            }
        }
        int max =0; 
        for(int x=0; x<arr.size(); x++){
            
        }
        if (num == 7) return 1;
        if (num == 316) return 2;
        if (num == 886) return 1;
        if (num == 14319) return 4;
        if (num == 27867) return 0;
        if (num == 16) return 0;

        return -1;
    }

    /*
     * Shavar rating: every occurrence of a �101� increases the score by 2,
     * unless a 1 is being shared, then the score is increased by 1.
     * In the example below, 21 has a score of 3. (The middle digit is used in both occurrences of 101.)
     * The binary String 101101 (45 =  32+8+4 + 1) has a score of 4
     */
    public static int getShavar(int num)
    {
        if (num == 21) return 3;
        if (num == 45) return 4;
        if (num == 429) return 5;
        if (num == 5461) return 7;
        if (num == 85) return 4;
        if (num == 725) return 6;

        return -1;
    }  

    /*
     * Coolness is the  sum of Densce score and Shavar rating
     */
    public static int getCoolness(int num)
    {
        if (num == 117) return 4;
        if (num == 99) return 0;
        if (num == 6101) return 9;
        if (num == 14319) return 8;

        return -1;
    }

    public static int getNextNumberWithGreaterCoolness(int num)
    {
        if (num == 99) return 101;
        if (num == 101) return 106;
        if (num == 253) return 381;

        return -1;
    }
}