package net.muhammadsaad.devices;

import net.muhammadsaad.devices.alarm.Alarm;
import net.muhammadsaad.devices.watersprinkler.WaterSprinkler;

public interface DeviceFactory { //
    WaterSprinkler createWaterSprinkler();
    Alarm createAlarm();
}