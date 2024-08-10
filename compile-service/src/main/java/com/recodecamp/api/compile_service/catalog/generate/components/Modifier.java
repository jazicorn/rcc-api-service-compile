package com.recodecamp.api.compile_service.catalog.generate.components;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.AccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.NonAccessModifier;
import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.NonPrimitiveDataTypeModifier;
import com.recodecamp.api.compile_service.catalog.generate.helpers.modifiers.PrimitiveDataTypeModifier;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Modifier {

    public AccessModifier accessModifier;
    public NonAccessModifier nonAccessModifier;
    public PrimitiveDataTypeModifier primitiveDataTypeModifier;
    public NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier;
    public String objectDataTypeModifier;

    @Override
    public String toString() {

        List<Field> getModifiers = Arrays.asList(Modifier.class.getDeclaredFields());

        if (getModifiers.isEmpty() || getModifiers.containsAll(null))  {
            return "";
        } else {

            // convert string to arr and remove nulls
            String modifiers = String.format("%s %s %s %s %s", accessModifier, nonAccessModifier,
                    primitiveDataTypeModifier, nonPrimitiveDataTypeModifier, objectDataTypeModifier);

            // convert string to arr and remove null
            String[] arr = Arrays.stream(modifiers
                    .split(" "))
                    .filter(Objects::nonNull)
                    .toArray(String[]::new);

            return String.join(" ", arr);
        }
    }

    public Boolean isEmpty() {
        return toString().trim().isEmpty();
    };

    public abstract void isModifierValid();

}
