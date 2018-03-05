package attribute;

import java.util.List;

public class VectorImpl extends Vector {
    public VectorImpl(VectorComponent... components) {
        super(components);
    }

    public VectorImpl(List<VectorComponent> components) {
        super(components);
    }

    public VectorImpl(int size) {
        super(size);
    }
}
