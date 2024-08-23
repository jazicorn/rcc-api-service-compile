package com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.objects;

import com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.NonAccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.NonPrimitiveDataTypeModifier;
import com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.PrimitiveDataTypeModifier;

public record ObjectModifier(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    PrimitiveDataTypeModifier primitiveDataTypeModifier,
    NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier,
    String objectDataTypeModifier
) {
}
