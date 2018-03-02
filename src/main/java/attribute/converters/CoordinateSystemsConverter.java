package attribute.converters;

import attribute.Vector;

import java.io.IOException;

public interface CoordinateSystemsConverter {
    Vector convert(Vector source) throws IOException;
}
