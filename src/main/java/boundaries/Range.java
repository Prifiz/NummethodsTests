package boundaries;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Range {

    private String name;
    private double min;
    private double max;

    public Range(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public Range addName(String name) {
        this.name = name;
        return this;
    }
}
