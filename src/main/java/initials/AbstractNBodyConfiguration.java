package initials;

public abstract class AbstractNBodyConfiguration {

    protected int N;

    public AbstractNBodyConfiguration(int n) {
        N = n;
    }

    public int getParticlesCount() {
        return N;
    }

    protected abstract int getDimensions();
}
