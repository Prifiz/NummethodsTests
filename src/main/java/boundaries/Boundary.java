package boundaries;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Boundary {
    protected Map<Integer, Range> rangesByCoordinates;
    protected List<Range> simpleRanges;

    public Boundary() {
        this.rangesByCoordinates = new LinkedHashMap<>();
        this.simpleRanges = new ArrayList<>();
    }

    public Boundary addRange(Integer componentNumber, Range range) {
        // if exists??
        // fixme
        this.rangesByCoordinates.put(componentNumber, range);
        return this;
    }

    public Boundary addRange(Range range) {
        this.simpleRanges.add(range);
        return this;
    }


    // todo implement Iterable!!!

    public int getSize() {
        return rangesByCoordinates.size();
    }

    public Range getRange(int componentNumber) {
        return this.rangesByCoordinates.get(componentNumber);
    }

    public List<Range> getSimpleRanges() {
        return simpleRanges;
    }
}