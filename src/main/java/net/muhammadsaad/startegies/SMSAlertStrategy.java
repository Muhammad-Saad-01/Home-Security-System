package net.muhammadsaad.startegies;

import net.muhammadsaad.adapters.sms.SMSAdapter;
import net.muhammadsaad.adapters.sms.SMSFormat;

public class SMSAlertStrategy implements AlertStrategy {
    private final SMSAdapter smsAdapter;
    private final String phoneNumber;

    public SMSAlertStrategy(SMSAdapter smsAdapter, String phoneNumber) {
        this.smsAdapter = smsAdapter;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public void performAlert(String message) {
        message = (message == null ? "Alert! Security breach detected!" : message);
        smsAdapter.sendSMS(message, phoneNumber, SMSFormat.TEXT);

    }
}