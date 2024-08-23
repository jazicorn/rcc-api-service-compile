package com.recodecamp.api.compile_service.catalog.generate.components.utils;

public record ConstructorParameter<T>(
    T parameter,
    String name
) {
};
