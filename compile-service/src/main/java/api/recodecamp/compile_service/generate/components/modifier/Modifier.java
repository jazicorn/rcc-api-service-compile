package api.recodecamp.compile_service.generate.components.modifier;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import api.recodecamp.compile_service.generate.components.modifier.helpers.AccessModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.NonAccessModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.NonPrimitiveDataTypeModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.PrimitiveDataTypeModifier;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Modifier<T,K> {

    public AccessModifier accessModifier;
    public NonAccessModifier nonAccessModifier;
    public PrimitiveDataTypeModifier primitiveDataTypeModifier;
    public NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier;
    public String objectModifier;

    public List<Field> modifiers() {
        return Arrays.asList(Modifier.class.getDeclaredFields());
    };

    public Boolean isEmpty() {     
        return (modifiers().isEmpty() || modifiers().containsAll(null));
    };
    
    public String modifier() {
        // convert attributes to string
        String modifiers = String.format("%s %s %s %s %s", accessModifier, nonAccessModifier,
                primitiveDataTypeModifier, nonPrimitiveDataTypeModifier, objectModifier);

        // convert string to arr and remove null
        String[] arr = Arrays.stream(modifiers
                .split(" "))
                .filter(Objects::nonNull)
                .toArray(String[]::new);

        return Optional.ofNullable(String.join(" ", arr)) == null ? "" : String.join(" ", arr);
    };
    
    @Override
    public String toString() {
        String modifier = this.isEmpty() ? "" : modifier();
        return modifier;
    };

    public abstract Boolean isValid();

    public abstract Optional<T> accessType();

    public abstract Optional<K> dataType();
}
