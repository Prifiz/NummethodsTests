package methods;

public interface Method {
    void performStep(double tau);
    double getCurrentRho();
    double getCurrentAlpha();
    void resetInitials();
    void logState();
    double getX();
    double getY();
}
