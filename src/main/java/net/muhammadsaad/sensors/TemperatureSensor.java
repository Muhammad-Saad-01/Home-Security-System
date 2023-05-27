package net.muhammadsaad.sensors;

import net.muhammadsaad.utils.Logger;

public class TemperatureSensor implements Sensor{
    private final Logger logger;

    public TemperatureSensor(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void detect() {
        logger.log("Temperature Sensor detect");
    }
}
