package com.recodecamp.api.compile_service.catalog.generate;

import java.time.LocalDateTime;
import java.util.List;

import com.recodecamp.api.compile_service.catalog.util.Documentation;

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
