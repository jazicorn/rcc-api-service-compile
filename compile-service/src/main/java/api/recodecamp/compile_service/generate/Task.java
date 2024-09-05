package api.recodecamp.compile_service.generate;

import java.time.LocalDateTime;
import java.util.List;

import api.recodecamp.compile_service.util.Documentation;

public record Task(
    LocalDateTime createdAt,
    LocalDateTime updatedAt,
    String id,
    String language,
    Integer level,
    Integer points,
    List<Instruction<?,?>> instructions,
    String category,
    String categorySub,
    List<String> tags,
    Documentation sources
) {
};
