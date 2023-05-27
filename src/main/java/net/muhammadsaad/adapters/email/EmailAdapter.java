package net.muhammadsaad.adapters.email;

public interface EmailAdapter {
    void sendEmail(String emailAddress, String message, String subject, EmailFormat format);
}
