package methods;

import utils.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class NBodyConfiguration2D extends AbstractNBodyConfiguration {

    private List<Double> x;
    private List<Double> y;
    private List<Double> vx;
    private List<Double> vy;

    public NBodyConfiguration2D(int N) {
        super(N);
        x = new ArrayList<Double>(N);
        y = new ArrayList<Double>(N);
        vx = new ArrayList<Double>(N);
        vy = new ArrayList<Double>(N);
    }

    protected int getDimensions() {
        return 2;
    }

    public double[] getX() {
        return CollectionUtils.listToRawArray(x, N);
    }

    public double[] getY() {
        return CollectionUtils.listToRawArray(y, N);
    }

    public double[] getVx() {
        return CollectionUtils.listToRawArray(vx, N);
    }

    public double[] getVy() {
        return CollectionUtils.listToRawArray(vy, N);
    }
}
