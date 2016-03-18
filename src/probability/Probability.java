/*
Job of Probability:
    to calculate chance of of occurring any event.
 */

package probability;

import exceptions.InvalidInputException;

public class Probability {

    private double chance;

    private Probability(double chance) {
        this.chance = chance;
    }

    public static Probability create(double chance) throws InvalidInputException {
        if (chance < 0 || chance > 1)
            throw new InvalidInputException("Expected: between 0 to 1,\nActual: ", chance);
        return new Probability(chance);
    }

    public Probability occurrence(Probability anotherProbability) throws InvalidInputException {
        return create(this.chance * anotherProbability.chance);
    }

    public Probability notOccurrence() throws InvalidInputException {
        return Probability.create(1.0 - this.chance);
    }

    public Probability or(Probability otherProbability) throws InvalidInputException {
        Probability result = this.notOccurrence().occurrence(otherProbability.notOccurrence());
        return result.notOccurrence();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        return Double.compare(that.chance, chance) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(chance);
        return (int) (temp ^ (temp >>> 32));
    }
}
