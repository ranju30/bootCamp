package length;

public class Feet {

    private double feet;

    public Feet(double feet) {
        this.feet = feet;
    }

    public Inch convertToInch() {
        return new Inch(feet * 12);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feet feet1 = (Feet) o;

        return Double.compare(feet1.feet, feet) == 0;

    }
}
