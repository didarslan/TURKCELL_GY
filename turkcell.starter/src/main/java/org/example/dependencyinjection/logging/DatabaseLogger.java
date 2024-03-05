package org.example.dependencyinjection.logging;

public class DatabaseLogger extends BaseLogger
{

    @Override
    public void log(String message) {
        System.out.println("Db'ye loglandi:" + message);
    }
}
