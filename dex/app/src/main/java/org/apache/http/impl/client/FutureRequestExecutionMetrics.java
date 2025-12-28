package org.apache.http.impl.client;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: C:\Users\User\Downloads\PREM space\dex2jar-2.0\andro259\classes.dex */
public final class FutureRequestExecutionMetrics {
    private final AtomicLong activeConnections = new AtomicLong();
    private final AtomicLong scheduledConnections = new AtomicLong();
    private final DurationCounter successfulConnections = new DurationCounter();
    private final DurationCounter failedConnections = new DurationCounter();
    private final DurationCounter requests = new DurationCounter();
    private final DurationCounter tasks = new DurationCounter();

    FutureRequestExecutionMetrics() {
    }

    final AtomicLong getActiveConnections() {
        return this.activeConnections;
    }

    final AtomicLong getScheduledConnections() {
        return this.scheduledConnections;
    }

    final DurationCounter getSuccessfulConnections() {
        return this.successfulConnections;
    }

    final DurationCounter getFailedConnections() {
        return this.failedConnections;
    }

    final DurationCounter getRequests() {
        return this.requests;
    }

    final DurationCounter getTasks() {
        return this.tasks;
    }

    public final long getActiveConnectionCount() {
        return this.activeConnections.get();
    }

    public final long getScheduledConnectionCount() {
        return this.scheduledConnections.get();
    }

    public final long getSuccessfulConnectionCount() {
        return this.successfulConnections.count();
    }

    public final long getSuccessfulConnectionAverageDuration() {
        return this.successfulConnections.averageDuration();
    }

    public final long getFailedConnectionCount() {
        return this.failedConnections.count();
    }

    public final long getFailedConnectionAverageDuration() {
        return this.failedConnections.averageDuration();
    }

    public final long getRequestCount() {
        return this.requests.count();
    }

    public final long getRequestAverageDuration() {
        return this.requests.averageDuration();
    }

    public final long getTaskCount() {
        return this.tasks.count();
    }

    public final long getTaskAverageDuration() {
        return this.tasks.averageDuration();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[activeConnections=").append(this.activeConnections).append(", scheduledConnections=").append(this.scheduledConnections).append(", successfulConnections=").append(this.successfulConnections).append(", failedConnections=").append(this.failedConnections).append(", requests=").append(this.requests).append(", tasks=").append(this.tasks).append("]");
        return sb.toString();
    }

    static class DurationCounter {
        private final AtomicLong count = new AtomicLong(0);
        private final AtomicLong cumulativeDuration = new AtomicLong(0);

        DurationCounter() {
        }

        public void increment(long j) {
            this.count.incrementAndGet();
            this.cumulativeDuration.addAndGet(System.currentTimeMillis() - j);
        }

        public long count() {
            return this.count.get();
        }

        public long averageDuration() {
            long j = this.count.get();
            if (j > 0) {
                return this.cumulativeDuration.get() / j;
            }
            return 0L;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[count=").append(count()).append(", averageDuration=").append(averageDuration()).append("]");
            return sb.toString();
        }
    }
}
