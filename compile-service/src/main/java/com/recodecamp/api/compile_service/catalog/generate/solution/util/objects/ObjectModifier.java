package com.recodecamp.api.compile_service.catalog.generate.solution.util.objects;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.NonAccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.NonPrimitiveDataTypeModifier;
import com.recodecamp.api.compile_service.catalog.generate.solution.util.modifiers.PrimitiveDataTypeModifier;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class ObjectModifier {

    public AccessModifier accessModifier;
    public NonAccessModifier nonAccessModifier;
    public PrimitiveDataTypeModifier primitiveDataTypeModifier;
    public NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier;
    public String objectDataTypeModifier;

    @Override
    public String toString() {

        List<Field> getModifiers = Arrays.asList(ObjectModifier.class.getDeclaredFields());

        if (getModifiers.containsAll(null)) {
            return "";
        } else {

            // convert string to arr and remove nulls
            String modifiers = String.format("%s %s %s %s %s", accessModifier, nonAccessModifier, primitiveDataTypeModifier, nonPrimitiveDataTypeModifier, objectDataTypeModifier);

            // convert string to arr and remove null
            String[] arr = Arrays.stream(modifiers
                    .split(" "))
                    .filter(Objects::nonNull)
                    .toArray(String[]::new);

            return String.join(" ", arr);
        }
    }
    
    public abstract void isModifierValid();

}
