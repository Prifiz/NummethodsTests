package initials;

public interface NBodyConfiguration {
    void add2DParticleCoordinates(double x, double y);
    void set2DparticleVelocities(int particleIdx, double vx, double vy);
    void set2DparticleMass(int particleIdx, double mass);

    //NBodyConfiguration add2DParticle(double x, double y, double vx, double vy, double m);
}
