package com.recodecamp.api.compile_service.catalog.generate.solution;

import java.util.List;
import java.util.UUID;

import com.recodecamp.api.compile_service.catalog.generate.solution.structure.DataStructure;

public class Solution {
    UUID id;
    String regexPattern;
    String solution;
    List<String> hints;
    List<String> conditions;
    List<String> constraints;
    DataStructure dataStructure;

    public Solution(
        String regexPattern,
        List<String> hints,
        List<String> conditions,
        List<String> constraints,
        DataStructure dataStructure
    ) {
        this.id = UUID.randomUUID(); 
        this.regexPattern = regexPattern;
        this.hints = hints;
        this.conditions = conditions;
        this.constraints = constraints;
    };
};