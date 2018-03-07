package history;

import java.util.LinkedList;
import java.util.List;

public class SimpleParticleSystemHistory implements ParticleSystemHistory {

    private List<ParticleSystemHistorySnapshot> history;

    private boolean autoSaveEnabled;

    public SimpleParticleSystemHistory(boolean autoSaveEnabled) {
        this.history = new LinkedList<>();
        this.autoSaveEnabled = autoSaveEnabled;
    }

    @Override
    public void addSnapshot(ParticleSystemHistorySnapshot snapshot) {
        this.history.add(snapshot);
        if(this.autoSaveEnabled) {
            save();
        }
    }

    @Override
    public void saveHistory() {
        save();
    }

    private void save() {
        // todo implement save
    }

    public boolean isAutoSaveEnabled() {
        return autoSaveEnabled;
    }

    public void setAutoSaveEnabled(boolean autoSaveEnabled) {
        this.autoSaveEnabled = autoSaveEnabled;
    }


}
