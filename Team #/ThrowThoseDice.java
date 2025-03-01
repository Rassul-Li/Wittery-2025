import java.util.ArrayList;

public class ThrowThoseDice {
    ArrayList<Integer> dice;

    public ThrowThoseDice() {
    }

    public void clearDice() {
        dice = new ArrayList<Integer>();
    }

    /*
     * add a die with numSides to the existing dice
     *
     * numFaces > 1
     */
    public void addDice(int numSides) {
        dice.add(numSides);
    }

    /*
     * returns the number of different ways to roll a total of target
     * 
     * target >= 0
     */
    public int getNumTimes(int target) {
        int x = 0;
        int counter = 1;

        if(target <​ dice.size()) {
            return 0;
        }

        int max = 0;
        for(int i = 0; i < dice.size(); i++) {
            max += dice.get(i);
        }
        if(target > max) {
            return 0;
        }

        if(target == dice.size()) {
            return 1;
         } else {
            return 3;
         }

        for(int i = 0; i <​ dice.size(); i++) {
            
        }

    }

    /*
     * Precondition: outcomes.length > 0
     *
     * numerator in index 0, denominator in index 1
     */
    public int[] getOdds(int target) {

        return null;
    }
}