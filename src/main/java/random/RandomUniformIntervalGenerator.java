package random;

public class RandomUniformIntervalGenerator implements RandomGenerator {

    private double left;
    private double right;

    public RandomUniformIntervalGenerator(double left, double right) {
        this.left = left;
        this.right = right;
    }


    public double generateDoubleValue() {
        RandomGenerator uniformGenerator = UniformRandomGenerator.getInstance();
        return left + (right - left) * uniformGenerator.generateDoubleValue();
    }
}
