package net.muhammadsaad.devices;

import net.muhammadsaad.utils.Logger;
import net.muhammadsaad.devices.alarm.AdvancedAlarm;
import net.muhammadsaad.devices.alarm.Alarm;
import net.muhammadsaad.devices.watersprinkler.AdvancedWaterSprinkler;
import net.muhammadsaad.devices.watersprinkler.WaterSprinkler;

public class AdvancedDeviceFactory implements DeviceFactory {
    private final Logger logger;

    public AdvancedDeviceFactory(Logger logger) {
        this.logger = logger;
    }

    public WaterSprinkler createWaterSprinkler() {
        return new AdvancedWaterSprinkler(logger);
    }

    public Alarm createAlarm() {
        return new AdvancedAlarm(logger);
    }

}
