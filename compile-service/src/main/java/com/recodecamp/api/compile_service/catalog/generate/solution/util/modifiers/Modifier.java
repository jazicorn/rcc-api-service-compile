package com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers;

public record Modifier(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    PrimitiveDataTypeModifier primitiveDataTypeModifier,
    NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier,
    String objectDataTypeModifier
) {
}
