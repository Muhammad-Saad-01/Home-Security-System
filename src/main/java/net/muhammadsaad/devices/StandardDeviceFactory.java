package net.muhammadsaad.devices;

import net.muhammadsaad.utils.Logger;
import net.muhammadsaad.devices.alarm.Alarm;
import net.muhammadsaad.devices.alarm.StandardAlarm;
import net.muhammadsaad.devices.watersprinkler.StandardWaterSprinkler;
import net.muhammadsaad.devices.watersprinkler.WaterSprinkler;

public class StandardDeviceFactory implements DeviceFactory {
    private final Logger logger;

    public StandardDeviceFactory(Logger logger) {
        this.logger = logger;
    }

    public WaterSprinkler createWaterSprinkler() {
        return new StandardWaterSprinkler(logger);
    }

    public Alarm createAlarm() {
        return new StandardAlarm(logger);
    }
}
