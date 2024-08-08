package com.recodecamp.api.compile_service.catalog.generate;

import java.util.List;
import java.util.UUID;

import com.recodecamp.api.compile_service.catalog.generate.solution.Solution;
import com.recodecamp.api.compile_service.catalog.generate.solution.structure.DataStructure;

public class Instruction<T> extends Solution {

    UUID id;
    String statement;
    T boilerplate;

    public Instruction(
        String statement,
        T boilerplate,
        String regexPattern,
        List<String> hints,
        List<String> conditions,
        List<String> constraints,
        DataStructure dataStructure
    ) {
        super(
            null,
            null,
            null,
            null,
            null
        );
        id = UUID.randomUUID();
    };
};