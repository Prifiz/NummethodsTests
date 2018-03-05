package attribute.generators;

import attribute.Vector;
import attribute.VectorComponent;
import attribute.VectorImpl;
import random.RandomGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RandomValueVectorGenerator implements VectorGenerator {

    private Map<String, RandomGenerator> randomGeneratorsForComponents;
    private int vectorSize;

    public RandomValueVectorGenerator(int vectorSize, Map<String, RandomGenerator> randomGeneratorsForComponents) {
        this.vectorSize = vectorSize;
        this.randomGeneratorsForComponents = randomGeneratorsForComponents;
    }

    public RandomValueVectorGenerator(Map<String, RandomGenerator> randomGeneratorsForComponents) {
        this.vectorSize = randomGeneratorsForComponents.size();
        this.randomGeneratorsForComponents = randomGeneratorsForComponents;
    }

    @Override
    public Vector generateVector() throws VectorGenerationException {
        List<VectorComponent> vectorComponents = new ArrayList<>(vectorSize);
        for(Map.Entry<String, RandomGenerator> entry : randomGeneratorsForComponents.entrySet()) {
            RandomGenerator randomGenerator = entry.getValue();
            if(randomGenerator == null) {
                throw new VectorGenerationException();
            }
            ScalarGenerator componentGenerator = new RandomValueScalarGenerator(randomGenerator);
            vectorComponents.add(new VectorComponent(componentGenerator.generateScalar(), entry.getKey()));
        }
        return new VectorImpl(vectorComponents);
    }
}
