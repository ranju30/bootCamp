package length;

public class Centimeter {

    private double centimeter;

    public Centimeter(double centimeter) {
        this.centimeter = centimeter;
    }

    public Millimeter convertToMillimeter() {
        return new Millimeter(centimeter * 10);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Centimeter that = (Centimeter) o;

        return Double.compare(that.centimeter, centimeter) == 0;

    }

    public Centimeter add(Centimeter otherCentimeter) {
        return new Centimeter(this.centimeter + otherCentimeter.centimeter);
    }

    public Inch convertToInch() {
        return new Inch(this.centimeter/2.5);
    }
}
