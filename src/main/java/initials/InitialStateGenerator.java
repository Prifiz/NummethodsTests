package initials;

public interface InitialStateGenerator {
    NBodyConfiguration generateCoordinates(int partsCount);
    NBodyConfiguration generateVelocities(int partsCount);
    NBodyConfiguration generateMasses(int partsCount);
}
