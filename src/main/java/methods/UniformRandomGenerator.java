package methods;

import java.util.Random;

public class UniformRandomGenerator implements RandomGenerator {

    private final Random random;

    private UniformRandomGenerator() {
        this.random = new Random();
    }

    private static final UniformRandomGenerator INSTANCE = new UniformRandomGenerator();

    public static UniformRandomGenerator getInstance() {
        return INSTANCE;
    }

    public double generateDoubleValue() {
        return random.nextDouble();
    }
}
