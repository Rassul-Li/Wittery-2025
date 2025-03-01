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
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        for(int x=0; x<s.length(); x++){
            if(s.charAt(x)=='1'){
                count++;
            }else {
                arr.add(count);
                count = 0;
            }
        }
        arr.add(count);
        int max = arr.get(0);
        for(int x=0; x<arr.size(); x++){
            if(arr.get(x)>max){
                max = arr.get(x);
            }
        }
        if(max<2){
            return 0;
        }
        return max-2;

    }

    /*
     * Shavar rating: every occurrence of a �101� increases the score by 2,
     * unless a 1 is being shared, then the score is increased by 1.
     * In the example below, 21 has a score of 3. (The middle digit is used in both occurrences of 101.)
     * The binary String 101101 (45 =  32+8+4 + 1) has a score of 4
     */
    public static int getShavar(int num)
    {
        String s = Integer.toBinaryString(num);

        return recursive(s);
    }
    public static int recursive(String s){

        if(s.length()<2){
            return 0;
        }else if(s.length()>2&&s.charAt(0)=='1'&& s.charAt(1)=='0'&&s.charAt(2)=='1'){
            if(s.length()>3){
                if(s.charAt(3)=='0'){
                    if(s.length()>4&&s.charAt(4)=='1'){
                        return 1 + recursive(s.substring(2,s.length()));
                    }else{
                        return 2 + recursive(s.substring(3,s.length()));
                    }
                }else{
                    return 2 + recursive(s.substring(3,s.length()));
                }
            }else{
                return 2;
            }



        }else{
            return recursive(s.substring(1,s.length()));
        }

    }

    /*
     * Coolness is the  sum of Densce score and Shavar rating
     */
    public static int getCoolness(int num)
    {
        return getDensce(num) + getShavar(num);
    }

    public static int getNextNumberWithGreaterCoolness(int num)
    {
        int n = getDensce(num) + getShavar(num);
        int count = n+1;
        while(getDensce(count)+getShavar(count)<n){
            count++;
        }
        return count;
    }
}
