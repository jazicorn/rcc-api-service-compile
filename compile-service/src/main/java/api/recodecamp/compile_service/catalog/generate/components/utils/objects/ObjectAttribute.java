package api.recodecamp.compile_service.catalog.generate.components.utils.objects;

import api.recodecamp.compile_service.catalog.generate.components.attributes.AttributeType;

public record ObjectAttribute(
    AttributeType attributeType,
    String attributeName,
    String attributeValue
) {
};
