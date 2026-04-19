package bg.tu_varna.sit.f24621743.calendar;

import java.time.LocalDateTime;

public class Slot {
    private LocalDateTime start;
    private LocalDateTime end;

    public Slot(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
    }
}
