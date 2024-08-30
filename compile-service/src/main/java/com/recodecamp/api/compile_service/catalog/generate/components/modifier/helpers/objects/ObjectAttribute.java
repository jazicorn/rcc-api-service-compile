package com.recodecamp.api.compile_service.catalog.generate.components.modifier.helpers.objects;

import com.recodecamp.api.compile_service.catalog.generate.components.attributes.AttributeType;

public record ObjectAttribute(
    AttributeType attributeType,
    String attributeName,
    String attributeValue
) {
};
