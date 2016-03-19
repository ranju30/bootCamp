/*
    Job of Feet
        - to add litter and gallon
        - compare two litter objects.
 */
package compare;

public class Litre {
    private double litre;

    public Litre(double litre) {
        this.litre = litre;
    }


    public Litre add(Object unit) throws IllegalArgumentException {
        try {
            Gallon gallon = (Gallon) unit;
            return new Litre(this.litre + gallon.convertToLitre().litre);
        }catch (ClassCastException exception) {
            throw new IllegalArgumentException("Litre can only add gallon and litre with it");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Litre litre1 = (Litre) o;

        return Double.compare(Math.round(litre1.litre), Math.round(litre)) == 0;
    }
}
