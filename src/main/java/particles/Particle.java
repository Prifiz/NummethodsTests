package particles;

import attribute.*;
import com.sun.istack.internal.NotNull;

/**
 * Created by PrifizGamer on 16.02.2018.
 */
public class Particle {

    public void setMass(Scalar mass) {
        this.mass = mass;
    }

    public Scalar getMass() {
        return mass;
    }

    private Scalar mass;
    private Vector coordinates;
    private Vector velocities;
    private Vector impmomemts;
    private Scalar forceLimit;

    private static final int DIMENSIONS = 2;

    public Particle() throws VectorGenerationException {
        this.coordinates = new ZeroVectorGenerator(DIMENSIONS).generateVector();
        this.mass = new ZeroScalarGenerator().generateScalar();
        this.forceLimit = new ZeroScalarGenerator().generateScalar();
        this.velocities = new ZeroVectorGenerator(DIMENSIONS).generateVector();

    }

    public Particle(@NotNull Vector coordinates) throws VectorGenerationException {
        this.coordinates = coordinates;
        this.mass = new ZeroScalarGenerator().generateScalar();
        this.forceLimit = new ZeroScalarGenerator().generateScalar();
        this.velocities = new ZeroVectorGenerator(DIMENSIONS).generateVector();
    }

    private Vector ensureVector(Vector vector) throws VectorGenerationException {
        if(DIMENSIONS == vector.getSize()) {
            return vector;
        } else {
            System.out.printf("Incorrect input vector size. Making zero vector of needed size %s instead\n", DIMENSIONS);
            return new ZeroVectorGenerator(DIMENSIONS).generateVector();
        }
    }

    // compare upper /\ versus down \/


//        double m;
//        double x;
//        double y;
//        double z;
//        double vx;
//        double vy;
//        double vz;
//        double Ix;
//        double Iy;
//        double Iz;
//        double limitF;
}
