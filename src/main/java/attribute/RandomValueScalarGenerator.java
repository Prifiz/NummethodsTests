package attribute;

import random.RandomGenerator;

public class RandomValueScalarGenerator implements ScalarGenerator {

    public void setRandomGenerator(RandomGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }

    private RandomGenerator randomGenerator;

//    public RandomValueScalarGenerator(RandomGenerator randomGenerator) {
//        this.randomGenerator = randomGenerator;
//    }

    @Override
    public Scalar generateScalar() {
        return new ScalarImpl(randomGenerator.generateDoubleValue());
    }
}