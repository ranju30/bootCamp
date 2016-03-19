package length;

public class Inch {

    private final double inch;

    public Inch(double inch) {
        this.inch = inch;
    }

    public Centimeter convertToCentimeter() {
        return new Centimeter(inch * 2.5);
    }

    public Inch add(Inch otherInch) {
        return new Inch(this.inch + otherInch.inch);
    }

    public Inch add(Centimeter centimeter){
        return new Inch(this.inch+ centimeter.convertToInch().inch);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Inch inch1 = (Inch) o;

        return Double.compare(inch1.inch, inch) == 0;

    }
}
