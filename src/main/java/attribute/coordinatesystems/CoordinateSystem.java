package attribute.coordinatesystems;

import java.util.HashSet;
import java.util.Set;

public class CoordinateSystem {

    private String name;
    private Set<String> axisNames;


    public CoordinateSystem(String name) {
        this.name = name;
        this.axisNames = new HashSet<>();
    }

    public void addAxis(String name) {
        this.axisNames.add(name);
    }
}
