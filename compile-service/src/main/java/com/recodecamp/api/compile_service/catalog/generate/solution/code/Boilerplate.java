package com.recodecamp.api.compile_service.catalog.generate.solution.code;

import java.util.List;

import com.recodecamp.api.compile_service.catalog.generate.solution.code.util.ClassType;

public class Boilerplate <T> {

    Boolean filePublic;
    ClassType fileType;
    String fileName;
    List<T> boilerplateObjects;

    public Boilerplate(
        Boolean filePublic,
        ClassType fileType, 
        String fileName,
        List<T> objects
    ) {
        this.filePublic = filePublic;
        this.fileType = fileType;
        this.fileName = fileName;
        this.boilerplateObjects = objects;
    }
}
