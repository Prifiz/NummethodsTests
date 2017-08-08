package methods;

public abstract class AbstractOneBodyMethod implements Method {


    double x;
    double y;
    double vx;
    double vy;

    AbstractOneBodyMethod() {
        resetInitials();
    }


    public void resetInitials() {
        final double x0 = 1.0f;
        final double y0 = 0.0f;
        final double vx0 = 0.0f;
        final double vy0 = 2 * Math.PI;
        x = x0;
        y = y0;
        vx = vx0;
        vy = vy0;
        //protected final double vy0 = 4.6f;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getCurrentRho() {
        return getR(x, y);
    }

    public double getCurrentAlpha() {
        return Math.atan(y / x);
    }

    private double getR(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    private double getR3(double x, double y) {
        double r = getR(x, y);
        return r*r*r;
    }

    double getAx(double x, double y) {
        return - 4 * Math.PI * Math.PI * x / getR3(x, y);
    }

    double getAy(double x, double y) {
        return - 4 * Math.PI * Math.PI * y / getR3(x, y);
    }

    private String getPreparedValue(double value) {
        return String.valueOf(value).replace('.', ',');
    }

    public void logState() {
        System.out.println(getPreparedValue(x) + '\t' + getPreparedValue(y));
    }
}

