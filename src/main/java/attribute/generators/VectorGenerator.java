package attribute.generators;

import attribute.Vector;

public interface VectorGenerator {
    Vector generateVector() throws VectorGenerationException;
}
