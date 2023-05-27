package net.muhammadsaad.systems;

import net.muhammadsaad.sensors.SmokeSensor;
import net.muhammadsaad.startegies.AlertStrategy;
import net.muhammadsaad.utils.Logger;
import net.muhammadsaad.devices.watersprinkler.WaterSprinkler;

public class SmokeSensorSystem extends SecuritySystem {
    private final SmokeSensor smokeSensor;
    private final WaterSprinkler waterSprinkler;

    public SmokeSensorSystem(AlertStrategy alertStrategy, Logger logger, SmokeSensor smokeSensor, WaterSprinkler waterSprinkler) {
        super(alertStrategy, logger);
        this.smokeSensor = smokeSensor;
        this.waterSprinkler = waterSprinkler;
    }

    @Override
    protected void sendAlert() {
        alertStrategy.performAlert("Smoke detected!");
    }

    @Override
    protected void deactivateDevice() {
        logger.log("Smoke Sensor System deactivate Water Sprinkler");
        waterSprinkler.turnOff();
    }

    protected void detect() {
        smokeSensor.detect();
    }

    protected void activateDevice() {
        waterSprinkler.turnOn();
    }
}
