/*
    Job of Feet
        - to convert gallon to litter.
        - to compare two gallon objects.
 */
package compare;

public class Gallon {
    private double gallon;

    public Gallon(double gallon) {
        this.gallon = gallon;
    }

    public Litre convertToLitre() {
        return new Litre(this.gallon * 3.78);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gallon gallon1 = (Gallon) o;

        return Double.compare(gallon1.gallon, gallon) == 0;
    }
}
