package errors;

import methods.Method;

public class RichardsonError extends AbstractError implements Error {

    private final Method method;

    public RichardsonError(Method method, double tau) {
        super(tau);
        this.method = method;
    }

    public double calculateAverageError(int steps) {
        double rhoSum = 0.0f;
        double result = 0.0f;
        for (int i = 0; i < steps; i++) {
            method.performStep(2 * tau);
            double currentDoubleTauRho = method.getCurrentRho();
            rhoSum += currentDoubleTauRho;
            method.resetInitials();
            method.performStep(tau);
            method.performStep(tau);
            double currentTauPlusTauRho = method.getCurrentRho();
            rhoSum+= currentTauPlusTauRho;
            double currentError = (currentTauPlusTauRho - currentDoubleTauRho) / 15;
            result += currentError;
        }
        double avgRho = rhoSum / steps / 2;
        double avgErr = Math.abs(result / steps);
        return  avgErr * 100 / avgRho;
    }

}
