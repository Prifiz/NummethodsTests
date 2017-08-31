package random;


import initials.AbstractRectDistributionGenerator;
import initials.InitialStateGenerator;
import initials.NBodyConfiguration;
import initials.NBodyConfiguration2D;

public class RandomRectInitialStateGenerator extends AbstractRectDistributionGenerator implements InitialStateGenerator {

    public RandomRectInitialStateGenerator(double left, double right, double top, double bottom) {
        super(left, right, top, bottom);
    }

    public RandomRectInitialStateGenerator() {
        super(-1.0f, 1.0f, 1.0f, -1.0f);
    }

    public NBodyConfiguration generateCoordinates(int partsCount) {
        NBodyConfiguration configuration = new NBodyConfiguration2D(partsCount);
        for (int i = 0; i < partsCount; i++) {
            double x_cur = new RandomUniformIntervalGenerator(left, right).generateDoubleValue();
            double y_cur = new RandomUniformIntervalGenerator(bottom, top).generateDoubleValue();
            configuration.add2DParticleCoordinates(x_cur, y_cur);
        }

        return configuration;
    }

    public NBodyConfiguration generateVelocities(int partsCount) {
        for (int i = 0; i < partsCount; i++) {
            double vx_cur = new RandomUniformIntervalGenerator()
        }
    }

    public NBodyConfiguration generateMasses(int partsCount) {
        return null;
    }
}
