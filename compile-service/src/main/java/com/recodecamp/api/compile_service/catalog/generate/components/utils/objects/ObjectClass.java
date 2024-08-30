package com.recodecamp.api.compile_service.catalog.generate.components.utils.objects;

import com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.NonAccessModifier;

public record ObjectClass(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    String name
) {
};
