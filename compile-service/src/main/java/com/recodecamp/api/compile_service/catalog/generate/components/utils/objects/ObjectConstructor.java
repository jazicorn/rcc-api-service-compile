package com.recodecamp.api.compile_service.catalog.generate.components.utils.objects;

import com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.AccessModifier;

public record ObjectConstructor<T,S>(
    AccessModifier modifier,
    T parameters,
    S returnTypes
) {
};
