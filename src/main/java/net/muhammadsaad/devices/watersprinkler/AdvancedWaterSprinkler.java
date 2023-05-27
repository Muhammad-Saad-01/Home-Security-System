package net.muhammadsaad.devices.watersprinkler;

import net.muhammadsaad.utils.Logger;

public class AdvancedWaterSprinkler implements WaterSprinkler {
    private final Logger logger;

    public AdvancedWaterSprinkler(Logger logger) {
        this.logger = logger;
    }

    public void turnOn() {
        logger.log("Advanced water sprinkler turned on.");
    }

    public void turnOff() {
        logger.log("Advanced water sprinkler turned off.");
    }
}