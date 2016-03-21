package compare;

public enum VolumeUnit implements Unit {
    LITRE(1),
    GALLON(3.78);


    private double unitValueInLitre;

    VolumeUnit(double unitValueInLitre) {
        this.unitValueInLitre = unitValueInLitre;
    }

    @Override
    public double getUnitValue() {
        return this.unitValueInLitre;
    }

    @Override
    public Unit getBaseUnit() {
        return VolumeUnit.LITRE;
    }
}
