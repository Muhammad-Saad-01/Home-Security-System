package net.muhammadsaad.systems;

import net.muhammadsaad.startegies.AlertStrategy;
import net.muhammadsaad.utils.Logger;
import net.muhammadsaad.devices.alarm.Alarm;
import net.muhammadsaad.sensors.MotionSensor;

public class MotionSensorSystem extends SecuritySystem {
    private final MotionSensor motionSensor;
    private final Alarm alarm;

    public MotionSensorSystem(AlertStrategy alertStrategy, Logger logger, MotionSensor motionSensor, Alarm alarm) {
        super(alertStrategy, logger);
        this.motionSensor = motionSensor;
        this.alarm = alarm;
    }

    @Override
    protected void deactivateDevice() {
        logger.log("Motion Sensor System deactivate Alarm");
        alarm.turnOff();
    }

    protected void detect() {
        logger.log("Motion Sensor System detect");
        motionSensor.detect();
    }

    @Override
    protected void sendAlert() {
        logger.log("Motion Sensor System send Alert");
        alertStrategy.performAlert("Motion detected!");
    }

    protected void activateDevice() {
        logger.log("Motion Sensor System activate Alarm");
        alarm.turnOn();
    }
}