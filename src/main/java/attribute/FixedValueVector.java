package attribute;

import java.io.IOException;

/**
 * Created by PrifizGamer on 16.02.2018.
 */
public class FixedValueVector extends Vector {

    public FixedValueVector(int size, Scalar[] scalars) {
        super(size);
        this.scalars = scalars;
    }

    @Override
    public Scalar[] getValue() throws IOException {
        if(scalars.length == size) {
            return scalars;
        } else {
            throw new IOException("Incompatible vector size");
        }
    }
}
