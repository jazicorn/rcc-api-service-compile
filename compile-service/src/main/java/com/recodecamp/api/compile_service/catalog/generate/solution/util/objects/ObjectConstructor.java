package com.recodecamp.api.compile_service.catalog.generate.solution.util.objects;

import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.AccessModifier;

public record ObjectConstructor<T,S>(
    AccessModifier modifier,
    T parameters,
    S returnTypes
) {
};
