package api.recodecamp.compile_service.generate.solution.bigO;

import java.util.List;
import java.util.UUID;

import api.recodecamp.compile_service.generate.solution.bigO.complexity.Complexity;
import api.recodecamp.compile_service.generate.solution.bigO.complexity.ComplexityAction;
import api.recodecamp.compile_service.generate.solution.bigO.complexity.ComplexityRating;
import api.recodecamp.compile_service.util.Documentation;

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
