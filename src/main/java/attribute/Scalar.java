package attribute;

/**
 * Created by PrifizGamer on 16.02.2018.
 */
public abstract class Scalar {

    public Scalar(double value) {
        this.value = value;
    }

    protected double value;

    public double getValue() {
        return value;
    }
}
