package com.recodecamp.api.compile_service.catalog.generate.solution;

import java.util.List;
import java.util.UUID;

import com.recodecamp.api.compile_service.catalog.generate.solution.structure.DataStructure;

public abstract class Solution {
    public UUID id;
    public String regexPattern;
    public String solution;
    public List<String> hints;
    public List<String> conditions;
    public List<String> constraints;
    public DataStructure dataStructure;

    public Solution(
        UUID id,
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