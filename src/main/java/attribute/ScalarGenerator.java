package attribute;

import random.RandomGenerator;

public interface ScalarGenerator {
    Scalar generateScalar();
    void setRandomGenerator(RandomGenerator generator);
}
