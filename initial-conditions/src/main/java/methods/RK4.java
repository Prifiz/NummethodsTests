package methods;

public class RK4 extends AbstractOneBodyMethod {

    public RK4() {
        super();
    }

    public RK4(double x0, double y0, double vx0, double vy0) {
        super();
        this.x = x0;
        this.y = y0;
        this.vx = vx0;
        this.vy = vy0;
    }

    public void performStep(double tau) {
        double k1_vx, k2_vx, k3_vx, k4_vx,
                k1_vy, k2_vy, k3_vy, k4_vy,
                k1_x, k2_x, k3_x, k4_x,
                k1_y, k2_y, k3_y, k4_y;

        k1_vx = getAx(x, y);
        k1_vy = getAy(x, y);
        k1_x = vx;
        k1_y = vy;

        k2_vx = getAx(x + k1_x * 0.5 * tau, y);
        k2_vy = getAy(x, y + k1_y * 0.5 * tau);
        k2_x = vx + k1_vx * 0.5 * tau;
        k2_y = vy + k1_vy * 0.5 * tau;

        k3_vx = getAx(x + k2_x * 0.5 * tau, y);
        k3_vy = getAy(x, y + k2_y * 0.5 * tau);
        k3_x = vx + k2_vx * 0.5 * tau;
        k3_y = vy + k2_vy * 0.5 * tau;

        k4_vx = getAx(x + k3_x * tau, y);
        k4_vy = getAy(x, y + k3_y * tau);
        k4_x = vx + k3_vx * tau;
        k4_y = vy + k3_vy * tau;

        vx += (k1_vx + 2 * k2_vx + 2 * k3_vx + k4_vx) * tau / 6;
        vy += (k1_vy + 2 * k2_vy + 2 * k3_vy + k4_vy) * tau / 6;
        x += (k1_x + 2 * k2_x + 2 * k3_x + k4_x) * tau / 6;
        y += (k1_y + 2 * k2_y + 2 * k3_y + k4_y) * tau / 6;
    }

}
