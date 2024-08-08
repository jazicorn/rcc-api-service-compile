package com.recodecamp.api.compile_service.catalog.generate.solution.code;

import com.recodecamp.api.compile_service.catalog.generate.solution.code.util.AccessModifier;

public record BoilerplateConstructor<T,S>(
    AccessModifier modifier,
    T parameters,
    S returnTypes
) {
};
