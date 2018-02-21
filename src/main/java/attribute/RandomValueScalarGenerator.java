package attribute;

import random.RandomGenerator;

public class RandomValueScalarGenerator implements ScalarGenerator {

    public RandomValueScalarGenerator(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    public void setRandomGenerator(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    private RandomGenerator randomGenerator;

    @Override
    public Scalar generateScalar() {
        return new ScalarImpl(randomGenerator.generateDoubleValue());
    }
}
