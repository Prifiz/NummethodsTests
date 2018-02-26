package coordinates;

import attribute.Vector;
import attribute.generators.VectorGenerationException;

/**
 * Created by PrifizGamer on 12.02.2018.
 */
public interface CoordinatesGenerator {
    Vector generate() throws VectorGenerationException;
}
