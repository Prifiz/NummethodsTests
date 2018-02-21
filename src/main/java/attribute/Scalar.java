package attribute;

/**
 * Created by PrifizGamer on 16.02.2018.
 */
public abstract class Scalar {

    protected double value;

    public Scalar(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
