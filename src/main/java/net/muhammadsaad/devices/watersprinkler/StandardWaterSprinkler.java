package net.muhammadsaad.devices.watersprinkler;

import net.muhammadsaad.utils.Logger;

public class StandardWaterSprinkler implements WaterSprinkler {
    private final Logger logger;

    public StandardWaterSprinkler(Logger logger) {
        this.logger = logger;
    }

    public void turnOn() {
        logger.log("Standard water sprinkler turned on.");
    }

    public void turnOff() {
        logger.log("Standard water sprinkler turned off.");
    }
}