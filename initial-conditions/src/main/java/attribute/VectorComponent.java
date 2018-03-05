package attribute;

import attribute.generators.FixedValueScalarGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VectorComponent {
    private Scalar scalar;
    private String name;

    public VectorComponent(Scalar scalar, String name) {
        this.scalar = scalar;
        this.name = name;
    }

    public VectorComponent(double scalarValue, String name) {
        this.scalar = new FixedValueScalarGenerator(scalarValue).generateScalar();
        this.name = name;
    }
}
