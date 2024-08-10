package com.recodecamp.api.compile_service.catalog.generate.solution.boilerplate;

import com.recodecamp.api.compile_service.catalog.generate.solution.util.helpers.ObjectType;

public class BoilerplateObject <T> {

    ObjectType objType;
    T objData;

    public BoilerplateObject(
        ObjectType objType,
        T objData
    ) {
        this.objType = objType;
        this.objData = objData;
    };
};
