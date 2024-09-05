package api.recodecamp.compile_service.generate.components.modifier;

import java.util.Optional;

import api.recodecamp.compile_service.generate.components.modifier.helpers.AccessModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.NonAccessModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.NonPrimitiveDataTypeModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.PrimitiveDataTypeModifier;

public class AttributeModifier<T,K> extends Modifier<T,K> {
    
    public AttributeModifier() {
        super();
    }

    public AttributeModifier(
        AccessModifier accessModifier,
        NonAccessModifier nonAccessModifier,
        PrimitiveDataTypeModifier primitiveDataTypeModifier,
        NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier,
        String objectModifier
    ) {
        super(
            accessModifier,
            nonAccessModifier,
            primitiveDataTypeModifier,
            nonPrimitiveDataTypeModifier,
            objectModifier
        );
    }

    @Override
    public Boolean isValid() {
        throw new UnsupportedOperationException("Unimplemented method 'isValid'");
    }

    @Override
    public Optional<T> accessType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Optional<K> dataType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
