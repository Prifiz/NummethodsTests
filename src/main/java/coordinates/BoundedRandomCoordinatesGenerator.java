package coordinates;

import attribute.Vector;
import attribute.generators.RandomValueVectorGenerator;
import attribute.generators.VectorGenerationException;
import attribute.generators.VectorGenerator;
import boundaries.Boundaries;
import boundaries.RectangleBoundaries;
import random.RandomGenerator;
import random.RandomUniformIntervalGenerator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by PrifizGamer on 27.02.2018.
 */
public class BoundedRandomCoordinatesGenerator implements CoordinatesGenerator {

    private Boundaries boundaries;
    private int size;

    public BoundedRandomCoordinatesGenerator(Boundaries boundaries, int size) {
        this.boundaries = boundaries;
        this.size = size;
    }

    // Adaptive size!
    // Not only this boundaries type!
    // RIGID CODE!

    @Override
    public Vector generate() throws VectorGenerationException {
        Map<Integer, RandomGenerator> randomGeneratorMapping = new HashMap<>();
        RectangleBoundaries rectangleBoundaries = ((RectangleBoundaries)boundaries);
        RandomGenerator xGenerator = new RandomUniformIntervalGenerator(
               rectangleBoundaries.getLeft(), rectangleBoundaries.getLeft() + rectangleBoundaries.getWidth());
        randomGeneratorMapping.put(0, xGenerator);
        RandomGenerator yGenerator = new RandomUniformIntervalGenerator(
                rectangleBoundaries.getBottom(), rectangleBoundaries.getBottom() + rectangleBoundaries.getHeight());
        randomGeneratorMapping.put(1, yGenerator);
        VectorGenerator vectorGenerator = new RandomValueVectorGenerator(size, randomGeneratorMapping);

        return vectorGenerator.generateVector();
    }
}
