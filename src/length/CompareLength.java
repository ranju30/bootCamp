/*
Job of CompareLength:
    To Compare the length of of a particular unit.
 */
package length;

import exceptions.InvalidInputException;

public class CompareLength {

    private double upperUnit;
    private double lowerLength;

    public static CompareLength create(double upperUnit, double lowerUnit) throws InvalidInputException {
        if(upperUnit < 0){
            throw new InvalidInputException("Positive number required but got ",upperUnit);
        }
        if(lowerUnit < 0){
            throw new InvalidInputException("Positive number required but got ",lowerUnit);
        }
        return new CompareLength(upperUnit,lowerUnit);
    }

    private CompareLength(double upperUnit, double lowerUnit) {
        this.upperUnit = upperUnit;
        this.lowerLength = lowerUnit;
    }

    public boolean compare(double length, double expectedLength) {
        return Double.compare((length/this.upperUnit)*lowerLength,expectedLength) == 0;
    }
}
