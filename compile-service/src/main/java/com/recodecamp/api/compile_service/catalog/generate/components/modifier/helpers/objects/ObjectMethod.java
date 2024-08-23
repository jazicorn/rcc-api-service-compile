package com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.objects;

import com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.NonAccessModifier;

public record ObjectMethod(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    String returnType
) {
};
