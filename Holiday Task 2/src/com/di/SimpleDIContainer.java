package com.di;

import java.util.HashMap;
import java.util.Map;

class SimpleDIContainer {
    private Map<Class<?>, Object> container = new HashMap<>();

    // Register dependency
    public <T> void register(Class<T> clazz, T instance) {
        container.put(clazz, instance);
    }

    // Retrieve dependency
    public <T> T get(Class<T> clazz) {
        return clazz.cast(container.get(clazz));
    }
}