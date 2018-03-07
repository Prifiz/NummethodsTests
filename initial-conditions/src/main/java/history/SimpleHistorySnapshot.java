package history;

import particles.ParticleSystem;

import java.util.Date;

public class SimpleHistorySnapshot implements ParticleSystemHistorySnapshot {
    private ParticleSystem particleSystem;
    private Date changeDate;
    private double modelTimestamp;
}
