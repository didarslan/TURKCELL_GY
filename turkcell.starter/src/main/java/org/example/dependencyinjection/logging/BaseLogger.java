package org.example.dependencyinjection.logging;

//Abstract classlar hem soyut hem somut işlevler içerebilen yapılardır.

public abstract class BaseLogger implements Logger
{
    public void logMessage(String message)
    {
        System.out.println("Once konsola loglandi: "+message);
        log(message);
    }
}
