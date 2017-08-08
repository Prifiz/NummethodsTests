package errors;

import methods.Method;

public class RungeError extends AbstractError implements Error {

    private final Method method;


    public RungeError(Method method, double tau) {
        super(tau);
        this.method = method;
        this.tau = tau;
    }

    public double calculateAverageError(int steps) {
        double result = 0.0f;
        for (int i = 0; i < steps; i++) {
            method.performStep(tau);
            double currentTauRho = method.getCurrentRho();
            method.resetInitials();
            method.performStep(2 * tau);
            double currentDoubleTauRho = method.getCurrentRho();
            double currentError = 16 * (currentTauRho - currentDoubleTauRho) / 15;
            result += currentError;
        }
        return (double) Math.round(Math.abs(result / steps) * roundCoef) / roundCoef;
    }

}
