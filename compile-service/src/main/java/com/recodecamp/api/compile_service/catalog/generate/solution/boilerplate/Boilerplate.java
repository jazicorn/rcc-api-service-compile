package com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate;

import java.util.List;

import com.recodecamp.api.compile_service.catalog.generate.solution.util.objects.ObjectClassType;

public class Boilerplate<T, K> {
    String fileName; 
    String fileType; 
    Boolean objectClassPublic;
    ObjectClassType objectClassType;
    List<T> boilerplateObjects;
    List<K> solvedObjects;

    public Boilerplate(
        String fileType,
        Boolean objectClassPublic,
        ObjectClassType objectClassType, 
        String fileName,
        List<T> boilerplate,
        List<K> solved
    ) {
        this.fileName = fileName;
        this.objectClassPublic = objectClassPublic;
        this.fileType = fileType;
        this.objectClassType = objectClassType;
        this.boilerplateObjects = boilerplate;
        this.solvedObjects = solved;
    }

};
