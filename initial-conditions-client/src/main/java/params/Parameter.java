package params;

import boundaries.Range;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Parameter {
    private Range range;
    private List<Double> explicitValues;

    public Parameter(Range range, List<Double> explicitValues) {
        this.range = range;
        this.explicitValues = explicitValues;
    }

    public Parameter(Range range) {
        this.range = range;
        this.explicitValues = new ArrayList<>();
    }

    public Parameter() {
        this.explicitValues = new ArrayList<>();
    }

    public void addExplicitValue(double value) {
        this.explicitValues.add(value);
    }
}
