package com.recodecamp.api.compile_service.catalog.generate.solution.util.objects;

import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.NonAccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.NonPrimitiveDataTypeModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.PrimitiveDataTypeModifier;

public record Modifier(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    PrimitiveDataTypeModifier primitiveDataTypeModifier,
    NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier,
    String objectDataTypeModifier
) {
}
