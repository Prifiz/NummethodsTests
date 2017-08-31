package initials;

import utils.CollectionUtils;
import utils.InitialStateConstants;

import java.util.ArrayList;
import java.util.List;

public class NBodyConfiguration2D extends AbstractNBodyConfiguration {

    private List<Double> x_list;
    private List<Double> y_list;
    private List<Double> vx_list;
    private List<Double> vy_list;
    private List<Double> masses;

    public NBodyConfiguration2D(int N) {
        super(N);
        x_list = new ArrayList<Double>(N);
        y_list = new ArrayList<Double>(N);
        vx_list = new ArrayList<Double>(N);
        vy_list = new ArrayList<Double>(N);
        masses = new ArrayList<Double>(N);
    }

    protected int getDimensions() {
        return 2;
    }

    public double[] getX_list() {
        return CollectionUtils.listToRawArray(x_list, N);
    }

    public double[] getY_list() {
        return CollectionUtils.listToRawArray(y_list, N);
    }

    public double[] getVx_list() {
        return CollectionUtils.listToRawArray(vx_list, N);
    }

    public double[] getVy_list() {
        return CollectionUtils.listToRawArray(vy_list, N);
    }

    public double[] getMasses() {
        return CollectionUtils.listToRawArray(masses, N);
    }

    public void add2DParticleCoordinates(double x, double y) {
        this.x_list.add(x);
        this.y_list.add(y);
        this.vx_list.add(InitialStateConstants.DEFAULT_VELOCITY);
        this.vy_list.add(InitialStateConstants.DEFAULT_VELOCITY);
        this.masses.add(InitialStateConstants.DEFAULT_MASS);
    }

    public void set2DparticleVelocities(int particleIdx, double vx, double vy) {
        this.vx_list.set(particleIdx, vx);
        this.vy_list.set(particleIdx, vy);
    }

    public void set2DparticleMass(int particleIdx, double mass) {
        this.masses.set(particleIdx, mass);
    }
}
