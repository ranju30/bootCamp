package compare;

public enum LengthUnit implements Unit {
    FEET(12),
    INCH(1),
    CENTIMETER(0.4),
    MILLIMETER(0.04);

    private double unitValueInInch;

    LengthUnit(double unitValueInInch) {
        this.unitValueInInch = unitValueInInch;
    }

    @Override
    public double getUnitValue() {
        return unitValueInInch;
    }

    @Override
    public Unit getBaseUnit() {
        return LengthUnit.INCH;
    }

}
