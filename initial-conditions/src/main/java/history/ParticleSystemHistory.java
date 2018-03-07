package history;

public interface ParticleSystemHistory {
    void addSnapshot(ParticleSystemHistorySnapshot snapshot);
    void saveHistory();
}
