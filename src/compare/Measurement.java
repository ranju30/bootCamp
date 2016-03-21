package compare;

public abstract class Measurement implements Unit {


    private double value;
    private Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public double getUnitValue() {
        return unit.getUnitValue();
    }

    @Override
    public Unit getBaseUnit() {
        return unit.getBaseUnit();
    }


    @Override
    public boolean equals(Object otherMeasurement) {

        if (this == otherMeasurement) return true;
        if (otherMeasurement == null || getClass() != otherMeasurement.getClass()) return false;

        Measurement that = (Measurement) otherMeasurement;

        return Double.compare(Math.round(this.value * this.getUnitValue() * 100.0) / 100.0, Math.round(that.value * that.getUnitValue() * 100.0) / 100.0) == 0;
    }

}
