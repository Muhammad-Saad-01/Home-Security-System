package net.muhammadsaad.adapters.sms;


public interface SMSAdapter {

    void sendSMS(String message, String phoneNumber, SMSFormat format);
}
