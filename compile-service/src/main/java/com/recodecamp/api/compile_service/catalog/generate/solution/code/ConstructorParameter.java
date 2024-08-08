package com.recodecamp.api.compile_service.catalog.generate.solution.code;

public record ConstructorParameter<T>(
    T parameter,
    String name
) {
};
