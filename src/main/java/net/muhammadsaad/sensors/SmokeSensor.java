package net.muhammadsaad.sensors;


import net.muhammadsaad.utils.Logger;

public class SmokeSensor implements Sensor {
   private final Logger logger;

    public SmokeSensor(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void detect() {
        logger.log("Smoke Sensor detect smoke");
    }

}
