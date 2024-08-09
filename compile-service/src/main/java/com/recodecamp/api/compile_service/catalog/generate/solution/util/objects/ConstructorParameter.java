package com.recodecamp.api.compile_service.catalog.generate.solution.util.objects;

public record ConstructorParameter<T>(
    T parameter,
    String name
) {
};
