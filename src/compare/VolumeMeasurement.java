package compare;

public class VolumeMeasurement extends Measurement {
    private double value;

    public VolumeMeasurement(double value, Unit unit) {
        super(value, unit);
        this.value = value;
    }

    public boolean equalsTo(VolumeMeasurement otherVolumeMeasurement) {
        return super.equals(otherVolumeMeasurement);
    }

    public VolumeMeasurement add(VolumeMeasurement otherVolumeMeasurement) {
        return new VolumeMeasurement(this.getUnitValue() * this.value + otherVolumeMeasurement.getUnitValue() * otherVolumeMeasurement.value, this.getBaseUnit());
    }
}
