package com.arika.dev.singleton;

public class ThreadSafeLazyInitializationSingleton {

    private static ThreadSafeLazyInitializationSingleton instance;

    private ThreadSafeLazyInitializationSingleton() {
    }

    public static synchronized ThreadSafeLazyInitializationSingleton getInstance() {
        if(instance == null)
            instance = new ThreadSafeLazyInitializationSingleton();
        return instance;
    }
}
