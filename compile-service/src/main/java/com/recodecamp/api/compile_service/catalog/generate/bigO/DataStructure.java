package com.recodecamp.api.compile_service.catalog.generate.bigO;

import java.util.List;
import java.util.UUID;

import com.recodecamp.api.compile_service.catalog.generate.bigO.complexity.Complexity;
import com.recodecamp.api.compile_service.catalog.generate.bigO.complexity.ComplexityAction;
import com.recodecamp.api.compile_service.catalog.generate.bigO.complexity.ComplexityRating;
import com.recodecamp.api.compile_service.catalog.util.Documentation;

public record DataStructure(
    UUID id,
    Boolean primitiveType,
    DataStructureClass dataStructureClass,
    DataStructureType dataStructureType,
    String dataStructureTypeSub,
    Complexity timeComplexity,
    ComplexityAction timeComplexityAction,
    ComplexityRating timeComplexityRating,
    Complexity spaceComplexity,
    ComplexityRating spaceComplexityRating,
    List<String> examples,
    Documentation sources
) {
};
