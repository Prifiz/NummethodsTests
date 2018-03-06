package params;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RectangleDistributionConfiguration extends DistributionConfiguration {

    private Parameter x;
    private Parameter y;
    //private Parameter mass;
    private int N;

    public RectangleDistributionConfiguration(int n) {
        N = n;
    }
}
