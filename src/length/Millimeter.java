package length;

public class Millimeter {

    private double millimeter;

    public Millimeter(double millimeter) {
        this.millimeter = millimeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Millimeter that = (Millimeter) o;

        return Double.compare(that.millimeter, millimeter) == 0;
    }
}
