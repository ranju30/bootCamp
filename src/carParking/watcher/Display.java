package carParking.watcher;

public class Display {
    private int size;
    private int maxCapacity;

    public Display(int size, int maxCapacity) {
        this.size = size;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Display display = (Display) o;

        return size == display.size && maxCapacity == display.maxCapacity;
    }
}
