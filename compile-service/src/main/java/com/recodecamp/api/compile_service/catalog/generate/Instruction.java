package com.recodecamp.api.compile_service.catalog.generate;

import java.util.List;
import java.util.UUID;

import com.recodecamp.api.compile_service.catalog.generate.solution.Solution;
import com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate.Boilerplate;
import com.recodecamp.api.compile_service.catalog.generate.solution.structure.DataStructure;

public class Instruction <T,K> extends Solution {

    UUID id;
    String statement;
    Boilerplate<T,K> boilerplate;
    List<String> solutions;

    public Instruction(
        String statement,
        Boilerplate<T,K> boilerplate,
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
            null,
            null
        );
        this.id = super.id;
    };
};