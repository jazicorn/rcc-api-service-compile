package api.recodecamp.compile_service.generate.components.modifier;

import java.util.Optional;

import api.recodecamp.compile_service.generate.components.modifier.helpers.AccessModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.NonAccessModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.NonPrimitiveDataTypeModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.PrimitiveDataTypeModifier;
import api.recodecamp.compile_service.util.EnumUtil;
import api.recodecamp.compile_service.util.StrUtil;

public class AttributeModifier extends Modifier {

    public AttributeModifier(
        AccessModifier accessModifier,
        NonAccessModifier nonAccessModifier,
        PrimitiveDataTypeModifier primitiveDataTypeModifier
    ) {
        super(
            accessModifier,
            nonAccessModifier,
            primitiveDataTypeModifier
        );
    };

    public AttributeModifier(
        AccessModifier accessModifier,
        NonAccessModifier nonAccessModifier,
        NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier,
        Boolean nonPrimitiveDataTypeModifierDiamond
    ) {
        super(
            accessModifier,
            nonAccessModifier,
            nonPrimitiveDataTypeModifier,
            nonPrimitiveDataTypeModifierDiamond
        );
    };

    public AttributeModifier(
        AccessModifier accessModifier,
        NonAccessModifier nonAccessModifier,
        String nonPrimitiveDataTypeModifier,
        Boolean nonPrimitiveDataTypeModifierDiamond
    ) {
        super(
            accessModifier,
            nonAccessModifier,
            nonPrimitiveDataTypeModifier,
            nonPrimitiveDataTypeModifierDiamond
        );
    };

    @Override
    public Boolean isValid() {
        return !super.isEmpty();
    };

    @Override
    public String fAccessType() {
        String access = EnumUtil.enumToStr(accessModifier);
        return nonAccessModifier == null ? access : access.concat(" ").concat(EnumUtil.enumToStr(nonAccessModifier));
    };

    @Override
    public Optional<String> fDataType() {
        String ft;
        if(nonPrimitiveDataTypeModifier instanceof Enum) {
            ft = StrUtil.fStrTitleCase(EnumUtil.enumToStr(nonPrimitiveDataTypeModifier));
        } else {
            ft = StrUtil.fStrTitleCase((String) nonPrimitiveDataTypeModifier);
        }
        
        return Optional.ofNullable(ft);
    };

    @Override
    public Optional<String> fDataTypeDiamond() {
        String ft = String.format("<%s>", fDataType());
        return Optional.ofNullable(ft);
    }
}
