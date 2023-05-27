package net.muhammadsaad.adapters.sms;

import net.muhammadsaad.utils.Logger;

public class SMSAdapterImpl implements SMSAdapter {

    private final Logger logger;

    public SMSAdapterImpl(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void sendSMS(String message, String phoneNumber, SMSFormat format) {
        logger.log(switch (format) {
            case TEXT -> "Sending text SMS: ";
            case MULTIMEDIA -> "Sending MMS SMS: ";
        } + message + " to " + phoneNumber);
    }
}