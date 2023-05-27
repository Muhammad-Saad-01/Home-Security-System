package net.muhammadsaad.devices.alarm;

import net.muhammadsaad.utils.Logger;

public class StandardAlarm implements Alarm {
    private final Logger logger;

    public StandardAlarm(Logger logger) {
        this.logger = logger;
    }

    public void turnOn() {
        logger.log("Standard alarm turned on.");
    }

    public void turnOff() {
        logger.log("Standard alarm turned off.");
    }
}