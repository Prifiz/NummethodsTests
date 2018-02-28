package boundaries;

public class Range {
    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    private double min;
    private double max;

    public Range(double min, double max) {
        this.min = min;
        this.max = max;
    }
}
