package com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate;

import com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate.util.AccessModifier;

public record BoilerplateConstructor<T,S>(
    AccessModifier modifier,
    T parameters,
    S returnTypes
) {
};
