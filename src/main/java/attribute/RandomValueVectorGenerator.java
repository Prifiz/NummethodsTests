package attribute;

import random.RandomGenerator;

import java.util.Map;

public class RandomValueVectorGenerator implements VectorGenerator {

    private Map<Integer, RandomGenerator> randomGeneratorsForComponents;
    private int vectorSize;

    public RandomValueVectorGenerator(int vectorSize, Map<Integer, RandomGenerator> randomGeneratorsForComponents) {
        this.vectorSize = vectorSize;
        this.randomGeneratorsForComponents = randomGeneratorsForComponents;
    }

    @Override
    public Vector generateVector() throws VectorGenerationException {
        Scalar[] scalars = new Scalar[vectorSize];
        for (int i = 0; i < vectorSize; i++) {
            RandomGenerator randomGenerator = randomGeneratorsForComponents.get(i);
            if(randomGenerator == null) {
                throw new VectorGenerationException();
            }
            ScalarGenerator componentGenerator = new RandomValueScalarGenerator(randomGenerator);
            scalars[i] = componentGenerator.generateScalar();
        }
        return new VectorImpl(scalars);
    }
}
