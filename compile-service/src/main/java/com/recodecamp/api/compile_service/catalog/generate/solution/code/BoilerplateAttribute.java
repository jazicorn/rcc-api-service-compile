package com.recodecamp.api.compile_service.catalog.generate.solution.code;

import com.recodecamp.api.compile_service.catalog.generate.solution.code.util.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.code.util.NonAccessModifier;

import java.util.Optional;

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
