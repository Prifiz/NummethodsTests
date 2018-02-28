import attribute.*;
import attribute.Scalar;
import attribute.generators.*;
import boundaries.*;
import coordinates.BoundedRandomCoordinatesGenerator;
import coordinates.CoordinatesGenerator;
import coordinates.FixedCoordinatesGenerator;
import coordinates.TestCoordinatesGenerator;
import particles.Particle;
import random.RandomGenerator;
import random.RandomUniformIntervalGenerator;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

//        List<Float> stepValues = Arrays.asList(
//                0.5f, 0.2f, 0.1f, 0.05f, 0.01f, 0.005f, 0.001f, 0.0005f, 0.0001f);
//        for(Float tau : stepValues) {
//            calculateErrors(tau);
//        }

//        methods.MethodRunner rungeRunner = new methods.MethodRunnerImpl(new RK4());
//        rungeRunner.run(10000, 0.001f);
//        calculateErrors(0.001f);
//        System.out.println(Math.ulp(1.000002878290556E-10));


//        Method method = new Euler();
//        methods.MethodRunner runner = new methods.MethodRunnerImpl(method);
//        runner.run(1000, 0.001f);// use decorator for options
//
//        InitialStateGenerator initialStateGenerator = new RandomRectInitialStateGenerator();
//        NBodyConfiguration configuration = initialStateGenerator.generateCoordinates(10);

        calculateErrors(0.1f);
    }

//    private static AbstractAttributeGeneratorFactory getFactory(int distributionType, Boundaries boundaries)
//            throws IOException {
//        switch (distributionType) {
//            case 1:
//                return new RandomAttributeGeneratorFactory(boundaries);
//            case 2:
//                return new FixedAttributeGeneratorFactory(boundaries);
//            case 3:
//                return new FormulaAttributeGeneratorFactory(boundaries);
//            default:
//                throw new IOException("No such attribute option!");
//        }
//    }

    //private static int getDimension() {}

    private static void calculateErrors(final float TAU) throws IOException {

        int tabNumber = 1;
        double left = -1.0f;
        double bottom = -1.0f;
        double width = 2.0;
        double hieght = 2.0;
        final int N = 10;

        //int distributionType = 1;

        // UI Adapter: START

        AbstractBoundariesParams abstractBoundariesParams = null;

        switch (tabNumber) {
            case 1:
                abstractBoundariesParams = new RectangleBoundariesParams(left, bottom, width, hieght);
        }
        // UI Adapter: END

        Boundaries boundaries = new DefaultBoundariesGenerator().createBoundaries(abstractBoundariesParams);

        double massMin = 1.0f;
        double massMax = 2.0f;

        ScalarGenerator massGenerator = new RandomValueScalarGenerator(
                new RandomUniformIntervalGenerator(massMin, massMax));

        ScalarGenerator fixedScalarGenerator = new FixedValueScalarGenerator(1.0f);
        Scalar zeroScalar = new ZeroValueScalar();

        VectorGenerator fixedVectorGenerator = new FixedValueVectorGenerator(1.0f, 2.0f, 3.0f);
        Vector fixedVector = fixedVectorGenerator.generateVector();

        Map<Integer, RandomGenerator> randomGeneratorsForComponents = new HashMap<>();
        randomGeneratorsForComponents.put(0, new RandomUniformIntervalGenerator(0.0f, 1.0f));
        randomGeneratorsForComponents.put(1, new RandomUniformIntervalGenerator(-1.0f, 0.0f));
        VectorGenerator randomVectorGenerator = new RandomValueVectorGenerator(2, randomGeneratorsForComponents);
        Vector randomVector = randomVectorGenerator.generateVector();
        //System.out.println(randomVector.toString());

        CoordinatesGenerator boundedCoordinatesGenerator = new BoundedRandomCoordinatesGenerator(boundaries, 2);
        Vector bounded = boundedCoordinatesGenerator.generate();
        //System.out.println(bounded.toString());

        Boundary rectBoundary = new Boundary()
                .addRange(0, new Range(-3.0f, -2.0f))
                .addRange(1, new Range(2.0f, 3.0f))
                .addRange(2, new Range(10.0f, 20.0f));

        CoordinatesGenerator testGenerator = new TestCoordinatesGenerator(rectBoundary);

        for (int i = 0; i < 1000; i++) {
            Vector testVector = testGenerator.generate();
            System.out.println(testVector.toString());
        }


//        for (int i = 0; i < N; i++) {
//            Vector coordinates = null;
//            Particle particle = new Particle(coordinates);
//            particle.setMass(massGenerator.generateScalar());
//            System.out.println(particle.getMass().getValue());
//        }

        // CHANGE generated attribute!!!


//        double m;
//        double x;
//        double y;
//        double z;
//        double vx;
//        double vy;
//        double vz;
//        double Ix;
//        double Iy;
//        double Iz;
//        double limitF;


        //attributeGeneratorFactory.generate2DPoint();







        //System.out.println(boundaries.getName());

//        System.out.println("TAU = " + TAU);
//        final int STEPS = 10000;
//        Method rk4 = new RK4();
//        Error rungeError = new RungeError(rk4, TAU);
//        double rungeErrorValue = rungeError.calculateAverageError(STEPS);
//        System.out.println("RUNGE ERROR: " + rungeErrorValue + " %");
//        Error richardsonError = new RichardsonError(rk4, TAU);
//        double richardsonErrorValue = richardsonError.calculateAverageError(STEPS);
//        System.out.println("RICHARDSON ERROR: " + richardsonErrorValue + " %");
//        System.out.println("=============================");
    }
}
