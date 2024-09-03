package api.recodecamp.compile_service.catalog.generate.components.modifier;

import api.recodecamp.compile_service.catalog.generate.components.modifier.helpers.AccessModifier;
import api.recodecamp.compile_service.catalog.generate.components.modifier.helpers.NonAccessModifier;
import api.recodecamp.compile_service.catalog.generate.components.modifier.helpers.NonPrimitiveDataTypeModifier;
import api.recodecamp.compile_service.catalog.generate.components.modifier.helpers.PrimitiveDataTypeModifier;

public record ObjectModifier(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    PrimitiveDataTypeModifier primitiveDataTypeModifier,
    NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier,
    String objectModifier
) {
}
