package org.example.dependencyinjection.logging;

public class FileLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Dosya loglandi:"+message);
        //Dosya aç, yaz, kaydet..

    }
}
