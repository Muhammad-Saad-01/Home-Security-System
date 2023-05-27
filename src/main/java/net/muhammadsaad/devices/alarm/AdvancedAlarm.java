package net.muhammadsaad.devices.alarm;

import net.muhammadsaad.utils.Logger;

public class AdvancedAlarm implements Alarm {
    private final Logger logger;

    public AdvancedAlarm(Logger logger) {
        this.logger = logger;
    }

    public void turnOn() {
        logger.log("Advanced alarm turned on.");
    }

    public void turnOff() {
        logger.log("Advanced alarm turned off.");
    }
}