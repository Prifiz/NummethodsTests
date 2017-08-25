package initials;

import methods.AbstractNBodyConfiguration;

public interface InitialStateGenerator {
    AbstractNBodyConfiguration generate(int partsCount);
}
