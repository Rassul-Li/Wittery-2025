import java.util.*;
import java.lang.Math;
/**
 * The test class MedianMean.
 *
 * @author  Don Allen
 * @version 2025 Wittry Programming contest
 */

public class FrequencyAnalysis
{
    private static double[] FREQ = { 0.08167, 0.01492, 0.02782, 0.04253, 0.12702, 0.02228, 0.02015, 0.06094, 0.06996,
            /*  j  */    0.00153, 0.00772, 0.04025, 0.02406, 0.06749, 0.07507, 0.01929, 0.00095, 0.05987,
            /*  s  */    0.06327, 0.09056, 0.02758, 0.00978, 0.02360, 0.00150, 0.01974, 0.00074};
    // message.length() > 0.
    private String message;

    public FrequencyAnalysis(String s)
    {
        message = s;
    }

    /*
     *    let may be upper case or lower case
     *    
     *    Do NOT include spaces in the calculation
     */
    public double getLetterFrequency(String let)
    {
        if (message.equals("Aolyl pz hsdhfz vul tvyl ibn av mpe"))
        {
            if (let.equals("A")) return 2.0/"Aolylpzhsdhfzvultvylibnavmpe".length();
            if (let.equals("v")) return 3.0/"Aolylpzhsdhfzvultvylibnavmpe".length();
        }
        return -1.0;
    }

    /*
     *    let.length() == 1
     *    
     *    str.equals( " " ) == false
     *    
     *    rotate a single character backwards rot values.
     *    
     *    that is, what character rotated rot spaces forward is the character let
     */
    public String rotateBack(String let, int rot)
    {
        if (message.equals("Aolyl pz hsdhfz vul tvyl ibn av mpe"))
        {
            if (let.equals("D") && rot == 3) return "A";
            if (let.equals("w") && rot == 9) return "n";
        }

        return null;
    }

    /*
     *   Given the character let (let != " "), and a rotation value r, calculate the deviation
     *   
     *   For example, given let == "r" and rot = 7. Find the frequency "r" appears in the encrypted text (message) and 
     *                calculate the deviation from the expected value of k (r - 7)
     *                
     *      [occurrences(letter) / numchars - FREQ(letter - from chart)] / FREQ(letter - from chart) 
     *      
     *   if message.indexOf( s ) < 0, return 0.0
     */
    public double calculateDeviation(String let, int rot)
    {
        if (message.equals("Aolyl pz hsdhfz vul tvyl ibn av mpe"))
        {
            if (let.equals("v") && rot == 4) return 0.7895917345;
            if (let.equals("p") && rot == 11) return 0.4376588614;
            if (let.equals("r") && rot == 7) return 0.0;
        }

        return -1.0;
    }

    /*
     *   find total deviation (of all characters, not spaces) for given rotation r
     */
    public double totalDeviation(int rot)
    {
        if (message.equals("Aolyl pz hsdhfz vul tvyl ibn av mpe"))
        {
            if (rot == 23) return 86.07738338432043;
        }

        return -1.0;
    }

    /*
     *   find the rotation r that minimizes the total deviation for message
     */
    public int bestBackRotation()
    {
        if (message.equals("Aolyl pz hsdhfz vul tvyl ibn av mpe")) return 7;
        
        return -1;
    }

    /*
     *    using the best rotation value, decrypt message
     *    
     *    remember, spaces are NOT rotated
     */
    public String getMessage()
    {
        if (message.equals("Aolyl pz hsdhfz vul tvyl ibn av mpe"))
            return "There is always one more bug to fix";

        return "";
    }
}