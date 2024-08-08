package com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate;

import java.util.Optional;

import com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate.util.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate.util.NonAccessModifier;

public record BoilerplateAttribute<T>(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    Optional<T> objectModifier,
    String name
) {
    public BoilerplateAttribute {
        if (objectModifier != null || nonAccessModifier != null) {
            throw new IllegalArgumentException("objectModifier or nonAccessModifer must have NULL value");
        }
    }
};
