package net.muhammadsaad.sensors;

import net.muhammadsaad.utils.Logger;

public class SensorsFactory {
    private final Logger logger;

    public SensorsFactory(Logger logger) {
        this.logger = logger;
    }


    public SmokeSensor createSmokeSensor() {
        return new SmokeSensor(logger);
    }

    public TemperatureSensor createTemperatureSensor() {
        return new TemperatureSensor(logger);
    }
    public MotionSensor createMotionSensor() {
        return new MotionSensor(logger);
    }
}
