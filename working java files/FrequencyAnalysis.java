import java.util.*;
import java.lang.Math;

/**
 * The test class MedianMean.
 *
 * @author Don Allen
 * @version 2025 Wittry Programming contest
 */

public class FrequencyAnalysis {
    private static double[] FREQ = { 0.08167, 0.01492, 0.02782, 0.04253, 0.12702, 0.02228, 0.02015, 0.06094, 0.06996,
            /* j */ 0.00153, 0.00772, 0.04025, 0.02406, 0.06749, 0.07507, 0.01929, 0.00095, 0.05987,
            /* s */ 0.06327, 0.09056, 0.02758, 0.00978, 0.02360, 0.00150, 0.01974, 0.00074 };
    // message.length() > 0.
    private String message;

    public FrequencyAnalysis(String s) {
        message = s;
    }

    /*
     * let may be upper case or lower case
     * 
     * Do NOT include spaces in the calculation
     */
    public double getLetterFrequency(String let) {

        String lowercase = let.toLowerCase();
        String uppercase = let.toUpperCase();

        String copy = message;
        int count = 0;
        while (copy != "") {
            if (copy.charAt(count) == lowercase.charAt(0) || copy.charAt(count) == uppercase.charAt(0)) {
                count++;
            }

            copy.substring(1);
        }

        return count / message.length();
    }

    /*
     * let.length() == 1
     * 
     * str.equals( " " ) == false
     * 
     * rotate a single character backwards rot values.
     * 
     * that is, what character rotated rot spaces forward is the character let
     */
    public String rotateBack(String let, int rot) {

        int aASCII = Integer.valueOf('a');

        int x = Integer.valueOf(let.charAt(0));

        if (x - rot < aASCII) {
            x += 26;
            x -= rot;
        } else {
            x -= rot;
        }

        Character c = (char) x;
        String s = c.toString();

        return s;
    }

    /*
     * Given the character let (let != " "), and a rotation value r, calculate the
     * deviation
     * 
     * For example, given let == "r" and rot = 7. Find the frequency "r" appears in
     * the encrypted text (message) and
     * calculate the deviation from the expected value of k (r - 7)
     * 
     * [occurrences(letter) / numchars - FREQ(letter - from chart)] / FREQ(letter -
     * from chart)
     * 
     * if message.indexOf( s ) < 0, return 0.0
     */
    public double calculateDeviation(String let, int rot) {

        if (message.indexOf(let) < 0) {
            return 0.0;
        }

        int x = 0;
        switch (let) {
            case "a":
                x = 0;
            case "b":
                x = 1;
            case "c":
                x = 2;
            case "d":
                x = 3;
            case "e":
                x = 4;
            case "f":
                x = 5;
            case "g":
                x = 6;
            case "h":
                x = 7;
            case "i":
                x = 8;
            case "j":
                x = 9;
            case "k":
                x = 10;
            case "l":
                x = 11;
            case "m":
                x = 12;
            case "n":
                x = 13;
            case "o":
                x = 14;
            case "p":
                x = 15;
            case "q":
                x = 16;
            case "r":
                x = 17;
            case "s":
                x = 18;
            case "t":
                x = 19;
            case "u":
                x = 20;
            case "v":
                x = 21;
            case "w":
                x = 22;
            case "x":
                x = 23;
            case "y":
                x = 24;
            case "z":
                x = 25;
        }

        double freq = FREQ[x];

        double num = Math.abs((getLetterFrequency(let) - freq) / freq);

        return num;
    }

    /*
     * find total deviation (of all characters, not spaces) for given rotation r
     */
    public double totalDeviation(int rot) {

        ArrayList<Character> chars = new ArrayList<Character>();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ' && !chars.contains(message.charAt(i))) {
                chars.add(message.charAt(i));
            }
        }

        int x = 0;
        for (int i = 0; i < chars.size(); i++) {
            x += calculateDeviation(chars.get(i).toString(), rot);
        }

        return x;
    }

    /*
     * find the rotation r that minimizes the total deviation for message
     */
    public int bestBackRotation() {
        double best = this.totalDeviation(0);
        int bestRot = 0;

        for (int i = 0; i <= 26; i++) {
            double test = this.totalDeviation(i);
            if (test < best) {
                bestRot = i;
                best = test;
            }
        }

        return bestRot;

    }

    /*
     * using the best rotation value, decrypt message
     * 
     * remember, spaces are NOT rotated
     */
    public String getMessage() {
        int rot = this.bestBackRotation();
        String s = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != ' ') {
                s += rotateBack(message.charAt(i) + "", rot);
            } else {
                s += " ";
            }
        }

        return s;
    }
}