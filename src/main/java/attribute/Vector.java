package attribute;

import java.io.IOException;

/**
 * Created by PrifizGamer on 16.02.2018.
 */
public abstract class Vector {
    protected int size;
    protected Scalar[] scalars;

    public Vector(int size) {
        this.size = size;
    }

    public abstract Scalar[] getValue() throws IOException;
}
