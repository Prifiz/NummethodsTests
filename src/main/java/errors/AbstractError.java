package errors;

abstract class AbstractError {
    double tau;

    final int roundCoef = 10000;

    AbstractError(double tau) {
        this.tau = tau;
    }
}
