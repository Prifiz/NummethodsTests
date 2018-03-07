package particles;

import java.util.ArrayList;
import java.util.List;

public class DefaultParticleSystem implements ParticleSystem {
    private List<Particle> particles;

    public DefaultParticleSystem() {
        this.particles = new ArrayList<>();
    }

    @Override
    public void addParticle(Particle particle) {
        this.particles.add(particle);
    }

    @Override
    public int getParticlesNumber() {
        return this.particles.size();
    }
}
