package api.recodecamp.compile_service.generate.components.modifier;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import api.recodecamp.compile_service.generate.components.modifier.helpers.AccessModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.NonAccessModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.NonPrimitiveDataTypeModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.PrimitiveDataTypeModifier;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

/**
* Modifier class generates modifier for objects
* 
* @author Jasmine Anderson
* @version 1.0
*/
public abstract class Modifier {

    public AccessModifier accessModifier;
    public NonAccessModifier nonAccessModifier;
    public PrimitiveDataTypeModifier primitiveDataTypeModifier;
    public Object nonPrimitiveDataTypeModifier;
    public Boolean nonPrimitiveDataTypeModifierDiamond;
    
    public Modifier(
        AccessModifier accessModifier,
        NonAccessModifier nonAccessModifier,
        PrimitiveDataTypeModifier primitiveDataTypeModifier
    ) {
        this.accessModifier = accessModifier;
        this.nonAccessModifier = nonAccessModifier;
        this.primitiveDataTypeModifier = primitiveDataTypeModifier;
    };

    public Modifier(
        AccessModifier accessModifier,
        NonAccessModifier nonAccessModifier,
        NonPrimitiveDataTypeModifier nonPrimitiveDataTypeModifier,
        Boolean nonPrimitiveDataTypeModifierDiamond
    ) {
        this.accessModifier = accessModifier;
        this.nonAccessModifier = nonAccessModifier;
        this.nonPrimitiveDataTypeModifier = nonPrimitiveDataTypeModifier;
        this.nonPrimitiveDataTypeModifierDiamond = nonPrimitiveDataTypeModifierDiamond;
        isDiamondPrimitive();
    };

    public Modifier(
        AccessModifier accessModifier,
        NonAccessModifier nonAccessModifier,
        String nonPrimitiveDataTypeModifier,
        Boolean nonPrimitiveDataTypeModifierDiamond
    ) {
        this.accessModifier = accessModifier;
        this.nonAccessModifier = nonAccessModifier;
        this.nonPrimitiveDataTypeModifier = nonPrimitiveDataTypeModifier;
        this.nonPrimitiveDataTypeModifierDiamond = nonPrimitiveDataTypeModifierDiamond;
        isDiamondPrimitive();
    };

    /**
     * Checks if diamond modifier is a valid type
     * @see Arrays#stream()
     * @throws IllegalArgumentException exception thrown if diamond modifier is primitive data type
     */
    private void isDiamondPrimitive() {
        if (nonPrimitiveDataTypeModifierDiamond) {
            boolean primitive = Arrays.stream(PrimitiveDataTypeModifier.values())
                    .anyMatch(type -> type.name().equals(nonPrimitiveDataTypeModifier));
            boolean nonPrimitive = Arrays.stream(NonPrimitiveDataTypeModifier.values())
                .anyMatch(type -> type.name().toLowerCase().equals(nonPrimitiveDataTypeModifier.toString().toLowerCase()));
            if (primitive) {
                throw new IllegalArgumentException("Primitive data types not allowed for diamond operator");
            }
            if (nonPrimitive) {
                throw new IllegalArgumentException("For non-custom class, non-primitive data types, use NonPrimitiveDataTypeModifier enum");
            }
        }
    };

    /**
     * List format of attribute value for Modifier class
     * @return List of Modifier attribute values
     * @see Class#getDeclaredFields() Class.getDeclaredFields()
     * @see Arrays#asList() Arrays.asList()
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">List</a> 
     */
    public List<Field> fields() {
        List<Field> fields = new ArrayList<>(List.of(Modifier.class.getDeclaredFields()));
        if (nonPrimitiveDataTypeModifierDiamond) {
            fields.remove(fields.size() - 1);
        }
        return fields;
    };

    /**
     * Checks if List contains any valid values
     * @return True if List contains a valid value and false if all Null or empty String
     * @see List#isEmpty() List.isEmpty()
     * @see List#containsAll(Collection) List.containsAll()
     */
    public Boolean isEmpty() {     
        return (fields().isEmpty() || fields().containsAll(null));
    };
    
    /**
    * Removes nulls and converts List<Fields> to a String 
    * @return String of all attribute values filtered for nulls or empty string if all attribute values are null
    * @see List#parallelStream() List.parallelStream()
    * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#filter-java.util.function.Predicate-">Stream.filter()</a>
    * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#map-java.util.function.Function-">Stream.map()</a>
    * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#collect-java.util.stream.Collector-">Stream.collect()</a>
     */
    @Override
    public String toString() {
        List<String> arr = fields()
            .parallelStream()
            .filter(Objects::nonNull)
            .map(object -> Objects.toString(object, null))
            .collect(Collectors.toList());
        
        String str = String.join(" ", arr);

        return str == null ? "" : str;
    };

    public abstract Boolean isValid();

    public abstract String fAccessType();

    public abstract Optional<String> fDataType();

    public abstract Optional<String> fDataTypeDiamond();
}
