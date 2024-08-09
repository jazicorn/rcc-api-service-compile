package com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate;

import java.util.List;

import com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate.util.ObjectClassType;

public class Boilerplate <T,K> {

    Boolean filePublic;
    ObjectClassType fileType;
    String fileName;
    List<T> boilerplateObjects;
    List<K> solvedObjects;

    public Boilerplate(
        Boolean filePublic,
        ObjectClassType fileType, 
        String fileName,
        List<T> boilerplate,
        List<K> solved
    ) {
        this.filePublic = filePublic;
        this.fileType = fileType;
        this.fileName = fileName;
        this.boilerplateObjects = boilerplate;
        this.solvedObjects = solved;
    }
}
