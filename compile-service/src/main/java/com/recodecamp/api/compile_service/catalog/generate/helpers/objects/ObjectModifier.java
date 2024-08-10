package com.recodecamp.api.compile_service.catalog.generate.helpers.objects;

import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.NonAccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.NonPrimitiveDataTypeModifier;
import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.PrimitiveDataTypeModifier;

public record ObjectModifier(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    PrimitiveDataTypeModifier primitiveDataTypeModifier,
    NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier,
    String objectDataTypeModifier
) {
}
