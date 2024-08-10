package com.recodecamp.api.compile_service.catalog.generate.solution.util.objects;

import com.recodecamp.api.compile_service.catalog.generate.solution.util.helpers.AttributeType;
import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.Modifier;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ObjectAttribute extends ObjectModifier {
    
    AttributeType attrType;
    String attrName;
    String attrValue;
 
    public ObjectAttribute(
        AttributeType attributeType,
        String attributeName,
        String attributeValue
    ) {
        super(
            null,
            null,
            null,
            null,
            null
        );
        this.attrType = attributeType;
        this.attrName = attributeName;
        this.attrValue = attributeValue;

        isModifierValid();
    };

    public ObjectAttribute(
        AttributeType attributeType,
        String attributeName,
        String attributeValue,
        Modifier modifiers
    ) {
        super(
            modifiers.accessModifier(),
            modifiers.nonAccessModifier(),
            modifiers.primitiveDataTypeModifier(),
            modifiers.nonPrimitiveDataTypeModifier(),
            modifiers.objectDataTypeModifier()
        );
        this.attrType = attributeType;
        this.attrName = attributeName;
        this.attrValue = attributeValue;

        isModifierValid();
    };
    
    public String attrDeclare() {
        return String.format("%s %s", super.toString(), attrName).trim();
    };

    public String attrDeclareValue() {
        return String.format("%s = %s", attrName, attrValue);
    };

    public String thisSyntax() {
        return String.format("this.%s = %s", attrName, attrValue);
    };
    
    @Override
    public String toString() {
        if (null != attrType) {
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

    @Override
    public final void isModifierValid() {
        if (super.primitiveDataTypeModifier != null || super.nonPrimitiveDataTypeModifier != null) {
            throw new IllegalArgumentException(
                    "primitiveModifierReturnValue or nonPrimitiveModifierReturnValue must be NULL");
        }
        
        if ((super.primitiveDataTypeModifier != null || super.nonPrimitiveDataTypeModifier != null) && super.objectDataTypeModifier != null) {
            throw new IllegalArgumentException(
                    "primitiveModifierReturnValue AND nonPrimitiveModifierReturnValue must be NULL if using objectDataTypeModifier");
        }
    };
};
