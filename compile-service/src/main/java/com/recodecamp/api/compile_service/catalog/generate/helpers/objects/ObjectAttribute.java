package com.recodecamp.api.compile_service.catalog.generate.helpers.objects;

import com.recodecamp.api.compile_service.catalog.generate.helpers.AttributeType;

public record ObjectAttribute(
    AttributeType attributeType,
    String attributeName,
    String attributeValue
) {
};
