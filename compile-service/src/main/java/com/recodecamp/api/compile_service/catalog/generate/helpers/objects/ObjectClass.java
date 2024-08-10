package com.recodecamp.api.compile_service.catalog.generate.helpers.objects;

import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.NonAccessModifier;

public record ObjectClass(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    String name
) {
};
