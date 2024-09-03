package api.recodecamp.compile_service.catalog.generate.components.attributes;

public record ObjectAttribute(
    AttributeType attributeType,
    String attributeName,
    String attributeValue
) {
};
