package net.muhammadsaad.startegies;

import net.muhammadsaad.adapters.email.EmailAdapter;
import net.muhammadsaad.adapters.email.EmailFormat;

public class EmailAlertStrategy implements AlertStrategy {
    private final EmailAdapter emailAdapter;
    private final String emailAddress;

    public EmailAlertStrategy(EmailAdapter emailAdapter, String emailAddress) {
        this.emailAdapter = emailAdapter;
        this.emailAddress = emailAddress;
    }


    @Override
    public void performAlert(String message) {
        String subject = "Security Alert";
        message = (message == null ? "Alert! Security breach detected!" : message);
        emailAdapter.sendEmail(emailAddress, message, subject, EmailFormat.PLAIN_TEXT);
    }
}
