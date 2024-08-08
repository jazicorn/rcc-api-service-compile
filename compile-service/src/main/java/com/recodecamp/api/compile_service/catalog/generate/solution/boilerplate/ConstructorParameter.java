package com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate;

public record ConstructorParameter<T>(
    T parameter,
    String name
) {
};
