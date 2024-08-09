package com.recodecamp.api.compile_service.catalog.generate.solution.util.objects;

import java.util.Optional;

import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.NonAccessModifier;

public record ObjectAttribute<T>(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    Optional<T> objectModifier,
    String name
) {
    public ObjectAttribute {
        if (objectModifier != null || nonAccessModifier != null) {
            throw new IllegalArgumentException("objectModifier or nonAccessModifer must have NULL value");
        }
    }
};
