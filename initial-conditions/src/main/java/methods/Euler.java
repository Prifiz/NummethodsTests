package methods;

public class Euler extends AbstractOneBodyMethod {

    public void performStep(double tau) {
        vx += getAx(x, y) * tau;
        vy += getAy(x, y) * tau;
        x += vx * tau;
        y += vy * tau;
    }
}
