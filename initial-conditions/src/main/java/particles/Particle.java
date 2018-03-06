package particles;

import attribute.*;

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

    private final int dimensions;
    private Scalar mass;
    private Vector coordinates;
    private Vector velocities;
    private Vector impmomemts;
    private Scalar forceLimit;

    public Particle(int dimensions) {
        this.dimensions = dimensions;
        this.coordinates = new ZeroValueVector(dimensions);
        this.mass = new ZeroValueScalar();
        this.forceLimit = new ZeroValueScalar();
        this.velocities = new ZeroValueVector(dimensions);

    }

    public Particle(Vector coordinates) {
        if(coordinates == null) {
            System.out.println("Coordinates not set. Setting 3D zero vector by default");
            this.dimensions = 3;
            this.coordinates = new ZeroValueVector(dimensions);
        } else {
            this.dimensions = coordinates.getSize();
            this.coordinates = coordinates;
        }
        this.mass = new ZeroValueScalar();
        this.forceLimit = new ZeroValueScalar();
        this.velocities = new ZeroValueVector(dimensions);
    }

    private Vector ensureVector(Vector vector) {
        if(dimensions == vector.getSize()) {
            return vector;
        } else {
            System.out.printf("Incorrect input vector size. Making zero vector of needed size %s instead\n", dimensions);
            return new ZeroValueVector(dimensions);
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
