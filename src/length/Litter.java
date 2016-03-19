package length;

public class Litter {
    private double litter;

    public Litter(double litter) {
        this.litter = litter;
    }


    public Litter add(Gallon gallon) {
        return new Litter(this.litter + gallon.convertToLitter().litter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Litter litter1 = (Litter) o;

        return Double.compare(Math.round(litter1.litter), Math.round(litter)) == 0;
    }
}
