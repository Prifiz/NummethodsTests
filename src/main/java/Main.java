import boundaries.*;
import initials.InitialStateGenerator;
import initials.NBodyConfiguration;
import random.RandomRectInitialStateGenerator;

public class Main {

    public static void main(String[] args) {

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

    private static void calculateErrors(final float TAU) {

        int tabNumber = 1;
        double left = -1.0f;
        double bottom = -1.0f;
        double width = 2.0;
        double hieght = 2.0;


        // UI Adapter: START

        AbstractBoundariesParams abstractBoundariesParams = null;

        switch (tabNumber) {
            case 1:
                abstractBoundariesParams = new RectangleBoundariesParams(left, bottom, width, hieght);
        }




        // UI Adapter: END

        Boundaries boundaries = new DefaultBoundariesGenerator().createBoundaries(abstractBoundariesParams);



        System.out.println(boundaries.getName());

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
