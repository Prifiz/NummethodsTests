import attribute.*;
import attribute.FixedValueScalar;
import attribute.Scalar;
import boundaries.*;
import particles.Particle;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        List<Float> stepValues = Arrays.asList(
//                0.5f, 0.2f, 0.1f, 0.05f, 0.01f, 0.005f, 0.001f, 0.0005f, 0.0001f);
//        for(Float tau : stepValues) {
//            calculateErrors(tau);
//        }

//        MethodRunner rungeRunner = new MethodRunnerImpl(new RK4());
//        rungeRunner.run(10000, 0.001f);
//        calculateErrors(0.001f);
//        System.out.println(Math.ulp(1.000002878290556E-10));


//        Method method = new Euler();
//        MethodRunner runner = new MethodRunnerImpl(method);
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

    private static void calculateErrors(final float TAU) throws IOException {

        int tabNumber = 1;
        double left = -1.0f;
        double bottom = -1.0f;
        double width = 2.0;
        double hieght = 2.0;
        final int N = 1000;

        //int distributionType = 1;

        // UI Adapter: START

        AbstractBoundariesParams abstractBoundariesParams = null;

        switch (tabNumber) {
            case 1:
                abstractBoundariesParams = new RectangleBoundariesParams(left, bottom, width, hieght);
        }
        // UI Adapter: END

        Boundaries boundaries = new DefaultBoundariesGenerator().createBoundaries(abstractBoundariesParams);

//        try {
//            //AbstractAttributeGeneratorFactory attributeGeneratorFactory = getFactory(distributionType, boundaries);
//
//        } catch (IOException ex) {
//        }

        Scalar fixedMassAttr = new FixedValueScalar(1.0f);
        System.out.println("Fixed mass: " + fixedMassAttr.getValue());
        double massMin = 1.0f;
        double massMax = 2.0f;
        Scalar randomMassAttr = new RandomValueScalar(massMin, massMax);
        System.out.printf("Random mass (%s : %s): " + randomMassAttr.getValue(), massMin, massMax);
        System.out.println();
        Scalar x = new FixedValueScalar(1.0f);
        Scalar y = new FixedValueScalar(5.0f);
        Vector fixedCoord = new FixedValueVector(2, new Scalar[]{x, y});
//        for(Scalar coord : fixedCoord.getValue()) {
//            System.out.println(coord.getValue());
//        }




        for (int i = 0; i < N; i++) {
            Vector coordinates = null;
            Particle particle2D = new Particle(coordinates);
            FixedValueScalarGenerator fixedValueScalarGenerator = new ScalarGeneratorImpl();
            particle2D.setMass(fixedValueScalarGenerator.generateFixedValueScalar(1.0f));

        }

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
