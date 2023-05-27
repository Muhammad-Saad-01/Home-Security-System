package net.muhammadsaad;


import net.muhammadsaad.adapters.email.EmailAdapter;
import net.muhammadsaad.adapters.email.EmailAdapterImpl;
import net.muhammadsaad.adapters.sms.SMSAdapter;
import net.muhammadsaad.adapters.sms.SMSAdapterImpl;
import net.muhammadsaad.devices.AdvancedDeviceFactory;
import net.muhammadsaad.devices.DeviceFactory;
import net.muhammadsaad.devices.alarm.Alarm;
import net.muhammadsaad.devices.watersprinkler.WaterSprinkler;
import net.muhammadsaad.sensors.MotionSensor;
import net.muhammadsaad.sensors.SensorsFactory;
import net.muhammadsaad.sensors.SmokeSensor;
import net.muhammadsaad.startegies.AlertStrategy;
import net.muhammadsaad.startegies.EmailAlertStrategy;
import net.muhammadsaad.startegies.SMSAlertStrategy;
import net.muhammadsaad.systems.MotionSensorSystem;
import net.muhammadsaad.systems.SecuritySystem;
import net.muhammadsaad.systems.SmokeSensorSystem;
import net.muhammadsaad.utils.Logger;

import java.io.IOException;

public class HomeSecuritySimulator {
    public static void main(String[] args) {
        Logger logger = null;

        try {
            logger = Logger.getInstance("detections.log");
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        SMSAdapter smsAdapter = new SMSAdapterImpl(logger);
        EmailAdapter emailAdapter = new EmailAdapterImpl(logger);

        DeviceFactory deviceFactory = new AdvancedDeviceFactory(logger);
        Alarm alarm = deviceFactory.createAlarm();
        WaterSprinkler waterSprinkler = deviceFactory.createWaterSprinkler();

        SensorsFactory sensorsFactory = new SensorsFactory(logger);


        SmokeSensor smokeSensor = sensorsFactory.createSmokeSensor();
        MotionSensor motionSensor = sensorsFactory.createMotionSensor();


        AlertStrategy smsAlert = new SMSAlertStrategy(smsAdapter, "1234567890");
        AlertStrategy emailAlert = new EmailAlertStrategy(emailAdapter, "Muhammad-saad-01@outlook.com");

        SecuritySystem smokeSensorSystem = new SmokeSensorSystem(smsAlert, logger, smokeSensor, waterSprinkler);
        smokeSensorSystem.runSecuritySystem();

        SecuritySystem motionSensorSystem = new MotionSensorSystem(emailAlert, logger, motionSensor, alarm);
        motionSensorSystem.runSecuritySystem();

    }
}
