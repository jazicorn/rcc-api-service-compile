package api.recodecamp.compile_service.catalog.generate.components.attributes;

import api.recodecamp.compile_service.catalog.generate.components.modifier.Modifier;
import api.recodecamp.compile_service.catalog.generate.components.utils.objects.ObjectAttribute;
import api.recodecamp.compile_service.catalog.generate.components.utils.objects.ObjectModifier;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attribute extends Modifier {
    
    AttributeType attrType;
    String attrName;
    String attrValue;
 
    public Attribute(
        ObjectAttribute attr
    ) {
        super();
        this.attrType = attr.attributeType();
        this.attrName = attr.attributeName();
        this.attrValue = attr.attributeValue();

        isModifierValid();
    };

    public Attribute(
        ObjectAttribute attr,
        ObjectModifier modifier
    ) {
        super(
            modifier.accessModifier(),
            modifier.nonAccessModifier(),
            modifier.primitiveDataTypeModifier(),
            modifier.nonPrimitiveDataTypeModifier(),
            modifier.objectModifier()
        );
        this.attrType = attr.attributeType();
        this.attrName = attr.attributeName();
        this.attrValue = attr.attributeValue();

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

    @Override
    public final void isModifierValid() {
        if (super.primitiveDataTypeModifier != null || super.nonPrimitiveDataTypeModifier != null) {
            throw new IllegalArgumentException(
                    "primitiveModifierReturnValue or nonPrimitiveModifierReturnValue must be NULL");
        }
        
        if ((super.primitiveDataTypeModifier != null || super.nonPrimitiveDataTypeModifier != null) && super.objectModifier != null) {
            throw new IllegalArgumentException(
                    "primitiveModifierReturnValue AND nonPrimitiveModifierReturnValue must be NULL if using objectDataTypeModifier");
        }
    };
};
