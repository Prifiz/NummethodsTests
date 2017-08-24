import errors.Error;
import errors.RichardsonError;
import errors.RungeError;
import methods.Euler;
import methods.Method;
import methods.RK4;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

    }

    private static void calculateErrors(final float TAU) {
        System.out.println("TAU = " + TAU);
        final int STEPS = 10000;
        Method rk4 = new RK4();
        Error rungeError = new RungeError(rk4, TAU);
        double rungeErrorValue = rungeError.calculateAverageError(STEPS);
        System.out.println("RUNGE ERROR: " + rungeErrorValue + " %");
        Error richardsonError = new RichardsonError(rk4, TAU);
        double richardsonErrorValue = richardsonError.calculateAverageError(STEPS);
        System.out.println("RICHARDSON ERROR: " + richardsonErrorValue + " %");
        System.out.println("=============================");
    }
}
