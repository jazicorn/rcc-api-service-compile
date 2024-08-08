package com.recodecamp.api.compile_service.catalog.generate.solution.structure;

public enum Complexity {
    SPEED1("O(1)"),
    SPEED2("O(log(n))"),
    SPEED3("O(n)"),
    SPEED4("O(n log(n))"),
    SPEED5("O(n^2)"),
    SPEED6("O(2^n)"),
    SPEED7("O(n!)");

    public final String label;

    private Complexity(String label) {
        this.label = label;
    };
};
