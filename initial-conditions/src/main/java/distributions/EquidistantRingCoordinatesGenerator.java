//package distributions;
//
//import attribute.Vector;
//import boundaries.Boundary;
//import boundaries.Range;
//
//import java.io.IOException;
//import java.util.Map;

//public class EquidistantRingCoordinatesGenerator implements CoordinatesGenerator {
//
//    private Boundary boundary;
//    private Map<String, Double> distances;
//
//    public EquidistantRingCoordinatesGenerator(Boundary boundary, Map<String, Double> distances) {
//        this.boundary = boundary;
//        this.distances = distances;
//    }
//
//    @Override
//    public Vector generate() throws IOException {
//        for (Range range : boundary.getSimpleRanges()) {
//            Double rangeDistance = distances.get(range.getName());
//            if (rangeDistance == null) {
//                throw new IOException("No distance defined by name: " + range.getName());
//            }
//            for (double current = range.getMin(); current < range.getMax(); current += rangeDistance) {
//
//            }
//
//        }
//    }
//
//
//}
