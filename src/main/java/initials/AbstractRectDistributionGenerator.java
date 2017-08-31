package initials;

public class AbstractRectDistributionGenerator {
    protected double left;
    protected double right;
    protected double top;
    protected double bottom;

    public AbstractRectDistributionGenerator(double left, double right, double top, double bottom) {
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
    }
}
