package api.recodecamp.compile_service.generate.components.modifier;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import api.recodecamp.compile_service.generate.components.modifier.helpers.AccessModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.NonAccessModifier;
import api.recodecamp.compile_service.generate.components.modifier.helpers.PrimitiveDataTypeModifier;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

/**
* Modifier class generates modifier for objects
* 
* @author Jasmine Anderson
* @version 1.0
*/
public abstract class Modifier<T,K> {

    public AccessModifier accessModifier;
    public NonAccessModifier nonAccessModifier;
    public PrimitiveDataTypeModifier primitiveDataTypeModifier;
    public T nonPrimitiveDataTypeModifier;
    public K dataTypeModifierDiamond;
    
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
        T nonPrimitiveDataTypeModifier,
        K dataTypeModifierDiamond
    ) {
        this.accessModifier = accessModifier;
        this.nonAccessModifier = nonAccessModifier;
        this.nonPrimitiveDataTypeModifier = nonPrimitiveDataTypeModifier;
        this.dataTypeModifierDiamond = dataTypeModifierDiamond;
    };

    /**
     * List format of attribute value for Modifier class
     * @return List of Modifier attribute values
     * @see Class#getDeclaredFields() Class.getDeclaredFields()
     * @see Arrays#asList(T...) Arrays.asList()
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html">List</a> 
     */
    public List<Field> fields() {
        return Arrays.asList(Modifier.class.getDeclaredFields());
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

    public abstract Object accessType();

    public abstract Object dataType();
}
