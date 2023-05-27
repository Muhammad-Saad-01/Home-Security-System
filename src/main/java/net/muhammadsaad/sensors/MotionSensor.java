package net.muhammadsaad.sensors;


import net.muhammadsaad.utils.Logger;

public class MotionSensor implements Sensor {

    private final Logger logger;

    public MotionSensor(Logger logger) {
        this.logger = logger;
    }


    @Override
    public void detect() {
        logger.log("Motion Sensor detect motion");
    }

}
