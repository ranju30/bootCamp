/*
Job of Probability:
    to calculate chance of of occurring any event.
 */

package probability;

public class Probability {

    private int sampleSpace;

    public Probability(int sampleSpace) {
        this.sampleSpace = sampleSpace;
    }

    public double getChanceOfOccurrenceAtEveryTime(int numberOfFlips) {
        return Math.pow((1.0 / sampleSpace), numberOfFlips);
    }

    public double getChanceOfNotOccurrence(int numberOfFlips) {
        return 1.0 - this.getChanceOfOccurrenceAtEveryTime(numberOfFlips);
    }

    public double getChanceOfAtLeastOneOccurrence(int numberOfFlips) {
        return 1.0 - this.getChanceOfOccurrenceAtEveryTime(numberOfFlips);
    }
}
