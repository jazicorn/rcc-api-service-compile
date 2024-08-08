package com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate;

import com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate.util.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate.util.NonAccessModifier;

public record BoilerplateMethod(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    String returnType
) {
};
