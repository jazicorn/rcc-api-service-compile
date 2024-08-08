package com.recodecamp.api.compile_service.catalog.generate.solution.code;

import com.recodecamp.api.compile_service.catalog.generate.solution.code.util.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.code.util.NonAccessModifier;

public record BoilerplateMethod(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    String returnType
) {
};
