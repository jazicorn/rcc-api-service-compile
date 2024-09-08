package api.recodecamp.compile_service.generate.solution.boilerplate;

import api.recodecamp.compile_service.generate.components.utils.ObjectType;

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
