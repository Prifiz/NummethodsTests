package methods;

/**
 * Created by vaba1010 on 27.04.2017.
 */
public class MethodRunnerImpl implements MethodRunner{
    private final Method method;

    public MethodRunnerImpl(Method method) {
        this.method = method;
    }

    public void run(final int steps, final double tau) {
        for (int i = 0; i < steps; i++) {
            method.performStep(tau);
            method.logState();
        }
    }
}
