package api.recodecamp.compile_service.generate.components.attributes;

import java.util.Optional;

import api.recodecamp.compile_service.generate.components.modifier.AttributeModifier;

public class Attribute {
    
    AttributeModifier modifier;
    AttributeType attrType;
    String attrName;
    String attrValue;
 
    public Attribute(
        AttributeModifier modifier,
        AttributeType attrType,
        String attrName,
        String attrValue
        
    ) {
        this.modifier = modifier;
        this.attrType = attrType;
        this.attrName = attrName;
        this.attrValue = attrValue;

    };
    
    public Attribute(
        AttributeType attrType,
        String attrName,
        String attrValue
    ) {
        this.attrType = attrType;
        this.attrName = attrName;
        this.attrValue = attrValue;
    };

    public Optional<String> attrDeclare() {
        return Optional.ofNullable(String.format("%s %s", modifier.toString(), attrName).trim());
    };

    public Optional<String> attrDeclareValue() {
        return Optional.ofNullable(String.format("%s = %s", attrName, attrValue));
    };

    public Optional<String> thisSyntax() {
        return Optional.ofNullable(String.format("this.%s = %s", attrName, attrValue));
    };
    
    @Override
    public String toString() {
        if (attrType != null) {
            switch (attrType) {
                case DECLAREATTRIBUTE -> {
                    return "";
                }
                case DECLAREATTRIBUTEVALUE -> {
                    return "";
                }
                case PARAMETER-> {
                    return "";
                }
                case INITIALVALUE -> {
                    return "";
                }
                case THISINITIALVALUE -> {
                    return "";
                }
                case THISINITIALVALUENOPARAMETER -> {
                    return "";
                }
                default -> {
                    return "";
                }
            } 
        } {
            throw new NullPointerException(
                "attrType CANNOT be NULL"
            );
        }
    };
};
