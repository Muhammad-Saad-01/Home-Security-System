package net.muhammadsaad.adapters.email;

import net.muhammadsaad.utils.Logger;

public class EmailAdapterImpl implements EmailAdapter {
   private final Logger logger;

    public EmailAdapterImpl(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void sendEmail(String emailAddress, String subject, String message, EmailFormat format) {
        logger.log(switch (format) {
            case HTML -> "Sending HTML email: ";
            case PLAIN_TEXT -> "Sending plain text email: ";
        } + subject + " - " + message + " to " + emailAddress);

    }
}
