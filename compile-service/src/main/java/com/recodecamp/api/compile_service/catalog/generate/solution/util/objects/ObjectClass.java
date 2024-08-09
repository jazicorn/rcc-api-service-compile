package com.recodecamp.api.compile_service.catalog.generate.solution.util.objects;

import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.NonAccessModifier;

public record ObjectClass(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    String name
) {
};
