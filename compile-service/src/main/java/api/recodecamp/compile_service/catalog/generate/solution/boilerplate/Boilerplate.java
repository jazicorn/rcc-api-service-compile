package api.recodecamp.compile_service.catalog.generate.solution.boilerplate;

import java.util.List;

import api.recodecamp.compile_service.catalog.generate.components.utils.ClassType;

public class Boilerplate<T, K> {
    String fileName; 
    String fileType; 
    Boolean objectClassPublic;
    ClassType objectClassType;
    List<T> boilerplateObjects;
    List<K> solvedObjects;

    public Boilerplate(
        String fileType,
        Boolean objectClassPublic,
        ClassType objectClassType, 
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
