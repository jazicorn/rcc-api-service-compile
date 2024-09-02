package api.recodecamp.compile_service.catalog.generate.components.utils.objects;

import api.recodecamp.compile_service.catalog.generate.components.modifier.helpers.AccessModifier;
import api.recodecamp.compile_service.catalog.generate.components.modifier.helpers.NonAccessModifier;

public record ObjectMethod(
    AccessModifier accessModifier,
    NonAccessModifier nonAccessModifier,
    String returnType
) {
};
