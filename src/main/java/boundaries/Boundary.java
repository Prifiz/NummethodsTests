package boundaries;

import java.util.LinkedHashMap;
import java.util.Map;

public class Boundary {
    protected Map<Integer, Range> rangesByCoordinates;

    public Boundary() {
        this.rangesByCoordinates = new LinkedHashMap<>();
    }

    public Boundary addRange(Integer componentNumber, Range range) {
        // if exists??
        this.rangesByCoordinates.put(componentNumber, range);
        return this;
    }


    public int getSize() {
        return rangesByCoordinates.size();
    }

    public Range getRange(int componentNumber) {
        return this.rangesByCoordinates.get(componentNumber);
    }
}