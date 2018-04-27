import attribute.Vector;
import attribute.generators.FixedValueVectorGenerator;
import boundaries.Boundary;
import boundaries.Range;
import coordinates.CoordinatesGenerator;
import coordinates.DefaultRandomCoordinatesGenerator;
import coordinates.FixedCoordinatesGenerator;
import params.Parameter;
import params.RectangleDistributionConfiguration;
import particles.Particle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        /* Simple rectangular 2D random distribution : START */
        // from UI
        final double x_min = -1.0f;
        final double x_max = 1.0f;
        final double y_min = -1.0f;
        final double y_max = 1.0f;
        final int N = 10;

        // building config object
        Range rangeX = new Range(x_min, x_max).addName("x");
        Range rangeY = new Range(y_min, y_max).addName("y");
        Parameter x = new Parameter(rangeX);
        Parameter y = new Parameter(rangeY);
        RectangleDistributionConfiguration rectangleDistributionConfiguration =
                new RectangleDistributionConfiguration(N);
        rectangleDistributionConfiguration.setX(x);
        rectangleDistributionConfiguration.setY(y);

        // creating particles
        Boundary simpleRectBoundary = new Boundary()
                .addRange(rectangleDistributionConfiguration.getX().getRange())
                .addRange(rectangleDistributionConfiguration.getY().getRange());

        CoordinatesGenerator coordinatesGenerator = new DefaultRandomCoordinatesGenerator(simpleRectBoundary);

        List<Particle> particles = new ArrayList<>();

        try {
            for (int i = 0; i < rectangleDistributionConfiguration.getN(); i++) {
                Vector coordinates = coordinatesGenerator.generate();
                Particle particle = new Particle(coordinates);
                particles.add(particle);
                //System.out.println(coordinates.toString());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        /* Simple rectangular 2D random distribution : END */

        /* Simple manual rectangular 2D random distribution : START */

        int clicksInArea = 3;
        Parameter x1 = new Parameter();
        x1.addExplicitValue(0.1f);
        x1.addExplicitValue(-0.1f);
        x1.addExplicitValue(0.5f);
        Parameter y1 = new Parameter();
        y1.addExplicitValue(0.2f);
        y1.addExplicitValue(0.9f);
        y1.addExplicitValue(-0.8f);

        RectangleDistributionConfiguration rect2 = new RectangleDistributionConfiguration(clicksInArea);
        rect2.setX(x1);
        rect2.setY(y1);

        List<Particle> particlesManual = new ArrayList<>();

        try {
            for (int i = 0; i < rect2.getN(); i++) {
                double xValue = rect2.getX().getExplicitValues().get(i);
                double yValue = rect2.getY().getExplicitValues().get(i);
                CoordinatesGenerator manualGenerator = new FixedCoordinatesGenerator(
                        new FixedValueVectorGenerator(xValue, yValue));
                Vector manualCoordinates = manualGenerator.generate();
                Particle particle = new Particle(manualCoordinates);
                particlesManual.add(particle);
                System.out.println(manualCoordinates.toString());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        /* Simple manual rectangular 2D random distribution : END */

    }
}
