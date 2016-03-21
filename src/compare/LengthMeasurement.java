package compare;

public class LengthMeasurement extends Measurement {

    private double value;
    private Unit unit;

    public LengthMeasurement(double value, Unit unit) {
        super(value, unit);
        this.value = value;
        this.unit = unit;
    }


    public boolean equalsTo(LengthMeasurement otherLengthMeasurement) {
        return super.equals(otherLengthMeasurement);
    }

    public LengthMeasurement add(LengthMeasurement otherLengthMeasurement) {
        return new LengthMeasurement(this.getUnitValue() * this.value + otherLengthMeasurement.getUnitValue() * otherLengthMeasurement.value, this.getBaseUnit());
    }
}
