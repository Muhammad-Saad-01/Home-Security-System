package net.muhammadsaad.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance;
    private final PrintWriter writer;

    private Logger(String filename) throws IOException {
        writer = new PrintWriter(new FileWriter(filename, true), true);
    }

    public static Logger getInstance(String filename) throws IOException {
        if (instance != null) {
            return instance;
        }
        synchronized (Logger.class) {
            if (instance == null)
                instance = new Logger(filename);
        }

        return instance;
    }

    public void log(String message) {
        writer.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " " + message);
    }

    public void close() {
        writer.close();
    }
}
