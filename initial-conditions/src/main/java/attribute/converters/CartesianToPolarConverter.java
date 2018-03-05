package attribute.converters;

import attribute.Vector;

import java.io.IOException;

public class CartesianToPolarConverter implements CoordinateSystemsConverter {

    private Vector pole;

    public CartesianToPolarConverter(Vector pole) {
        this.pole = pole;
    }

    @Override
    public Vector convert(Vector source) throws IOException {
        throw new IOException("Not supported yet");
    }
}
