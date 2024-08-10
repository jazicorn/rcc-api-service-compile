package com.recodecamp.api.compile_service.catalog.generate.helpers;

public record ConstructorParameter<T>(
    T parameter,
    String name
) {
};
