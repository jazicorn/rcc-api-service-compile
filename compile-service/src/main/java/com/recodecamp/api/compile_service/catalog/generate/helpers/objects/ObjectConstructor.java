package com.recodecamp.api.compile_service.catalog.generate.helpers.objects;

import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.AccessModifier;

public record ObjectConstructor<T,S>(
    AccessModifier modifier,
    T parameters,
    S returnTypes
) {
};
