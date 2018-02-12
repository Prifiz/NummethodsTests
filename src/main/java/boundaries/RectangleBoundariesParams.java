package boundaries;

/**
 * Created by PrifizGamer on 12.02.2018.
 */
public class RectangleBoundariesParams extends AbstractBoundariesParams {
    private double left;
    private double bottom;
    private double width;
    private double height;

    public double getLeft() {
        return left;
    }

    public double getBottom() {
        return bottom;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public RectangleBoundariesParams(double left, double bottom, double width, double height) {
        this.left = left;
        this.bottom = bottom;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return BoundariesNames.RECTANGLE_BOUNDARY;
    }
}
