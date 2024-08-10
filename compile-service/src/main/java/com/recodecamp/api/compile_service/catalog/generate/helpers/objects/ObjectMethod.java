package com.recodecamp.api.compile_service.catalog.generate.helpers.objects;

import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.NonAccessModifier;

public record ObjectMethod(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    String returnType
) {
};
