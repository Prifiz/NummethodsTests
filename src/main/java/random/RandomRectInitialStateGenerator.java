package random;

import methods.AbstractNBodyConfiguration;
import methods.AbstractRectDistributionGenerator;
import initials.InitialStateGenerator;
import initials.NBodyConfiguration2D;

public class RandomRectInitialStateGenerator extends AbstractRectDistributionGenerator implements InitialStateGenerator {

    public RandomRectInitialStateGenerator(double left, double right, double top, double bottom) {
        super(left, right, top, bottom);
    }

    public AbstractNBodyConfiguration generate(int partsCount) {
        AbstractNBodyConfiguration configuration = new NBodyConfiguration2D(partsCount);
        RandomGenerator randomGenerator = UniformRandomGenerator.getInstance();
        for (int i = 0; i < partsCount; i++) {
            configuration.
        }
    }
}
