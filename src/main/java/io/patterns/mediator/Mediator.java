package io.patterns.mediator;

import io.patterns.mediator.device.Alarm;
import io.patterns.mediator.device.Calendar;
import io.patterns.mediator.device.Device;
import io.patterns.mediator.device.Sprinkler;

public class Mediator {
    private final Device alarm;
    private final Calendar calendar;
    private final Sprinkler sprinkler;

    public Mediator() {
        this.alarm = new Alarm();
        this.calendar = new Calendar();
        this.sprinkler = new Sprinkler();
    }

    public void updateState() {
        if (alarm.isEnabled()) {
            calendar.onAlarmEvent();
        }
        if (isWeekend()) {
            this.sprinkler.onWeekendEvent();
        }
    }

    private boolean isWeekend() {
        return this.calendar.getDay() == 5 || this.calendar.getDay() == 6;
    }

    public Device getAlarm() {
        return alarm;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public Sprinkler getSprinkler() {
        return this.sprinkler;
    }
}
