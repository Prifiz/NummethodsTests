package boundaries;

/**
 * Created by PrifizGamer on 12.02.2018.
 */
public class RectangleBoundaries implements Boundaries {

    private RectangleBoundariesParams rectangleBoundariesParams;

    public RectangleBoundaries(RectangleBoundariesParams rectangleBoundariesParams) {
        this.rectangleBoundariesParams = rectangleBoundariesParams;
    }

    public double getLeft() {
        return rectangleBoundariesParams.getLeft();
    }

    public double getBottom() {
        return rectangleBoundariesParams.getBottom();
    }

    public double getWidth() {
        return rectangleBoundariesParams.getWidth();
    }

    public double getHeight() {
        return rectangleBoundariesParams.getHeight();
    }

    public boolean isInside(double x, double y) {
        return x >= rectangleBoundariesParams.getLeft() &&
                x <= (rectangleBoundariesParams.getLeft() + rectangleBoundariesParams.getWidth()) &&
                y >= rectangleBoundariesParams.getBottom() &&
                y <= (rectangleBoundariesParams.getBottom() + rectangleBoundariesParams.getHeight());
    }

    @Override
    public String getName() {
        return rectangleBoundariesParams.getName();
    }
}
