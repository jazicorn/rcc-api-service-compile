package api.recodecamp.compile_service.catalog.generate.components.modifier;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import api.recodecamp.compile_service.catalog.generate.components.modifier.helpers.AccessModifier;
import api.recodecamp.compile_service.catalog.generate.components.modifier.helpers.NonAccessModifier;
import api.recodecamp.compile_service.catalog.generate.components.modifier.helpers.NonPrimitiveDataTypeModifier;
import api.recodecamp.compile_service.catalog.generate.components.modifier.helpers.PrimitiveDataTypeModifier;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Modifier {

    public AccessModifier accessModifier;
    public NonAccessModifier nonAccessModifier;
    public PrimitiveDataTypeModifier primitiveDataTypeModifier;
    public NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier;
    public String objectModifier;

    @Override
    public String toString() {

        List<Field> getModifiers = Arrays.asList(Modifier.class.getDeclaredFields());

        if (getModifiers.isEmpty() || getModifiers.containsAll(null))  {
            return "";
        } else {

            // convert attributes to string
            String modifiers = String.format("%s %s %s %s %s", accessModifier, nonAccessModifier,
                    primitiveDataTypeModifier, nonPrimitiveDataTypeModifier, objectModifier);

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
