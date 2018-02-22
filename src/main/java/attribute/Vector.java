package attribute;

/**
 * Created by PrifizGamer on 16.02.2018.
 */
public abstract class Vector {
    public int getSize() {
        return size;
    }

    protected int size;
    protected Scalar[] scalars;

    public Vector(Scalar... components) {
        this.size = components.length;
        this.scalars = components;
    }

    public Vector(int size) {
        this.size = size;
        this.scalars = new Scalar[size];
    }
}
