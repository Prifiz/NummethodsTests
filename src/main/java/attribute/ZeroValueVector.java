package attribute;

/**
 * Created by PrifizGamer on 22.02.2018.
 */
public class ZeroValueVector extends Vector {
    public ZeroValueVector(int size) {
        createZeroValueVector(size);
    }

    private void createZeroValueVector(int size) {
        Scalar[] scalars = new Scalar[size];
        for (int i = 0; i < size; i++) {
            scalars[i] = new ZeroValueScalar();
        }
    }
}
