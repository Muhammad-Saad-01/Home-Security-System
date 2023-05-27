package net.muhammadsaad.systems;

import net.muhammadsaad.startegies.AlertStrategy;
import net.muhammadsaad.utils.Logger;

public abstract class SecuritySystem {
    protected AlertStrategy alertStrategy;
    protected Logger logger;

    protected SecuritySystem(AlertStrategy alertStrategy, Logger logger) {
        this.alertStrategy = alertStrategy;
        this.logger = logger;
    }

    public final void runSecuritySystem() {
        detect();
        sendAlert();
        activateDevice();
        deactivateDevice();
        issueSolved();
    }

    protected abstract void deactivateDevice();

    protected abstract void detect();

    protected abstract void sendAlert() ;

    protected abstract void activateDevice();

    protected void issueSolved() {
        logger.log("Issue solved! System is ready for next detection.");
    }
}
